package jp.techacademy.yoshifumi.nishida.kotlinlog

import android.util.Log
import jp.techacademy.yoshifumi.nishida.kotlinlogDog.Dog


class BigDog: Dog{

    //superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int): super(name,age) {}

        override fun say() {

            super.say()
            Log.d("kotlintest" , "大きな力です。")
        }
    }


