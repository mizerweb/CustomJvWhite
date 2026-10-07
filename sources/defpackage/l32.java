package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l32 extends phl {
    public final String a;
    public final boolean b;

    public l32(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l32)) {
            return false;
        }
        l32 l32Var = (l32) obj;
        return cqk.d(this.a, l32Var.a) && this.b == l32Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.a + ", isJoinByExistLink=" + this.b + ")";
    }
}
