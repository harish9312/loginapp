package loginapp

class UsersController {


    def home(){

    }


    def index() { 

    		List std = Students.list()
    		for(int i = 0; i < std.size(); i++) {
            println(std.get(i));

    }
}

	def login(){

		def std = params.username
		def pwd = params.password


		def user = UserOne.findByUserNameAndPassword(params.userName,params.password)

		if(params.userName != null && params.password != null)
		{

		if(user)
		{
		redirect(action : "home")
		}
		else
		{
			println("fail")
		}
        }

	}


}