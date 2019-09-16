import java.util.Scanner;

public class QuadraticEquation {
        private double a,b,c;
        public QuadraticEquation(){

        }
        public QuadraticEquation(double a,double b,double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double getDiscriminant(){
            double denta=this.b*this.b -4*this.a*this.c;
            return denta;
        }
        public double getroot1(){
            return (-this.b+ Math.sqrt(getDiscriminant()))/2*this.a;
        }
        public double getroot2(){
            return (-this.b-Math.sqrt(getDiscriminant()))/2*this.a;
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap gia tri a:");
        double a=scanner.nextDouble();
        System.out.println("Nhap gia tri b:");
        double b =scanner.nextDouble();
        System.out.println("Nhap gia tri c:");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has two roots "+quadraticEquation.getroot1()+" and "+quadraticEquation.getroot2());
        }
        else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has one root "+quadraticEquation.getroot2());
        }
        else {
            System.out.println("The quation has no roots");
        }
    }
}
