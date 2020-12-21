package com.example.navigation_fragment;

public class Food {
    private int image;
    private String ten;
    private String gia;
    private String add;
    public  int getImage()
    {
        return  image;
    }
    public void setImage(int image){
        this.image=image;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
    public String getGia(){
        return  gia;
    }
    public void setGia(String mota){
        this.gia=mota;
    }
    public String getAdd(){
        return add;
    }
    public void setAdd(String sale){
        this.add=sale;
    }
    public Food(int image, String ten,String gia,String add ){
        this.image=image;
        this.ten=ten;
        this.gia=gia;
        this.add=add;
    }



}
