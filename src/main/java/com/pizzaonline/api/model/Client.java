package com.pizzaonline.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;

    public Client() {}

    public Client(Long id, String nome, String email, String telefone, String endereco) {
        this.id = id;
        this.name = nome;
        this.email = email;
        this.phone = telefone;
        this.address = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

}


   // @OneToMany(mappedBy = "client")
   // Set<Pedido> pedidos