package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i5g {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public i5g(h5g h5gVar) {
        this.a = h5gVar.a;
        this.b = h5gVar.b;
        this.c = h5gVar.c;
        this.e = h5gVar.e;
        this.d = h5gVar.d;
        this.f = h5gVar.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i5g.class != obj.getClass()) {
            return false;
        }
        i5g i5gVar = (i5g) obj;
        return this.a == i5gVar.a && this.b == i5gVar.b && this.c == i5gVar.c && this.d == i5gVar.d && this.f == i5gVar.f && this.e == i5gVar.e;
    }

    public final int hashCode() {
        return ((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
