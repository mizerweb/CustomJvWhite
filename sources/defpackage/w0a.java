package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class w0a {
    public final x4a a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public w0a(x4a x4aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        lvb.R(!z5 || z3);
        lvb.R(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        lvb.R(z6);
        this.a = x4aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final w0a a(long j) {
        if (j == this.c) {
            return this;
        }
        return new w0a(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final w0a b(long j) {
        if (j == this.b) {
            return this;
        }
        return new w0a(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0a.class == obj.getClass()) {
            w0a w0aVar = (w0a) obj;
            if (this.b == w0aVar.b && this.c == w0aVar.c && this.d == w0aVar.d && this.e == w0aVar.e && this.f == w0aVar.f && this.g == w0aVar.g && this.h == w0aVar.h && this.i == w0aVar.i && this.j == w0aVar.j && Objects.equals(this.a, w0aVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
