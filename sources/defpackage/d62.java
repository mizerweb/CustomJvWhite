package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d62 {
    public final x7j a;
    public final String b;
    public final List c;
    public final vai d;
    public final tx8 e;
    public final boolean f;
    public final ok0 g;
    public final boolean h;
    public final boolean i;

    public d62(x7j x7jVar, String str, List list, vai vaiVar, tx8 tx8Var, boolean z, ok0 ok0Var, boolean z2, boolean z3) {
        this.a = x7jVar;
        this.b = str;
        this.c = list;
        this.d = vaiVar;
        this.e = tx8Var;
        this.f = z;
        this.g = ok0Var;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d62)) {
            return false;
        }
        d62 d62Var = (d62) obj;
        return this.a == d62Var.a && cqk.d(this.b, d62Var.b) && cqk.d(this.c, d62Var.c) && cqk.d(this.d, d62Var.d) && cqk.d(this.e, d62Var.e) && this.f == d62Var.f && cqk.d(this.g, d62Var.g) && this.h == d62Var.h && this.i == d62Var.i;
    }

    public final int hashCode() {
        int iC = qv1.c(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        vai vaiVar = this.d;
        int iHashCode = (iC + (vaiVar == null ? 0 : vaiVar.hashCode())) * 31;
        tx8 tx8Var = this.e;
        int iN = nbh.n((iHashCode + (tx8Var == null ? 0 : tx8Var.hashCode())) * 31, 31, this.f);
        ok0 ok0Var = this.g;
        return Boolean.hashCode(this.i) + nbh.n((iN + (ok0Var != null ? ok0Var.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallViewState(activeMode=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", modes=");
        sb.append(this.c);
        sb.append(", unavailableCallState=");
        sb.append(this.d);
        sb.append(", labelSpeakerState=");
        sb.append(this.e);
        sb.append(", isGroupCall=");
        sb.append(this.f);
        sb.append(", mainSpeakerAvatar=");
        sb.append(this.g);
        sb.append(", isCallEventsUnavailable=");
        sb.append(this.h);
        sb.append(", isP2GCallAnimationDepended=");
        return qt4.r(sb, this.i, ")");
    }

    public /* synthetic */ d62() {
        this(x7j.a, "", r66.a, null, null, false, null, false, false);
    }
}
