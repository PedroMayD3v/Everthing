package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy HH:mm:ss");
	
	Date moment;
	String title;
	String content;
	Integer likes;
	
  List<Comment> comments = new ArrayList<>(); //Chamando a lista do tipo Comment para faer composição/relação
                                              //Entre classes e objetos	
	public Post() {}
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}	
	
	
	//Vale smp ressaltar, nunca deixar o metodo setter para listas para nao ser subistituida ou tocada
	// e sim manipular a lista como abaixo:

	
	public void addComent(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComent(Comment comment) {
		comments.remove(comment);
	}
	
	
	//Trabalhando com o StringBUilder
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		//Criando comentarios tipo lista no StringBuilder com o for-each
		for(Comment c : comments) {
			sb.append(c.getText());
		}
		
		return sb.toString();
	}
	
	

}
