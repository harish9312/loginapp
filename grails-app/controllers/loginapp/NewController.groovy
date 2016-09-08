package loginapp

class NewController {
   
//   def scaffold = Students

    def index() { 

    	def user = UserOne.findByUserName("soni");
    	println(user)
		user.userName = 'ROCK'
		user.save(flush:true)

    }
}
