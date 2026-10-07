package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o40 {
    public final String a;
    public final String b;
    public final Integer c;

    public o40(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return cqk.d(this.a, o40Var.a) && cqk.d(this.b, o40Var.b) && cqk.d(this.c, o40Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("AttachData(attachName=", this.a, ", image=", this.b, ", placeholder=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
