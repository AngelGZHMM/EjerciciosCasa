package com.example.boletines.Boletin0

fun multiplicar(a: Int, b: Int){
    println("El resultado de la multiplicación es: ${a*b}")
}

fun esPar(a:Int): Boolean{
    if(a%2==0){
        return true
    }else{
        return false

    }
}

fun main(){
    multiplicar(2,3)
    println(esPar(2))
    println(esPar(3))
}