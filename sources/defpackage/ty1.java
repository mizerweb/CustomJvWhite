package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ty1 {
    public static final ty1 g = new ty1(false, false, false, null, false, null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final fu1 d;
    public final boolean e;
    public final CharSequence f;

    public ty1(boolean z, boolean z2, boolean z3, fu1 fu1Var, boolean z4, CharSequence charSequence) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = fu1Var;
        this.e = z4;
        this.f = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty1)) {
            return false;
        }
        ty1 ty1Var = (ty1) obj;
        return this.a == ty1Var.a && this.b == ty1Var.b && this.c == ty1Var.c && cqk.d(this.d, ty1Var.d) && this.e == ty1Var.e && cqk.d(this.f, ty1Var.f);
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        fu1 fu1Var = this.d;
        int iN2 = nbh.n((iN + (fu1Var == null ? 0 : fu1Var.hashCode())) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        return iN2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("CallScreenRecordState(isMe=", this.a, ", meIsAdmin=", this.b, ", isRecordStateEnabled=");
        sbB.append(this.c);
        sbB.append(", recordScreenOpponentId=");
        sbB.append(this.d);
        sbB.append(", isAdminDisableScreenRecord=");
        sbB.append(this.e);
        sbB.append(", userName=");
        sbB.append((Object) this.f);
        sbB.append(")");
        return sbB.toString();
    }
}
