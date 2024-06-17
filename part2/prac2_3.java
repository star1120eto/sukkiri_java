package part2;

public class prac2_3 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前は？");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢は？");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(3);
        String fortuneString = "大凶";
        if (fortune == 1) {
            fortuneString = "大吉";
        } else if (fortune == 2){
            fortuneString = "中吉";
        } else {
            fortuneString = "小吉";
        }
        System.out.println("こんちわ、"+name+ "（"+age+"）さん。あなたの運気は"+fortuneString+"です。");
    }
}
