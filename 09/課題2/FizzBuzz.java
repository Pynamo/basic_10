// 1 から順番に数を表示する
// その数が 3 で割り切れるなら "Fizz"、5 で割り切れるなら "Buzz" 、両方で割り切れるなら "FizzBuzz" と表示する
// 最後の数はコマンドライン引数で渡す
// ファイル名は「FizzBuzz.java」とする

public class FizzBuzz {
  public static void main(String[] args) {

    int val = Integer.parseInt(args[0]);

      for (int i = 1; i <= val; i++) {

        if(i % 3 == 0 && i % 5 == 0) {
            System.out.print("FizzBuzz ");
            continue;
        } else if(i % 3 == 0) {
            System.out.print("Fizz ");
            continue;
        } else if(i % 5 == 0) {
            System.out.print("Buzz ");
            continue;
        }

        System.out.print(i + " ");
      }
  }
}