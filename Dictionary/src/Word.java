public class Word {
    private String word_target;
    private String word_explain;

    Word() {
        word_target="";
        word_explain="";
    }
    /**
     * initial Word.
     *
     * @param word_target  is word target.
     * @param word_explain is word explain.
     */
    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }

    /**z
     * getter & setter for Word.
     */
    public String getWord_target() {
        return this.word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return this.word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
}
