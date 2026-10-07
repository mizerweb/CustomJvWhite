package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l11 {
    public final yp9 a;
    public final yp9 b;
    public final yp9 c;
    public final yp9 d;
    public final sg1 e;
    public final boolean f;

    public l11(yp9 yp9Var, yp9 yp9Var2, yp9 yp9Var3, yp9 yp9Var4, sg1 sg1Var, boolean z) {
        this.a = yp9Var;
        this.b = yp9Var2;
        this.c = yp9Var3;
        this.d = yp9Var4;
        this.e = sg1Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l11)) {
            return false;
        }
        l11 l11Var = (l11) obj;
        return this.a == l11Var.a && this.b == l11Var.b && this.c == l11Var.c && this.d == l11Var.d && this.e.equals(l11Var.e) && this.f == l11Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BottomPanelState(isMicrophoneEnabled=" + this.a + ", isVideoEnabled=" + this.b + ", isRaiseHandEnabled=" + this.c + ", isHoldEnabled=" + this.d + ", dynamicType=" + this.e + ", isGroupCall=" + this.f + ")";
    }
}
