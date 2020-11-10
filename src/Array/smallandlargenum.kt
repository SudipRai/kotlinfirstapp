package Array

fun main()
{
    val arrr= arrayOf(1,4,6,7,88,99,12,3,23)
    displaySmall(arrr)
    displayLarge(arrr)
}
fun displaySmall(arrr:Array<Int>)
{
    var small=arrr[0]
    var temp:Int
    for(i in arrr.indices)
    {
      if(small>arrr[i])
      {
          temp=small
          small=arrr[i]
          arrr[i]=small
      }
    }
    println("Smallest number is $small")
}
fun displayLarge(arrr:Array<Int>)
{
    var large=arrr[0]
    var temp:Int
    for(i in arrr.indices)
    {
        if(large<arrr[i])
        {
            temp=large
            large=arrr[i]
            arrr[i]=large
        }
    }
    print("Largest number is $large")
}