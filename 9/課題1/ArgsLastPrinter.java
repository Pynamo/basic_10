public class ArgsLastPrinter {
  public static void main(String[] args) {

    int len = args.length;

    if(len > 0) {
        System.out.println(args[args.length - 1]);
    } else {
        System.out.println("なし");
    }
  }
}