/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author Wuba
 */
public class ComparadorMascotaPorNombre implements Comparator<Mascota>{

    @Override
    public int compare(Mascota m1, Mascota m2) {
        return m1.getNombre().compareToIgnoreCase(m2.getNombre());
    }

    @Override
    public Comparator<Mascota> reversed() {
        return Comparator.super.reversed(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Comparator<Mascota> thenComparing(Comparator<? super Mascota> other) {
        return Comparator.super.thenComparing(other); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public <U> Comparator<Mascota> thenComparing(Function<? super Mascota, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Mascota> thenComparing(Function<? super Mascota, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Comparator<Mascota> thenComparingInt(ToIntFunction<? super Mascota> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Comparator<Mascota> thenComparingLong(ToLongFunction<? super Mascota> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Comparator<Mascota> thenComparingDouble(ToDoubleFunction<? super Mascota> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
