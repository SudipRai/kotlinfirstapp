package Kotlinbasic

fun main()
{
    print("Enter a number")
    val r= readLine()!!.toFloat()
    val area = calculateArea(_r = r)
    print("Area of $r is $area")
}
fun calculateArea(pi:Float=3.14F, _r: Float):Float
{
    return pi*_r*_r
}