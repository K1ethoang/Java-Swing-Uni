package JTextArea.model;

public class SearchModel {
    private String text;
    private String keyword;
    private String result;

    public SearchModel() {
        this.text = "";
        this.keyword = "";
        this.result = "";
    }

    public String getText() {
        return text;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getResult() {
        return result;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void search() {
        int count = 0;
        int position = 0;
        while (!this.text.isEmpty() && !this.keyword.isEmpty()) {
            int i = this.text.indexOf(this.keyword, position);
            if (i == -1) {
                // khong tim thay
                break;
            } else {
                count++;
                position = i + 1;
            }
        }
        this.result = "Kết quả: có " + count + " " + "'" + this.keyword + "'";
    }
}
