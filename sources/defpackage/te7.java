package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class te7 {
    public final String a;
    public final String b;
    public final te7 c;

    public te7(String str, String str2, te7 te7Var) {
        this.a = str;
        this.b = str2;
        this.c = te7Var;
    }

    public static te7 a(te7 te7Var, String str) {
        String str2 = te7Var.a;
        te7 te7Var2 = te7Var.c;
        te7Var.getClass();
        return new te7(str2, str, te7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te7)) {
            return false;
        }
        te7 te7Var = (te7) obj;
        return cqk.d(this.a, te7Var.a) && cqk.d(this.b, te7Var.b) && cqk.d(this.c, te7Var.c);
    }

    public final int hashCode() {
        int iD = zo5.d(this.a.hashCode() * 31, 31, this.b);
        te7 te7Var = this.c;
        return iD + (te7Var == null ? 0 : te7Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("Result(normalized=", this.a, ", original=", this.b, ", noEmoji=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
