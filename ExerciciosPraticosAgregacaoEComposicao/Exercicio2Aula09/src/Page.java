public class Page {
    private int numPages;
    private String content;

    public Page(int numberOfPages, String content) {
        this.numPages = numberOfPages;
        this.content = content;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getContent() {
        return content;
    }
}