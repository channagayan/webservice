package com.directfn.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: channas
 * Date: 11/27/13
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */





@WebService
public class WebClass {
    private FileOutputStream fout;
    private ObjectOutputStream oos;
    private FileInputStream fin;
    private ObjectInputStream ois;
    private Scanner fileScanner;
    private File f;
    private InputStream inputStream;
    private BufferedReader reader;

    public WebClass( )
    {

    }

    @WebMethod
    public String testWebService(String name){

        return "hi "+name+" welcome to the webservice";
    }
    public void openFile(String filename)
    {
         inputStream =getClass().getClassLoader().getResourceAsStream(filename);
        reader = new BufferedReader(new InputStreamReader(inputStream));

    }


    @WebMethod
    public Order[] orderListForCustomer(String portfolioNo,String clOrderID)
    {
        openFile("Orders.txt");
        ArrayList<Order> tempOrderList=new ArrayList<Order>();
        String line;
        String[] splited;
        int count=0;
        Order tempOrder=new Order();
        /*sb[0]=new Order();
        sb[1]=new Order();
        sb[0].setorderID("channa");
        sb[0].setPortfolioNo("db45");
        sb[1].setorderID("gayan");
        sb[1].setPortfolioNo("dt56");*/
        System.out.println("executing method orderListForCustomer");
        //openFile("Orders.txt");
        try {

            while((line=reader.readLine())!=null) {
                //System.out.println(line);
                tempOrder=new Order();
                splited=line.split(",");
                tempOrder.setClOrderID(Long.parseLong(splited[0]));
                tempOrder.setPortfolioNo(splited[1]);
                tempOrder.setSymbol(splited[2]);
                tempOrder.setSecurityExchange(splited[3]);
                tempOrder.setOrderType(splited[4]);
                tempOrder.setIssueCurrency(splited[5]);
                tempOrder.setQuantity(Integer.parseInt(splited[6]));
                tempOrder.setSide(Integer.parseInt(splited[7]));
                tempOrder.setStopPx(Double.parseDouble(splited[8]));
                tempOrder.setTimeInForce(Integer.parseInt(splited[9]));
                tempOrder.setExpireTime(splited[10]);
                tempOrder.setMinQty(Integer.parseInt(splited[11]));
                tempOrder.setMaxFloor(Integer.parseInt(splited[12]));
                tempOrder.setOrigClOrderID(Long.parseLong(splited[13]));
                tempOrder.setOrderID(splited[14]);
                tempOrder.setExecutionID(splited[15]);
                tempOrder.setExecutionType(splited[16]);
                tempOrder.setStatus(splited[17]);
                tempOrder.setRejectReason(splited[18]);
                tempOrder.setLastShares(Integer.parseInt(splited[19]));
                tempOrder.setCumQty(Integer.parseInt(splited[20]));
                tempOrder.setLeavesQty(Integer.parseInt(splited[21]));
                tempOrder.setTransactTime(splited[22]);
                tempOrder.setAvgPx(Double.parseDouble(splited[23]));
                tempOrder.setLastPx(Double.parseDouble(splited[24]));
                tempOrder.setOrderNo(Long.parseLong(splited[25]));
                tempOrder.setCreateDate(splited[26]);
                tempOrder.setOrderValue(Double.parseDouble(splited[27]));
                tempOrder.setNetSettle(Double.parseDouble(splited[28]));
                tempOrder.setPrice(Double.parseDouble(splited[29]));
                tempOrder.setLastUpdateDate(splited[30]);
                tempOrder.setMarketCode(splited[31]);



                tempOrderList.add(tempOrder);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        Order[] sb=new Order[count];
        for(int i=0;i<count;i++) {
            sb[i]=tempOrderList.get(i) ;
            //System.out.println(sb[i].getPortfolioNo());
        }
        return sb;
    }
    @WebMethod
    public Order[] orderListForDealer (String dealerID, int fromRecord, int toRecord, int status, String fromDate,String toDate)
    {
        openFile("Orders.txt");
        ArrayList<Order> tempOrderList=new ArrayList<Order>();
        String line;
        String[] splited;
        int count=0;
        Order tempOrder=new Order();
        /*sb[0]=new Order();
        sb[1]=new Order();
        sb[0].setorderID("channa");
        sb[0].setPortfolioNo("db45");
        sb[1].setorderID("gayan");
        sb[1].setPortfolioNo("dt56");*/
        System.out.println("executing method orderListForDealer");
        //openFile("Orders.txt");
        try {

            while((line=reader.readLine())!=null) {
                //System.out.println(line);
                tempOrder=new Order();
                splited=line.split(",");
                tempOrder.setClOrderID(Long.parseLong(splited[0]));
                tempOrder.setPortfolioNo(splited[1]);
                tempOrder.setSymbol(splited[2]);
                tempOrder.setSecurityExchange(splited[3]);
                tempOrder.setOrderType(splited[4]);
                tempOrder.setIssueCurrency(splited[5]);
                tempOrder.setQuantity(Integer.parseInt(splited[6]));
                tempOrder.setSide(Integer.parseInt(splited[7]));
                tempOrder.setStopPx(Double.parseDouble(splited[8]));
                tempOrder.setTimeInForce(Integer.parseInt(splited[9]));
                tempOrder.setExpireTime(splited[10]);
                tempOrder.setMinQty(Integer.parseInt(splited[11]));
                tempOrder.setMaxFloor(Integer.parseInt(splited[12]));
                tempOrder.setOrigClOrderID(Long.parseLong(splited[13]));
                tempOrder.setOrderID(splited[14]);
                tempOrder.setExecutionID(splited[15]);
                tempOrder.setExecutionType(splited[16]);
                tempOrder.setStatus(splited[17]);
                tempOrder.setRejectReason(splited[18]);
                tempOrder.setLastShares(Integer.parseInt(splited[19]));
                tempOrder.setCumQty(Integer.parseInt(splited[20]));
                tempOrder.setLeavesQty(Integer.parseInt(splited[21]));
                tempOrder.setTransactTime(splited[22]);
                tempOrder.setAvgPx(Double.parseDouble(splited[23]));
                tempOrder.setLastPx(Double.parseDouble(splited[24]));
                tempOrder.setOrderNo(Long.parseLong(splited[25]));
                tempOrder.setCreateDate(splited[26]);
                tempOrder.setOrderValue(Double.parseDouble(splited[27]));
                tempOrder.setNetSettle(Double.parseDouble(splited[28]));
                tempOrder.setPrice(Double.parseDouble(splited[29]));
                tempOrder.setLastUpdateDate(splited[30]);
                tempOrder.setMarketCode(splited[31]);



                tempOrderList.add(tempOrder);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        Order[] sb=new Order[count];
        for(int i=0;i<count;i++) {
            sb[i]=tempOrderList.get(i) ;
            //System.out.println(sb[i].getPortfolioNo());
        }
        return sb;

    }
    @WebMethod
    public Order[] orderSearchForCustomer (String portfolioNo, String orderId, String symbol, String side,int fromRecord, int toRecord, String status, String fromDate, String toDate)
    {
        openFile("Orders.txt");
        ArrayList<Order> tempOrderList=new ArrayList<Order>();
        String line;
        String[] splited;
        int count=0;
        Order tempOrder;

        System.out.println("executing method orderSearchForCustomer");

        try {

            while((line=reader.readLine())!=null) {

                tempOrder=new Order();
                splited=line.split(",");
                tempOrder.setClOrderID(Long.parseLong(splited[0]));
                tempOrder.setPortfolioNo(splited[1]);
                tempOrder.setSymbol(splited[2]);
                tempOrder.setSecurityExchange(splited[3]);
                tempOrder.setOrderType(splited[4]);
                tempOrder.setIssueCurrency(splited[5]);
                tempOrder.setQuantity(Integer.parseInt(splited[6]));
                tempOrder.setSide(Integer.parseInt(splited[7]));
                tempOrder.setStopPx(Double.parseDouble(splited[8]));
                tempOrder.setTimeInForce(Integer.parseInt(splited[9]));
                tempOrder.setExpireTime(splited[10]);
                tempOrder.setMinQty(Integer.parseInt(splited[11]));
                tempOrder.setMaxFloor(Integer.parseInt(splited[12]));
                tempOrder.setOrigClOrderID(Long.parseLong(splited[13]));
                tempOrder.setOrderID(splited[14]);
                tempOrder.setExecutionID(splited[15]);
                tempOrder.setExecutionType(splited[16]);
                tempOrder.setStatus(splited[17]);
                tempOrder.setRejectReason(splited[18]);
                tempOrder.setLastShares(Integer.parseInt(splited[19]));
                tempOrder.setCumQty(Integer.parseInt(splited[20]));
                tempOrder.setLeavesQty(Integer.parseInt(splited[21]));
                tempOrder.setTransactTime(splited[22]);
                tempOrder.setAvgPx(Double.parseDouble(splited[23]));
                tempOrder.setLastPx(Double.parseDouble(splited[24]));
                tempOrder.setOrderNo(Long.parseLong(splited[25]));
                tempOrder.setCreateDate(splited[26]);
                tempOrder.setOrderValue(Double.parseDouble(splited[27]));
                tempOrder.setNetSettle(Double.parseDouble(splited[28]));
                tempOrder.setPrice(Double.parseDouble(splited[29]));
                tempOrder.setLastUpdateDate(splited[30]);
                tempOrder.setMarketCode(splited[31]);



                tempOrderList.add(tempOrder);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        Order[] sb=new Order[count];
        for(int i=0;i<count;i++) {
            sb[i]=tempOrderList.get(i) ;

        }
        return sb;
    }
    @WebMethod
    public PortfolioDetails[] getPortfolioDetailsForCustomer (String customerID)
    {
        openFile("PortfiloDetails.txt");
        ArrayList<PortfolioDetails> tempPortfolioDetails=new ArrayList<PortfolioDetails>();
        String line;
        String[] splited;
        int count=0;
        PortfolioDetails tempPortfolioDetail;
        try {

            while((line=reader.readLine())!=null) {

                tempPortfolioDetail=new PortfolioDetails();
                splited=line.split(",");
                tempPortfolioDetail.setPortfolioName(splited[0]);
                tempPortfolioDetail.setPortfolioNo(splited[1]);
                tempPortfolioDetail.setCustomerReferenceNo(splited[2]);
                tempPortfolioDetail.setCashAccountNumber(splited[3]);
                tempPortfolioDetail.setMarginEnabled(Boolean.parseBoolean(splited[4]));
                tempPortfolioDetail.setAccountStatus(Integer.parseInt(splited[5]));
                tempPortfolioDetail.setPortfolioMargin(Double.parseDouble(splited[6]));
                tempPortfolioDetail.setMarginDue(Double.parseDouble(splited[7]));
                tempPortfolioDetail.setCurrency(splited[8]);
                tempPortfolioDetail.setPortfolioValue(Double.parseDouble(splited[9]));
                tempPortfolioDetail.setApprovalStatus(Integer.parseInt(splited[10]));
                tempPortfolioDetail.setMarginBlock(Double.parseDouble(splited[11]));



                tempPortfolioDetails.add(tempPortfolioDetail);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        PortfolioDetails[] sb=new PortfolioDetails[count];
        for(int i=0;i<count;i++) {
            sb[i]=tempPortfolioDetails.get(i) ;

        }

        System.out.println("executing method getPortfolioDetailsForCustomer");
        return sb;
    }
    @WebMethod
    public PortfolioRecord[] getPortfolioRecordsForCustomer(String customerID)
    {
        openFile("PortfolioRecord.txt");
        ArrayList<PortfolioRecord> tempPortfolioRecords=new ArrayList<PortfolioRecord>();
        String line;
        String[] splited;
        int count=0;
        PortfolioRecord tempPortfolioRecord;

        try {

            while((line=reader.readLine())!=null) {

                tempPortfolioRecord=new PortfolioRecord();
                splited=line.split(",");
                tempPortfolioRecord.setPortfolioNo(splited[0]);
                tempPortfolioRecord.setExchange(splited[1]);
                tempPortfolioRecord.setCurrency(splited[2]);
                tempPortfolioRecord.setNetHoldings(Integer.parseInt(splited[3]));
                tempPortfolioRecord.setAverageCost(Double.parseDouble(splited[4]));
                tempPortfolioRecord.setSellPending(Integer.parseInt(splited[5]));
                tempPortfolioRecord.setPledgedQty(Integer.parseInt(splited[6]));
                tempPortfolioRecord.setBuyPending(Integer.parseInt(splited[7]));
                tempPortfolioRecord.setAveragePrice(Double.parseDouble(splited[8]));
                tempPortfolioRecord.setMarginDue(Double.parseDouble(splited[9]));
                tempPortfolioRecord.setOpenBuyCount(Integer.parseInt(splited[10]));



                tempPortfolioRecords.add(tempPortfolioRecord);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        PortfolioRecord[] sb=new PortfolioRecord[count];
        for(int i=0;i<count;i++) {
            sb[i]=tempPortfolioRecords.get(i) ;

        }

        System.out.println("executing method getPortfolioRecordsForCustomer");
        return sb;

    }
    @WebMethod
    public CashAccountDetails[] getCashAccountDetailsForCustomer(String customerID)
    {
        openFile("CashAccountDetails.txt");
        ArrayList<CashAccountDetails> tempCashAccountDetails=new ArrayList<CashAccountDetails>();
        String line;
        String[] splited;
        int count=0;
        CashAccountDetails tempCashAccountDetail;

        try {

            while((line=reader.readLine())!=null) {

                tempCashAccountDetail=new CashAccountDetails();
                splited=line.split(",");
                tempCashAccountDetail.setCashAccountNumber(splited[0]);
                tempCashAccountDetail.setBlockedAmount(Double.parseDouble(splited[1]));
                tempCashAccountDetail.setPrimaryTradinglimit(Double.parseDouble(splited[2]));
                tempCashAccountDetail.setPrimaryTradingLimitExpDate(splited[3]);
                tempCashAccountDetail.setSecondaryTradinglimit(Double.parseDouble(splited[4]));
                tempCashAccountDetail.setSecondaryTradingLimitExpDate(splited[5]);
                tempCashAccountDetail.setMargin(Double.parseDouble(splited[6]));
                tempCashAccountDetail.setMarginDue(Double.parseDouble(splited[7]));
                tempCashAccountDetail.setMarginBalance(Double.parseDouble(splited[8]));
                tempCashAccountDetail.setPendingSettle(Double.parseDouble(splited[9]));
                tempCashAccountDetail.setPendingWithdrawal(Double.parseDouble(splited[10]));
                tempCashAccountDetail.setPendingDeposit(Double.parseDouble(splited[11]));
                tempCashAccountDetail.setPendingDeposit(Double.parseDouble(splited[12]));
                tempCashAccountDetail.setCashAccountID(splited[13]);
                tempCashAccountDetail.setCurrency(splited[14]);
                tempCashAccountDetail.setBalance(Double.parseDouble(splited[15]));
                tempCashAccountDetail.setTradingEnabled(Boolean.parseBoolean(splited[16]));
                tempCashAccountDetail.setDayTradingLimit(Double.parseDouble(splited[17]));




                tempCashAccountDetails.add(tempCashAccountDetail);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        CashAccountDetails[] sb=new CashAccountDetails[count];
        for(int i=0;i<count;i++) {
            sb[i]=tempCashAccountDetails.get(i) ;

        }

        System.out.println("executing method getCashAccountDetailsForCustomer");
        return sb;

    }
    @WebMethod
    public AccountSummary getAccountSummaryForCustomer(String customerID)
    {
           AccountSummary as=new AccountSummary();
        //read file for get portfilo details
        openFile("PortfiloDetails.txt");
        String line;
        String[] splited;
        int count=0;
        int lineCount=0;
        PortfolioDetails tempPortfolioDetail;
        try {
            while ((line=reader.readLine())!=null)
            {
               lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        PortfolioDetails[] tempPortfolioDetails=new PortfolioDetails[lineCount];
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        openFile("PortfiloDetails.txt");
        try {

            while((line=reader.readLine())!=null) {

                tempPortfolioDetail=new PortfolioDetails();
                splited=line.split(",");
                tempPortfolioDetail.setPortfolioName(splited[0]);
                tempPortfolioDetail.setPortfolioNo(splited[1]);
                tempPortfolioDetail.setCustomerReferenceNo(splited[2]);
                tempPortfolioDetail.setCashAccountNumber(splited[3]);
                tempPortfolioDetail.setMarginEnabled(Boolean.parseBoolean(splited[4]));
                tempPortfolioDetail.setAccountStatus(Integer.parseInt(splited[5]));
                tempPortfolioDetail.setPortfolioMargin(Double.parseDouble(splited[6]));
                tempPortfolioDetail.setMarginDue(Double.parseDouble(splited[7]));
                tempPortfolioDetail.setCurrency(splited[8]);
                tempPortfolioDetail.setPortfolioValue(Double.parseDouble(splited[9]));
                tempPortfolioDetail.setApprovalStatus(Integer.parseInt(splited[10]));
                tempPortfolioDetail.setMarginBlock(Double.parseDouble(splited[11]));


                tempPortfolioDetails[count]=tempPortfolioDetail;
                //tempPortfolioDetails.add(tempPortfolioDetail);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        as.setPortfolioDetails(tempPortfolioDetails);
        /////////////////////////////////////
          //as.setPortfolioDetails(tempPortfolioDetails);  //////////////////////////////
        //done reading file to get portfoliodetails

        //start reading file to get cash account details
        lineCount=0;
        openFile("CashAccountDetails.txt");

         line="";
         splited=null;
         count=0;
        CashAccountDetails tempCashAccountDetail;
        try {
            while ((line=reader.readLine())!=null)
            {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        CashAccountDetails[] tempCashAccountDetails=new CashAccountDetails[lineCount];
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        openFile("CashAccountDetails.txt");
        try {

            while((line=reader.readLine())!=null) {

                tempCashAccountDetail=new CashAccountDetails();
                splited=line.split(",");
                tempCashAccountDetail.setCashAccountNumber(splited[0]);
                tempCashAccountDetail.setBlockedAmount(Double.parseDouble(splited[1]));
                tempCashAccountDetail.setPrimaryTradinglimit(Double.parseDouble(splited[2]));
                tempCashAccountDetail.setPrimaryTradingLimitExpDate(splited[3]);
                tempCashAccountDetail.setSecondaryTradinglimit(Double.parseDouble(splited[4]));
                tempCashAccountDetail.setSecondaryTradingLimitExpDate(splited[5]);
                tempCashAccountDetail.setMargin(Double.parseDouble(splited[6]));
                tempCashAccountDetail.setMarginDue(Double.parseDouble(splited[7]));
                tempCashAccountDetail.setMarginBalance(Double.parseDouble(splited[8]));
                tempCashAccountDetail.setPendingSettle(Double.parseDouble(splited[9]));
                tempCashAccountDetail.setPendingWithdrawal(Double.parseDouble(splited[10]));
                tempCashAccountDetail.setPendingDeposit(Double.parseDouble(splited[11]));
                tempCashAccountDetail.setPendingDeposit(Double.parseDouble(splited[12]));
                tempCashAccountDetail.setCashAccountID(splited[13]);
                tempCashAccountDetail.setCurrency(splited[14]);
                tempCashAccountDetail.setBalance(Double.parseDouble(splited[15]));
                tempCashAccountDetail.setTradingEnabled(Boolean.parseBoolean(splited[16]));
                tempCashAccountDetail.setDayTradingLimit(Double.parseDouble(splited[17]));



                tempCashAccountDetails[count]=tempCashAccountDetail;
                //tempCashAccountDetails.add(tempCashAccountDetail);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
       as.setCashAccountDetails(tempCashAccountDetails);
        System.out.println("executing method getAccountSummaryForCustomer");
        return as;
    }
    @WebMethod
    public double getCustomerBuyingPower(String customerID,String cashAccountNo)
    {
        openFile("CustomerBuyingPower.txt");
        double cbp=0;
        try {
             cbp=Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("executing method getCustomerBuyingPower");
        return cbp;
    }


}
