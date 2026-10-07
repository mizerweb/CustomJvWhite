package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k52 {
    public static final k52 k = new k52(null, 1, null, null, true, x7j.a, false, vmi.d, 0, false);
    public final fu1 a;
    public final int b;
    public final fu1 c;
    public final fu1 d;
    public final boolean e;
    public final x7j f;
    public final boolean g;
    public final vmi h;
    public final long i;
    public final boolean j;

    public k52(fu1 fu1Var, int i, fu1 fu1Var2, fu1 fu1Var3, boolean z, x7j x7jVar, boolean z2, vmi vmiVar, long j, boolean z3) {
        this.a = fu1Var;
        this.b = i;
        this.c = fu1Var2;
        this.d = fu1Var3;
        this.e = z;
        this.f = x7jVar;
        this.g = z2;
        this.h = vmiVar;
        this.i = j;
        this.j = z3;
    }

    public static k52 a(k52 k52Var, fu1 fu1Var, int i, fu1 fu1Var2, fu1 fu1Var3, x7j x7jVar, vmi vmiVar, long j, int i2) {
        if ((i2 & 1) != 0) {
            fu1Var = k52Var.a;
        }
        fu1 fu1Var4 = fu1Var;
        int i3 = (i2 & 2) != 0 ? k52Var.b : i;
        fu1 fu1Var5 = (i2 & 4) != 0 ? k52Var.c : fu1Var2;
        fu1 fu1Var6 = (i2 & 8) != 0 ? k52Var.d : fu1Var3;
        boolean z = (i2 & 16) != 0 ? k52Var.e : false;
        x7j x7jVar2 = (i2 & 32) != 0 ? k52Var.f : x7jVar;
        boolean z2 = (i2 & 64) != 0 ? k52Var.g : true;
        vmi vmiVar2 = (i2 & np0.m) != 0 ? k52Var.h : vmiVar;
        long j2 = (i2 & np0.n) != 0 ? k52Var.i : j;
        boolean z3 = (i2 & np0.o) != 0 ? k52Var.j : true;
        k52Var.getClass();
        return new k52(fu1Var4, i3, fu1Var5, fu1Var6, z, x7jVar2, z2, vmiVar2, j2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k52)) {
            return false;
        }
        k52 k52Var = (k52) obj;
        return cqk.d(this.a, k52Var.a) && this.b == k52Var.b && cqk.d(this.c, k52Var.c) && cqk.d(this.d, k52Var.d) && this.e == k52Var.e && this.f == k52Var.f && this.g == k52Var.g && this.h == k52Var.h && this.i == k52Var.i && this.j == k52Var.j;
    }

    public final int hashCode() {
        fu1 fu1Var = this.a;
        int iF = c0a.f(this.b, (fu1Var == null ? 0 : fu1Var.hashCode()) * 31, 31);
        fu1 fu1Var2 = this.c;
        int iHashCode = (iF + (fu1Var2 == null ? 0 : fu1Var2.hashCode())) * 31;
        fu1 fu1Var3 = this.d;
        return Boolean.hashCode(this.j) + qt4.g((this.h.hashCode() + nbh.n((this.f.hashCode() + nbh.n((iHashCode + (fu1Var3 != null ? fu1Var3.hashCode() : 0)) * 31, 31, this.e)) * 31, 31, this.g)) * 31, 31, this.i);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CallUserState(pinnedOpponentId=");
        sb.append(this.a);
        sb.append(", pinType=");
        int i = this.b;
        if (i == 1) {
            str = "NONE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTO";
        } else {
            str = "MANUAL";
        }
        sb.append(str);
        sb.append(", pipOpponentIdState=");
        sb.append(this.c);
        sb.append(", selectedOpponentId=");
        sb.append(this.d);
        sb.append(", canShowInviteBanner=");
        sb.append(this.e);
        sb.append(", modeView=");
        sb.append(this.f);
        sb.append(", raiseHandOnce=");
        sb.append(this.g);
        sb.append(", vpnNotification=");
        sb.append(this.h);
        sb.append(", lastShowWaitingRoomNotificationTs=");
        sb.append(this.i);
        return nbh.z(sb, ", switchModeHintShowed=", this.j, ")");
    }
}
