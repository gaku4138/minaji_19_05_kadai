public class Word {
//フィールド作成
    private String word;
    private String meaning;

    //コンストラクタ作成
    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word){
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning){
        this.meaning =meaning;
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
