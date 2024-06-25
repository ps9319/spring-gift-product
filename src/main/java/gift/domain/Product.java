package gift.domain;


import java.util.concurrent.atomic.AtomicLong;

public class Product {
    private Long id;
    private String name;
    private int price;
    private String imageUrl;

    private static AtomicLong nextId = new AtomicLong(1);

    public static long getNextId() {
        return nextId.getAndIncrement();
    }

    public Product(Long id, String name, int price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public void update(String name, int price, String imageUrl){
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}