package com.romanuriel.chatconnect

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewModelScope
import com.romanuriel.chatconnect.ui.components.ItemContact
import com.romanuriel.chatconnect.ui.theme.ChatConnectTheme
import com.romanuriel.chatconnect.ui.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatConnectTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    PreviewDynamicList()
                }
            }
        }
    }

    @Composable
    fun DynamicList(names: List<String>){
        LazyColumn(modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp)
        ){
            items(names){name ->
                ItemContact(name = name, imageUrl = R.drawable.ic_launcher_background){
                    Toast.makeText(baseContext, name,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    @Preview
    @Composable
    fun PreviewDynamicList() {
        val names = listOf(
            "Alice", "Bob", "Charlie", "David", "Eve",
            "Fiona", "George", "Helen", "Ian", "Julia",
            "Kevin", "Laura", "Michael", "Nina", "Oliver"
        )
        DynamicList(names = names)
    }

}


