package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.Station;
import com.evrentalsystem.evRentalSystem.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StationService {
    private final StationRepository stationRepository;

    public List<Station> getAll() {
        return stationRepository.findAll();
    }

    public Station save(Station station) {
        return stationRepository.save(station);
    }
}
