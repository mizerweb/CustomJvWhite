package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class dik extends b5f {
    public final int b;
    public final int c;
    public final int d;
    public final ByteBuffer e;

    public dik(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        byteBufferWrap.get();
        this.b = byteBufferWrap.getShort() & 65535;
        byteBufferWrap.getInt();
        byte b = byteBufferWrap.get();
        int i = 0;
        for (int i2 : qt4.H(2)) {
            byte b2 = 1;
            if (i2 == 1) {
                b2 = 0;
            } else if (i2 != 2) {
                throw null;
            }
            if (b2 == b) {
                i = i2;
                break;
            }
        }
        this.c = i;
        this.d = byteBufferWrap.getShort() & 65535;
        this.a = byteBufferWrap.get();
        this.e = byteBufferWrap.slice();
    }
}
