package Assignment14;

public class Question2 {
    public void wrapperToPrimitive(){
        double num1=33.33;
        double num2=33.33;

        int num3=(int)num2;

        System.out.println("Double object "+num1);
        System.out.println("Double primitive "+num2);
        System.out.println("Double primitive "+num3);
    }

    static void main(String[] args){
        Question2 q2=new Question2();
        q2.wrapperToPrimitive();
    }
}
