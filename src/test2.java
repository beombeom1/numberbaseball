import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(9) + 1;
        int b = random.nextInt(9) + 1;
        while (b == a) {
            b = random.nextInt(9) + 1;
        }
        int c = random.nextInt(9) + 1;
        while (c == a || c == b) {
            c = random.nextInt(9) + 1;
        }
        int strike = 0;
        int ball = 0;
        int x, y, z;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        System.out.println("숫자 야구 3자리");
        int randomNumber = 100 * a + 10 * b + c;
        //System.out.println(randomNumber);
        while (true){
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            x = s / 100;
            y = (s / 10) % 10;
            z = s % 10;
            if(s<100){
                System.out.println("3자리 숫자를 입력해주세요");
                continue;
            }
            if(x==y||y==z||x==z){
                System.out.println("서로 다른 숫자를 입력해주세요");
                continue;
            }
            ArrayList<Integer> numbers2 = new ArrayList<>();
            numbers2.add(x);
            numbers2.add(y);
            numbers2.add(z);
            if(a==x && numbers.indexOf(a) == numbers2.indexOf(x)){
                strike++;
            } else if(numbers.contains(x) && numbers.indexOf(a) == numbers2.indexOf(x)){
                ball++;
            }
            if(b==y && numbers.indexOf(b) == numbers2.indexOf(y)){
                strike++;
            } else if (numbers.contains(y) && numbers.indexOf(b) == numbers2.indexOf(y)){
                ball++;
            }
            if(c==z && numbers.indexOf(c) == numbers2.indexOf(z)){
                strike++;
            } else if (numbers.contains(z) && numbers.indexOf(c) == numbers2.indexOf(z)){
                ball++;
            }
            if(strike == 0 && ball == 0){
                System.out.println("Out");
            }else {
                System.out.println(strike + "strike  " + ball + "ball");
            }
            if(strike==3){
                break;
            }
            strike = 0;
            ball = 0;
        }
        System.out.println("성공하셨습니다.");
    }
}