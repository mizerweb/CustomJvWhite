package org.apache.http.message;

import defpackage.c;
import defpackage.ore;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ParserCursor {
    private final int lowerBound;
    private int pos;
    private final int upperBound;

    public ParserCursor(int i, int i2) {
        if (i < 0) {
            c.r("Lower bound cannot be negative");
            throw null;
        }
        if (i > i2) {
            c.r("Lower bound cannot be greater then upper bound");
            throw null;
        }
        this.lowerBound = i;
        this.upperBound = i2;
        this.pos = i;
    }

    public boolean atEnd() {
        return this.pos >= this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }

    public int getPos() {
        return this.pos;
    }

    public int getUpperBound() {
        return this.upperBound;
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(16);
        charArrayBuffer.append('[');
        charArrayBuffer.append(Integer.toString(this.lowerBound));
        charArrayBuffer.append('>');
        charArrayBuffer.append(Integer.toString(this.pos));
        charArrayBuffer.append('>');
        charArrayBuffer.append(Integer.toString(this.upperBound));
        charArrayBuffer.append(']');
        return charArrayBuffer.toString();
    }

    public void updatePos(int i) {
        if (i < this.lowerBound) {
            ore.i();
        } else if (i <= this.upperBound) {
            this.pos = i;
        } else {
            ore.i();
        }
    }
}
