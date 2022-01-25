package com.king.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.king.playground.ui.theme.PlaygroundTheme

class Constraint : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundTheme {
                Condition()
            }
        }
    }
}

@Composable
fun Condition() {
    ConstraintLayout(modifier = Modifier.padding(16.dp).fillMaxSize()) {
        val (textRex, box1, text2, box2, button) = createRefs()
        Text(text = "Time Text", modifier = Modifier.constrainAs(textRex){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
        Box(modifier = Modifier.height(200.dp).background(Color.Green, shape = RoundedCornerShape(20.dp)).fillMaxWidth().constrainAs(box1){
            top.linkTo(textRex.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(text2.top)
        }){

        }
        Text(text = "Take text", modifier = Modifier.constrainAs(text2){
            bottom.linkTo(box2.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(box1.bottom)
        })
        Box(modifier = Modifier.height(200.dp).background(Color.Black, shape = RoundedCornerShape(20.dp)).fillMaxWidth().constrainAs(box2){
            bottom.linkTo(button.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(text2.bottom)
        }){

        }
        Button(onClick = { /*TODO*/ }, modifier = Modifier.constrainAs(button){
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }) {

        }
    }
}



@Preview
@Composable
fun Preview() {
    PlaygroundTheme {
        Condition()
    }
}