package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pi2 {
    public final boolean a;
    public final boolean b;

    public pi2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi2)) {
            return false;
        }
        pi2 pi2Var = (pi2) obj;
        return this.a == pi2Var.a && this.b == pi2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationCriteria(checkBack=");
        sb.append(this.a);
        sb.append(", checkFront=");
        return c0a.p(sb, this.b, ')');
    }
}
