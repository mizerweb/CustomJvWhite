package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class d41 {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public d41(ByteBuffer byteBuffer, tg0 tg0Var, int i, int i2) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit != tg0Var.a) {
            StringBuilder sbY = zo5.y(iLimit, "Byte buffer size is not match with packet info: ", " != ");
            sbY.append(tg0Var.a);
            throw new IllegalStateException(sbY.toString());
        }
        this.a = i;
        this.b = i2;
        this.c = byteBuffer;
        this.d = tg0Var.b;
    }
}
