package guru.springframework.domain;

import javax.persistence.*;

/**
 * Created by jt on 6/13/17.
 */
public class Recipe {

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    //todo add
    //private Difficulty difficulty;
    private Byte[] image;
    private Notes notes;
}
