package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class ga5 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final jrc c = new jrc(1, (byte) 0);
    public xva d;
    public int e;
    public int f;
    public long g;

    public final long a(kj6 kj6Var, int i) {
        byte[] bArr = this.a;
        kj6Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
