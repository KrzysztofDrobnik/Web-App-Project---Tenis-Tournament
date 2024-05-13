package com.uep.wap.service;

import com.uep.wap.dto.DrawDTO;
import com.uep.wap.model.Draw;
import com.uep.wap.repository.DrawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DrawService {

    @Autowired
    private DrawRepository drawRepository;

    public void addDraw(DrawDTO drawDTO){
        Draw draw = new Draw();
        draw.setRound(drawDTO.getRound());
        draw.setMatches(drawDTO.getMatches());
        drawRepository.save(draw);
        System.out.println("Draw added!");
    }

    public Iterable<Draw> getAllDraws(){
        return drawRepository.findAll();
    }

    public Optional<Draw> findDrawById(int draw_id){
        return drawRepository.findById(draw_id);
    }

    public void deleteDrawById(int draw_id){
        drawRepository.deleteById(draw_id);
    }
}
