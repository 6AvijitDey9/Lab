package Assignment;
public class Student {
	public void calculateFeesStructure(Long studentId, Character studentGrade, Double monthlyFees, Boolean isScholarshipEligible) { //Method to check and give responce accordingly with given inputs
		if(studentId!=0 && studentGrade=='A' && isScholarshipEligible==true) {
			Double fees = (monthlyFees - (monthlyFees*10/100));
			System.out.println("Student Grade: " + studentGrade);
			System.out.println("Monthly Fees: " + monthlyFees);
			System.out.println("10% fees is exempted, The calculated fees is: " + fees);} 
		else if(studentId!=0 && studentGrade=='B' && isScholarshipEligible==true) {
			Double fees = (monthlyFees - (monthlyFees*8/100));
			System.out.println("Student Grade: " + studentGrade);
			System.out.println("Monthly Fees: " + monthlyFees);
			System.out.println("8% fees is exempted, The calculated fees is: " + fees);} 
		else if(studentId!=0 && studentGrade=='C' && isScholarshipEligible==true) {
			Double fees = (monthlyFees - (monthlyFees*6/100));
			System.out.println("Student Grade: " + studentGrade);
			System.out.println("Monthly Fees: " + monthlyFees);
			System.out.println("6% fees is exempted, The calculated fees is: " + fees);}
		else if(studentId!=0 && studentGrade=='D' && isScholarshipEligible==true) {
			Double fees = (monthlyFees - (monthlyFees*4/100));
			System.out.println("Student Grade: " + studentGrade);
			System.out.println("Monthly Fees: " + monthlyFees);
			System.out.println("4% fees is exempted, The calculated fees is: " + fees);}
		else { System.out.println("Not Eligible for Exemption");}}
	public void compareMarks(Long Maths, Double English) { //Method to check and give responce accordingly with given inputs
		if(English>Maths) {System.out.println("English mark is higher than Maths");}
		else if(English<Maths) {System.out.println("Maths mark is higher than English");}
		else {System.out.println("Both are Equal");}}
	public void validateFees(Double Fees) { //Method to check and give responce accordingly with given inputs
		if(Fees.isInfinite()==true) {System.out.println("Fees is infinite");}
		else if(Fees.isInfinite()==false) {System.out.println("Fees is not infinite");}
		else {System.out.println(Fees.byteValue());}}

	public static void main(String[] args) { //Main Method
		Student St = new Student();
		System.out.println("First Method Test......");
		St.calculateFeesStructure((long)234, 'C', (double)600, true);
		St.calculateFeesStructure((long)115, 'B', (double)909.50, true);
		St.calculateFeesStructure((long)980, 'G', (double)1810, false);
		System.out.println("Next Method Test......");
		St.compareMarks((long)65, (double)85);
		St.compareMarks((long)98, (double)56);
		St.compareMarks((long)84, (double)84);
		System.out.println("Next Method Test......");
		St.validateFees(900.45);
	}

}
