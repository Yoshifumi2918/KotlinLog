package jp.techacademy.yoshifumi.nishida.kotlinlogDog

import android.util.Log
import jp.techacademy.yoshifumi.nishida.kotlinlog.Animal
import jp.techacademy.yoshifumi.nishida.kotlinlog.Movable


open class Dog: Animal, Movable {
    // 引数付きコンストラクタ
    constructor(name: String, age: String, hobby: String): super(name, age, hobby) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}

