package models;

import utils.Utilities;

public class ProductivityApp extends App {



    public boolean isRecommendedApp(){
        if (Utilities.greaterThanOrEqualTo(getAppCost(),1.99) && Utilities.greaterThanOrEqualTo(calculateRating(),3.1)){
            return true;
        }else {
            return false;
        }
    }


    public String toString() {
        return super.toString();
    }
    public ProductivityApp(Developer developer,String appName,double appSize,double appVersion,double appCost){
        setDeveloper(developer);
        setAppName(appName);
        setAppSize(appSize);
        setAppVersion(appVersion);
        setAppCost(appCost);
    }
}
