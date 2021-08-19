package jp.techacademy.yoshifumi.nishida.kotlinlogDog

import android.util.Log

 open class Dog {
    //プロパティ
    var name: String
    var age: Int

    //引数付きコントラクタ
    constructor(name: String, age: Int ) {

        this.name = name
        this.age = age

    }


    //メソッド
    open fun say() {
        Log.d ("kotlintest", this.name + "(" + this.age + "歳）" + "[ワンワン]")

    }




    }
