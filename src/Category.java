public class Category {
    private String title;
    private String description;

    public Category(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCategoryInfo(){
        return "Category: " + title + "Description: " +description;
    }

}
