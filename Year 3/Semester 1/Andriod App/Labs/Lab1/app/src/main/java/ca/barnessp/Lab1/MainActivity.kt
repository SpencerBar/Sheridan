package ca.barnessp.Lab1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ca.barnessp.Lab1.ui.theme.Lab1_BarnesspTheme

//compile constant
const val TAG: String = "MAIN"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() is called")
        enableEdgeToEdge()
        setContent {
            Lab1_BarnesspTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CopyingText(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume() is called")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy() is called")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun CopyingText(modifier: Modifier){
    var text by remember{ mutableStateOf("") }
    Column(
        modifier= modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
        value = text,
        onValueChange= {text = it },
        modifier = modifier.fillMaxWidth()
        )
        Text(
            text = text,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1_BarnesspTheme {
        Greeting("Android")
    }
}