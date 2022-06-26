package com.storeapp.crud.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ProductoDto {

    @NotBlank
    private String category;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @Min(0)
    private Float unitPrice;
    @NotBlank
    private String imageUrl;
    @NotBlank
    private boolean active;
    @NotBlank
    private int unitsInStock;
    @NotBlank
    private Date lastUpdated;

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ProductoDto(String category, String name,
                       String description, Float unitPrice, String imageUrl,
                       boolean active, int unitsInStock) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.imageUrl = imageUrl;
        this.active = active;
        this.unitsInStock = unitsInStock;
    }

    public ProductoDto() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
