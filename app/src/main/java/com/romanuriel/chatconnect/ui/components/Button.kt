package com.romanuriel.chatconnect.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun OutlinedButtonWithIcon(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icon: ImageVector,
    text: String,
    contentColor: Color = MaterialTheme.colorScheme.primary
){
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        contentPadding = ButtonDefaults.ButtonWithIconContentPadding,
        colors = ButtonDefaults.outlinedButtonColors(contentColor = contentColor)) {

        Text(
            modifier = Modifier.padding(start = 9.dp),
            text = text)
    }
}