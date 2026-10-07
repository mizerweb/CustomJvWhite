package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mf8 {
    public final Exception a;
    public final pni b;

    public mf8(Exception exc, pni pniVar) {
        this.a = exc;
        this.b = pniVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mf8) {
            mf8 mf8Var = (mf8) obj;
            return this.a.equals(mf8Var.a) && this.b == mf8Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InitFailedArgs(exception=" + this.a + ", onResult=" + this.b + ")";
    }
}
