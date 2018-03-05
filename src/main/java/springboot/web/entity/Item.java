package springboot.web.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"description", "price", "amount"})
public class Item extends BaseEntity {

	private String name;

	private String description;

	@Column(columnDefinition = "DECIMAL(6,2)")
	private BigDecimal price;

	private int amount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;
	

	public Item(String name, String description, BigDecimal price, int amount) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", description=" + description + ", price=" + price + ", amount=" + amount
				+ ", getId()=" + getId() + "]";
	}

}
