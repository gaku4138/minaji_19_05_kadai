/*
import java.util.Scanner;


public class ColLesson01 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        Word[] words = new Word[10];

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();

        // ここから記述してください
        // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
        tmp = input.split(" ");

    }
}
*/




import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        Word[] words = new Word[10];

// コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();


//      ここから記述してください
//      例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
        //tmp = input.split(" ");
        String word[] = new String[2];

            while (input != "e"){
                input = sc.nextLine();
                //System.out.println(input);
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            }
            sc.close();
            System.out.println("合計:" + input);

//        do {
//            System.out.println(input);
//            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
//        }while(input != "e");









        //配列作成
//        String word[] = new String[4];
//        word[0] = "フィールド クラスの要素";
//        word[1] = "コンストラクタ 要素を変数化するもの";
//        word[2] = "インスタンス クラスを実体化するもの";
//        word[3] = "クラス インスタンスを作成するための型";

//        String meaning[] = new String[10];
//        meaning[0] = "クラスの要素";
//        meaning[1] = "要素を変数化するもの";
//        meaning[2] = "クラスを実体化するもの";
//        meaning[3] = "インスタンスを作成するための型";


//        for (int i = 0; i < 4; i++) {
//            String[] wordmeaning = input.split("  ");
//            System.out.println(word[i]);
//            //System.out.println("単語：" + word[i] + "  " + meaning[i]);
//            //System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
//        }



    }
}
