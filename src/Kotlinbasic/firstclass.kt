package Kotlinbasic

//Named argument
fun main()
{
    print("Enter first number")
    val a=readLine()!!.toInt()
    print("Enter second number")
    val b=readLine()!!.toInt()
    val c = add(_b = b, _a = a)
    println("Sum $a and $b is $c")
}
fun add(_a:Int,_b:Int):Int{
    return _a+_b
}