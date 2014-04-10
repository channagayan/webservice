package com.directfn.webservices;

import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: channas
 * Date: 12/4/13
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CashAccountDetails")

public class CashAccountDetails {
    private String cashAccountNumber;   //C000000237
    private double blockedAmount;     //0
    private double primaryTradinglimit;  //
    private String primaryTradingLimitExpDate; //
    private double secondaryTradinglimit;  //0
    private String secondaryTradingLimitExpDate;//
    private double Margin;
    private double marginDue;//0
    private double  marginBalance; //0.0024
    private double pendingSettle; //0
    private double pendingWithdrawal; //0
    private double pendingDeposit;  //0
    private String cashAccountID; //237
    private String currency; //LKR
    private double balance;  //0.0024
    private boolean isTradingEnabled;
    private double dayTradingLimit; //

    public CashAccountDetails() {
    }

    public String getCashAccountNumber() {
        return cashAccountNumber;
    }

    public void setCashAccountNumber(String cashAccountNumber) {
        this.cashAccountNumber = cashAccountNumber;
    }

    public double getBlockedAmount() {
        return blockedAmount;
    }

    public void setBlockedAmount(double blockedAmount) {
        this.blockedAmount = blockedAmount;
    }

    public double getPrimaryTradinglimit() {
        return primaryTradinglimit;
    }

    public void setPrimaryTradinglimit(double primaryTradinglimit) {
        this.primaryTradinglimit = primaryTradinglimit;
    }

    public String getPrimaryTradingLimitExpDate() {
        return primaryTradingLimitExpDate;
    }

    public void setPrimaryTradingLimitExpDate(String primaryTradingLimitExpDate) {
        this.primaryTradingLimitExpDate = primaryTradingLimitExpDate;
    }

    public double getSecondaryTradinglimit() {
        return secondaryTradinglimit;
    }

    public void setSecondaryTradinglimit(double secondaryTradinglimit) {
        this.secondaryTradinglimit = secondaryTradinglimit;
    }

    public String getSecondaryTradingLimitExpDate() {
        return secondaryTradingLimitExpDate;
    }

    public void setSecondaryTradingLimitExpDate(String secondaryTradingLimitExpDate) {
        this.secondaryTradingLimitExpDate = secondaryTradingLimitExpDate;
    }

    public double getMargin() {
        return Margin;
    }

    public void setMargin(double cashMargin) {
        this.Margin = cashMargin;
    }

    public double getMarginDue() {
        return marginDue;
    }

    public void setMarginDue(double marginDue) {
        this.marginDue = marginDue;
    }

    public double getMarginBalance() {
        return marginBalance;
    }

    public void setMarginBalance(double marginBalance) {
        this.marginBalance = marginBalance;
    }

    public double getPendingSettle() {
        return pendingSettle;
    }

    public void setPendingSettle(double pendingSettle) {
        this.pendingSettle = pendingSettle;
    }

    public double getPendingWithdrawal() {
        return pendingWithdrawal;
    }

    public void setPendingWithdrawal(double pendingWithdraw) {
        this.pendingWithdrawal = pendingWithdraw;
    }

    public double getPendingDeposit() {
        return pendingDeposit;
    }

    public void setPendingDeposit(double pendingDeposit) {
        this.pendingDeposit = pendingDeposit;
    }

    public String getCashAccountID() {
        return cashAccountID;
    }

    public void setCashAccountID(String cashAccountID) {
        this.cashAccountID = cashAccountID;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isTradingEnabled() {
        return isTradingEnabled;
    }

    public void setTradingEnabled(boolean tradingEnabled) {
        isTradingEnabled = tradingEnabled;
    }

    public double getDayTradingLimit() {
        return dayTradingLimit;
    }

    public void setDayTradingLimit(double dayTradingLimit) {
        this.dayTradingLimit = dayTradingLimit;
    }
}
