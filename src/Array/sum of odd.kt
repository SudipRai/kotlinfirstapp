package Array

fun main()
{
    val arrr= arrayOf(1,4,6,7,88,99,12,3,23)
    val sum=addOdd(arrr)
    print("Sum of odd number is $sum")
}
fun addOdd(arrr: Array<Int>):Int
{
    var total=0
    for(i in arrr.indices)
    {
        if(arrr[i]%2!=0)
            total=total+arrr[i]

    }
    return total
}