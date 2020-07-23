package io.github.trashemail.utils.exceptions.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ResultCumulativeEmailsPerDay {
    String day;
    Long count;

    public ResultCumulativeEmailsPerDay(String day, Long count) {
        this.day = day;
        this.count = count;
    }
}
