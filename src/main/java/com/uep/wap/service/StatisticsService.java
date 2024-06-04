package com.uep.wap.service;

import com.uep.wap.dto.StatisticsDTO;
import com.uep.wap.model.Match;
import com.uep.wap.model.Statistics;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.repository.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatisticsService {

    @Autowired
    private StatisticsRepository statisticsRepository;
    @Autowired
    private MatchRepository matchRepository;

    public void addStatistics(StatisticsDTO statisticsDTO) {
        Statistics statistics = new Statistics();
        statistics.setAces(statisticsDTO.getAces());
        statistics.setDoubleFaults(statisticsDTO.getDoubleFaults());
        statistics.setFirstServe(statisticsDTO.getFirstServe());
        statistics.setSecondServe(statisticsDTO.getSecondServe());
        statistics.setWinners(statisticsDTO.getWinners());

        if(!statisticsDTO.getMatchDate().isEmpty()) {

            Match match = matchRepository.findByDate(statisticsDTO.getMatchDate());
            statistics.setMatch(match);
        }

        statisticsRepository.save(statistics);
        System.out.println("Statistics added!");


    }

    public Iterable<Statistics> getAllStatistics() {
        return statisticsRepository.findAll();
    }

    public Optional<Statistics> getStatisticsById(int statisticID) {
        return statisticsRepository.findById(statisticID);
    }

    public void deleteStatisticsById(int statisticID) {
        statisticsRepository.deleteById(statisticID);
    }

    public Statistics findStatisticsByAces(int aces){
        return statisticsRepository.findByAces(aces);
    }

    public Statistics findStatisticsByWinners(int winners){
        return statisticsRepository.findByWinners(winners);
    }


}
