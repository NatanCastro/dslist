package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entites.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> gameLists = gameListRepository.findAll();
        return gameLists.stream().map(GameListDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList gameList = gameListRepository
          .findById(id).isPresent() ? gameListRepository.findById(id).get() : null;
        return gameList != null ? new GameListDTO(gameList) : null;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
      List<GameMinProjection> list = gameRepository.findByList(listId);

      GameMinProjection movedItem = list.remove(sourceIndex);
      list.add(destinationIndex, movedItem);

      int min = Math.min(sourceIndex, destinationIndex);
      int max = Math.max(sourceIndex, destinationIndex);

      for (int i = min; min <= max; i++) {
        gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
      }
    }
}
