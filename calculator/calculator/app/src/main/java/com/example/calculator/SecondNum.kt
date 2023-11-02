package com.example.calculator

class SecondNum {
    private var num: Float = 0.0f
    private var str_num: String = ""
    public fun setSecondNum(str_num: String){
        this.str_num += str_num
        this.num = this.str_num.toFloat()
    }

    public fun setSecondNum(num: Float){
        this.num = num
    }

    public fun getSecondNum():Float{
        return this.num
    }

    public fun getStrSecondNum(): String{
        return this.str_num
    }
}