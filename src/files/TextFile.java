package files;

public class TextFile extends MyFile implements FileOperation {

    public TextFile(String fileName, double fileSize) {
        super(fileName, fileSize);

    }

    @Override
    public void open() {
        System.out.println("Open Text File " + fileName + " with size " + fileSize);
    }

    @Override
    public void close() {
        System.out.println("close Text File " + fileName + " with size " + fileSize);

    }

    @Override
    public void read() {
        System.out.println("read Text File " + fileName + " with size " + fileSize);

    }

    @Override
    public void write() {
        System.out.println("write Text File " + fileName + " with size " + fileSize);

    }
}
