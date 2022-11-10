/*
 * 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan3_Inheritance;

public class Gajah extends Hewan{
	//meng-overwrite method pada class Hewan

	private static Gajah myGajah;

	public static void testClassMethod() {
		System.out.println("The Class Method in Hewan");
	}
	
	//meng-overwrite method pada class Hewan
	public void testInstanceMethod() {
		System.out.println("The Instance Method in Gajah");
	}
	
	public static void main (String args[]) {
		setMyGajah(new Gajah());
		Hewan myHewan = myGajah();
		Hewan.testClassMethod();
		myHewan.testInstanceMethod();
		
	}

	private static Hewan myGajah() {
		return null;
	}

	public static Gajah getMyGajah() {
		return myGajah;
	}

	public static void setMyGajah(Gajah myGajah) {
		Gajah.myGajah = myGajah;
	}
	
		
}

	


