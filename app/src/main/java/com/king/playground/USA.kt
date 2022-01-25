package com.king.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.king.playground.ui.theme.PlaygroundTheme

class USA : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundTheme {
                Conditioning()
            }
        }
    }
}

@Composable
fun Conditioning() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "United States of America", modifier = Modifier.fillMaxWidth(), fontSize = 30.sp, textAlign = TextAlign.Center)
        ConstraintLayout(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(260.dp)) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color(171, 46, 38))){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.White)){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color(171, 46, 38))){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.White)){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color(171, 46, 38))){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.White)){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color(171, 46, 38))){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.White)){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color(171, 46, 38))){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.White)){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color(171, 46, 38))){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.White)){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color(171, 46, 38))){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.White)){}
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color(171, 46, 38))){}
            }
            Box(modifier = Modifier
                .height(140.dp)
                .fillMaxWidth(0.45f)
                .background(Color(0, 0, 128))){
                Column(Modifier
                    .fillMaxSize()
                    .padding(0.dp, 10.dp, 0.dp, 10.dp), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp, 0.dp, 10.dp, 0.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp, 0.dp, 10.dp, 0.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp, 0.dp, 10.dp, 0.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp, 0.dp, 10.dp, 0.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                        Icon(painter = painterResource(id = R.drawable.star), contentDescription = "", tint = Color.White)
                    }
                }
            }
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .fillMaxHeight(0.9f), horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center){
            var scrollState = rememberScrollState()
            Text(text = "The history of the United States began with the arrival of Native Americans in North America around 15,000 BC. Numerous indigenous cultures formed, and many disappeared in the 16th century. The arrival of Christopher Columbus in 1492 started the European colonization of the Americas. Most colonies were formed after 1600, and the United States was the first nation whose most distant origins are fully recorded.[a] By the 1760s, the thirteen British colonies contained 2.5 million people and were established along the Atlantic Coast east of the Appalachian Mountains. After defeating France, the British government imposed a series of taxes, including the Stamp Act of 1765, rejecting the colonists' constitutional argument that new taxes needed their approval. Resistance to these taxes, especially the Boston Tea Party in 1773, led to Parliament issuing punitive laws designed to end self-government. Armed conflict began in Massachusetts in 1775.\n" +
                    "\n" +
                    "In 1776, in Philadelphia, the Second Continental Congress declared the independence of the colonies as the \"United States\". Led by General George Washington, it won the Revolutionary War. The peace treaty of 1783 established the borders of the new nation. The Articles of Confederation established a central government, but it was ineffectual at providing stability as it could not collect taxes and had no executive officer. A convention wrote a new Constitution that was adopted in 1789 and a Bill of Rights was added in 1791 to guarantee inalienable rights. With Washington as the first president and Alexander Hamilton his chief adviser, a strong central government was created. Purchase of the Louisiana Territory from France in 1803 doubled the size of the United States.\n" +
                    "\n" +
                    "Encouraged by the notion of manifest destiny, United States expanded to the Pacific Coast. While the nation was large in terms of area, its population in 1790 was only 4 million. The population grew rapidly and economic growth was even greater. Compared to European powers, the nation's military strength was relatively limited in peacetime before 1940. Westward expansion was driven by a quest for inexpensive land for yeoman farmers and slave owners. The expansion of slavery was increasingly controversial and fueled political and constitutional battles, which were resolved by compromises. Slavery was abolished in all states north of the Mason–Dixon line by 1804, but the South continued the institution, mostly for the production of cotton. Abraham Lincoln was elected president in 1860 on a platform of halting the expansion of slavery. Seven Southern slave states rebelled and created the foundation of the Confederacy. Its 1861 attack on a federal fort started a Civil War. The defeat of the Confederates in 1865 led to the abolition of slavery. In the Reconstruction era following the war, legal and voting rights were extended to freed slaves. The national government emerged much stronger, and gained explicit duty to protect individual rights. However, when white southerners regained their power in the South in 1877, often by paramilitary suppression of voting, they passed Jim Crow laws to maintain white supremacy, as well as new disenfranchising state constitutions that prevented most African Americans and many Poor Whites from voting. The United States and the Soviet Union emerged as rival superpowers in the aftermath of World War II. During the Cold War, the two countries confronted each other indirectly in the arms race, the Space Race, propaganda campaigns, and localized wars against communist expansion. In the 1960s, in large part due to the strength of the civil rights movement, another wave of social reforms was enacted which enforced the constitutional rights of voting and freedom of movement to African Americans and other racial minorities. The Cold War ended with the dissolution of the Soviet Union, leaving the United States as the world's sole superpower. Foreign policy after the Cold War has focused on modern conflicts in the Middle East, especially in response to the September 11 attacks and the rise of the Islamic State. Early in the 21st century, the U.S. experienced the Great Recession and later the COVID-19 pandemic, which also had a negative effect on the local economy.", modifier = Modifier.verticalScroll(scrollState), textAlign = TextAlign.Justify)
        }
    }
}


@Preview(showBackground = false)
@Composable
fun PreviewUSA() {
    PlaygroundTheme {
        Conditioning()
    }
}