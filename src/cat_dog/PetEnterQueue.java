package cat_dog;

/**
 * @Author: 束手就擒
 * @Date: 18-9-25 下午4:46
 * @Description:
 */
public class PetEnterQueue {
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count){
        this.pet = pet;
        this.count = count;
    }

    public long getCount(){
        return this.count;
    }

    public Pet getPet(){
        return this.pet;
    }

    public String getPetType(){
        return this.pet.getPetType();
    }
}
