package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zoj {
    public final String a;
    public final cx0 b;

    public zoj(String str, cx0 cx0Var) {
        this.a = str;
        this.b = cx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoj)) {
            return false;
        }
        zoj zojVar = (zoj) obj;
        return this.a.equals(zojVar.a) && cqk.d(this.b, zojVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cx0 cx0Var = this.b;
        return iHashCode + (cx0Var == null ? 0 : cx0Var.hashCode());
    }

    public final String toString() {
        return "AuthBiometry(title=" + this.a + ", cryptoObject=" + this.b + ")";
    }
}
