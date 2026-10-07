package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j6f {
    public static final j6f f = new j6f(0, false, false, null, false);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final i6f d;
    public final boolean e;

    public j6f(int i, boolean z, boolean z2, i6f i6fVar, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i6fVar;
        this.e = z3;
    }

    public static j6f a(j6f j6fVar, int i, boolean z, boolean z2, i6f i6fVar, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            i = j6fVar.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            z = j6fVar.b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = j6fVar.c;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            i6fVar = j6fVar.d;
        }
        i6f i6fVar2 = i6fVar;
        if ((i2 & 16) != 0) {
            z3 = j6fVar.e;
        }
        j6fVar.getClass();
        return new j6f(i3, z4, z5, i6fVar2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6f)) {
            return false;
        }
        j6f j6fVar = (j6f) obj;
        return this.a == j6fVar.a && this.b == j6fVar.b && this.c == j6fVar.c && cqk.d(this.d, j6fVar.d) && this.e == j6fVar.e;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        i6f i6fVar = this.d;
        return Boolean.hashCode(this.e) + ((iN + (i6fVar == null ? 0 : i6fVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollState(unreadMessages=");
        sb.append(this.a);
        sb.append(", isUnreadButtonVisible=");
        sb.append(this.b);
        sb.append(", isMentionButtonVisible=");
        sb.append(this.c);
        sb.append(", lastReaction=");
        sb.append(this.d);
        sb.append(", hasMessages=");
        return qt4.r(sb, this.e, ")");
    }
}
