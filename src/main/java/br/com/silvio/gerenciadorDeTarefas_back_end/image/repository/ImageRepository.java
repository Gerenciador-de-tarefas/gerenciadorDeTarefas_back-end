package br.com.silvio.gerenciadorDeTarefas_back_end.image.repository;

import br.com.silvio.gerenciadorDeTarefas_back_end.image.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
