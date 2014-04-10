package com.directfn.webservices;

import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: channas
 * Date: 12/4/13
 * Time: 2:23 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AccountSummary")
public class AccountSummary  {


    //private ArrayList<PortfolioDetails> PortfolioDetails;


    private CashAccountDetails[] CashAccountDetails1;
    private PortfolioDetails[] PortfolioDetails1;
    //private ArrayList<CashAccountDetails> CashAccountDetails;


    public AccountSummary() {
    }


    public PortfolioDetails[] getPortfolioDetails() {
        return PortfolioDetails1;
    }

    public void setPortfolioDetails(PortfolioDetails[] portfolioDetails) {
        PortfolioDetails1 = portfolioDetails;
    }

    public CashAccountDetails[] getCashAccountDetails() {
        return CashAccountDetails1;
    }

    public void setCashAccountDetails(CashAccountDetails[] cashAccountDetails) {
        CashAccountDetails1 = cashAccountDetails;
    }
}
