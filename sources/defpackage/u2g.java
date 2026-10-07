package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes4.dex */
public final class u2g {
    public final LatLng a;
    public final float b;
    public final Bitmap c;

    public u2g(LatLng latLng, float f, Bitmap bitmap) {
        this.a = latLng;
        this.b = f;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2g)) {
            return false;
        }
        u2g u2gVar = (u2g) obj;
        return this.a.equals(u2gVar.a) && Float.compare(this.b, u2gVar.b) == 0 && cqk.d(this.c, u2gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.m(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "MarkerModel(latLng=" + this.a + ", zoom=" + this.b + ", icon=" + this.c + ")";
    }
}
