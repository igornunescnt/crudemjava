package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContatoDAO contatoDao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setNome("João Luis");
		contato.setIdade(27);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		Contato c1 = new Contato();
		c1.setNome("Maria Dias");
		c1.setIdade(23);
		c1.setDataCadastro(new Date());
		c1.setId(3);
		
		//contatoDao.update(c1);
		
		contatoDao.delete(1);
		
		for(Contato c : contatoDao.ListaContatos()) {
			System.out.println("Contato: "+c.getNome());
		}
	}

}
