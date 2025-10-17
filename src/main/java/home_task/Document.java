package home_task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


abstract class Document implements Saveable, Displayable{
    public String title;
    protected String author;
    protected LocalDateTime createdDate;
    protected LocalDateTime modifiedDate;

    public Document(String title, String author) {
        this.title = title;
        this.author = author;
        this.createdDate = LocalDateTime.now();
        this.modifiedDate = createdDate;
    }

    public abstract String getContent();
    public abstract void setContent(String content);

    protected void updateModifiedDate(){
        this.modifiedDate = LocalDateTime.now();
    }

    @Override
    public String getSummary() {
        return String.format("Документ: '%s', Автор: '%s', Создан: '%s'",
                title, author, createdDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
    }
}
