package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ynd extends mk0 {
    public final long b;
    public final nnd c;

    public ynd(long j, nnd nndVar) {
        super(12);
        this.b = j;
        this.c = nndVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynd)) {
            return false;
        }
        ynd yndVar = (ynd) obj;
        return this.b == yndVar.b && this.c == yndVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChangeLink(id=" + this.b + ", type=" + this.c + ")";
    }
}
