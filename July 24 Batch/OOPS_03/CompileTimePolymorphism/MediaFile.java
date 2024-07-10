package OOPS_03.CompileTimePolymorphism;

public class MediaFile {

    // Method overloading, way to achieve compile time polymorphism
    void play(){
        System.out.println("Playing the default music");
    }
    void play(String audioFile){
        System.out.println("Playing "+audioFile);
    }

    int play(int time){
        System.out.println("playing music for "+time);
        return 0;
    }

    void play(String audioFile,int duration){
        System.out.println("Playing "+audioFile+" for "+duration);
    }

    public static void main(String[] args) {
        MediaFile mf = new MediaFile();
        mf.play();
        mf.play("Tum hi ho...");
        mf.play("Tum hi ho...",10);
        mf.play(20);
        mf.play("Twenty");
    }
}
