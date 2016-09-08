package loginapp

class PersonController {

    def index() {

    		def students = Students.list()
    		[students:students]
    		}
}
