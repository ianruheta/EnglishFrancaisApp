package com.englishfrancaisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//this app will take any number (in written form) from english and translate it in french
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Button trigger function (Calling the button)
        clickbutton.setOnClickListener {it: View
            var englishtxt:String =english.text.toString()
            when(englishtxt){

                //All Combination of possible single number that makes up all numbers, so if any number under a billion is entered it should give you a french translation
                "Zero"->francais.text="Zero"
                "One"->francais.text="Un"
                "Two"->francais.text="Deux"
                "Three"->francais.text="Trois"
                "Four"->francais.text="Quatre"
                "Five"->francais.text="Cinq"
                "Six"->francais.text="Six"
                "Seven"->francais.text="Sept"
                "Eight"->francais.text="Huit"
                "Nine"->francais.text="Neuf"
                "Ten"->francais.text="Dix"
                "Eleven"->francais.text="Onze"
                "Twelve"->francais.text="Douze"
                "Thirteen"->francais.text="Treize"
                "Fourteen"->francais.text="Quatorze"
                "Fifteen"->francais.text="Quinze"
                "Sixteen"->francais.text="Seize"
                "Seventeen"->francais.text="Dix-Sept"
                "Eighteen"->francais.text="Dix-Huit"
                "Nineteen"->francais.text="Dix-Neuf"
                "Twenty"->francais.text="Vingt"
                "Thirty"->francais.text="Trente"
                "Forty"->francais.text="Quarante"
                "Fifty"->francais.text="Cinquante"
                "Sixty"->francais.text="Soixante"
                "Seventy"->francais.text="Soixante-dix"
                "Eighty"->francais.text="Quatre-vingts"
                "Ninety"->francais.text="Quatre-vingt-dix"
                "Hundred"->francais.text="Cent"
                "Thousand"->francais.text="Milles"
                "Million"->francais.text="Un Million"
                "Billion"->francais.text="Milliard"
                "And"->francais.text="Et" //some number in written form either in english or french need "and" conjunction ex: hundred and one, vingt et un
                else->francais.text="The number entered doesn't exist or it's bigger than a trillion"  //if a number is bigger than a trillion it won't be able to work (Limit of the app = 999,999,999,999)

            }

        }
    }
}