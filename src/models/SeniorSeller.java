package models;

import interfces.ReportService;
import interfces.SellerService;
import interfces.SeniorSellerService;

public class SeniorSeller extends Person implements SellerService, SeniorSellerService, ReportService {
    @Override
    public void report() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void cancelSell() {

    }

    @Override
    public void writeOffGood() {

    }

    @Override
    public void closeOperDay() {

    }

    @Override
    public void enterGood() {

    }

    @Override
    public void deleteGood() {

    }
}
