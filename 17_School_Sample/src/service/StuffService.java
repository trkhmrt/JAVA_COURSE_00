package service;

import model.Stuff;
import repository.IStuffRepository;
import util.Lists;

public class StuffService implements IStuffRepository {

    @Override
    public void add_stuff(Stuff stuff) {
        Lists.stuffList.add(stuff);
    }

    @Override
    public void delete_stuff() {

    }

    @Override
    public void update_stuff() {

    }

    @Override
    public void list_stuff() {

    }

}
