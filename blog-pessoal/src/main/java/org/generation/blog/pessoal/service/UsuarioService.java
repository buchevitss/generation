package org.generation.blog.pessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.generation.blog.pessoal.model.UserLogin;
import org.generation.blog.pessoal.model.Usuario;
import org.generation.blog.pessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario CadastrarUsuario (Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		
		return usuarioRepository.save(usuario);
		
	}
	
	public Optional <UserLogin>Logar(Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional <Usuario> usuario = usuarioRepository.findByUsuario(user.get().getUsuario());
		
		if (usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha()));
		
			String auth = user.get().getUsuario() + user.get().getSenha();
			byte [] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
			String authHeader = "Basic" + new String(encodeAuth);
			
			user.get().setToken(authHeader);
			user.get().setNome(usuario.get().getNome());
		
			return user;
		}
		return null;
	}
	
}
