package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class npi {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final p4j d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final p4j h;

    public npi(long j, boolean z, boolean z2, p4j p4jVar, boolean z3, boolean z4, boolean z5, p4j p4jVar2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = p4jVar;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = p4jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npi)) {
            return false;
        }
        npi npiVar = (npi) obj;
        return this.a == npiVar.a && this.b == npiVar.b && this.c == npiVar.c && cqk.d(this.d, npiVar.d) && this.e == npiVar.e && this.f == npiVar.f && this.g == npiVar.g && cqk.d(this.h, npiVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + nbh.n(nbh.n(nbh.n((this.d.hashCode() + nbh.n(nbh.n(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "UserVideoState(id=", ", isMe=", this.b);
        sbU.append(", isVideoEnabled=");
        sbU.append(this.c);
        sbU.append(", videoState=");
        sbU.append(this.d);
        qv1.v(", isConnected=", ", isAccepted=", sbU, this.e, this.f);
        sbU.append(", isScreenCaptureEnabled=");
        sbU.append(this.g);
        sbU.append(", screenCaptureState=");
        sbU.append(this.h);
        sbU.append(")");
        return sbU.toString();
    }
}
