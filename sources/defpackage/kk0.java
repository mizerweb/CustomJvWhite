package defpackage;

import android.graphics.Rect;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class kk0 extends mk0 {
    public final Rect b;
    public final Uri c;
    public final long d;
    public final boolean e;
    public final ux4 f;

    public kk0(Rect rect, Uri uri, long j, boolean z, ux4 ux4Var) {
        super(0);
        this.b = rect;
        this.c = uri;
        this.d = j;
        this.e = z;
        this.f = ux4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kk0) {
            kk0 kk0Var = (kk0) obj;
            if (this.b.equals(kk0Var.b) && cqk.d(this.c, kk0Var.c) && this.d == kk0Var.d && this.e == kk0Var.e && this.f.equals(kk0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + nbh.n(qt4.g((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "OnCropSuccess(croppedBounds=" + this.b + ", imagePath=" + this.c + ", size=" + qx6.b(this.d) + ", imageOrientationChanged=" + this.e + ", cropResult=" + this.f + ")";
    }
}
