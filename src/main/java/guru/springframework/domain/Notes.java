package guru.springframework.domain;

import javax.persistence.*;

/**
 * Created by jt on 6/13/17.
 */
@Entity
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@OneToOne
    private Recipe recipe;

	@Lob
    private String recipeNotes;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(final Recipe recipe) {
		this.recipe = recipe;
	}

	public String getRecipeNotes() {
		return recipeNotes;
	}

	public void setRecipeNotes(final String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}
}
