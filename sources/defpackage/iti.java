package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iti implements kti {
    public final long a;
    public final String b;
    public final t50 c;
    public final long d;
    public final long e;
    public final boolean f;

    public iti(long j, String str, t50 t50Var, long j2, long j3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = t50Var;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iti)) {
            return false;
        }
        iti itiVar = (iti) obj;
        return this.a == itiVar.a && cqk.d(this.b, itiVar.b) && cqk.d(this.c, itiVar.c) && this.d == itiVar.d && this.e == itiVar.e && this.f == itiVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qt4.g(qt4.g((this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "OpenVideo(msgId=", ", attachLocalId=", this.b);
        sbT.append(", attachModel=");
        sbT.append(this.c);
        sbT.append(", playerPosition=");
        sbT.append(this.d);
        qt4.z(this.e, ", videoDuration=", ", isVideoLive=", sbT);
        return qt4.r(sbT, this.f, ")");
    }
}
