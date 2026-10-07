package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pg0 {
    public final tbh a;
    public final int b;
    public final Size c;
    public final fx5 d;
    public final List e;
    public final t94 f;
    public final int g;
    public final Range h;
    public final boolean i;
    public final int j;

    public pg0(tbh tbhVar, int i, Size size, fx5 fx5Var, List list, t94 t94Var, int i2, Range range, boolean z, int i3) {
        this.a = tbhVar;
        this.b = i;
        if (size == null) {
            ore.n("Null size");
            throw null;
        }
        this.c = size;
        if (fx5Var == null) {
            ore.n("Null dynamicRange");
            throw null;
        }
        this.d = fx5Var;
        if (list == null) {
            ore.n("Null captureTypes");
            throw null;
        }
        this.e = list;
        this.f = t94Var;
        this.g = i2;
        if (range == null) {
            ore.n("Null targetFrameRate");
            throw null;
        }
        this.h = range;
        this.i = z;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pg0)) {
            return false;
        }
        pg0 pg0Var = (pg0) obj;
        if (!this.a.equals(pg0Var.a) || this.b != pg0Var.b || !this.c.equals(pg0Var.c) || !this.d.equals(pg0Var.d) || !this.e.equals(pg0Var.e)) {
            return false;
        }
        t94 t94Var = pg0Var.f;
        t94 t94Var2 = this.f;
        if (t94Var2 == null) {
            if (t94Var != null) {
                return false;
            }
        } else if (!t94Var2.equals(t94Var)) {
            return false;
        }
        return this.g == pg0Var.g && this.h.equals(pg0Var.h) && this.i == pg0Var.i && this.j == pg0Var.j;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        t94 t94Var = this.f;
        return this.j ^ ((((((((iHashCode ^ (t94Var == null ? 0 : t94Var.hashCode())) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.i);
        sb.append(", customMaxFrameRate=");
        return zo5.t(sb, this.j, "}");
    }
}
