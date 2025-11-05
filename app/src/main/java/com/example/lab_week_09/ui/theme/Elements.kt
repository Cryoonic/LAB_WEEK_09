package com.example.lab_week_09.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun OnBackgroundTitleText(text: String) {
    TitleText(text = text, color = MaterialTheme.colorScheme.onBackground)
}

@Composable
fun TitleText(text: String, color: Color) {
    Text(text = text, style = MaterialTheme.typography.titleLarge, color = color)
}

@Composable
fun OnBackgroundItemText(text: String) {
    ItemText(text = text, color = MaterialTheme.colorScheme.onBackground)
}

@Composable
fun ItemText(text: String, color: Color) {
    Text(text = text, style = MaterialTheme.typography.bodySmall, color = color)
}

@Composable
fun PrimaryTextButton(
    text: String,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    CustomButton(
        text = text,
        textColor = Color.White,
        enabled = enabled,
        onClick = onClick
    )
}

@Composable
fun CustomButton(
    text: String,
    textColor: Color,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = Modifier.padding(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (enabled) Color.DarkGray else Color.Gray,
            contentColor = textColor
        )
    ) {
        Text(text = text, style = MaterialTheme.typography.labelMedium)
    }
}
