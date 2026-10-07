package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class jyh {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public jyh(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jyh.class != obj.getClass()) {
            return false;
        }
        jyh jyhVar = (jyh) obj;
        return this.a == jyhVar.a && this.c == jyhVar.c && this.d == jyhVar.d && Arrays.equals(this.b, jyhVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
