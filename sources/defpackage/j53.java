package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j53 {
    public final kc7 a;
    public final boolean b;

    public j53(kc7 kc7Var, int i) {
        kc7Var = (i & 1) != 0 ? null : kc7Var;
        boolean z = (i & 2) == 0;
        this.a = kc7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j53)) {
            return false;
        }
        j53 j53Var = (j53) obj;
        return cqk.d(this.a, j53Var.a) && this.b == j53Var.b;
    }

    public final int hashCode() {
        kc7 kc7Var = this.a;
        return Boolean.hashCode(true) + nbh.n((kc7Var == null ? 0 : kc7Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "FrameState(frame=" + this.a + ", loading=" + this.b + ", featureEnabled=true)";
    }
}
