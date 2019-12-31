public class Constructor{
	public static void main (String[] args){
		Box box1 = new Box (10, 5, 5); //Proses pembuatan box
		Box box2 = new Box (1, 4, 2);
		System.out.println (box1.length);
		System.out.println (box1.height);
		System.out.println (box1.width);
	}
}

class Box{
	double length;
	double height;
	double width;
	
	//Constructor Method
	public Box(double length, double height, double width){
		this.length = length;
		this.height = height;
		this.width = width;
	}
}