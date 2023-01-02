package models;

import java.util.ArrayList;

public class App {
    private Developer developer;
    private String appName = "No app name";
    private double appSize = 0;
    private double appVersion = 1.0;
    private double appCost = 0;
    private ArrayList<Rating> ratings = new ArrayList<>();
    public void addRating(Rating rating) {
    }
    public double calculateRating(){
        double sum = 0;
        double ave = 0;
        for (int i = 0;i < ratings.size();i++){
            sum += ratings.get(i).getNumberOfStars();
        }
        ave = sum/ratings.size();
        return ave;
    }

    public String appSummary() {
        return appName + "(V" + appVersion + ") by " + developer + ", " + "€" +
                appCost + ". Rating: " + calculateRating() + ".";
    }

    public boolean isRecommendedApp(){
        return true;
    }

    public String listRatings(){
        String str = "";
        if (ratings.isEmpty()){
            return "No ratings added yet";
        }else {
            for (int i = 0; i <= ratings.size();i++){
                str = ratings.get(i).getRatingComment();
            }
        }
        return str;
    }


    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setAppVersion(double appVersion) {
        if (appVersion >= 1.0) {
            this.appVersion = appVersion;
        }
    }

    public void setAppSize(double appSize) {
        if (appSize >= 1 && appSize <= 1000) {
            this.appSize = appSize;
        }
    }

    public void setAppCost(double appCost) {
        if (appCost >= 0) {
            this.appCost = appCost;
        }
    }

    public void setRatings(ArrayList<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getAppName() {
        return appName;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public double getAppVersion() {
        return appVersion;
    }

    public double getAppSize() {
        return appSize;
    }

    public double getAppCost() {
        return appCost;
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }
    /*
     * method toString
     * print the detail of the app
     * */
    public String toString() {
        return appName + ""
                + "(Version " + appVersion + ")" + ""
                + "by " + developer + ""
                + "Size: " + appSize + "MB" + ""
                + "Cost: " +  appCost + ""
                + "Ratings (" + calculateRating() + "): " + ratings;
    }
    public void App(Developer developer,String appName,double appSize,double appVersion,double appCost){
        setDeveloper(developer);
        setAppName(appName);
        setAppSize(appSize);
        setAppCost(appCost);
        setAppVersion(appVersion);
    }
}
