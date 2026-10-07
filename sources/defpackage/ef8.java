package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class ef8 {
    public static final df8 Companion = new df8();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ef8(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            shl.b(i, 3, cf8.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef8)) {
            return false;
        }
        ef8 ef8Var = (ef8) obj;
        return cqk.d(this.a, ef8Var.a) && cqk.d(this.b, ef8Var.b) && cqk.d(this.c, ef8Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return zo5.w(qv1.q("InformerSplashUpdateConfig(title=", this.a, ", button=", this.b, ", description="), this.c, ")");
    }
}
