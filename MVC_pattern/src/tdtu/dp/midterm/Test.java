package tdtu.dp.midterm;

public class Test {
	   public static void main(String[] args) {

	      //fetch student record based on his roll no from the database
	      Student model  = retriveStudentFromDatabase();

	      //Create a view : to write student details on console
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setStudentName("Huyen");

	      controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase(){
	      Student student1 = new Student();
	      student1.setName("Phat");
	      student1.setRollNo("21");
	     
	      
	      return student1;
	      
	   }
	}