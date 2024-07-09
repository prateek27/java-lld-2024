package L10_Collections;

public class BrowerHistoryClient {
    public static void main(String[] args) {
        BrowserHistoryV2 history = new BrowserHistoryV2();
        history.push("instagram.com");
        history.push("Linkedin.com");
        history.push("google.com");
        history.pop();
        history.push("chat.openai.com");

        //Iterate on my container
        // problem here - code is tighly coupled with BrowserHistory class
        // if internal storage changes then this code will have to change
        /*
        for(int i=0;i<history.getCount();i++){
            System.out.println(history.webUrls[i]);
        }
         */

        Iterator it = history.iterator();
        while(it.hasNext()){
            System.out.println(it.current());
            it.next();
        }
    }
}
