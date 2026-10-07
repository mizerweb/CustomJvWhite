package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rs1 extends xs1 {
    public final fu1 a;
    public final String b;
    public final String c;

    public rs1(fu1 fu1Var, String str, String str2) {
        this.a = fu1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs1)) {
            return false;
        }
        rs1 rs1Var = (rs1) obj;
        return cqk.d(this.a, rs1Var.a) && cqk.d(this.b, rs1Var.b) && this.c.equals(rs1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", url=");
        return zo5.w(sb, this.c, ")");
    }
}
