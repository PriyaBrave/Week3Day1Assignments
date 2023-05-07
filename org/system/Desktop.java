package org.system;

public class Desktop extends Computer {

	public void desktopSize(int a) {
		System.out.println("Desktop Size is "+a+" inches");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize(52);
	}

}
