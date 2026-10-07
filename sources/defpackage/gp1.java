package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class gp1 implements jp1 {
    public final fu1 a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final ok0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final npi p;
    public final e61 q;
    public final int r;
    public final boolean s;

    public gp1(fu1 fu1Var, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, String str, ok0 ok0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, npi npiVar, e61 e61Var, int i, boolean z11) {
        this.a = fu1Var;
        this.b = charSequence;
        this.c = spannableStringBuilder;
        this.d = str;
        this.e = ok0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
        this.p = npiVar;
        this.q = e61Var;
        this.r = i;
        this.s = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp1)) {
            return false;
        }
        gp1 gp1Var = (gp1) obj;
        return cqk.d(this.a, gp1Var.a) && cqk.d(this.b, gp1Var.b) && cqk.d(this.c, gp1Var.c) && this.d.equals(gp1Var.d) && this.e.equals(gp1Var.e) && this.f == gp1Var.f && this.g == gp1Var.g && this.h == gp1Var.h && this.i == gp1Var.i && this.j == gp1Var.j && this.k == gp1Var.k && this.l == gp1Var.l && this.m == gp1Var.m && this.n == gp1Var.n && this.o == gp1Var.o && this.p.equals(gp1Var.p) && this.q.equals(gp1Var.q) && this.r == gp1Var.r && this.s == gp1Var.s;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a.a;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.a.a == k79Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return Boolean.hashCode(this.s) + c0a.f(this.r, (this.q.hashCode() + ((this.p.hashCode() + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n((this.e.hashCode() + zo5.d((iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o)) * 31)) * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        gp1 gp1Var = (gp1) k79Var;
        npi npiVar = gp1Var.p;
        e61 e61Var = gp1Var.q;
        ok0 ok0Var = gp1Var.e;
        String str = gp1Var.d;
        c79 c79VarW = yab.w();
        CharSequence charSequence = gp1Var.c;
        if (!cqk.d(this.c, charSequence) || !this.d.equals(str)) {
            c79VarW.add(new bp1(str, charSequence));
        }
        boolean z = gp1Var.h;
        if (this.h != z) {
            c79VarW.add(new ap1(z));
        }
        boolean z2 = gp1Var.f;
        if (this.f != z2) {
            c79VarW.add(new dp1(z2));
        }
        if (!this.e.equals(ok0Var)) {
            c79VarW.add(new xo1(ok0Var));
        }
        if (!this.q.equals(e61Var)) {
            c79VarW.add(new yo1(e61Var));
        }
        if (!this.p.equals(npiVar)) {
            c79VarW.add(new ep1(npiVar));
        }
        boolean z3 = gp1Var.k;
        if (this.k != z3) {
            c79VarW.add(new cp1(z3));
        }
        boolean z4 = gp1Var.l;
        if (this.l != z4) {
            c79VarW.add(new zo1(z4));
        }
        return yab.j(c79VarW);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallOpponentState(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append((Object) this.b);
        sb.append(", userNameWithState=");
        sb.append((Object) this.c);
        sb.append(", userNameAccessibility=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", isTalking=");
        sb.append(this.f);
        sb.append(", isConnectedOnce=");
        qt4.B(", isConnecting=", ", isVideoEnabled=", sb, this.g, this.h);
        qt4.B(", isMicrophoneEnabled=", ", isRaiseHand=", sb, this.i, this.j);
        qt4.B(", isOnHold=", ", isMe=", sb, this.k, this.l);
        qt4.B(", isAdmin=", ", isCreator=", sb, this.m, this.n);
        sb.append(this.o);
        sb.append(", videoState=");
        sb.append(this.p);
        sb.append(", buttonAction=");
        sb.append(this.q);
        sb.append(", talkingState=");
        sb.append(pye.i(this.r));
        sb.append(", isOfficial=");
        return qt4.r(sb, this.s, ")");
    }
}
