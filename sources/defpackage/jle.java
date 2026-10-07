package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jle extends eh2 {
    public final d9 a;

    public jle(d9 d9Var) {
        this.a = d9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jle) && cqk.d(this.a, ((jle) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.a + ')';
    }
}
