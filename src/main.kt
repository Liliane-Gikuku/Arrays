fun main(){

     cousins("Lilian","Tita","Teta","Zion")
    cities()

     value(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))

    var name = state("Lilian", "Ganza","Teta")
    println(name.contentToString())

}

//Question 4
fun state(a:String,b:String,c:String):Array<String>{
    var name=arrayOf(a,b,c)
    return name
}
//Question 1
fun cousins(a:String,b:String,c:String,d:String){
    var names= arrayOf(a,b,c,d)
     println(names.contentToString())

}

//Question 2
fun cities() {
    var places = arrayListOf("harare", "mumbai", "dodoma", "jakarta")
    places.forEach { city ->
        println(city.capitalize())

    }
}

    fun  value(numbers:Array<Int>){
    var values=arrayOf(numbers)
    println(values)

    var sum=numbers[1]+ numbers[4]
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    println(numbers.sortedArray().contentToString())


}


