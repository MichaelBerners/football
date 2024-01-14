package ru.belonogov.football.domain.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "games")
@Data
public class Game {

    public static final String TABLE_NAME = "games";
    public static final String SEQ_GEN = TABLE_NAME + "_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_GEN)
    @SequenceGenerator(name = SEQ_GEN, allocationSize = 1)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "team1_id")
    private Team team1;
    @ManyToOne
    @JoinColumn(name = "team2_id")
    private Team team2;
    @Column(name = "goals_team1")
    private int goalsTeam1;
    @Column(name = "goals_team2")
    private int goalsTeam2;
    @Column(name = "match_date")
    private Date matchDate;
    @OneToMany(mappedBy = "game")
    private List<GameEvents> gameEvents;
    


}
