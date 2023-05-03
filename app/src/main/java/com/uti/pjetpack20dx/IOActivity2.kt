package com.uti.pjetpack20dx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack20dx.ui.theme.PJetPack20DXTheme

class IOActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PJetPack20DXTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                    // Buat Variable Untuk Objek
                    var txt_nilai1 by remember {
                        mutableStateOf("")
                    }


                    // Buat Kolom
                    Column(modifier = Modifier.padding(all = 10.dp)) {

                        // Buat Input 1
                        OutlinedTextField(
                            label = {
                                Text(text = "Isi Nilai Berikut")
                            },
                            value = "",
                            onValueChange = {},
                            modifier = Modifier.fillMaxWidth(),
                            colors = TextFieldDefaults.textFieldColors(
                                focusedIndicatorColor = colorResource(id = R.color.color_label1),
                                containerColor = Color.Transparent,
                                focusedLabelColor = colorResource(id = R.color.color_label1),
                                cursorColor = colorResource(id = R.color.color_label2)
                            )
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PJetPack20DXTheme {

    }
}