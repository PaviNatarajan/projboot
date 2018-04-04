package bootproject.service;

import org.springframework.stereotype.Service;

import bootproject.repository.TaskRepository;

@Service
public class taskservice {

	private final TaskRepository taskrepository;
	public taskservice(TaskRepository taskrepository) {
		this.taskrepository=taskrepository;
	}
}
