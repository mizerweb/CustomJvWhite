package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bs6 {
    public final String a;
    public final int b = 2;

    public bs6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs6)) {
            return false;
        }
        bs6 bs6Var = (bs6) obj;
        return cqk.d(this.a, bs6Var.a) && this.b == bs6Var.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + nbh.n(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sbV = qt4.v("FilePreferencesOptions(name=", this.a, ", isDebugMode=false, commitStrategy=");
        sbV.append(qv1.x(this.b));
        sbV.append(")");
        return sbV.toString();
    }
}
