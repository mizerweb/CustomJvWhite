package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ok0 {
    public final tj0 a;
    public final String b;

    public ok0(tj0 tj0Var, String str) {
        this.a = tj0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok0)) {
            return false;
        }
        ok0 ok0Var = (ok0) obj;
        return cqk.d(this.a, ok0Var.a) && cqk.d(this.b, ok0Var.b);
    }

    public final int hashCode() {
        tj0 tj0Var = this.a;
        int iHashCode = (tj0Var == null ? 0 : tj0Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarInfo(abbreviationModel=" + this.a + ", url=" + this.b + ")";
    }
}
