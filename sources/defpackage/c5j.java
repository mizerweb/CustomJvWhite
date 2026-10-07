package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c5j {
    public final int a;
    public final int b;
    public final int c;

    public c5j(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5j)) {
            return false;
        }
        c5j c5jVar = (c5j) obj;
        return this.a == c5jVar.a && this.b == c5jVar.b && this.c == c5jVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("SizeConfig(height=", this.a, ", paddingHorizontal=", this.b, ", paddingVertical="), this.c, ")");
    }
}
