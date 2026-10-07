package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class zl9 {
    public static final yl9 Companion = new yl9();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ zl9(String str, String str2, int i, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl9)) {
            return false;
        }
        zl9 zl9Var = (zl9) obj;
        return cqk.d(this.a, zl9Var.a) && cqk.d(this.b, zl9Var.b) && cqk.d(this.c, zl9Var.c) && cqk.d(this.d, zl9Var.d) && cqk.d(this.e, zl9Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("MapConfig(tile=", this.a, ", geocoder=", this.b, ", staticPreview=");
        nbh.G(sbQ, this.c, ", logoLight=", this.d, ", logoDark=");
        return zo5.w(sbQ, this.e, ")");
    }
}
