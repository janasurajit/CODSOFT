
import java.util.Scanner;


class gradeCalculator{
    public static void main(String[] args) {
        float Bengali,English,Mathmatics,Physics,Chemistry,Biology;
       try( Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the obtained marks in Bengali (out of 100)");
        Bengali=sc.nextFloat();
        System.out.println("Enter the obtained marks in English (out of 100)");
        English=sc.nextFloat();
        System.out.println("Enter the obtained marks in Mathmatics (out of 100)");
        Mathmatics=sc.nextFloat();
        System.out.println("Enter the obtained marks in Physics (out of 100)");
        Physics=sc.nextFloat();
        System.out.println("Enter the obtained marks in Chemistry (out of 100)");
        Chemistry=sc.nextFloat();
        System.out.println("Enter the obtained marks in Biology (out of 100)");
        Biology=sc.nextFloat();
       }
      
        float totalSum=Bengali+English+Mathmatics+Physics+Chemistry+Biology;
        System.out.println("Total Marks: "+totalSum);
        float avaragePercentage=(totalSum/600)*100;
        System.out.printf("Avarage Percentage: %.2f \n",avaragePercentage);
       
        if(avaragePercentage<25.0){
            System.out.println("Grade: D");
        }
        else if((avaragePercentage>=25.0)&&(avaragePercentage<35.0)){
             System.out.println("Grade: C");
        }
        else if((avaragePercentage>=35.0)&&(avaragePercentage<45.0)){
             System.out.println("Grade: B");
        }
        else if((avaragePercentage>=45.0)&&(avaragePercentage<60.0)){
             System.out.println("Grade: B+");
        }
        else if((avaragePercentage>=60.0)&&(avaragePercentage<80.0)){
             System.out.println("Grade: A");
        }
        else if((avaragePercentage>=80.0)&&(avaragePercentage<90.0)){
             System.out.println("Grade: A+");
        }
        else if((avaragePercentage>=90.0)&&(avaragePercentage<=100.0)){
             System.out.println("Grade: AA");
        }
    }
}