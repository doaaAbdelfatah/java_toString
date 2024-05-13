package files;

public class Main {
    public static void main(String[] args) {
        TextFile txt = new TextFile("data.txt" , 1500);
        ImageFile img = new ImageFile("photo.png" , 3000);
        AudioFile aud = new AudioFile("song.mp3" , 4500);

        FileOperation [] arr = {txt , img ,aud};

        FileManager fileManager =  new FileManager(arr);
//        fileManager.setFiles(arr);

        fileManager.openAll();
        System.out.println("----------------------");
        fileManager.readAll();
        System.out.println("----------------------");
        fileManager.writeAll();
        System.out.println("----------------------");
        fileManager.closeAll();

    }
}
