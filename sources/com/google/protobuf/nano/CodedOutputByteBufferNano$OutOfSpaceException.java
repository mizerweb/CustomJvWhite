package com.google.protobuf.nano;

import defpackage.nbh;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class CodedOutputByteBufferNano$OutOfSpaceException extends IOException {
    public CodedOutputByteBufferNano$OutOfSpaceException(int i, int i2) {
        super(nbh.u("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", i, " limit ", i2, ")."));
    }
}
