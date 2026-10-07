package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h6k extends k6k {
    public final String a;
    public final Throwable b;

    public h6k(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6k)) {
            return false;
        }
        h6k h6kVar = (h6k) obj;
        return cqk.d(this.a, h6kVar.a) && cqk.d(this.b, h6kVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoResponseFromArbiter(arbiter=" + this.a + ", exception=" + this.b + ')';
    }
}
