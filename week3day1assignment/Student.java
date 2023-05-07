package week3day1assignment;

public class Student {
	
	public void getStudentInfo(int sid) {
		System.out.println("Student ID: "+sid);
	}
	
	public void getStudentInfo(int sid, String sname) {
		System.out.println("Student ID: "+sid+" & Student Name: "+sname);
	}
	
	public void getStudentInfo(String email, long phoneno) {
		System.out.println("Student Email ID: "+email+" & Phone Number: "+phoneno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.getStudentInfo(101);
		st.getStudentInfo(102, "Priya");
		st.getStudentInfo("priya@gmail.com", 123456789L);
	}

}
