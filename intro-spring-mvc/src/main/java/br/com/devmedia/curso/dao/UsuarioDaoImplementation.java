package br.com.devmedia.curso.dao;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.devmedia.curso.domain.TipoSexo;
import br.com.devmedia.curso.domain.Usuario;

@Repository
public class UsuarioDaoImplementation implements UsuarioDao {
	
	private static List<Usuario> us;

	public UsuarioDaoImplementation() {
		createUserList();
	}
	
	private List<Usuario> createUserList() {
		if (us == null) {
			us = new LinkedList<>();
			us.add( new Usuario(System.currentTimeMillis()+1L, "Ana", "da Silva", LocalDate.of(1994, 11, 8), TipoSexo.FEMININO) );
			us.add( new Usuario(System.currentTimeMillis()+2L, "Jose", "de Almeida", LocalDate.of(1997, 6, 12), TipoSexo.MASCULINO) );
			us.add( new Usuario(System.currentTimeMillis()+3L, "Filomeno", "Espolinari", LocalDate.of(1977, 1, 5), TipoSexo.MASCULINO) );
			us.add(new Usuario(System.currentTimeMillis()+4L, "Amanda", "Mello"));
			us.add(new Usuario(System.currentTimeMillis()+5L, "Amanda", "do meu Coracao"));
			us.add(new Usuario(System.currentTimeMillis()+6L, "Sonia", "Blade"));
			us.add(new Usuario(System.currentTimeMillis()+7L, "Liu", "Kenga"));
		}
		return us;
	}
	
	@Override
	public void salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		usuario.setId(System.currentTimeMillis());
		us.add(usuario);
	}

	@Override
	public void editar(Usuario usuario) {
		// TODO Auto-generated method stub
		us.stream()
			.filter((u) -> u.getId().equals(usuario.getId()))
			.forEach((u) -> {
				u.setNome(usuario.getNome());
				u.setSobrenome(usuario.getSobrenome());
				u.setNascimento(usuario.getNascimento());
				u.setSexo(usuario.getSexo());
			});
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		us.removeIf((u) -> u.getId().equals(id));
	}

	@Override
	public Usuario getId(Long id) {
		// TODO Auto-generated method stub
		return us.stream()
				.filter((u) -> u.getId().equals(id))
				.collect(Collectors.toList()).get(0);
	}

	@Override
	public List<Usuario> getTodos() {
		// TODO Auto-generated method stub
		return us;
	}

}
