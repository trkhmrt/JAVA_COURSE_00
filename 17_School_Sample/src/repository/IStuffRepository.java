package repository;

import model.Stuff;

public interface IStuffRepository {
    void add_stuff(Stuff stuff);
    void delete_stuff();
    void update_stuff();
    void list_stuff();
}
