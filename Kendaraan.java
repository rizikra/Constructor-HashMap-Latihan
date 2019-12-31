public class Kendaraan{
	public static void main (String[] args){
		Motor motor = new Motor();
		System.out.println (motor.Merk);
	}
}

class Motor{
	String Merk;
	String Type;
	String Warna;
	String cc;
	
	public Motor (){
		this.Merk = "Piaggio Vespa";
		this.Type = "Primavera i-get";
		this.Warna = "Hitam Doff";
		this.cc = "150 cc";
	}
}
	