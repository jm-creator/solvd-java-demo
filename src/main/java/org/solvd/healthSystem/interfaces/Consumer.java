package org.solvd.healthSystem.interfaces;

@FunctionalInterface
public interface Consumer<T> {
    void supply(T t);
}
