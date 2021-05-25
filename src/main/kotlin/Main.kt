fun main(args: Array<String>) {

    print("Enter a Age for Simpson: ")
    val ageCheck:String? = readLine()
    if (ageCheck != null && ageCheck.isNotBlank()){

        try {
            Integer.parseInt(ageCheck)
            val age:Int =ageCheck.toInt()
            print("Enter a Name for Simpson: ")
            val name:String? = readLine()!!
            print("Enter a Job for Simpson: ")
            val job:String? = readLine()!!

            val simpson = Simpson(age?:1,name?:"",job?:"")
            simpson.changeHairColor("Yellow")

            println("Simpson is creating....")
            Thread.sleep(3000)
            println("Your simpson ready :))")
            println("${simpson.name} is a/an ${simpson.job} age is ${simpson.age}".also { " :))" })
        }catch (e: NumberFormatException){
            println("Enter a correct number!!")
        }


    }
    else{
        println("Please enter correct types!!")
    }




}

