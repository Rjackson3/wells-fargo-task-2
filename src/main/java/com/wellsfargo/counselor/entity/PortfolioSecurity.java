package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Portfolio portfolio;

    @ManyToOne
    private Security security;

    @Column(nullable = false)
    private int purchaseQuantity;

    public PortfolioSecurity() {
    }

    public PortfolioSecurity(Portfolio portfolio, Security security, int purchaseQuantity) {
        this.portfolio = portfolio;
        this.security = security;
        this.purchaseQuantity = purchaseQuantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }
}
