package io.npcloud.contracts.vrp;

import java.util.List;

public interface IVerify {

    List<String> verify(String prefix);

    default void notNull(String field, Object value, List<String> errors){
        if(value == null){
            errors.add(field + " is null");
        }
    }

    default void notEmpty(String field, String value, List<String> errors){
        if(value == null || value.isEmpty()){
            errors.add(field + " is null or empty");
        }
    }

    default void validNonNegative(String field, Long value, List<String> errors){
        if(value == null){
            errors.add(field + " is null ");
            return;
        }
        if(value < 0){
            errors.add(field + " is less than 0");
        }
    }

    default void validNonNegative(String field, Integer value, List<String> errors){
        if(value == null){
            errors.add(field + " is null ");
            return;
        }
        if(value < 0){
            errors.add(field + " is less than 0");
        }
    }

    default void validNonNegative(String field, Double value, List<String> errors){
        if(value == null){
            errors.add(field + " is null ");
            return;
        }
        if(value < 0){
            errors.add(field + " is less than 0");
        }
    }

    default  void notEmpty(String field, List value, List<String> errors){
        if(value == null || value.isEmpty()){
            errors.add(field + " (list) is null or empty");
        }
    }
}
