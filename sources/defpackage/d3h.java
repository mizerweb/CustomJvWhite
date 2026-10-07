package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d3h {
    public final Uri a;
    public final long b;
    public final float c;
    public final float d;
    public final boolean e;
    public final List f;
    public final int g;
    public final int h;
    public final i6a i;

    public d3h(Uri uri, long j, float f, float f2, boolean z, List list, int i, int i2, i6a i6aVar) {
        this.a = uri;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = list;
        this.g = i;
        this.h = i2;
        this.i = i6aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3h)) {
            return false;
        }
        d3h d3hVar = (d3h) obj;
        return cqk.d(this.a, d3hVar.a) && this.b == d3hVar.b && Float.compare(this.c, d3hVar.c) == 0 && Float.compare(this.d, d3hVar.d) == 0 && this.e == d3hVar.e && cqk.d(this.f, d3hVar.f) && this.g == d3hVar.g && this.h == d3hVar.h && cqk.d(this.i, d3hVar.i);
    }

    public final int hashCode() {
        int iC = zo5.c(this.h, zo5.c(this.g, qv1.c(nbh.n(nbh.m(nbh.m(qt4.g(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31), 31);
        i6a i6aVar = this.i;
        return iC + (i6aVar == null ? 0 : i6aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryVideoExportInput(videoUri=");
        sb.append(this.a);
        sb.append(", totalDurationMs=");
        sb.append(this.b);
        sb.append(", trimStartFraction=");
        sb.append(this.c);
        sb.append(", trimEndFraction=");
        sb.append(this.d);
        sb.append(", mute=");
        sb.append(this.e);
        sb.append(", layers=");
        sb.append(this.f);
        zo5.C(this.g, this.h, ", canvasWidth=", ", canvasHeight=", sb);
        sb.append(", mediaTransform=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
