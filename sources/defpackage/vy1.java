package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vy1 {
    public static final vy1 g = new vy1(false, false, null, false, false, false);
    public final boolean a;
    public final boolean b;
    public final fu1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public vy1(boolean z, boolean z2, fu1 fu1Var, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = fu1Var;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean a() {
        return this.a && this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy1)) {
            return false;
        }
        vy1 vy1Var = (vy1) obj;
        return this.a == vy1Var.a && this.b == vy1Var.b && cqk.d(this.c, vy1Var.c) && this.d == vy1Var.d && this.e == vy1Var.e && this.f == vy1Var.f;
    }

    public final int hashCode() {
        int iN = nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b);
        fu1 fu1Var = this.c;
        return Boolean.hashCode(this.f) + nbh.n(nbh.n((iN + (fu1Var == null ? 0 : fu1Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("CallScreenSharingState(isMe=", this.a, ", isSharingStateEnabled=", this.b, ", sharedScreenOpponentId=");
        sbB.append(this.c);
        sbB.append(", isAdminDisableScreenSharing=");
        sbB.append(this.d);
        sbB.append(", isMeAudioSharingEnabled=");
        return bc1.m(", isMeAdmin=", ")", sbB, this.e, this.f);
    }
}
