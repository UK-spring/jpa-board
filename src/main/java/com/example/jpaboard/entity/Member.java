package com.example.jpaboard.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "member")
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private Integer age;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public Member() {
    }

    public Member(String username, String password, Integer age, Board board) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.board = board;
    }
}
