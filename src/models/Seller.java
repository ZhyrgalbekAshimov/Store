package models;

import interfces.ReportService;
import interfces.SellerService;

public class Seller extends Person implements SellerService, ReportService {
    @Override
    public void report() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void cancelSell() {

    }
}
