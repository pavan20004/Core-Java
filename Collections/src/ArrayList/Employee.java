package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
	
	private int id;
	private String ename;
	private String job;
	private double sal;
	
	public Employee(int id,String ename,String job,double sal) {
		this.id=id;
		this.ename=ename;
		this.job=job;
		this.sal=sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public String toString() {
		
		return "id :" + id  + " name :"+ename+" job :"+job+" sal :"+sal; 
	}
	
	
	
	
	public static void main(String[] args) {
		
			List<Employee>list = new ArrayList<>();
		
			list.add(new Employee(02,"Pavan","clerk",2000.00));
			list.add(new Employee(01,"John","manager",10000.00));
			list.add(new Employee(05,"Mike","supervispor",3000.00));
			list.add(new Employee(03,"Rufus","assisant manager",6000.00));
			list.add(new Employee(04,"Chris","clerk",9000.00));
		
//		HashMap<Integer,Employee> sortedMap=map.entrySet().stream().sorted(Map.Entry.comparingByKey())
//		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e2,LinkedHashMap::new));
//		
//		sortedMap.forEach((key,value) -> System.out.println(key+" "+value));
		
	
		Collections.sort(list,new SortById());
		
		list.forEach((sortedList)->System.out.println(sortedList));
		
		
	
		
		
		
	}
	

}
