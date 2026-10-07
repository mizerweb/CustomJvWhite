package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gsd extends mk0 {
    public final long b;
    public final kmd c;
    public final boolean d;
    public final String e;

    public gsd(long j, kmd kmdVar, boolean z, String str) {
        super(14);
        this.b = j;
        this.c = kmdVar;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsd)) {
            return false;
        }
        gsd gsdVar = (gsd) obj;
        return this.b == gsdVar.b && this.c == gsdVar.c && this.d == gsdVar.d && cqk.d(this.e, gsdVar.e);
    }

    public final int hashCode() {
        int iN = nbh.n((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31, this.d);
        String str = this.e;
        return iN + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OpenCall(id=" + this.b + ", type=" + this.c + ", isVideo=" + this.d + ", joinLink=" + this.e + ")";
    }
}
