package L10_Collections;

public class BrowserHistory {
    public String[] webUrls; //change it to treemap
    private int count;

    BrowserHistory(){
        webUrls = new String[10];
        count = 0;
    }

    public void push(String url){
        webUrls[count++] = url;
    }
    public String pop(){
        return webUrls[--count];
    }

    public int getCount(){
        return count;
    }
}
