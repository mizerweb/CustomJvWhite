package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x4a {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public x4a(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final x4a a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new x4a(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4a)) {
            return false;
        }
        x4a x4aVar = (x4a) obj;
        return this.a.equals(x4aVar.a) && this.b == x4aVar.b && this.c == x4aVar.c && this.d == x4aVar.d && this.e == x4aVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public x4a(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public x4a(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public x4a(Object obj) {
        this(-1L, obj);
    }
}
