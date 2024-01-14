package ru.belonogov.football.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = Team.TABLE_NAME)
@Data
public class Team {

    public static final String TABLE_NAME = "teams";
    public static final String SEQ_GEN = TABLE_NAME + "_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_GEN)
    @SequenceGenerator(name = SEQ_GEN,sequenceName = SEQ_GEN, allocationSize = 1)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "team")
    private List<Player> players;
    @OneToMany(mappedBy = "team1")
    private List<Game> games1;
    @OneToMany(mappedBy = "team2")
    private List<Game> games2;

}
