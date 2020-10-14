package pl.szymonwrobel.module.news.dto;

public class MenuDto {
    private String category;
    private String url;

    public MenuDto(String category, String url) {
        this.category = category;
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "MenuDto{" +
                "category='" + category + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
