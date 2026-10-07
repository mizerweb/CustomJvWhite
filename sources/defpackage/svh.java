package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class svh {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final jvh f;
    public final boolean g;
    public final boolean h;

    public svh(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jvh jvhVar, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = jvhVar;
        this.g = z6;
        this.h = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svh)) {
            return false;
        }
        svh svhVar = (svh) obj;
        return this.a == svhVar.a && this.b == svhVar.b && this.c == svhVar.c && this.d == svhVar.d && this.e == svhVar.e && cqk.d(this.f, svhVar.f) && this.g == svhVar.g && this.h == svhVar.h;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        jvh jvhVar = this.f;
        return Boolean.hashCode(this.h) + nbh.n((iN + (jvhVar == null ? 0 : jvhVar.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("TopPanelState(isGroupCall=", this.a, ", shouldShowTitleAndStatus=", this.b, ", isRecordEnabled=");
        qt4.B(", isMenuButtonVisible=", ", isAddUserEnabled=", sbB, this.c, this.d);
        sbB.append(this.e);
        sbB.append(", recordStateTooltip=");
        sbB.append(this.f);
        sbB.append(", isMeAudioSharingEnabled=");
        return bc1.m(", isSharingStateEnabled=", ")", sbB, this.g, this.h);
    }
}
