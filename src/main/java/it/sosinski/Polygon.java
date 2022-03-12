package it.sosinski;

public abstract sealed class Polygon implements Shape permits Section, Triangle {
}
