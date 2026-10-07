package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class csd extends mk0 {
    public final long b;
    public final kmd c;

    public csd(long j, kmd kmdVar) {
        super(14);
        this.b = j;
        this.c = kmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csd)) {
            return false;
        }
        csd csdVar = (csd) obj;
        return this.b == csdVar.b && this.c == csdVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "EditProfile(id=" + this.b + ", type=" + this.c + ")";
    }
}
