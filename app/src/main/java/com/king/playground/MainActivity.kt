package com.king.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.king.playground.ui.theme.PlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Body()
    }
}

@Composable
fun Body(){
    Column {
        for (number in 1..10){
            Row {
                Text(text = "First name $number", Modifier.padding(10.dp))
                Button(onClick = {}, colors =ButtonDefaults.buttonColors(Color(number*7,254/number,number *5,20*5))) {
                    Text(text = "Button $number")
                }
            }
        }
    }
}

        @Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PlaygroundTheme {
        Greeting("Android")
    }
}