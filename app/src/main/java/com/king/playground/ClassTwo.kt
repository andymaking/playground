package com.king.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.king.playground.ui.theme.PlaygroundTheme

class ClassTwo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundTheme {
                ClassTwo(name = "")

            }
        }
    }
}

@Composable
fun ClassTwo(name: String) {
    Scaffold(
        topBar = { TopAppBar {

        }},
        floatingActionButton = { FloatingActionButton(onClick = {}, content = {}) },
        bottomBar = { BottomAppBar {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                TextField(value="", onValueChange = {})
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Send")
                }
            }
        }},
        drawerContent = {}
    ) {
        Column {
            LazyColumn(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(.9F),
                horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                val listItems = (1..20).toList()
                items(listItems.size) { item ->
                    if (item % 2==0){
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                            Card {
                                Text("this is Item number $item", fontSize = 20.sp, modifier = Modifier.padding(16.dp))

                            }
                        }
                    } else{
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                            Card {
                                Text("this is Item number $item", fontSize = 20.sp, modifier = Modifier.padding(16.dp))

                            }
                        }
                    }


                }
            }


        }

    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PlaygroundTheme {
        ClassTwo("Android")
    }
}