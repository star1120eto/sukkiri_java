package part2;

public class func_test {
    public static void main(String[] args) {
        System.out.println("改行せずに文字を出力");
        
        int m = Math.max(2, 12);
        System.out.println("Math.max()は多き数字を選択。大きかったのは"+m);

        String n = "999";
        int na=Integer.parseInt(n);
        System.out.println("Integer.parseInt()は文字を数値に変換する。999は最初文字だけど数値にすると → "+na);

        int r = new java.util.Random().nextInt(1000);
        System.out.println("私は"+r+"歳です。");
    }
}
