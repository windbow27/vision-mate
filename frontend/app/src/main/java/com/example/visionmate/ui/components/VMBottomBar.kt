package com.example.visionmate.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiObjects
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material.icons.filled.Sick
import androidx.compose.material.icons.filled.TextFormat
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun VMBottomBar(
    onDetectFacesClick: () -> Unit,
    onRecognizeTextClick: () -> Unit,
    onOtherActionClick: () -> Unit
) {
    BottomAppBar {
        Box(
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                FloatingActionButton(
                    onClick = onDetectFacesClick,
                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(),
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(Icons.Filled.RemoveRedEye, "Detect Faces")
                }
                FloatingActionButton(
                    onClick = onRecognizeTextClick,
                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(),
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(Icons.Filled.TextFormat, "Recognize Text")
                }
                FloatingActionButton(
                    onClick = onOtherActionClick,
                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(),
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(Icons.Filled.Image, "Localized description")
                }
                FloatingActionButton(
                    onClick = onOtherActionClick,
                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(),
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(Icons.Filled.EmojiObjects, "Localized description")
                }
                FloatingActionButton(
                    onClick = onOtherActionClick,
                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(),
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(Icons.Filled.Sick, "Localized description")
                }
            }
        }
    }
}

@Preview
@Composable
fun VMBottomBarPreview() {
    VMBottomBar(
        onDetectFacesClick = { },
        onRecognizeTextClick = { },
        onOtherActionClick = { }
    )
}