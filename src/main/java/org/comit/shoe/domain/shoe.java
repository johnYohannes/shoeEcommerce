package org.comit.shoe.domain;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
//@Entity
//@Table(name = "Shoe")
public class shoe {
   /*
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Shoe_id_seq")
	    @SequenceGenerator(name = "Shoe_id_seq", sequenceName = "Shoe_id_seq", initialValue = 109, allocationSize = 1)
	    @Column(name = "id")
	 */
	    private Long id;

	  //  @Column(name = "Shoe_title")
	    private String shoeTitle;

	  //  @Column(name = "Shoer")
	    private String shoer;

	  //  @Column(name = "year")
	    private Integer year;
	    
	   // @Column(name = "country")
	    private String country;

	  //  @Column(name = "Shoe_gender")
	    private String shoeGender;

	  //  @Column(name = "fragrance_top_notes")
	    private String fragranceTopNotes;

	  //  @Column(name = "fragrance_middle_notes")
	    private String fragranceMiddleNotes;
	    
	  //  @Column(name = "fragrance_base_notes")
	    private String fragranceBaseNotes;

	  //  @Column(name = "description")
	    private String description;
	    
	  //  @Column(name = "filename")
	    private String filename;
	    
	  //  @Column(name = "price")
	    private Integer price;
	    
	  //  @Column(name = "volume")
	    private String volume;
	    
	  //  @Column(name = "type")
	    private String type;
	    
	 //   @Column(name = "Shoe_rating")
	    private Double ShoeRating;

	  //  @OneToMany
	    @ToString.Exclude
	    private List<Review> reviews;

	   /* @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Shoe Shoe = (Shoe) o;
	        return Objects.equals(id, Shoe.id);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
         }
         */
}