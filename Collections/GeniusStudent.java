package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class GeniusStudent implements Comparable<GeniusStudent> {
	
	int id;
	String name;
	
	public GeniusStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int hashCode() {
		return Objects.hash(id, name);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeniusStudent other = (GeniusStudent) obj;
		return id == other.id && Objects.equals(name, other.name);
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GeniusStudent [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(GeniusStudent o) {
		// TODO Auto-generated method stub
		if(id == o.id) {
			return 0;
		}
		else if(id > o.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
	//	CustomArrayList list = new CustomArrayList();
		
	//	list.add(1);
	//	list.add(2);
	//	list.add(1);
	//	list.add(4);
	//	list.add(3);
	//	list.add(6);
	//	list.add(6);
		
	//	System.out.println(list);
		
		
		
		Set<GeniusStudent> setStudent = new HashSet<>();
		
		GeniusStudent gst1 = new GeniusStudent(101, "Shalu");
		GeniusStudent gst2 = new GeniusStudent(101, "Shalu");
		GeniusStudent gst3 = new GeniusStudent(103, "Mishra");
		
		setStudent.add(gst1);
		setStudent.add(gst2);
		setStudent.add(gst3);
		Collections.sort((List) setStudent);
		System.out.println(setStudent);
	}
}