package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.awt.print.Book;
import java.util.Set;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioID;

    @OneToOne
    private Client client;

    @OneToMany
    private Set<PortfolioSecurity> PortfolioSecurities;

    public Portfolio(){
    }

    public Portfolio(Client client){
        this.client = client;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public void setPortfolioID(Long portfolioID) {
        this.portfolioID = portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<PortfolioSecurity> getPortfolioSecurities() {
        return PortfolioSecurities;
    }

    public void setPortfolioSecurities(Set<PortfolioSecurity> portfolioSecurities) {
        this.PortfolioSecurities = portfolioSecurities;
    }
}
