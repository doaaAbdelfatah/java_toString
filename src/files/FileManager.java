package files;

public class FileManager {
    private  FileOperation[] files  ;

    public FileManager(FileOperation[] files) {
        this.files = files;
    }

    public FileOperation[] getFiles() {
        return files;
    }

    public void setFiles(FileOperation[] files) {
        this.files = files;
    }

    void openAll(){
//        String [] names ={"ahmed" ,"sara"};
//        for (String n :names){
//            System.out.println(n);
//        }

        for (FileOperation f : files){
            f.open();
        }
    }

    void  closeAll(){
        for (FileOperation f : files){
            f.close();
        }
    }

    void  writeAll(){
        for (FileOperation f : files){
            f.write();
        }
    }
    void  readAll(){
        for (FileOperation f : files){
            f.read();
        }
    }
}
