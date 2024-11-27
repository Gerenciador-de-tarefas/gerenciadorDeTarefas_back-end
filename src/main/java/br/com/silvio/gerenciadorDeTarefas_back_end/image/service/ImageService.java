package br.com.silvio.gerenciadorDeTarefas_back_end.image.service;

import br.com.silvio.gerenciadorDeTarefas_back_end.image.repository.ImageRepository;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    private ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }


}
