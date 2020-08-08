package com.programem.viajantes;



public class UsuarioRepository extends CrudRepository <Usuario , String> {
    
    Usuario findByLogin(String login);
    
}