package com.directfn.webservices;

import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: channas
 * Date: 12/3/13
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Order")

public class Order {
   // private String orderID;
   // private String portfolioNo;

    private long clOrderID;     //   692
    private String portfolioNo;  //     P000000028
    private String symbol;       //     HEXP.N000
    private String securityExchange;  //  LKCSE
    private String orderType;        //   2
    private String issueCurrency;    //  LKR
    private int side;              //    2
    private int quantity;          //    1000
    private double stopPx ;        //    0
    private int timeInForce ;      //    0
    private String expireTime;     //    5/20/2011
    private int minQty;            //    100
    private int  maxFloor;         //    0
    private long origClOrderID;    //    -1
    private String orderID;        //    A-ARR-2011/05/20-52746
    private String executionID;     //   E02011/05/20-02:29_220905_1000_458
    private String executionType;   //   0
    private String status;          //    2
    private String rejectReason;    //   -1
    private int lastShares;         //    1000
    private int cumQty;             //    1000
    private int leavesQty ;         //    0
    private String transactTime;     //   20110520-02:29:16
    private  double avgPx;          //    230
    private double lastPx ;         //    230
    private long orderNo ;          //    458
    private String createDate;      //    5/20/2011 2:29:15 PM
    private double orderValue ;     //    230000
    private double netSettle;        //   227424
    private double price ;            //   230
    private String lastUpdateDate ;   //   5/20/2011 2:29:16 AM
    private String marketCode ;       //   N



    public Order() {
    }

    public long getClOrderID() {
        return clOrderID;
    }

    public void setClOrderID(long clOrderID) {
        this.clOrderID = clOrderID;
    }

    public String getPortfolioNo() {
        return portfolioNo;
    }

    public void setPortfolioNo(String portfolioNo) {
        this.portfolioNo = portfolioNo;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSecurityExchange() {
        return securityExchange;
    }

    public void setSecurityExchange(String securityExchange) {
        this.securityExchange = securityExchange;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getIssueCurrency() {
        return issueCurrency;
    }

    public void setIssueCurrency(String issueCurrency) {
        this.issueCurrency = issueCurrency;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getStopPx() {
        return stopPx;
    }

    public void setStopPx(double stopPx) {
        this.stopPx = stopPx;
    }

    public int getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(int timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    public long getOrigClOrderID() {
        return origClOrderID;
    }

    public void setOrigClOrderID(long origClOrderID) {
        this.origClOrderID = origClOrderID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getExecutionID() {
        return executionID;
    }

    public void setExecutionID(String executionID) {
        this.executionID = executionID;
    }

    public String getExecutionType() {
        return executionType;
    }

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public int getLastShares() {
        return lastShares;
    }

    public void setLastShares(int lastShares) {
        this.lastShares = lastShares;
    }

    public int getCumQty() {
        return cumQty;
    }

    public void setCumQty(int cumQty) {
        this.cumQty = cumQty;
    }

    public int getLeavesQty() {
        return leavesQty;
    }

    public void setLeavesQty(int leavesQty) {
        this.leavesQty = leavesQty;
    }

    public String getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(String transactTime) {
        this.transactTime = transactTime;
    }

    public double getAvgPx() {
        return avgPx;
    }

    public void setAvgPx(double avgPx) {
        this.avgPx = avgPx;
    }

    public double getLastPx() {
        return lastPx;
    }

    public void setLastPx(double lastPx) {
        this.lastPx = lastPx;
    }

    public long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public double getNetSettle() {
        return netSettle;
    }

    public void setNetSettle(double netSettle) {
        this.netSettle = netSettle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }
}
