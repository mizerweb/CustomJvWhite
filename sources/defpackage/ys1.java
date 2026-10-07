package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class ys1 implements k79 {
    public final fu1 a;
    public final CharSequence b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final long l;

    public ys1(fu1 fu1Var, CharSequence charSequence, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, String str2, boolean z6) {
        this.a = fu1Var;
        this.b = charSequence;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = z5;
        this.j = str2;
        this.k = z6;
        this.l = fu1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys1)) {
            return false;
        }
        ys1 ys1Var = (ys1) obj;
        return cqk.d(this.a, ys1Var.a) && cqk.d(this.b, ys1Var.b) && this.c.equals(ys1Var.c) && this.d == ys1Var.d && this.e == ys1Var.e && this.f == ys1Var.f && this.g == ys1Var.g && this.h == ys1Var.h && this.i == ys1Var.i && this.j.equals(ys1Var.j) && this.k == ys1Var.k;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.l;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.l == k79Var.getItemId();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + nbh.n(qt4.g(nbh.n(nbh.n(nbh.n(nbh.n(zo5.d(mw7.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        ys1 ys1Var = (ys1) k79Var;
        boolean z = ys1Var.d;
        boolean z2 = ys1Var.g;
        boolean z3 = ys1Var.e;
        String str = ys1Var.c;
        String str2 = ys1Var.j;
        fu1 fu1Var = ys1Var.a;
        c79 c79VarW = yab.w();
        CharSequence charSequence = ys1Var.b;
        CharSequence charSequence2 = this.b;
        if (!TextUtils.equals(charSequence2, charSequence)) {
            c79VarW.add(new ws1(charSequence));
        }
        if (!TextUtils.equals(this.j, str2)) {
            c79VarW.add(new ss1(str2));
        }
        boolean zEquals = this.c.equals(str);
        fu1 fu1Var2 = this.a;
        if (!zEquals || !cqk.d(fu1Var2, fu1Var) || !cqk.d(charSequence2, charSequence)) {
            c79VarW.add(new rs1(fu1Var, charSequence.toString(), str));
        }
        if (!cqk.d(fu1Var2, fu1Var) || this.e != z3 || this.g != z2) {
            c79VarW.add(new ts1(fu1Var, z3, z2));
        }
        if (this.d != z || !cqk.d(fu1Var2, fu1Var)) {
            c79VarW.add(new us1(fu1Var, z));
        }
        boolean z4 = ys1Var.i;
        if (this.i != z4) {
            c79VarW.add(new vs1(z4));
        }
        return yab.j(c79VarW);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallOpponentInfoState(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append((Object) this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", hasMoreAction=");
        sb.append(this.d);
        sb.append(", hasMenuAction=");
        qt4.B(", isAdmin=", ", isRaiseHand=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", isRaiseHandTime=");
        sb.append(this.h);
        sb.append(", isOnHold=");
        sb.append(this.i);
        sb.append(", description=");
        sb.append((Object) this.j);
        return nbh.z(sb, ", isOfficial=", this.k, ")");
    }
}
