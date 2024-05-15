package L04_OOPSIV.InterfaceDemo3;

public class JPEGCompressor implements Compressor {
    public void compress(String img){
        System.out.println("Compressing using JPG :"+img);
    }
}
