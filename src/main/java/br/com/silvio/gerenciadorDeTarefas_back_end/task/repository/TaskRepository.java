package br.com.silvio.gerenciadorDeTarefas_back_end.task.repository;

import br.com.silvio.gerenciadorDeTarefas_back_end.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {
}
