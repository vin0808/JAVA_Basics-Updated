package Day1;

import java.util.Scanner;

//Student class definition
class Student {
	private String name;
	private static String university = "Tekarch";
	private int id;
	private double gdp;

	// Constructor
	public Student(String name, int id, double gdp) {
		this.name = name;
		this.id = id;
		this.gdp = gdp;
		// this.university = "tekarch"; // Set university as "tekarch" for all students
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getGDP() {
		return gdp;
	}

	// Setter for GDP
	public void setGDP(double gdp) {
		this.gdp = gdp;
	}

	// Method to print student information
	public void printStudentInfo() {
		System.out.println("ID: " + id + ", Name: " + name + ", University: " + university + ", GDP: " + gdp);
	}
}

public class Student_info {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Storing 3 students information in the list
		Student[] students = new Student[3];
		System.out.println(students.getClass());

		// Reading student information and storing in the array
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter details for student " + (i + 1) + ": ");
			System.out.print("Enter name: ");
			String name = scanner.next();
			System.out.print("Enter ID: ");
			int id = scanner.nextInt();
			System.out.print("Enter GDP: ");
			double gdp = scanner.nextDouble();

			students[i] = new Student(name, id, gdp);
		}

		// Print all student information
		System.out.println("\nAll Student Information:");
		for (Student student : students) {
			student.printStudentInfo();
		}

		// Update the GDP of a student based on ID

		System.out.print("\nEnter the student ID to update GDP: ");
		int searchId = scanner.nextInt();
		boolean found = false;
		for (Student student : students) {
			if (student.getId() == searchId) {
				System.out.print("Enter the new GDP: ");
				double newGDP = scanner.nextDouble();
				student.setGDP(newGDP);
				System.out.println("GDP updated successfully!");
				student.printStudentInfo();
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No student found with ID " + searchId);
		}

		scanner.close();
	}
}
