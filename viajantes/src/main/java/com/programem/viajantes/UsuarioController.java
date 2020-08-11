package com.programem.viajantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    private Lista lista = new Lista();
    private BCryptPasswordEncoder Enconder = new BCryptPasswordEncoder();

    @GetMapping("/")
    public String usuarioForm(){
        return "usuarioForm";
    }

    @PostMapping(path ="/insere")
    public @ResponseBody String addNewUsuario(
        @RequestParam String login,
        @RequestParam String nomeCompleto,
        @RequestParam String senha
    ){
        Usuario u = new Usuario();

        u.setLogin(login);
        u.setNomeCompleto(nomeCompleto);
        u.setSenha(Enconder.encode(senha));

        usuarioRepository.save(u);

        return "Usuário cadastrado!";
    }

}