package org.comit.shoe.Bean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//import javax.persistence.*;
import java.util.Objects;


//@Entity
@Getter
@Setter
@ToString
//@Table(name = "order_item")
public class orderItem {
	 /*  @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_seq")
	    @SequenceGenerator(name = "order_item_seq", sequenceName = "order_item_seq", initialValue = 12, allocationSize = 1)
	    @Column(name = "id")
	   */
	    private Long id;

	    //@Column(name = "amount")
	    private Long amount;

	    //@Column(name = "quantity")
	    private Long quantity;

	   // @OneToOne
	    private shoe Shoe;

	   // @Override
	  //  public boolean equals(Object o) {
	  //      if (this == o) return true;
	  //      if (o == null || getClass() != o.getClass()) return false;
	       // OrderItem orderItem = (OrderItem) o;
	       // return Objects.equals(id, orderItem.id);
	   // }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
          }
}
