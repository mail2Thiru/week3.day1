package org.student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("int id");
			}
	public void getStudentInfo(int id,String name) {
		System.out.println("int id and Name");
			}

	public void getStudentInfo(String email ,long phonenumber ) {
		System.out.println("email and number");
			}
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(0001);
		std.getStudentInfo(0001, "Thiru");
		std.getStudentInfo("id@g.com", 854785555);
	
		
	}

}
