package javaclasses.library.impl.dao.inter;

import java.util.Set;

public interface CommunEntityDAO<Entity> {

    void addEntityObject(Entity object);

    void updateEntityObject(Entity object);

    Entity getObjectByName(String name);

    void deleteObject(Entity object);

    long getObjectIdByName(String name);

    Entity getObjectById(long id);

    Set<Entity> getObjectsById(Entity objects);

}
