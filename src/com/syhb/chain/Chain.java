package com.syhb.chain;

public interface Chain {

    void setNextChain(Chain nextChain);
    void calculate(Numbers request);

}
