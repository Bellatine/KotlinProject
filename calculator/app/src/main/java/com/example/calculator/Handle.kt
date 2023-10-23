package com.example.calculator

class Handle {
    private var isFirstNum: Boolean = true
    private var firstNum: Number = Number()
    private var secondNum: Number = Number()
    private var sign: String = ""
    private var result: Float = 0.0f
    private var textView: String = ""
    public fun loadDigits(digits: String){

        this.textView += digits
        if (isFirstNum){
            if(digits.equals(".")&&firstNum.getStrNum().equals("")){
                firstNum.setNum("0")
            }
            firstNum.setNum(digits)
        }else{
            if(digits.equals(".")&&secondNum.getStrNum().equals("")){
                secondNum.setNum("0")
            }
            secondNum.setNum(digits)
        }
    }

    public fun onClickSign(sign: String){
        this.textView += sign
        this.isFirstNum = false
        this.sign = sign

    }

    public fun onClickEqual(){

        if(isFirstNum){
            this.result =  firstNum.getNum()
        }else{
            when(sign){
                "+" -> this.result = firstNum.getNum() + secondNum.getNum()
                "-" -> this.result = firstNum.getNum() - secondNum.getNum()
                "x" -> this.result = firstNum.getNum() * secondNum.getNum()
                "/" -> this.result = firstNum.getNum() / secondNum.getNum()
                else -> this.result = firstNum.getNum()
            }
        }
        this.firstNum.setNum(result)
        this.isFirstNum = true
        this.secondNum.clear()
        this.sign=""
        this.textView = result.toString()
    }

    public fun onClickCE(){
        this.firstNum.clear()
        this.secondNum.clear()
        this.result = 0.0f
        this.sign = ""
        this.textView = ""
        this.isFirstNum = true
    }
    public fun onClickC(){
        this.secondNum.clear()
        this.sign=""
        this.isFirstNum = true
        this.textView = firstNum.getStrNum()
    }

    public fun getStrResult(): String{
        return this.result.toString()
    }

    public fun getTextView(): String{
        return textView
    }
}