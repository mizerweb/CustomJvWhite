package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r01 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public r01(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01)) {
            return false;
        }
        r01 r01Var = (r01) obj;
        return this.a == r01Var.a && cqk.d(this.b, r01Var.b) && this.c.equals(r01Var.c) && cqk.d(this.d, r01Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iD = zo5.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "BotItem(botId=", ", botTag=", this.b);
        nbh.G(sbT, ", commandName=", this.c, ", commandDescription=", this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
