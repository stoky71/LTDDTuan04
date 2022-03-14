package model;

public class Language {
    private int id;
    private String name;
    private String shopName;
    private int img;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShopName() {
        return shopName;
    }

    public int getImg() {
        return img;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Language(int id, String name, String shopName, int img) {
        this.id = id;
        this.name = name;
        this.shopName = shopName;
        this.img = img;
    }
}
