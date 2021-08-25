package jp.techacademy.yoshifumi.nishida.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {


    //superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: String, hobby: String): super(name, age,hobby) {
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {

        Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")

    }
    //Thinkインターフェイスのメソッドをオーバーライド
    override fun think() {


        Log.d("kotlintest", "私は" + this.hobby + "について考える")

    }

}