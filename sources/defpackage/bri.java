package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class bri implements Comparable, Serializable {
    public static final bri c = new bri(0, 0);
    public final long a;
    public final long b;

    public bri(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bri briVar = (bri) obj;
        long j = briVar.a;
        long j2 = this.a;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.b, briVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bri)) {
            return false;
        }
        bri briVar = (bri) obj;
        return this.a == briVar.a && this.b == briVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        t2m.a(this.a, bArr, 0, 0, 4);
        bArr[8] = 45;
        t2m.a(this.a, bArr, 9, 4, 6);
        bArr[13] = 45;
        t2m.a(this.a, bArr, 14, 6, 8);
        bArr[18] = 45;
        t2m.a(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        t2m.a(this.b, bArr, 24, 2, 8);
        return z5h.F0(bArr);
    }
}
