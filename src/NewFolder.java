import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

class NewFolder {
    SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    public void createFolder(File nameFolder, StringBuilder log) {
        if (nameFolder.mkdir()) {
            log.append(date.format(new Date()) + " создан каталог " + nameFolder.getName() + "\n");
        } else {
            log.append(date.format(new Date()) + " ошибка создания каталога!!! " + nameFolder.getName() + "\n");
        }
    }
}