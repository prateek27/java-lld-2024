package L04_OOPSIV.InterfaceDemo3;

public class ImageStore {
    //class that is used on the server to store images on blob storage
    //before storing you can compress the image using JPG or PNG
    // filter given by user (BW Filter, Vivid Filter, Vibrant)
    // print ("Storing the final image")
    // you can get input for compression, filter
    public void store(String fileName,Compressor compressor){
        //use the compressor
        compressor.compress(fileName);
        //same for filter
        //...
        System.out.println("Uploading to blob storage");
    }
}
