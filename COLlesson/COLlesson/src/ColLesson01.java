import java.util.Scanner;


public class ColLesson01 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        Word[] words = new Word[10];  //１０の要素を持つwordsという配列変数を作成
        int index = 0; //index = 配列Wordsの要素番号

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in); //キーボードから入力された内容を読み取る
        String input = sc.nextLine();         //スキャナーで読み取った文字列をinputに格納する

            //"e"が入力されるまでキーボード入力を継続する(!は、否定の意味　）
            //while(条件文) {行う処理} →　条件文が正である限り、処理を継続する　　処理：キーボード入力の内容を登録、データ数の把握
            while(!input.equals("e")){
                //tmp = テンポラリ　= 一時的
                String[] tmp = new String[1];        //文字列２つを格納するtmpという配列変数を作成
                tmp = input.split(" ");      //tmp内の文字列を、要素ごとに分割する
                try{
                    Word wd = new Word(tmp[0],tmp[1]);   //オブジェクトwdを実体化し、要素ごとに文字列を格納する　Wordクラスの内容に接続できる
                    words[index] = wd;                  //配列名wordsに、入力されたwdをどんどん格納していく
                    index++;                            //words内に新規の箱(wd)を創る
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("全角スペースが入力されました。半角にしてもう一度入力をお願いします。");
                }
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
                input = sc.nextLine();              //新規のコマンドラインを創る
            }
            //for文にはwhileで回した配列を組み込み、入力したデータを表示させる
            for (int i = 0;i < index; i++){
                System.out.println("単語：" + words[i].getWord() + "　" + "日本語：" + words[i].getMeaning());
            }
        System.out.println(index + "件、登録しました。");
    }
}