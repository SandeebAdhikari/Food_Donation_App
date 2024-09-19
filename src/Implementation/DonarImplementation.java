package Implementation;

import Consumer.Consumer;
import Interface.ConsumerInterface;
import Interface.DonarInterface;
import User.User;
import Donor.Donor;

public class DonarImplementation implements DonarInterface, ConsumerInterface {


    @Override
    public User getParentUser(Donor donar) {
        System.out.println(getDonorParentId(donar));
        return donar.getUser();
    }

    private int getDonorParentId( Donor donor){
        return donor.getId();
    }

    private int getConsumerParentId( Consumer consumer){
        return consumer.getId();
    }

    @Override
    public User getParentUser(Consumer consumer) {
        System.out.println(getConsumerParentId(consumer));
        return consumer.getUser();
    }
}
