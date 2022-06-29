
public class InterOperabilityJava {

    public static void main(String args[]){
        int sum = Sample.add(3,4);
        System.out.println("Sum is "+sum);

        System.out.println("Area is "+Sample.findArea(2));
    }

    public static int getMax(int a, int b){
        return a>b? a:b;
    }

}
