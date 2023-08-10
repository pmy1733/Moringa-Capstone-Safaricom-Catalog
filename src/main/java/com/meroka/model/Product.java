package com.meroka.model;
import jakarta.persistence.*;
import lombok.*;


//mark class as an Entity
    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name="products")
    @Builder
    public class Product
    {
        //Defining book id as primary key
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long productId;
        private String itemName;
        private String team;
        private String division;
        private String description;
        private String link;

//        public Product(String itemName, String team, String division, String description, String link) {
//            this.itemName = itemName;
//            this.team = team;
//            this.division = division;
//            this.description = description;
//            this.link = link;
//        }
    }
