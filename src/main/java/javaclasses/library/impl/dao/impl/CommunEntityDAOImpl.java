package javaclasses.library.impl.dao.impl;

import javaclasses.library.impl.dao.inter.CommunEntityDAO;

import java.util.Set;

public class CommunEntityDAOImpl<Entity> implements CommunEntityDAO<Entity> {
    @Override
    public void addEntityObject(Entity object) {

    }

    @Override
    public void updateEntityObject(Entity object) {

    }

    @Override
    public Entity getObjectByName(String name) {
        return null;
    }

    @Override
    public void deleteObject(Entity object) {

    }

    @Override
    public long getObjectIdByName(String name) {
        return 0;
    }

    @Override
    public Entity getObjectById(long id) {
        return null;
    }

    @Override
    public Set<Entity> getObjectsById(Entity objects) {
        return null;
    }
}
