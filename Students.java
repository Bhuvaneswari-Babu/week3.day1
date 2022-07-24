package week3.day1;
public class Students {
	 	
	public void getStudentInfo(int id)
	{
		System.out.println(id);		
	}
	public void getStudentInfo(String name,String email)
	{	
		System.out.println(name);
		System.out.println(email);
	}
	public void getStudentInfo(int phonenumber,String dept)
	{
	System.out.println(phonenumber);
	System.out.println(dept);
	}
	public static void main(String[] args) {
		Students stud=new Students();
		stud.getStudentInfo(5345);
		stud.getStudentInfo("Bhuvana", "bhuvaneswari991105@gmail.com");
		stud.getStudentInfo(9445819,"Ece");

	}
}
