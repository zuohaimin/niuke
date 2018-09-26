package cat_dog;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: 束手就擒
 * @Date: 18-9-25 下午4:56
 * @Description:
 */
public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatQueue(){
        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
        this.count = 0;
    }

    public void add(Pet pet){
        if (pet.getPetType().equals("dog")){
            this.dogQ.add(new PetEnterQueue(pet,this.count++));
        }else if (pet.getPetType().equals("cat")){
            this.catQ.add(new PetEnterQueue(pet,this.count++));
        }else{
            throw new RuntimeException("err, not dog or cat");
        }
    }

    public Pet pollAll(){
        if (!this.catQ.isEmpty() && !this.dogQ.isEmpty()){
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()){
                return  this.dogQ.poll().getPet();
            }else{
                return this.catQ.poll().getPet();
            }
        }else if (!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        }else if (!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }else{
            throw new RuntimeException("err, queue is empty");
        }
    }

    public Pet pollDog(){
        if (!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }else{
            throw  new RuntimeException("dog queue is empty");
        }
    }
    public Pet pollCat(){
        if (!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        }else{
            throw  new RuntimeException("cat queue is empty");
        }
    }

    public boolean isEmpty(){
        return this.catQ.isEmpty() && this.dogQ.isEmpty();
    }

    public boolean isDogEmpty(){
        return this.dogQ.isEmpty();
    }
    public boolean isCatEmpty(){
        return this.catQ.isEmpty();


    }
}
