package pl.szymonwrobel.module.about;

public class WorkerDto {
    private String name;
    private String surname;
    private int age;
    private Position position;
    private String imgUrl;

    public WorkerDto(String name, String surname, int age, Position position, String imgUrl) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
