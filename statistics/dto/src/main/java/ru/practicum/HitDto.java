package ru.practicum;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HitDto {

    private Long id;
    private String app;
    private String uri;
    private String ip;
