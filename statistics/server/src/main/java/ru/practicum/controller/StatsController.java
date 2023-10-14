package ru.practicum.controller;


import org.springframework.web.bind.annotation.*;
import ru.practicum.HitDto;
import ru.practicum.StatsDto;
import ru.practicum.service.StatsService;


import java.util.List;

@RestController
public class StatsController {
    private final StatsService statsService;


    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @PostMapping("/hit")

    }
}
