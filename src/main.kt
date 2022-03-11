fun main(){

     cousins (arrayOf("Lilian","Tita","Teta","Zion"))
    cities()
    value()
    state(arrayOf("yves","chance","anne"))

}
//Question 1
fun cousins(name:Array<String>){
println(name.contentToString())

}

//Question 2
fun cities(){
    var places=arrayListOf("harare","mumbai","dodoma","jakarta")
    places.forEach { city->
        println(city.capitalize())

    }
}
//Question 3
fun value(){
    var values=arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=values[1]+values[4]
    println(sum)
    var index=values.indexOf(158)
    println(index)
    var element=values.sortedArray()
    println(element.contentToString())


}

//Question 4
fun state(state:Array<String>):Array<String>{
    var yuppies=state
    println(yuppies.contentToString())
    return yuppies
}
