package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cth {
    public final long a;
    public final int b;

    public cth(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cth.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        cth cthVar = (cth) obj;
        return this.a == cthVar.a && this.b == cthVar.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (Long.hashCode(this.a) * 31);
    }
}
