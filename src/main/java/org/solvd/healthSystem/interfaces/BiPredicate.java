package org.solvd.healthSystem.interfaces;

@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
}
