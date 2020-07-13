package javaBasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class Student1 {
	int id;
	String name;
	double cgpa;

	public Student1(int id, String name, double cgpa) {

		this.id = id;
		this.name = name;
		this.cgpa = cgpa;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

}

class Priorities {

	public List<Student1> getStudents(List<String> events) {
		
		PriorityQueue<Student1> pq = new PriorityQueue(10, new MyComparator());

		int i = 0;
		while (i < events.size()) {
			if (events.get(i).equals("SERVED")) {
				pq.poll();
			} else {
				String[] attributes = events.get(i).split("\\s");
				Student1 student1 = new Student1(Integer.parseInt(attributes[3]), attributes[1],
						Double.parseDouble(attributes[2]));
				pq.offer(student1);
			}
			i++;
		}

		//for(int i=0;i<events.size();i++){
		//  Student s=(Student)events.get(i);
		//  pq.add(s);
		//}

		List<Student1> l = new ArrayList<Student1>();
		while (!pq.isEmpty()) {
			l.add(pq.poll());

		}
		return l;
	}

}

class MyComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		Double cgpa1 = s1.getCgpa();
		Double cgpa2 = s2.getCgpa();
		String n1 = s1.getName();
		String n2 = s2.getName();
		Integer i1 = s1.getId();
		Integer i2 = s2.getId();
		if (Double.compare(s2.getCgpa(), s1.getCgpa()) == 0) {
			if (n1.compareTo(n2) == 0) {
				return i1.compareTo(i2);
			} else {
				return n1.compareTo(n2);
			}
		} else {
			return Double.compare(s2.getCgpa(), s1.getCgpa());
		}

	}

}

public class JavaPriorityQueue {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student1> student1s = priorities.getStudents(events);

		if (student1s.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student1 st : student1s) {
				System.out.println(st.getName());
			}
		}
	}
}