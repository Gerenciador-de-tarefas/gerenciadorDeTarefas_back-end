package br.com.silvio.gerenciadorDeTarefas_back_end.image.model;

import br.com.silvio.gerenciadorDeTarefas_back_end.user.model.User;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "image_id")
    private String id;

    @Column(name = "url")
    private String url;

    @Column(name = "fileName")
    private String fileName;

    @OneToOne(mappedBy = "image")
    private User user;

    public Image() {}

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
