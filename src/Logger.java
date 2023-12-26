import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Logger {
    public void loggerWrite(File tempFiles, StringBuilder log) {
        log.append("------------------------------------------------------------ \n");
        try (FileOutputStream fos = new FileOutputStream(tempFiles, true);) {
            byte[] bytes = log.toString().getBytes();
            fos.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public void createFiles(File nameFiles, StringBuilder log) {
        try {
            if (nameFiles.createNewFile()) {
                log.append(date.format(new Date()) + " создан файл " + nameFiles.getName() + "\n");
            } else {
                log.append(date.format(new Date()) + " ошибка создания файла!!! " + nameFiles.getName() + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void createFolder(File nameFolder, StringBuilder log) {
        if (nameFolder.mkdir()) {
            log.append(date.format(new Date()) + " создан каталог " + nameFolder.getName() + "\n");
        } else {
            log.append(date.format(new Date()) + " ошибка создания каталога!!! " + nameFolder.getName() + "\n");
        }
    }
}
