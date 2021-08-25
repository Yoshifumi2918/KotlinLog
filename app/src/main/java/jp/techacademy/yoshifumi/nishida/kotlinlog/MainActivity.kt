package jp.techacademy.yoshifumi.nishida.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.techacademy.yoshifumi.nishida.kotlinlogDog.Dog
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //課題

        val human = Human("〜〜", "〜〜", "〜〜")

        human.say()

        human.think()

        val human1 = Human("西田佳史", "23", "バスケットボール")

        human1.say()

        human1.think()

        val human2 = Human("林貴大", "24", "ゲームをすること")

        human2.say()

        human2.think()

    }

}
