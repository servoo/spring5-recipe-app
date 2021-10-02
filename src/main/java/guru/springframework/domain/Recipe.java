package guru.springframework.domain;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * Created by jt on 6/13/17.
 */
@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    //todo add
    //private Difficulty difficulty;

	@Lob
    private Byte[] image;

    @OneToOne
	@Cascade(CascadeType.ALL)
    private Notes notes;
}
