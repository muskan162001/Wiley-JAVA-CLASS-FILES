package Weekly_Assignment_2;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.*;
public class ProductDetail {
	public static void main(String[]args) throws IOException {
		FileOutputStream fout=new FileOutputStream("C:\\Users\\SHALU\\eclipse-workspace1\\wileyjava\\src\\week2_assingment\\Product.csv");
		DataOutputStream dos = new DataOutputStream(fout);  
		Product obj=new Product("Watch",999.67,5);
		Product obj1=new Product("Shoes",567.45,56);
		dos.writeUTF(obj.getName());
	    dos.writeDouble(obj.getPrice());
	    dos.writeInt(obj.getRating());
	    dos.writeUTF(obj1.getName());
	    dos.writeDouble(obj1.getPrice());
	    dos.writeInt(obj1.getRating());
	    dos.close();
	    
        
	    
	    FileInputStream fout1=new FileInputStream("C:\\Users\\SHALU\\eclipse-workspace1\\wileyjava\\src\\week2_assingment\\Product.csv");
		DataInputStream dos1 = new DataInputStream(fout1); 
		List<Product> al = new ArrayList<>();
		try{
			while(true) {
	    String name  = dos1.readUTF();
		Double price = dos1.readDouble();
		int rating = dos1.readInt();
		dos.close();
		Product pr = new Product(name, price, rating);
		al.add(pr);
		//System.out.println("Name:"+name+" Price:"+price+" Rating:"+rating);
		}
		}catch(EOFException e){}
		 for(Product all:al){
			System.out.print(all.getName() + "\t");
             System.out.print(all.getPrice() + "\t");
             System.out.println(all.getRating());	
		 	}
		}
	}