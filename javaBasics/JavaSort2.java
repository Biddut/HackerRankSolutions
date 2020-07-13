package javaBasics;

import java.util.*;

class Student2 {
	private int id;
	private String fname;
	private double cgpa;

	public Student2(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	
	  public int compareTo(Object o){ Student1 s=(Student1)o; if(cgpa==s.cgpa){
	  if(fname.equals(s.fname)){ return id-s.id; }else{ return
	  fname.compareTo(s.fname); } }else{ if(s.cgpa-cgpa>0) return 1; else return
	  -1; } }
	 
}

class NameComparator2 implements Comparator<Student2> {
	public int compare(Student2 s1, Student2 s2) {
		if (s1.getCgpa() == s2.getCgpa()) {
			if (s1.getFname().equals(s2.getFname())) {
				return s2.getId() - s1.getId();
			} else {
				return s1.getFname().compareTo(s2.getFname());
			}
		} else {
			if (s1.getCgpa() - s2.getCgpa() > 0)
				return 1;
			else
				return -1;
		}

	}
}

//Complete the code
public class JavaSort2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student2> studentList = new ArrayList<Student2>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student2 st = new Student2(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		for (Student2 st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
