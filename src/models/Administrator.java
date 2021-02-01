package models;

import interfces.AdminService;
import interfces.ReportService;
import interfces.SellerService;

public class Administrator extends Person implements SellerService, AdminService, ReportService {
    @Override
    public void orderGood() {

    }

    @Override
    public void acceptGood() {

    }

    @Override
    public void writeOffGood() {

    }

    @Override
    public void closeOperDay() {

    }

    @Override
    public void registerUser() {

    }

    @Override
    public void deleteUser() {

    }

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
