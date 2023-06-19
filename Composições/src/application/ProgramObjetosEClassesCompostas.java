package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramObjetosEClassesCompostas {

	public static void main(String[] args) throws ParseException {
		
		//Adicionando objetos relcionados a outras classes
		//Chamando um objeto de formatação para datas, e gerando datas nos objetos
		Comment c1 = new Comment("Have a nice trip! \n");
		Comment c2 = new Comment("Wow, thas awesome");
		SimpleDateFormat sdf  =new SimpleDateFormat("dd/MM/yyyy");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveland to New Zeland", "Im going to visit this wonderful country", 12);
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1.toString());		
				

	}

}
