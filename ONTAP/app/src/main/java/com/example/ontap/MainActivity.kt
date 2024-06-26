package com.example.ontap

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ontap.ui.theme.ONTAPTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ONTAPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun UnitConverter()
{
    var inputValue by remember { mutableStateOf("") }
    var outputValue by remember { mutableStateOf("") }
    var inputUnit by remember { mutableStateOf("Centimeters") }
    var outputUnit by remember { mutableStateOf("Meters") }
    var IExpand by remember { mutableStateOf(false) }  // Sửa thành Boolean
    var oExpand by remember { mutableStateOf(false) }  // Sửa thành Boolean
    var conversion by remember { mutableStateOf(0.01) }  // Sửa thành Double

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(text = "QLAPtext")
        Spacer(Modifier.height(15.dp))
        OutlinedTextField(
            value = inputValue,
            onValueChange = { newValue -> inputValue = newValue },
            label = { Text(text = "Enter Value")}
        )
        Spacer(Modifier.height(15.dp))
        Spacer(Modifier.height(15.dp))
        Row {
             Box{
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "ArrowDown")
                    }
                 DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                     DropdownMenuItem(text = {Text("centimeters")}, onClick = { /*TODO*/ })
                     DropdownMenuItem(text = {Text("Meters")}, onClick = { /*TODO*/ })
                     DropdownMenuItem(text = {Text("Kilometers")}, onClick = { /*TODO*/ })
                     DropdownMenuItem(text = {Text("decimeters")}, onClick = { /*TODO*/ })
                 }
                }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "ArrowDown"
                    )
                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = {Text("centimeters")}, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = {Text("Meters")}, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = {Text("Kilometers")}, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = {Text("decimeters")}, onClick = { /*TODO*/ })
                }
            }

        }
        Spacer(Modifier.height(15.dp))
        Text("Result")

    }


}