package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
                    QuadrantTextInput()
                }
            }
        }
    }
}



@Composable
fun QuadrantTextInput() {
    QuadrantTextStyle(
        textComposable = stringResource(R.string.text_composable),
        textComposableDescription = stringResource(R.string.text_composable_description),
        imageComposable = stringResource(R.string.image_composable),
        imageComposableDescription = stringResource(R.string.image_composable_description),
        rowComposable = stringResource(R.string.row_composable),
        rowComposableDescription = stringResource(R.string.row_composable_description),
        columnComposable = stringResource(R.string.column_composable),
        columnComposableDescription = stringResource(R.string.column_composable_description)
    )
}

// this function provides the values of the strings

@Composable
fun QuadrantTextStyle(
    textComposable: String,
    textComposableDescription: String,
    imageComposable: String,
    imageComposableDescription: String,
    rowComposable: String,
    rowComposableDescription: String,
    columnComposable: String,
    columnComposableDescription: String,
) {
// this function declares the strings to be used and their styling
// plus the styling of the whole composition
    Column {
        // start of row 1
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFEADDFF))
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = textComposable,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = textComposableDescription,
                    textAlign = TextAlign.Justify
                )
            }

            Column(
                modifier = Modifier
                    .background(color = Color(0xFFD0BCFF))
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = imageComposable,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = imageComposableDescription,
                    textAlign = TextAlign.Justify
                )
            }
        }
// end of row 1

        // start of row 2

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFB69DF8))
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = rowComposable,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = rowComposableDescription,
                    textAlign = TextAlign.Justify
                )
            }

            Column(
                modifier = Modifier
                    .background(color = Color(0xFFF6EDFF))
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .fillMaxSize()
                    .padding(16.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = columnComposable,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = columnComposableDescription,
                    textAlign = TextAlign.Justify
                )
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        QuadrantTextInput()
    }
}


