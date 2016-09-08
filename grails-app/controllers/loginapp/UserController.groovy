package loginapp

class UserController {

    def index() {


    	def name = params.username
    	println(name)

    	def uid = UserOne.findByUserName(name)
    	println(uid)

		def uname = uid.userName
		println(uname)


     }

}
