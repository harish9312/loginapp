package loginapp

class DisplayController {

def pno
def std1
def std
    def index() { 

    	std = Display.findByName("Harish")
		

		std1=std.pno
		println(std1)
		pno = std1
		println(pno)
		[pno:pno]

    }

    def update(){

    	String s = params.pno
    	println(s)
    	std.pno = s
		println(std1)
		std.save()

    }

}
