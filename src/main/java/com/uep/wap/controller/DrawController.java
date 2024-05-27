package com.uep.wap.controller;

import com.uep.wap.dto.DrawDTO;
import com.uep.wap.model.Draw;
import com.uep.wap.service.DrawService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class DrawController {

    private final DrawService drawService;

    public DrawController(DrawService drawService) {
        this.drawService = drawService;
    }

    @PostMapping(path = "/draws")
    public String addDraw(@RequestBody DrawDTO drawDTO){
        drawService.addDraw(drawDTO);
        return "Draw added!";
    }


    @GetMapping(path = "/draws")
    public Iterable<Draw> getAllDraws(){
        return drawService.getAllDraws();
    }

    @GetMapping(path = "/draws/{draw_id}")
    public Optional<Draw> findDrawById(@PathVariable int draw_id){
        return drawService.findDrawById(draw_id);
    }

    @DeleteMapping(path = "/draws/{draw_id}")
    public String deleteDrawById(@PathVariable int draw_id){
        drawService.deleteDrawById(draw_id);
        return "Draw deleted!";
    }
}
