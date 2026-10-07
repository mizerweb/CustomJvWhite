package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wg2 {
    public final tw5 a;
    public final us7 b;

    public wg2(tw5 tw5Var, us7 us7Var) {
        this.a = tw5Var;
        this.b = us7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg2)) {
            return false;
        }
        wg2 wg2Var = (wg2) obj;
        return this.a == wg2Var.a && this.b == wg2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.a + ", executor=" + this.b + ')';
    }
}
