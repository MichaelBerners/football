package ru.belonogov.football.domain.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = Player.TABLE_NAME)
@Data
public class Player {

    public static final String TABLE_NAME = "players";
    public static final String SEQ_NAME = TABLE_NAME + "_id_seq";
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Player.SEQ_NAME)
    @SequenceGenerator(name = Player.SEQ_NAME, allocationSize = 1)
    private Long id;
    private String name;
    private int number;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;





}
