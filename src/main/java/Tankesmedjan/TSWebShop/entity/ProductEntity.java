package Tankesmedjan.TSWebShop.entity;

import javax.persistence.*;

@Entity
@Table(name="Products")
public class ProductEntity {
    private int productId;
    private int categoryId;
    private String productName;
    private String shortDescription;
    private String fullDescription;
    private Double productPrice;
    private int taxId;

    public ProductEntity() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }
}
