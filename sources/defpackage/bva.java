package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bva {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final i5f d;
    public final long e;
    public final long f;
    public final int g;

    public bva(int i, boolean z, boolean z2, i5f i5fVar, long j, long j2, int i2, int i3) {
        z = (i3 & 2) != 0 ? false : z;
        z2 = (i3 & 4) != 0 ? false : z2;
        i5fVar = (i3 & 8) != 0 ? i5f.a : i5fVar;
        j = (i3 & 16) != 0 ? 0L : j;
        j2 = (i3 & 32) != 0 ? -1L : j2;
        i2 = (i3 & 64) != 0 ? 0 : i2;
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i5fVar;
        this.e = j;
        this.f = j2;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bva)) {
            return false;
        }
        bva bvaVar = (bva) obj;
        return this.a == bvaVar.a && this.b == bvaVar.b && this.c == bvaVar.c && this.d == bvaVar.d && this.e == bvaVar.e && this.f == bvaVar.f && this.g == bvaVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + qt4.g(qt4.g((this.d.hashCode() + nbh.n(nbh.n(qt4.D(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ScrollWork(scrollType=");
        int i = this.a;
        if (i == 1) {
            str = "TO_UNREAD";
        } else if (i == 2) {
            str = "TO_LAST";
        } else if (i != 3) {
            str = i != 4 ? "null" : "TO_ANCHOR";
        } else {
            str = "TO_LAST_NEW";
        }
        sb.append(str);
        sb.append(", highlight=");
        sb.append(this.b);
        sb.append(", instant=");
        sb.append(this.c);
        sb.append(", alignment=");
        sb.append(this.d);
        sb.append(", msgId=");
        sb.append(this.e);
        qt4.z(this.f, ", time=", ", offset=", sb);
        return zo5.t(sb, this.g, ")");
    }
}
