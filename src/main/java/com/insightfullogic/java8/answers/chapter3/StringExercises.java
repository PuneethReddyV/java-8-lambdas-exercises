package com.insightfullogic.java8.answers.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringExercises {

    // Question 7
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                           .filter(Character::isLowerCase)
                           .count();
    }

    // Question 8
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                      .max(Comparator.comparing(StringExercises::countLowercaseLetters));
    }
    
    public static void mostLowercaseString(List<String> strings) {
        int requiredStringCount = list1.stream().mapToInt(action->{
				
				return (int) action.chars().filter(Character::isLowerCase).count();
				
			}).max().getAsInt();
	list1.stream().forEach(reqStr -> {
			if(reqStr.chars().filter(Character::isLowerCase).count()==requiredStringCount){
				System.out.println(reqStr+" Have highest number of strings "+requiredStringCount);
			}
	});
    }

}
