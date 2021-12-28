package com.example.basic.repository;

import com.example.basic.model.Player;
import com.example.basic.model.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeamRepositoryTest {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    PlayerRepository playerRepository;

    @Test
    @Transactional
    public void findTeam(){
        Team team=teamRepository.findById(1L).get();
        List<Player> players=team.getPlayers();

    }
}