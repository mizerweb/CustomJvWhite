package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnb {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public cnb(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i != 0;
    }

    public static cnb a(cnb cnbVar, int i, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            i = cnbVar.a;
        }
        if ((i2 & 2) != 0) {
            z = cnbVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = cnbVar.c;
        }
        if ((i2 & 8) != 0) {
            z3 = cnbVar.d;
        }
        cnbVar.getClass();
        return new cnb(i, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnb)) {
            return false;
        }
        cnb cnbVar = (cnb) obj;
        return this.a == cnbVar.a && this.b == cnbVar.b && this.c == cnbVar.c && this.d == cnbVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + nbh.n(nbh.n(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationStackModel(hasCounterValue=");
        sb.append(this.a);
        sb.append(", hasReaction=");
        sb.append(this.b);
        sb.append(", hasMention=");
        return bc1.m(", isMuted=", ")", sb, this.c, this.d);
    }
}
