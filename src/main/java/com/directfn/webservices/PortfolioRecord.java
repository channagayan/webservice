package com.directfn.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: channas
 * Date: 12/5/13
 * Time: 9:37 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PortfolioRecord")
public class PortfolioRecord {

    private String portfolioNo;
    private String exchange;
    private String currency;
    private int netHoldings;
    private double averageCost;
    private int sellPending;
    private int pledgedQty;
    private int buyPending;
    private double averagePrice;
    private double marginDue;
    private int openBuyCount;

    public PortfolioRecord() {
    }

    public String getPortfolioNo() {
        return portfolioNo;
    }

    public void setPortfolioNo(String portfolioNo) {
        this.portfolioNo = portfolioNo;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getNetHoldings() {
        return netHoldings;
    }

    public void setNetHoldings(int netHoldings) {
        this.netHoldings = netHoldings;
    }

    public double getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(double averageCost) {
        this.averageCost = averageCost;
    }

    public int getSellPending() {
        return sellPending;
    }

    public void setSellPending(int sellPending) {
        this.sellPending = sellPending;
    }

    public int getPledgedQty() {
        return pledgedQty;
    }

    public void setPledgedQty(int pledgedQty) {
        this.pledgedQty = pledgedQty;
    }

    public int getBuyPending() {
        return buyPending;
    }

    public void setBuyPending(int buyPending) {
        this.buyPending = buyPending;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public double getMarginDue() {
        return marginDue;
    }

    public void setMarginDue(double marginDue) {
        this.marginDue = marginDue;
    }

    public int getOpenBuyCount() {
        return openBuyCount;
    }

    public void setOpenBuyCount(int openBuyCount) {
        this.openBuyCount = openBuyCount;
    }
}
