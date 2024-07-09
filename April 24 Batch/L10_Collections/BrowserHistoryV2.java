package L10_Collections;


public class BrowserHistoryV2 {
    public String[] webUrls; //change it to treemap
    private int count;

    BrowserHistoryV2(){
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

    public Iterator iterator(){
        return new ArrayIterator(this);
    }


    public class ArrayIterator implements Iterator{
        private BrowserHistoryV2 history;
        private int index;

        ArrayIterator(BrowserHistoryV2 history){
            this.history = history;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if(index < history.count){
                return true;
            }
            return false;
        }

        @Override
        public String current() {
            return history.webUrls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
