package ru.belonogov.football.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = GameEvents.TABLE_NAME)
@Data
public class GameEvents {

    public static final String TABLE_NAME = "games_events";
    public static final String SEQ_GEN = TABLE_NAME + "_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_GEN)
    @SequenceGenerator(name = SEQ_GEN, allocationSize = 1)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    @Enumerated(value = EnumType.STRING)
    private Action action;

}
