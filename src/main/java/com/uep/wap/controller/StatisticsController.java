package com.uep.wap.controller;

import com.uep.wap.dto.StatisticsDTO;
import com.uep.wap.model.Statistics;
import com.uep.wap.service.StatisticsService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class StatisticsController {

    private final StatisticsService statisticsService;

    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping(path = "/statistics")
    public Iterable<Statistics> getAllStatistics() {
        return statisticsService.getAllStatistics();
    }

    @PostMapping(path = "/statistics")
    public String addStatistics(@RequestBody StatisticsDTO statisticsDTO) {
        statisticsService.addStatistics(statisticsDTO);
        return "Statistics added!";
    }

    @GetMapping(path = "/statistics/{statisticsId}")
    public Optional<Statistics> findStatisticsById(@PathVariable int statisticsId) {
        return statisticsService.getStatisticsById(statisticsId);
    }

    @GetMapping(path = "/statistics/{aces}")
    public Statistics findStatisticsByAces(@PathVariable int aces) {
        return statisticsService.findStatisticsByAces(aces);
    }

    @GetMapping(path = "/statistics/{winners}")
    public Statistics findStatisticsByWinners(@PathVariable int winners) {
        return statisticsService.findStatisticsByWinners(winners);
    }

    @DeleteMapping(path = "/statistics{statisticsId}")
    public void deleteStatisticsById(@PathVariable int statisticsId) {
        statisticsService.deleteStatisticsById(statisticsId);
    }
}
