package oop_117367_danielkurniag.week08

class NotificationService{
    fun sendEmail(emailAdress:String){
        println("Mengirim email ke $emailAdress")
    }

    fun processUser(user: UserProfile){
        //send.email(user:email) will result in an error

        if (user.email != null){
            //SUCCESS via smart casting, compiler will know 'user.email' will not null on this block
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}