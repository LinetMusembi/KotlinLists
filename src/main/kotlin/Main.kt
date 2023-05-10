fun main() {
    checkNums()
    println( names("Lynet","Irene","Emmily").contentToString())
    var people = listOf(
        People("lynet",19,50,50.0),
        People("Essy",24,7,60.6),
        People("Jemmimah",13,9,70.5)
    )

    var sortedPeople = people.sortedByDescending { it.age }
    println(sortedPeople)


}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)

fun checkNums(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sorted())
}
//2. Given a list of Person objects, each with the attributes, name, age, height, and weight.
//Sort the list in order of descending age (2 points)
data class People(var name:String,var age:Int,var height:Int,var weight:Double)




//3. Create a function that takes in 3 names and returns a string array containing all 3 names.
fun names(name1:String,name2:String,name3:String):Array<String>{
    var friends = arrayOf(name1,name2,name3)
    return friends

}
//4. Write a function that takes in a list of Car objects each with a registration and mileage attribute
//and returns the average mileage of all the vehicles in the list.

fun vehicle(registration:String,mileage:Double){

}