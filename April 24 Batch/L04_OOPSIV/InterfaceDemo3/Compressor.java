package L04_OOPSIV.InterfaceDemo3;

public interface Compressor {
    // public void compress(String img);
    default void compress(String img){
        System.out.println("Compressing img");
    }
}
