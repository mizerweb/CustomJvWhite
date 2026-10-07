package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ecc implements bcc, dcc {
    public final String a;
    public final Integer b;
    public final cf7 c;

    public ecc(String str, Integer num, cf7 cf7Var) {
        this.a = str;
        this.b = num;
        this.c = cf7Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ecc)) {
            return false;
        }
        ecc eccVar = (ecc) obj;
        return this.a.equals(eccVar.a) && cqk.d(this.b, eccVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
