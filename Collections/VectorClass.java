package Collections;

import java.util.*;

public class VectorClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int size=1000000;
		List<Integer>arrayList=new ArrayList<>();
		Long start =System.currentTimeMillis();
		for (int i=0;i<size;i++) {
			arrayList.add(i);
		}
		long end=System.currentTimeMillis();
		System.out.println("Time taken to add "+size+" values: "+(end-start));
		
		List<Integer>vectorList=new Vector<>();
		start =System.currentTimeMillis();
		for (int i=0;i<size;i++) {
			arrayList.add(i);
		}
		end=System.currentTimeMillis();
		System.out.println("Time taken to add "+size+"values in vector: "+(end-start));
		
		
		///multithreaded apporch
	//imp	List<Integer>multithreadarrayList=new ArrayList<>();
		List<Integer>multithreadarrayList=Collections.synchronizedList(new ArrayList<>());
		start =System.currentTimeMillis();
		Thread t1=new Thread(()->{
			for(int i=0;i<size;i++) {
				multithreadarrayList.add(i);
			}
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<size;i++) {
				multithreadarrayList.add(i);
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		 end=System.currentTimeMillis();
		 System.out.println(multithreadarrayList.size());
		System.out.println("Time taken to add "+size+" values: "+(end-start));
		
		List<Integer>multithreadvector=new Vector<>();
		start =System.currentTimeMillis();
		Thread t3=new Thread(()->{
			for(int i=0;i<size;i++) {
				multithreadvector.add(i);
			}
		});
		Thread t4=new Thread(()->{
			for(int i=0;i<size;i++) {
				multithreadvector.add(i);
			}
		});
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		
		 end=System.currentTimeMillis();
		 System.out.println(multithreadvector.size());
		System.out.println("Time taken to add "+size+" values in vector: "+(end-start));
		
		
	}

}