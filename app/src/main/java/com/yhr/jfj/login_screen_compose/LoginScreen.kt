package com.yhr.jfj.login_screen_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yhr.jfj.login_screen_compose.ui.theme.Black
import com.yhr.jfj.login_screen_compose.ui.theme.BlueGray
import com.yhr.jfj.login_screen_compose.ui.theme.Roboto

@Composable
fun LoginScreen() {
    Surface {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            TopSection()

            Spacer(modifier = Modifier.height(36.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp)
            ) {
                LoginSection()

                Spacer(modifier = Modifier.height(30.dp))

                SocialMediaSection()

                val uiColor = if (isSystemInDarkTheme()) Color.White else Black
                Box(
                    modifier = Modifier
                        .fillMaxHeight(0.8f)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xFF94A3B8),
                                    fontSize = 14.sp,
                                    fontFamily = Roboto,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("Don't have an account? ")
                            }
                            withStyle(
                                style = SpanStyle(
                                    color = uiColor,
                                    fontSize = 14.sp,
                                    fontFamily = Roboto,
                                    fontWeight = FontWeight.Medium
                                )
                            ) {
                                append("Create Now")
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun SocialMediaSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Or Continue With",
            style = MaterialTheme.typography.labelMedium.copy(color = Color(0xFF64748B))
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Social Media log in
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            SocialMediaLogin(
                icon = R.drawable.google,
                text = "Google",
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                // TODO: Implement
            }

            Spacer(modifier = Modifier.width(20.dp))

            SocialMediaLogin(
                icon = R.drawable.facebook,
                text = "Facebook",
                modifier = Modifier.weight(1f)
            ) {
                // TODO: Implement
            }
        }
    }
}

@Composable
private fun LoginSection() {
    // Email
    LoginTextField(
        label = stringResource(id = R.string.email),
        trailing = "",
        modifier = Modifier.fillMaxWidth()
    )
    Spacer(modifier = Modifier.height(15.dp))

    // Password
    LoginTextField(
        label = stringResource(id = R.string.password),
        trailing = "Forgot?",
        modifier = Modifier.fillMaxWidth()
    )
    Spacer(modifier = Modifier.height(20.dp))

    // Button for log in
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSystemInDarkTheme()) BlueGray else Black,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(4.dp)
    ) {
        Text(
            text = "Log in",
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium)
        )
    }
}

@Composable
private fun TopSection() {
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
        Row(
            modifier = Modifier.padding(top = 80.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(id = R.string.app_logo),
                modifier = Modifier.size(42.dp),
                tint = uiColor
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(
                    text = stringResource(id = R.string.the_tolet),
                    style = MaterialTheme.typography.headlineMedium,
                    color = uiColor
                )
                Text(
                    text = stringResource(id = R.string.find_house),
                    style = MaterialTheme.typography.titleMedium,
                    color = uiColor
                )
            }
        }
        Text(
            text = stringResource(id = R.string.login),
            style = MaterialTheme.typography.headlineLarge,
            color = uiColor,
            modifier = Modifier
                .padding(bottom = 10.dp)
                .align(Alignment.BottomCenter)
        )
    }
}
















