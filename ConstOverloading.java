public class ConstOverloading{
	public static void main (String[] args){
		Box box1 = new Box (10, 5, 5); //Proses pembuatan box
		Box box2 = new Box (1, 4, 2);
		Box box3 = new Box ("Balok");
		System.out.println (box1.length);
		System.out.println (box2.height);
		System.out.println (box3.nama);
	}
}

class Box{
	String nama;
	double length;
	double height;
	double width;
	
	//Constructor Method
	public Box (String nama){
		this.nama = nama;
	}
	
	public Box(double length, double height, double width){
		this.length = length;
		this.height = height;
		this.width = width;
	}
}