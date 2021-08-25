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


        val dog = Dog("ポチ", "3", "")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.move()


        //課題

        val human = Human("〜〜","〜〜","〜〜")

        human.say()

        human.think()

        var num = 10

        //整数型の変数をnumという名前で作成して、10を代入する
        var num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 -2 * 4 / 2 =" + num1)

        val flag1 = true
        val flag2 = false

        Log.d("kotlintest", "flag1 &&  flag2 =" + (flag1 && flag2))
        Log.d("kotlintest", "flag1 ||  flag2 =" + (flag1 || flag2))

        val num2 = 10
        val num3 = 20

        Log.d("kotlintest", "num2 < num3 =" + (num2 < num3))

        num = 60

        if (num >= 90) {

            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 1

        val message = when (drink) {

            0 -> Log.d("kotlintest", "紅茶を注文しました")
            1 -> Log.d("kotlintest", "ミルクを注文しました")
            2 -> Log.d("kotlintest", "オーダーミスです")
            else -> "コーヒーを注文しました"
        }
        Log.d("kotlintest", "message")

        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の" + i + "回目")
        }
        num = 1

        while(num < 6) {
            Log.d("kotlintest", "while文の" + num + "回目")
            num++
        }
        //Array<Int>型の配列が作成される
        val points = arrayOf(10,6,15,23,17)

        for (i in points)
        {
            Log.d("kotlintest", i.toString())
        }


    }

     private fun total ()
    {
        var sum = 0

        for (i in 1..10)
        {
            sum += i
        }

        Log.d ("kotlinetest",sum.toString())
    }
}
