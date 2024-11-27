package br.com.silvio.gerenciadorDeTarefas_back_end.image.dto;

public class ImageDTO {

    private String id;

    private String url;

    private String fileName;

    public ImageDTO() {}

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
