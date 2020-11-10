package Array

fun main()
{
    val arrr= arrayOf(1,4,6,7,88,99,12,3,23)
    displayEven(arrr)
}
fun displayEven(arrr: Array<Int>)
{
    println("Even number are")
    for(i in arrr.indices)
    {
        if(arrr[i]%2==0)
            println(arrr[i])
    }
}