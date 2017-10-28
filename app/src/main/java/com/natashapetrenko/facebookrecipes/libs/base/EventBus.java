package com.natashapetrenko.facebookrecipes.libs.base;

/**
 * Created by petrenkonv on 26.10.2017.
 */

public interface EventBus {

    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
