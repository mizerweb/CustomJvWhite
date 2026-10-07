package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class psh {
    public final Object a;
    public final long b;

    public psh(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psh)) {
            return false;
        }
        psh pshVar = (psh) obj;
        return this.a.equals(pshVar.a) && ew5.f(this.b, pshVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ghb ghbVar = ew5.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) ew5.t(this.b)) + ')';
    }
}
