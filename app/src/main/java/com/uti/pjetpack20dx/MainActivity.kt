package com.uti.pjetpack20dx

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack20dx.ui.theme.PJetPack20DXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PJetPack20DXTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
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
    PJetPack20DXTheme {
//        Greeting("Android")
//
//        Text(text = "Saya Belajar Jetpack Compose")
//
//        Button(onClick = { /*TODO*/ }) { Text(text = "tambah")
//
//        }
        Column(modifier = Modifier.run {
            fillMaxSize()
                .background(Color.Gray)
                .padding(
                    top = 10.dp, bottom = 15.dp, start = 20.dp, end = 5.dp
                )
        }) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan)
                    .padding(10.dp)
            ) {
                Greeting("Android")
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Yellow)
                    .padding(10.dp)
            ) {
                Text(text = "Saya Belajar Jetpack Compose")
            }

            Spacer(modifier = Modifier.padding(25.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(15.dp)
            ) {
                Text(text = "Saya Belajar Jetpack Compose Lagi")

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Black)
                        .padding(15.dp)
                ) {

                    // Buat Sebuah Variable
                    // var = Untuk Data Mutable = Bisa Di Ubah
                    // val = Untuk Data Immutable = Kekal
                    var x = "10"
                    var y = "3"
                    var z = x.toFloat() / y.toInt()

                    val context = LocalContext.current
                    Toast.makeText(
                        context,
                        "Hasil Penjumlahan = " + z.toString(),
                        Toast.LENGTH_LONG
                    ).show()

                    Button(modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White, contentColor = Color.Black
                    ), onClick = {

                    }) {
                        // Buat Variable Context
                        val context = LocalContext.current
                        Toast.makeText(context, z.toString(), Toast.LENGTH_LONG).show()

                        Text(text = "proses")


                    }
                }
            }

        }
    }
}