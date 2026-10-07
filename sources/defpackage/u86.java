package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u86 {
    public final String a;
    public final Object b;
    public final int c;
    public final bwi d;

    public u86(String str, Object obj, int i, bwi bwiVar) {
        this.a = str;
        this.b = obj;
        this.c = i;
        this.d = bwiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u86)) {
            return false;
        }
        u86 u86Var = (u86) obj;
        return this.a.equals(u86Var.a) && cqk.d(this.b, u86Var.b) && this.c == u86Var.c && cqk.d(this.d, u86Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.c(0, zo5.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "CacheKey(cameraId=" + this.a + ", cameraConfig=" + this.b + ", videoRecordingType=" + this.c + ", videoCapabilitiesSource=0, videoEncoderInfoFinder=" + this.d + ')';
    }
}
