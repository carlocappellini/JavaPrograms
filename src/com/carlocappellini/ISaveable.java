package com.carlocappellini;


import java.util.List;

public interface ISaveable {
    void read(List<String> savedValues);
    List<String> write();
}

