import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks: ");
        int marks=sc.nextInt();
        
        if(marks>=90){
            System.out.println("A");
        }
        else if(marks>=70){
            System.out.println("B");
        }
        else if(marks>=50){
            System.out.println("C");
        }
        else if(marks>=35){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}

