package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class hs2 {
    public static final gs2 Companion = new gs2();
    public static final hs2 e = new hs2();
    public final boolean a;
    public final boolean b;
    public final float c;
    public final long d;

    public hs2(int i, boolean z, boolean z2, float f, ew5 ew5Var) {
        long j;
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = 0.3f;
        } else {
            this.c = f;
        }
        if ((i & 8) == 0) {
            ghb ghbVar = ew5.b;
            j = 0;
        } else {
            j = ew5Var.a;
        }
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs2)) {
            return false;
        }
        hs2 hs2Var = (hs2) obj;
        return this.a == hs2Var.a && this.b == hs2Var.b && Float.compare(this.c, hs2Var.c) == 0 && ew5.f(this.d, hs2Var.d);
    }

    public final int hashCode() {
        int iM = nbh.m(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31);
        ghb ghbVar = ew5.b;
        return Long.hashCode(this.d) + iM;
    }

    public final String toString() {
        String strT = ew5.t(this.d);
        StringBuilder sbB = zo5.B("ChannelViewConfig(enabled=", this.a, ", fixEnabled=", this.b, ", messageThreshold=");
        sbB.append(this.c);
        sbB.append(", requiredViewTime=");
        sbB.append(strT);
        sbB.append(")");
        return sbB.toString();
    }

    public hs2() {
        ghb ghbVar = ew5.b;
        this.a = true;
        this.b = false;
        this.c = 0.3f;
        this.d = 0L;
    }
}
