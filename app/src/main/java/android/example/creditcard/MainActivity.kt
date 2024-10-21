package android.example.creditcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.example.creditcard.ui.theme.CreditCardTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreditCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    ) {
//
//                    }
                    DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards(){
    val cards = listOf(
        CardInfo("2211 1122 4343 3434",
            "Joshua AY",
            R.drawable.mastercard,
            R.drawable.background1
        ),

        CardInfo("2211 1122 4343 3434",
            "Joshua AY",
            R.drawable.visa,
            R.drawable.background3
        ),

        CardInfo("2211 1122 4343 3434",
            "Joshua AY",
            R.drawable.mastercard,
            R.drawable.background4
        ),

        CardInfo("2211 1122 4343 3434",
            "Joshua AY",
            R.drawable.visa,
            R.drawable.background2
        ),
    )

    LazyColumn(modifier = Modifier
        .fillMaxHeight()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        items(cards){
                card -> CreditCard(cardInfo = card)
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
fun DisplayCardsPreview() {
    CreditCardTheme {
        DisplayCards()
    }
}
