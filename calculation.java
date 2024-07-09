import java.lang.Math;
import java.util.Scanner;
class area_parimeter{
    Scanner sc=new Scanner(System.in);
    double pi=3.14;
    int x,y;
    void area(){
        System.out.println("Enter the side: ");
        x=sc.nextInt();
        System.out.println();
        System.out.println("the area of square= "+Math.pow(x, 2));
        System.out.println();
    }

    void perimeter(){
        System.out.println("Enter the length of the square: ");
        x=sc.nextInt();
        System.out.println();
        System.out.println("The area of the square= "+(4*x));
        System.out.println();
    }

    void area(int m,int n){  
        int a=m*n;
        System.out.println();
        System.out.println("the area of rectangle= "+a);
        System.out.println();
    }

    void perimeter(int m,int n){
        System.out.println();
        System.out.println("The perimeter of rectangle= "+(2*(m+n)));
        System.out.println();
    }

    void area(int r){  
        double a=pi*r*r;
        System.out.println();
        System.out.println("the area of cercle= "+a);
        System.out.println();
    }

    void perimeter(int r){
        double p=2*pi*r;
        System.out.println();
        System.out.println("The perimeter of rectangle= "+p);
        System.out.println();
    }

    void perimeter(int a,int b,int c){
        System.out.println();
        System.out.println("The perimeter of triangle= "+(a+b+c));
        System.out.println();
    }

    void area(int a,int b,int c){  
        double s=(a+b+c)/2;
        double p=s*(s-a)*(s-b)*(s-c);
        double q=Math.sqrt(p);
        System.out.println();
        System.out.printf("the area of triangle= %.2f\n",q);
        System.out.println();
    }

}

class calculator{
    Scanner sc=new Scanner(System.in);
    int x,y;
    public void sum(){
        System.out.println("Enter two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println();
        System.out.println(x+" + "+y+" = "+(x+y));
        System.out.println();
    }

    public void sub(){
        System.out.println("Enter two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println();
        System.out.println(x+" - "+y+" = "+(x-y));
        System.out.println();
    }

    public void mul(){
        System.out.println("Enter two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println();
        System.out.println(x+" * "+y+" = "+(x*y));
        System.out.println();
    }

    public void div(){
        System.out.println("Enter two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        double r=x/y;
        System.out.println();
        System.out.printf("%d / %d =%.2f",x,y,r );
        System.out.println();
    }
}

class si{
    Scanner sc=new Scanner(System.in);
    int  cp,sp;
    int p,t,r;
    void profit_loss(){
        System.out.println("Enter the cost price: ");
        cp=sc.nextInt();
        System.out.println("Enter the selling price: ");
        sp=sc.nextInt();
        System.out.println();
        if (cp<sp){
            System.out.println("profit = "+(sp-cp));
            System.out.println();
        }
        else{
            System.out.println("lose = "+(cp-sp));
            System.out.println();
        }
    }

    void simple_intrest(){
        System.out.println("Enter the principle price: ");
        p=sc.nextInt();
        System.out.println("Enter the time: ");
        t=sc.nextInt();
        System.out.println("Enter the rate: ");
        r=sc.nextInt();
        double n=(p*t*r)/100;
        System.out.println();
        System.out.println("The total simple intrest = "+n);
        System.out.println();
    }
}

public class calculation {
    Scanner sc=new Scanner(System.in);
    int mchoice;
    int choice;
    char ch;
    void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Manculation\n2. Calculator\n3. Simple Intrest\n4. exit");
        mchoice=sc.nextInt();
    }

    void submenu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Square\n2. Rectangle\n3. Cercle\n4. Triangle");
        choice=sc.nextInt();
    }

    void sbmenu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Area\n2. Perimeter");
        choice=sc.nextInt();
    }

    void calsubmenu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. +\n2. -\n3.*\n4. /");
        ch=sc.next().charAt(0);
    }

    void sisubmenu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Profit and lose\n2. Simple Intrest");
        choice=sc.nextInt();
    }

    void greed(){
        System.out.println("---!!! Thank you for using !!!---");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        area_parimeter ap=new area_parimeter();
        calculator cl=new calculator();
        si s=new si();
        calculation c=new calculation();
        int m,n,o,radious;
        do{
            c.menu();
            switch (c.mchoice){
                case 1:
                c.submenu();
                switch (c.choice){
                    case 1:
                    c.sbmenu();
                    switch (c.choice) {
                        case 1:
                        ap.area();
                        break;
                        case 2:
                        ap.perimeter();
                        break;
                        default:
                        System.out.println("Invalid choice!!");
                    }
                    break;
                    case 2:
                    c.sbmenu();
                    switch (c.choice){
                        case 1:
                        System.out.println("Enter the length of the rectangle: ");
                        m=sc.nextInt();
                        System.out.println("Enter the bredth of the rectangle: ");
                        n=sc.nextInt();
                        ap.area(m,n);
                        break;
                        case 2:
                        System.out.println("Enter the length of the rectangle: ");
                        m=sc.nextInt();
                        System.out.println("Enter the bredth of the rectangle: ");
                        n=sc.nextInt();
                        ap.perimeter(m, n);
                        break;
                        default: 
                        System.out.println("Invalid choice!!");
                    }
                    break;
                    case 3:
                    c.sbmenu();
                    switch (c.choice){
                        case 1:
                        System.out.println("Enter the radious of the circle: ");
                        radious=sc.nextInt();
                        ap.area(radious);
                        break;
                        case 2:
                        System.out.println("Enter the radious of the circle: ");
                        radious=sc.nextInt();
                        ap.perimeter(radious);
                        break;
                        default:
                        System.out.println("Invalid choice!!");
                    }
                    break;
                    case 4:
                    c.sbmenu();
                    switch (c.choice){
                        case 1:
                        System.out.println("Enter the side1 of triangle: ");
                        m=sc.nextInt();
                        System.out.println("Enter the side2 of triangle: ");
                        n=sc.nextInt();
                        System.out.println("Enter the side3 of triangle: ");
                        o=sc.nextInt();
                        ap.area(m, n, o);
                        break;
                        case 2:
                        System.out.println("Enter the side1 of triangle: ");
                        m=sc.nextInt();
                        System.out.println("Enter the side2 of triangle: ");
                        n=sc.nextInt();
                        System.out.println("Enter the side3 of triangle: ");
                        o=sc.nextInt();
                        ap.perimeter(m, n, o);
                        break;
                        default:
                        System.out.println("Invalid choice!!");
                    }
                    break;
                    default:
                    System.out.println("Invalid choice!!");

                }
                break;
                case 2:
                c.calsubmenu();
                switch (c.ch){
                    case '+':
                    cl.sum();
                    break;
                    case '-':
                    cl.sub();
                    break;
                    case '*':
                    cl.mul();
                    break;
                    case '/':
                    cl.div();
                    break;
                    default:
                    System.out.println("Invalid choice!!");
                }
                break;
                case 3:
                c.sisubmenu();
                switch (c.choice){
                    case 1:
                    s.profit_loss();
                    break;
                    case 2:
                    s.simple_intrest();
                    break;
                    default:
                    System.out.println("Invalid choice!!");
                }
                break;
                case 4:
                c.greed();
                break;
                default:
                System.out.println("Invalid choice!!");
            }
        }while(c.mchoice !=4);
        sc.close();    
    }
}
