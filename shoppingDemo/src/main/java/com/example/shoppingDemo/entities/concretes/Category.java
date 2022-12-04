package com.example.shoppingDemo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parentCategory;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "parentCategory")
    private List<Category> categories;

}
