package br.com.silvio.gerenciadorDeTarefas_back_end.user.dto;

import br.com.silvio.gerenciadorDeTarefas_back_end.image.model.Image;

public class UserDTO {

    private String id;

    private String nome;

    private String email;

    private String senha;

    private Image image;

    public UserDTO() {}

    public String getId() {
        return id;
    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
