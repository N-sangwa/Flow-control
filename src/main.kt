fun main(){
    oddNumbers()

    println(listOfNames(arrayOf("Nadine", "Hilda","Happiness","Epu","Virginia")))

    robotServesDrinks(12)
    robotServesDrinks(4)
    robotServesDrinks(18)

    multiplesOfNumbers()
}
fun oddNumbers(){
    for (numbers in 1..100){
        if (numbers%2!==0){
            println(numbers)
        }
    }
}
fun listOfNames(name:Array<String>):Int{
    var sum = 0
    name.forEach { nam->
        if (nam.length >5){
            sum++
        }
    }
    return sum
}
fun robotServesDrinks(age:Int){
    if (age<6){
        println("Milk")
    }
    else if (age<15 && age>6){
        println("Fanta Orange")
    }
    else{
        println("Coca Cola")
    }
}
fun multiplesOfNumbers(){
    for (numbers in 1..100){
        if (numbers%3==0 && numbers%5==0){
            println("FizzBuzz")
        }
        else if (numbers%3==0){
            println("Fizz")
        }
        else if (numbers%5==0){
            println("Buzz")
        }
        else{
            println(numbers)
        }
    }
}