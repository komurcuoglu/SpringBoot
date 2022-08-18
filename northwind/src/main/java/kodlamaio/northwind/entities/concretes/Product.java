package kodlamaio.northwind.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity //entity demek sen veritabanında bir şeye karşılık geliyorsun demek.
@Table(name="products")

public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int id;
	
	
	@Column(name="category_id")
	private int categoryId;
	
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="unit_in_stock")
	private short unitInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitInStock,String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
		this.quantityPerUnit = quantityPerUnit;
	}

	
}
