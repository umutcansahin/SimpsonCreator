class Simpson{

    //property
    var age:Int = 0
    var name: String = ""
    var job:String = ""
    private var hairColor: String = ""

    constructor(ageInput:Int, nameInput:String,jobInput:String){
        this.age = ageInput
        this.name = nameInput
        this.job = jobInput
    }

    fun changeHairColor(hairColor: String){
        this.hairColor = hairColor
    }
    fun getHairColor() : String{
        return hairColor
    }

}