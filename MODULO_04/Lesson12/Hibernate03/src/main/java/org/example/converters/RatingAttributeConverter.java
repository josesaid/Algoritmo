package org.example.converters;

import org.example.enums.Rating;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RatingAttributeConverter implements AttributeConverter<Rating, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Rating attribute) {
        if (attribute == null)
            return null;

        switch (attribute) {
            case ONE:
                return 1;

            case TWO:
                return 2;

            case THREE:
                return 3;

            case FOUR:
                return 4;

            case FIVE:
                return 5;

            default:
                throw new IllegalArgumentException(attribute + " not supported.");
        }
    }

    @Override
    public Rating convertToEntityAttribute(Integer dbData) {
        if (dbData == null)
            return null;

        switch (dbData) {
            case 1:
                return Rating.ONE;

            case 2:
                return Rating.TWO;

            case 3:
                return Rating.THREE;

            case 4:
                return Rating.FOUR;

            case 5:
                return Rating.FIVE;

            default:
                throw new IllegalArgumentException(dbData + " not supported.");
        }
    }

}
