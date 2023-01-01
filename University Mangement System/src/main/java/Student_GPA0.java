import java.util.Scanner;

public class Student_GPA0 {
    double gpa ;
    int Num_semesters_finished;
    static double [] semesters_GPAs = new double [10] ;
    
    public Student_GPA0() {
        this.gpa = 0.0;
        this.Num_semesters_finished = 0;
        for(int i= 0 ; i<10 ; i++){
        semesters_GPAs [i] =0.0;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getNum_semesters_finished() {
        return Num_semesters_finished;
    }

    public void setNum_semesters_finished(int Num_semesters_finished) {
        this.Num_semesters_finished = Num_semesters_finished;
    }

    public void getSemesters_GPAs() {
//        return semesters_GPAs;
     for(int k =0 ; k < Num_semesters_finished ; k++){
     System.out.println("your GPA IN semester "+ (k+1) +" = " +semesters_GPAs[k]);
     } 
    }

    public void setSemesters_GPAs(double[] semesters_GPAs) {
        this.semesters_GPAs = semesters_GPAs;
    }
    public void GPA (){
        Scanner s = new Scanner (System.in);
        System.out.println("IF You Are New Student Enter YES ,IF Not Enter NO");
        String x = s.next();
        if ("YES".equals(x)){
            System.out.println("your GPA = " + getGpa());
            System.out.println("Number of semesters finished so far = " + getNum_semesters_finished());
            
            
        }
        if ("NO".equals(x)) {
                    System.out.println("Enter Your GPA");
                    setGpa(s.nextDouble());
                    System.out.println("Enter Number of semesters finished so far");
                    setNum_semesters_finished(s.nextInt());
                    for(int j = 0 ; j < getNum_semesters_finished() ; j ++)
                    {
                    System.out.println("Enter Your GPA in Semester " + (j+1));
                    semesters_GPAs [j] = s.nextDouble();
                    
                    
                    
                    }
                    getSemesters_GPAs();
                    
                    

        
        
        
        
        }
        else System.out.println("Wrong Input");
        


}
}
