package org.system;
/*Assignment1
===========
Package   :org.system
Class        :Computer
Methods   :computerModel()

Class        :Desktop
Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.*/

public class Desktop extends Computer {
	
	public int desktopSize() {
		return 16;
	}

	public static void main(String[] args) {
		Desktop myDesktop=new Desktop();
		System.out.println("Desktop Model "+myDesktop.computerModel());
		System.out.println("Desktop Size "+myDesktop.desktopSize()+"inches");

	}

}
