package chapters.chapter_07.Exercises_07;

public class Exercise7_13 {
    public static void main(String[] args) {
        int[] numbers ={1,3,5,7,9,11,13};
        System.out.println("The random number : "+ randomNumber(numbers));
    }
    public static int randomNumber(int... numbers){
        int randomNum = (int)(1+ Math.random()*15);
        for(int n : numbers){
            if(randomNum==n){
                return randomNumber(numbers);
            }
        }
        return randomNum;
    }
}
