package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wm2 {
    public final jd2 a;
    public final j28 b;
    public final wb2 c;

    public wm2(jd2 jd2Var, j28 j28Var, wb2 wb2Var) {
        this.a = jd2Var;
        this.b = j28Var;
        this.c = wb2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wm2) {
            wm2 wm2Var = (wm2) obj;
            return cqk.d(this.a, wm2Var.a) && this.b == wm2Var.b && this.c == wm2Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.a + ", processor=" + this.b + ", captureSequenceProcessor=" + this.c + ')';
    }
}
