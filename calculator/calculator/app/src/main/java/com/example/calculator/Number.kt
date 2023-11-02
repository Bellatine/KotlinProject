package com.example.calculator

class Number {
    private var num: Float = 0.0f
    private var str_num: String = ""

    public fun setNum(str_num: String){
        this.str_num += str_num
//        if(str_num != ".") {
//            this.num = this.str_num.toFloat()
//        }
//        println(this.str_num + "-=-=-=-=-=-=-=-=-")
    }

    public fun setNum(num: Float){
        this.num = num
        this.str_num = num.toString()
    }

    public fun getNum(): Float{
//        println( "$num +-=-=-=-=-=-=-=-=-")
        this.num = this.str_num.toFloat()
        return this.num
    }

    public fun getStrNum(): String{
        return this.str_num
    }

    public fun clear(){
        this.str_num = ""
        this.num = 0.0f
    }



}