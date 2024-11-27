package br.com.silvio.gerenciadorDeTarefas_back_end.user.repository;

import br.com.silvio.gerenciadorDeTarefas_back_end.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
