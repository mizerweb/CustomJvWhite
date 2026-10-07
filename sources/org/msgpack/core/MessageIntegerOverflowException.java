package org.msgpack.core;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class MessageIntegerOverflowException extends MessageTypeException {
    public final BigInteger a;

    public MessageIntegerOverflowException(long j) {
        this(BigInteger.valueOf(j));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a.toString();
    }

    public MessageIntegerOverflowException(BigInteger bigInteger) {
        this.a = bigInteger;
    }
}
