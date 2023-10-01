package com.scaffold.ecommerce.store.app.service.dto.model;

import java.util.List;

/**
 * A classe Security é geralmente usada para implementar recursos de segurança em um sistema.
 * No entanto, o termo "Security" é bastante amplo e pode se referir a várias implementações diferentes,
 * dependendo dos requisitos de segurança do sistema. Vou fornecer um exemplo simplificado de uma
 * classe Security que pode ser usada para controlar o acesso a recursos em um sistema
 * **/
public class Security {
    private List<String> authorizedUsers;

    public Security(List<String> authorizedUsers) {
        this.authorizedUsers = authorizedUsers;
    }

    public boolean isUserAuthorized(String username) {
        return authorizedUsers.contains(username);
    }

    public void grantAccess(String username) {
        authorizedUsers.add(username);
    }

    public void revokeAccess(String username) {
        authorizedUsers.remove(username);
    }
}
