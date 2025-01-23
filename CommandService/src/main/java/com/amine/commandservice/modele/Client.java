package com.amine.commandservice.modele;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter


public class Client {
        private Long idClient;
        private String name;
        private String address;

}
