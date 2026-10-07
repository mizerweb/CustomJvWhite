package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mh2 extends jh2 {
    public final String a;
    public final int b;
    public final Integer c;
    public final hw5 d;
    public final Throwable e;
    public final hw5 f;
    public final hw5 g;
    public final hw5 h;
    public final ne2 i;

    public mh2(String str, int i, Integer num, hw5 hw5Var, Throwable th, hw5 hw5Var2, hw5 hw5Var3, hw5 hw5Var4, ne2 ne2Var) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = hw5Var;
        this.e = th;
        this.f = hw5Var2;
        this.g = hw5Var3;
        this.h = hw5Var4;
        this.i = ne2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh2)) {
            return false;
        }
        mh2 mh2Var = (mh2) obj;
        return cqk.d(this.a, mh2Var.a) && this.b == mh2Var.b && cqk.d(this.c, mh2Var.c) && cqk.d(this.d, mh2Var.d) && cqk.d(this.e, mh2Var.e) && cqk.d(this.f, mh2Var.f) && cqk.d(this.g, mh2Var.g) && cqk.d(this.h, mh2Var.h) && cqk.d(this.i, mh2Var.i);
    }

    public final int hashCode() {
        int iF = c0a.f(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        hw5 hw5Var = this.d;
        int iHashCode2 = (iHashCode + (hw5Var == null ? 0 : Long.hashCode(hw5Var.a))) * 31;
        Throwable th = this.e;
        int iHashCode3 = (iHashCode2 + (th == null ? 0 : th.hashCode())) * 31;
        hw5 hw5Var2 = this.f;
        int iHashCode4 = (iHashCode3 + (hw5Var2 == null ? 0 : Long.hashCode(hw5Var2.a))) * 31;
        hw5 hw5Var3 = this.g;
        int iHashCode5 = (iHashCode4 + (hw5Var3 == null ? 0 : Long.hashCode(hw5Var3.a))) * 31;
        hw5 hw5Var4 = this.h;
        int iHashCode6 = (iHashCode5 + (hw5Var4 == null ? 0 : Long.hashCode(hw5Var4.a))) * 31;
        ne2 ne2Var = this.i;
        return iHashCode6 + (ne2Var != null ? Integer.hashCode(ne2Var.a) : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) ef2.b(this.a)) + ", cameraClosedReason=" + tt2.p(this.b) + ", cameraRetryCount=" + this.c + ", cameraRetryDurationNs=" + this.d + ", cameraException=" + this.e + ", cameraOpenDurationNs=" + this.f + ", cameraActiveDurationNs=" + this.g + ", cameraClosingDurationNs=" + this.h + ", cameraErrorCode=" + this.i + ')';
    }
}
