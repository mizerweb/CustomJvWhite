package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class wz9 {
    public final long a;
    public final long b;
    public final Set c;
    public final long d;

    public wz9(long j, long j2, Set set, long j3) {
        this.a = j;
        this.b = j2;
        this.c = set;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz9)) {
            return false;
        }
        wz9 wz9Var = (wz9) obj;
        return this.a == wz9Var.a && this.b == wz9Var.b && cqk.d(this.c, wz9Var.c) && this.d == wz9Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + nbh.o(this.c, qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "MediaMarkers(backward=", ", forward=");
        sbS.append(this.b);
        sbS.append(", types=");
        sbS.append(this.c);
        return zo5.k(this.d, ", chatId=", ")", sbS);
    }
}
