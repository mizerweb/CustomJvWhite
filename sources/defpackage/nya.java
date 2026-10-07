package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nya {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public nya(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nya)) {
            return false;
        }
        nya nyaVar = (nya) obj;
        return this.a == nyaVar.a && this.b == nyaVar.b && this.c == nyaVar.c && this.d == nyaVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("Bounds(left=", this.a, ", top=", this.b, ", right=");
        sbP.append(this.c);
        sbP.append(", bottom=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
