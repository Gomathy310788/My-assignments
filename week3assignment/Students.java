package week3assignment;

public class Students {

	
	public void getStudentInfo(int id,String name) {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
	public void getStudentInfo(String email,Long phoneNo) {
	System.out.println("Mail ID:"+email);
	System.out.println("Phone Number:"+phoneNo);

}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(31,"Gomathy");
		obj.getStudentInfo("gomathy310788@gmail.com",8939155123L);
	}


	
	}


