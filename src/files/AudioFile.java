package files;

public class AudioFile extends MyFile implements FileOperation {

    public AudioFile(String fileName, double fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public void open() {
        System.out.println("Open Audio File " + fileName + " with size " + fileSize);
    }

    @Override
    public void close() {
        System.out.println("close Audio File" + fileName + " with size " + fileSize);

    }

    @Override
    public void read() {
        System.out.println("read Audio File " + fileName + " with size " + fileSize);

    }

    @Override
    public void write() {
        System.out.println("write Audio File " + fileName + " with size " + fileSize);

    }
}
