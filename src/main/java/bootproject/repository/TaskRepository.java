package bootproject.repository;

import org.springframework.data.repository.CrudRepository;

import bootproject.task.task;

public interface TaskRepository extends CrudRepository<task, Integer>  {

}
