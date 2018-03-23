public class Word {
//フィールド作成
    private String word;
    private String meaning;

    //コンストラクタ作成
    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    //単語表示メソッドを作成？
    public String getWordMeaning(){
        return word + "の意味は" + meaning + "です。";
    }

    //アクセサを作成？
//    public String getWord(){
//        return this.word;
//    }
//    public void setWord(String word){
//        this.word = word;
//    }
//
//    public String getMeaning(){
//        return this.meaning;
//    }
//    public void setWord(String meaning){
//        this.meaning = meaning;
//    }
}
