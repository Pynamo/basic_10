package junit;

public class Sample {

    public static String getColor(int rgb) {
        switch (rgb) {
        case 1:
            return "赤";
        case 2:
            // 本来は「緑」
            return "黒";
        case 3:
            return "青";
        }
        throw new IllegalArgumentException();
    }
}
