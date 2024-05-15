package L04_OOPSIV.InterfaceDemo3;

public class Main {
    public static void main(String[] args) {
        ImageStore store = new ImageStore();
        store.store("myfile.xyz",new JPEGCompressor());
        store.store("somefile.xyz",new PNGCompressor());
        store.store("somefile.xyz",new FastCompressor());
    }
}
