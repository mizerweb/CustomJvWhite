package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ahh {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public ahh() {
        if (xr8.a == null) {
            xr8.a = new xr8();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
