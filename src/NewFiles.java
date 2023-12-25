import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class NewFiles {
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
}