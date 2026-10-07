package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wli {
    public final int a;
    public final i64 b;

    public wli(int i, i64 i64Var) {
        this.a = i;
        this.b = i64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wli)) {
            return false;
        }
        wli wliVar = (wli) obj;
        return this.a == wliVar.a && cqk.d(this.b, wliVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.a + ", signal=" + this.b + ')';
    }
}
