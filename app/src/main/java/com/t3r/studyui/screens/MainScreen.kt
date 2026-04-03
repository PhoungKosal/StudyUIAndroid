package com.t3r.studyui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.t3r.studyui.navigation.NavItem
import com.t3r.studyui.screens.pages.ProfilePage
import com.t3r.studyui.screens.pages.SearchPage


@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    val navItemList = listOf(
        NavItem("Home", Icons.Default.Home, 0),
        NavItem("Search", Icons.Default.Search, 3),
        NavItem("Profile", Icons.Default.Person, 3)
    )

    var selectedIndex by remember {
        mutableStateOf(0)
    }
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar() {
                navItemList.forEachIndexed { index, item ->
                    NavigationBarItem(

                        icon = {
                            BadgedBox(
                                badge = {
                                    if(item.badgeCount > 0){
                                        Badge {
                                            Text(item.badgeCount.toString())
                                        }
                                    }
                                }
                            ) {
                                Icon(item.icon, contentDescription = item.label)
                            }},
                        label = { Text(item.label) },
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index }
                    )
                }
            }
        }
    ){ innerPadding ->
        ContentScreen(
            modifier = Modifier.padding(innerPadding), selectedIndex
        )
    }
}


@Composable
fun ContentScreen(modifier: Modifier = Modifier, selectedIndex: Int) {
    Column(modifier = modifier.fillMaxSize()) {
        when (selectedIndex) {
            0 -> Screen()
            1 -> SearchPage()
            2 -> ProfilePage()
        }
    }
    
}