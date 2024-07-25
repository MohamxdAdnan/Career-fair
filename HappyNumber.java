public class HappyNumber {

    public static void main(String[] args) {
        int number=19;

        System.out.println(isHappy(number));


    }

    public static boolean isHappy(int number){
        int rem = 0;
        int div=0;
        double squareSum=0;

        if (number<10 || number<0){
            return false;
        } else {
            while(number>0 ){
                 div=number/10;
                rem=number%10;
                if(div<=0){
                    number=(int)squareSum;
                }
                System.out.println(rem);
                squareSum= (squareSum+Math.pow(rem,2));
                System.out.println("d"+div);
                number=number/10;
            }
        }
        System.out.println(squareSum);
        if(squareSum==1.0){
            return true;
        }
        return false;
    }
}
