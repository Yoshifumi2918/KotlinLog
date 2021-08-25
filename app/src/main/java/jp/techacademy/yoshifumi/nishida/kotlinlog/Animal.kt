package jp.techacademy.yoshifumi.nishida.kotlinlog

abstract class Animal {

    var name: String
    var age: String
    var hobby: String


    //引数付きコンストラクタ
    constructor(name: String, age: String, hobby: String)
    {

        this.name = name
        this.age = age
        this.hobby = hobby

    }

    abstract fun say()



}