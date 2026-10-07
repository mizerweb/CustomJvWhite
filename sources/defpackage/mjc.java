package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mjc {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final ljc f;
    public final b40 g = gvk.a(false);

    public mjc(boolean z, long j, long j2, long j3, long j4, ljc ljcVar) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = ljcVar;
    }

    public final void a(long j, Object obj) {
        if (this.g.a()) {
            this.f.d(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.d);
        sb.append(" at ");
        sb.append((Object) tc7.a(this.b));
        sb.append(" for ");
        ore.c(c0a.m(j, " was completed multiple times!", sb));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mjc) {
            mjc mjcVar = (mjc) obj;
            if (this.a == mjcVar.a && this.b == mjcVar.b && this.c == mjcVar.c && this.d == mjcVar.d && this.e == mjcVar.e && cqk.d(this.f, mjcVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + qt4.g(qt4.g(qt4.g(qt4.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.a + ", cameraFrameNumber=" + ((Object) tc7.a(this.b)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.c + ')')) + ", cameraOutputSequence=" + this.d + ", cameraOutputNumber=" + this.e + ", outputListener=" + this.f + ')';
    }
}
