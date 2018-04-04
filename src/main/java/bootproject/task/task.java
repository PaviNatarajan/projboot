package bootproject.task;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	private String name;
	private String desc;
	private Date date;
	private boolean finished;
	
	public task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public task(String name, String desc, Date date, boolean finished) {
		super();
		this.name = name;
		this.desc = desc;
		this.date = date;
		this.finished = finished;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	

}
