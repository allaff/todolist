package br.com.allaff.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String nome;
    
    @Column(unique = true)
    private String username;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    // public String getNome() {
    //     return nome;
    // }

    // public void setUsername(String username) {
    //     this.username = username;
    // }
    
    // public String getUsername() {
    //     return username;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public String getPassword() {
    //     return password;
    // }
}
