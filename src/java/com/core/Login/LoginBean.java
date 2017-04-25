/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.Login;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import org.primefaces.context.RequestContext;

/**
 *
 * @author JUSAH
 */
@ManagedBean(name="login")
@RequestScoped
public class LoginBean {
    private String username;
    private String password;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    
    }
    
    public LoginBean() {
    }
    
        public void login(){
          RequestContext context = RequestContext.getCurrentInstance();
          context.execute("swal('Login Success!', 'Congratulations! you are logged in', 'success')");
            
        }
    }
    

