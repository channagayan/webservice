package com.directfn.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: channas
 * Date: 12/4/13
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PortfolioDetails")
public class PortfolioDetails {

    private String portfolioName;
    private String portfolioNo;
    private String customerReferenceNo;
    private String cashAccountNumber;
    private boolean marginEnabled;
    private int accountStatus;
    private double  portfolioMargin ;
    private double marginDue;
    private String currency;
    private double portfolioValue;
    private int approvalStatus ;
    private double   marginBlock ;

    public PortfolioDetails() {
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getPortfolioNo() {
        return portfolioNo;
    }

    public void setPortfolioNo(String portfolioNo) {
        this.portfolioNo = portfolioNo;
    }

    public String getCustomerReferenceNo() {
        return customerReferenceNo;
    }

    public void setCustomerReferenceNo(String customerReferenceNo) {
        this.customerReferenceNo = customerReferenceNo;
    }

    public String getCashAccountNumber() {
        return cashAccountNumber;
    }

    public void setCashAccountNumber(String cashAccountNumber) {
        this.cashAccountNumber = cashAccountNumber;
    }

    public boolean isMarginEnabled() {
        return marginEnabled;
    }

    public void setMarginEnabled(boolean marginEnabled) {
        this.marginEnabled = marginEnabled;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getPortfolioMargin() {
        return portfolioMargin;
    }

    public void setPortfolioMargin(double portfolioMargin) {
        this.portfolioMargin = portfolioMargin;
    }

    public double getMarginDue() {
        return marginDue;
    }

    public void setMarginDue(double marginDue) {
        this.marginDue = marginDue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(double portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public int getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(int approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public double getMarginBlock() {
        return marginBlock;
    }

    public void setMarginBlock(double marginBlock) {
        this.marginBlock = marginBlock;
    }
}
