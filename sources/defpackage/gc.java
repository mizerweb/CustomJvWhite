package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gc {
    public static final gc h = new gc(false, true, true, true, true, true, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public gc(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public static gc a(gc gcVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = gcVar.a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = gcVar.b;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = gcVar.c;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = gcVar.d;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = gcVar.e;
        }
        boolean z11 = z5;
        boolean z12 = gcVar.f;
        if ((i & 64) != 0) {
            z6 = gcVar.g;
        }
        gcVar.getClass();
        return new gc(z7, z8, z9, z10, z11, z12, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return this.a == gcVar.a && this.b == gcVar.b && this.c == gcVar.c && this.d == gcVar.d && this.e == gcVar.e && this.f == gcVar.f && this.g == gcVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("AdminCallState(isAdminOrCreator=", this.a, ", isEnableCameraAvailableInCall=", this.b, ", isEnableMicrophoneAvailableInCall=");
        qt4.B(", isEnableSharingScreenAvailableInCall=", ", isEnableRecordScreenAvailableInCall=", sbB, this.c, this.d);
        qt4.B(", isEnableHandsUpAvailableInCall=", ", isEnableWaitingRoom=", sbB, this.e, this.f);
        return qt4.r(sbB, this.g, ")");
    }
}
