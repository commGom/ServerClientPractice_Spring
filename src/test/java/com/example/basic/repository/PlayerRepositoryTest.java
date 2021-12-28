package com.example.basic.repository;

import com.example.basic.model.Player;
import com.example.basic.model.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PlayerRepositoryTest {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    PlayerRepository playerRepository;

    @Test
    public void updateTeam(){
        Team team=teamRepository.findById(2L).get();
        team.setName("B팀");
        teamRepository.save(team);
    }
    @Test
    public void findPlayer(){
        Optional<Player> player = playerRepository.findById(1L);
        Player player1 = player.get();
        String pName=player1.getName();
        Team team=player1.getTeam();
        String tName=team.getName();
        System.out.println(String.format("Player 이름 : %s, Team 이름 : %s",pName,tName));
    }

    @Test
    public void a(){
        //team 생성 후 save -> Player를 넣기 위한 팀 생성하여 DB에 저장
        Team team=new Team();
        team.setName("A팀");
        teamRepository.save(team);

        //팀에 선수 저장
        Player player=new Player();
        player.setName("Hong");
        player.setTeam(team);
        playerRepository.save(player);
    }

    @Test
    public void b(){
        //team 생성 후 save -> Player를 넣기 위한 팀 생성하여 DB에 저장
        Team team=new Team();
        team.setName("A팀");
        teamRepository.save(team);

        //팀에 선수 저장
        Player player=new Player();
        player.setName("Choi");
        player.setTeam(team);
        playerRepository.save(player);
    }

    @Test
    public void c(){
        // findById -> Optional return 되어서 get()해주면 객체 return 받을 수 있다.
        Team team=teamRepository.findById(1L).get();

        //팀에 선수 저장
        Player player=new Player();
        player.setName("Park");
        player.setTeam(team);
        playerRepository.save(player);
    }
}