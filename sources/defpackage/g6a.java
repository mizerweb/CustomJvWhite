package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class g6a {
    public static final f6a Companion = new f6a();
    public final int a;
    public final int b;
    public final int c;

    public /* synthetic */ g6a(int i, int i2, int i3, int i4) {
        this.a = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.b = -1;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = -1;
        } else {
            this.c = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6a)) {
            return false;
        }
        g6a g6aVar = (g6a) obj;
        return this.a == g6aVar.a && this.b == g6aVar.b && this.c == g6aVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("EncoderConfig(low=", this.a, ", avg=", this.b, ", high="), this.c, ")");
    }

    public g6a() {
        this.a = 1;
        this.b = -1;
        this.c = -1;
    }
}
