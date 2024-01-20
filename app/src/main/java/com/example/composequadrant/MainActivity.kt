package com.example.composequadrant

import android.graphics.Color.rgb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}
@Composable
fun QuadrantApp(modifier: Modifier = Modifier){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            CellQuant(
                composableFunction = stringResource(R.string.text_composable),
                description = stringResource(R.string.text_composable_desc),
                backgroundColor = Color(rgb(241, 0, 11)),
                modifier = modifier.weight(1f)

            )
            CellQuant(
                composableFunction = stringResource(R.string.image_composable),
                description = stringResource(R.string.image_composable_desc),
                backgroundColor = Color(rgb(151,0,12)) ,
                modifier = modifier.weight(1f)//******************
            )
        }
        Row(Modifier.weight(1f)) {
            CellQuant(
                composableFunction = stringResource(R.string.row_composable),
                description = stringResource(R.string.row_composable_desc),
                backgroundColor = Color(rgb(254,82,0)),
                modifier = modifier.weight(1f)//******************
            )
            CellQuant(
                composableFunction = stringResource(R.string.column_composable),
                description = stringResource(R.string.column_composable_desc),
                backgroundColor = Color(rgb(47,159,57)),
                modifier = modifier.weight(1f)//******************
            )
            }
        }
    }


@Composable
fun CellQuant(composableFunction: String, modifier: Modifier = Modifier, description: String, backgroundColor: Color) {
    Column(
        modifier = modifier.fillMaxSize() .padding(12.dp) .background(backgroundColor),
        verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = composableFunction,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,


        )
        Text(
            text = description,
            textAlign = TextAlign.Justify

        )
    }
}



@Preview(showBackground = true)
@Composable
fun QuadAppPreview() {
    ComposeQuadrantTheme {
        QuadrantApp()
    }
}