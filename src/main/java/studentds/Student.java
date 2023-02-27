package studentds;
import java.util.logging.*;
import java.util.*;

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
        	log.info(list.get(j).getname()+" ");
        	log.info(list.get(j).getage()+" ");
        	log.info(list.get(j).getgpa()+" ");
        	log.info("");
        }
        
        Collections.sort(list,new Comparator<StudentTest>(){
        	public int compare(StudentTest s1,StudentTest s2) {
        		return Double.compare(s2.getgpa(),s1.getgpa());
        	}
        });
        
        
        System.out.println("Sorted List");
        for(int j=0;j<list.size();j++) {
        	log.info(list.get(j).getname()+" ");
        	log.info(list.get(j).getage()+" ");
        	log.info(list.get(j).getgpa()+" ");
        	log.info("");
        }
        
    }
}
