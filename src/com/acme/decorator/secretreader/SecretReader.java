package com.acme.decorator.secretreader;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public class SecretReader extends FilterReader {
    private int secret;
    protected SecretReader(Reader in, int secret) {
        super(in);
        this.secret = secret;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        if(c<0){
            return c;// because we are at the end of the file
        }
        return c - secret;// if this is less than 0, it has to calculate from the maximum
    }
}
