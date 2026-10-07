package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ts2 extends e48 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final e48[] g;

    public ts2(String str, int i, int i2, long j, long j2, e48[] e48VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = e48VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ts2.class != obj.getClass()) {
            return false;
        }
        ts2 ts2Var = (ts2) obj;
        return this.c == ts2Var.c && this.d == ts2Var.d && this.e == ts2Var.e && this.f == ts2Var.f && this.b.equals(ts2Var.b) && Arrays.equals(this.g, ts2Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
