package com.yhr.jfj.login_screen_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.yhr.jfj.login_screen_compose.ui.theme.Black

@Composable
fun LoginScreen() {
    Surface {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            val uiColor = if (isSystemInDarkTheme()) Color.White else Black
            Box(
                contentAlignment = Alignment.TopCenter
            ) {
                Image(
                    painter = painterResource(id = R.drawable.shape),
                    contentDescription = "Shape",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(fraction = 0.46f),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}
















