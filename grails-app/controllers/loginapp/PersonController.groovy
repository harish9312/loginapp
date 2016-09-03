package loginapp

class PersonController {

    def index() {

    		def students = Students.list()
    		String std = Students.get(2)
    		println(std)
    		}
}
