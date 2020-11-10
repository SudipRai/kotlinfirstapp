package Array

fun main()
{
    val arr= arrayOf(1,2,34,5,6)
    for(i in 0..arr.size-1)
    {
        println(arr[i])
    }
    for(i in 0 until arr.size)
    {
        println(arr[i])
    }
    for(element in arr)
    {
        println(element)
    }
    for(i in arr.indices)
    {
        println(arr[i])
    }
}