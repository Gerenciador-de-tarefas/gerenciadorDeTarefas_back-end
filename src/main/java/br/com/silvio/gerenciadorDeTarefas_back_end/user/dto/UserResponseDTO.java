package br.com.silvio.gerenciadorDeTarefas_back_end.user.dto;

import br.com.silvio.gerenciadorDeTarefas_back_end.image.model.Image;

public class UserResponseDTO {

    private String nome;

    private String email;

    private Image image;

    public UserResponseDTO() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
