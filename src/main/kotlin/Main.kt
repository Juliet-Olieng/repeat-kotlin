fun main() {
 schoolName()

    //question2
   var y=sentence("juliet",25)
    println(y)

    //question three
    val name="juliet"
println(name.length)

    //question four
    name("kaitlin")
    name("Whitney")
}
//question one
fun schoolName(){
    val schoolName=("Akirachix")
    val output="${schoolName[0]}${schoolName[2]}${schoolName[3]}"
    println(output)
}
//question2
fun sentence(name:String,age:Int):String{
    var statement=("my name is $name,am $age years old")
    return statement
}
//question3
fun length(name:String):Int{
    return name.length
}
//question4
fun name(givenName:String){
    val name1="Whitney"
    if (name1 == givenName) {
        println("that's me")
    }
        else{
        println("that's not me")
    }
    }



