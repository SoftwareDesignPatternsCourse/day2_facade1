package com.domain;

public class HardDrive {
    public byte[] read(long position, int size) {
        System.out.println("HardDrive: Reading data from position " + position + " with size " + size);
        return new byte[size];
    }
}