package org.system;

// using single inhertiance
public class Desktop extends Computer{
	

	public void desktopSize() {
		System.out.println("17 inches");
	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
		
	}	

	}


