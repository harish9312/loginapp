package loginapp

class FeedController {

    def index() {



    	def fb  = Feed(params)
    	if(fb.save())
    	{
    		render("SAVED")
    	}


     }

    def save(){


    	def fb  = Feed(params)
    	if(fb.save())
    	{
    		render("SAVED")
    	}

    }
}
