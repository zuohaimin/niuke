package cat_dog;

/**
 * @Author: 束手就擒
 * @Date: 18-9-25 下午4:41
 * @Description:
 */
public class Pet {
    private String type;
    public Pet(String type){
        this.type = type;
    }

    public String getPetType(){
        return this.type;
    }
}
