package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gxd implements hxd {
    public final d9 a;

    public gxd(d9 d9Var) {
        this.a = d9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxd) && this.a == ((gxd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ')';
    }
}
