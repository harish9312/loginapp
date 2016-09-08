package loginapp

class RegController {
String us
		
    def index() { 

//    	render("Registered"}

}
	def save(){

		
    	def users = new Reg(params)
    	if(users.save())
    	{	
    		us = params.user
    		println(us)
    		redirect(cotroller:"reg"  , action:"add_fb")
    	}
	}

	def add_fb(){


    	    def user1 = [us:us]
    	    println(user1)
    	    [user1:user1]
    	    

	}
	def regs(){
		println(params)
		def fb  = new Feed(params)
    	if(fb.save())
    	{
    		render("SAVED")
    	}
	}

}
