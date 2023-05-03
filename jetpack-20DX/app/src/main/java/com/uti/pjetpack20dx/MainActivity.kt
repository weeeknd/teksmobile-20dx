package com.uti.pjetpack20dx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack20dx.ui.theme.Pjetpack20DXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pjetpack20DXTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

    //                Button(onClick = { /*TODO*/ }) {
      //                  Text(text = "Tambah")
        //            }
                 Column(modifier = Modifier
                     .fillMaxSize()
                     .background(Color.White)
                     .padding(all = 10.dp)) {
                     Column(modifier = Modifier
                         .fillMaxWidth()
                         .background(Color.Gray)
                         .padding(all = 10.dp)) {
                         Greeting("Android")
                     }
                     Spacer(modifier = Modifier.padding(all = 10.dp))
                     Column(modifier = Modifier
                         .fillMaxWidth()
                         .background(Color.Magenta)
                         .padding(all = 10.dp)) {
                         Text(text = "Saya Belajar Jetpack Compose")
                     }
                     Spacer(modifier = Modifier.padding(all = 10.dp))
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Cyan)
                        .padding(all = 10.dp)) {
                        Text(text = "Saya Belajar Jetpack Compose Lagi")
                    }
                 }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Pjetpack20DXTheme {
        Greeting("Android")
    }
}