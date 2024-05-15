package L04_OOPSIV.InterfaceDemo3;

public class PNGCompressor implements Compressor{
    public void compress(String img){
        System.out.println("Compressing using PNG Algo :"+img);
    }
}
