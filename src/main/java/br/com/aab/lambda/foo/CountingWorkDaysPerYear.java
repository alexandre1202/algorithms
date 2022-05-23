package br.com.aab.lambda.foo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountingWorkDaysPerYear {

    public Map<String, Long> getWorkDaysPerYear(int year) {
        Map<String, Long> mapWorkDays = new LinkedHashMap<>();
        EnumSet<DayOfWeek> weekends = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);

        Stream.of(Month.values()).forEach(month -> {
            YearMonth yearMonth = YearMonth.of(year, month);
            long countWeekDays =
                    IntStream.rangeClosed(1, yearMonth.lengthOfMonth())
                            .filter(day -> !weekends.contains(getDayOfWeek(year, month, day))).count();
            mapWorkDays.put(month.toString(), countWeekDays);
        });
        return mapWorkDays;
    }

    public DayOfWeek getDayOfWeek(final int year, final Month month, final int day) {
        return LocalDate.of(year, month, day).getDayOfWeek();
    }
}
