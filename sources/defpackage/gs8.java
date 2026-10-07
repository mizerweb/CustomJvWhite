package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gs8 implements hs8 {
    public final kqj a;
    public final wpj b;

    public gs8(kqj kqjVar, wpj wpjVar) {
        this.a = kqjVar;
        this.b = wpjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs8)) {
            return false;
        }
        gs8 gs8Var = (gs8) obj;
        return this.a.equals(gs8Var.a) && cqk.d(this.b, gs8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        wpj wpjVar = this.b;
        return iHashCode + (wpjVar == null ? 0 : wpjVar.hashCode());
    }

    public final String toString() {
        return "RequestShare(data=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
