import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

class Logger {
    public void loggerWrite(File tempFiles, StringBuilder log){
        log.append("------------------------------------------------------------ \n");
        try (FileOutputStream fos = new FileOutputStream(tempFiles, true);) {
            byte[] bytes = log.toString().getBytes();
            fos.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
