package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xbg implements jwa {
    public final float a;
    public final int b;

    public xbg(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xbg.class == obj.getClass()) {
            xbg xbgVar = (xbg) obj;
            if (this.a == xbgVar.a && this.b == xbgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
