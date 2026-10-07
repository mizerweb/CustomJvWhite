package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class hg2 {
    public final Context a;
    public final jg2 b;
    public final kzi c;
    public final vn7 d;
    public final gg2 e;
    public final ig2 f;

    public hg2(Context context, jg2 jg2Var, gg2 gg2Var) {
        kzi kziVar = new kzi(9);
        vn7 vn7Var = new vn7(8);
        ig2 ig2Var = new ig2();
        this.a = context;
        this.b = jg2Var;
        this.c = kziVar;
        this.d = vn7Var;
        this.e = gg2Var;
        this.f = ig2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg2)) {
            return false;
        }
        hg2 hg2Var = (hg2) obj;
        return cqk.d(this.a, hg2Var.a) && cqk.d(this.b, hg2Var.b) && cqk.d(this.c, hg2Var.c) && cqk.d(this.d, hg2Var.d) && cqk.d(this.e, hg2Var.e) && cqk.d(this.f, hg2Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 961;
        this.f.getClass();
        return (Boolean.hashCode(false) + iHashCode) * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.a + ", threadConfig=" + this.b + ", cameraMetadataConfig=" + this.c + ", cameraBackendConfig=" + this.d + ", cameraInteropConfig=" + this.e + ", imageSources=null, flags=" + this.f + ", platformApiCompat=null)";
    }
}
