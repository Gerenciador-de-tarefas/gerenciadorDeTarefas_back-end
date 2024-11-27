package br.com.silvio.gerenciadorDeTarefas_back_end.image.service;

import br.com.silvio.gerenciadorDeTarefas_back_end.image.model.Image;
import br.com.silvio.gerenciadorDeTarefas_back_end.image.repository.ImageRepository;
import br.com.silvio.gerenciadorDeTarefas_back_end.user.model.User;
import br.com.silvio.gerenciadorDeTarefas_back_end.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService {
    private ImageRepository imageRepository;
    private UserRepository userRepository;

    public ImageService(ImageRepository imageRepository, UserRepository userRepository) {
        this.imageRepository = imageRepository;
        this.userRepository = userRepository;
    }

    public Image saveImage(String userId, String url, String fileName) {
        Optional<User> userOpt = userRepository.findById(userId);

        if(userOpt.isPresent()) {
            User user = userOpt.get();

            Image image = new Image();
            image.setUrl(url);
            image.setFileName(fileName);
            image.setUser(user);

            user.setImage(image);

            userRepository.save(user);
            return imageRepository.save(image);
        }

        // Adicionar uma exceção para informar que não foi possível
        // salvar a imagem
        return null;
    }

}
