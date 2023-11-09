import java.util.Scanner;
public class Task2{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter your English mark out of 100");
int a=ob.nextInt();
System.out.println("Enter your Maths mark out of 100");
int b=ob.nextInt();
System.out.println("Enter your Science mark out of 100");
int c=ob.nextInt();
System.out.println("Enter your Social Science mark out of 100");
int d=ob.nextInt();
System.out.println("Enter your Hindi mark out of 100");
int e=ob.nextInt();
int sum=a+b+c+d+e;
int avg=sum/5;
System.out.println("Total Marks :"+sum);
System.out.println("Average Percentage : "+avg+"%");
if(avg>=90)
{
System.out.println("O Grade");
}
else if(avg>=80 && avg<90){
System.out.println("Grade : A Grade");
}
else if(avg>=70 && avg<80){
System.out.println("Grade : B Grade");
}
else if(avg>=60 && avg<70){
System.out.println("Grade : C Grade");
}
else if(avg>=50 && avg<60){
System.out.println("Grade : D Grade");
}
else{
System.out.println("Fail no Grade");
}

}
}