package com.yhr.jfj.login_screen_compose

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScopeMarker
import androidx.compose.ui.unit.dp
import com.yhr.jfj.login_screen_compose.ui.theme.BlueGray
import com.yhr.jfj.login_screen_compose.ui.theme.LightBlueWhite

@Composable
fun SocialMediaLogin(
    modifier: Modifier = Modifier,
    @DrawScopeMarker icon: Int,
    text: String,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
    ) {

    }
}

// Custom modifier
@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.socialMedia(): Modifier = composed {
    if (isSystemInDarkTheme()) {
        background(Color.Transparent).border(
            width = 1.dp,
            color = BlueGray,
            shape = RoundedCornerShape(4.dp)
        )
    } else {
        background(LightBlueWhite)
    }
}