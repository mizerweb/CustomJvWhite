package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i68 {
    public static final i68 c = new i68("UNKNOWN", null);
    public final String a;
    public final String b;

    public i68(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i68)) {
            return false;
        }
        i68 i68Var = (i68) obj;
        return this.a.equals(i68Var.a) && cqk.d(this.b, i68Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}
