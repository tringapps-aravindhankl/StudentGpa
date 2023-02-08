package studentds;
import java.util.logging.*;
import java.util.*;
class StudentTest
{
	private String name;
	private int age;
	private double gpa;
	StudentTest(String name,int age,double gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
	}
	String getname(){
		return name;
	}
	int getage() {
		return age;
	}
	double getgpa() {
		return gpa;
	}
}

public class Student 
{
    private static Scanner scan;

	public static void main( String[] args )
    {
        List <StudentTest> list  =new ArrayList<StudentTest>(); 
        Logger log=Logger.getLogger("hi");
        int i = 1;
        scan = new Scanner(System.in);
        System.out.println("how many students details entered:");
        int option=scan.nextInt();
        
        while(i<=option){
        	
        log.info("Enter Name");
        String name=scan.next();
        
        log.info("Enter Age");
        int age=scan.nextInt();
        
        log.info("Enter gpa");
        double gpa=scan.nextDouble();
        
        i++;
        
        list.add(new StudentTest(name,age,gpa));
        }
        log.info("List the Students:");		
        for(int j=0;j<list.size();j++) {
        	System.out.print(list.get(j).getname()+" ");
        	System.out.print(list.get(j).getage()+" ");
        	System.out.print(list.get(j).getgpa()+" ");
        	System.out.println("");
        }
        
        Collections.sort(list,new Comparator<StudentTest>(){
        	public int compare(StudentTest s1,StudentTest s2) {
        		return Double.compare(s2.getgpa(),s1.getgpa());
        	}
        });
        
        
        System.out.println("Sorted List");
        for(int j=0;j<list.size();j++) {
        	System.out.print(list.get(j).getname()+" ");
        	System.out.print(list.get(j).getage()+" ");
        	System.out.print(list.get(j).getgpa()+" ");
        	System.out.println("");
        }
        
    }
}
