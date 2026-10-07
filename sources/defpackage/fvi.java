package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fvi {
    public final y0e a;
    public final float b;
    public final float c;
    public final List d;
    public final boolean e;

    public fvi(a70 a70Var) {
        this.a = a70Var.a;
        this.b = a70Var.b;
        this.c = a70Var.c;
        this.d = (List) a70Var.d;
        this.e = a70Var.e;
    }

    public final a70 a() {
        a70 a70Var = new a70(1);
        a70Var.a = this.a;
        a70Var.b = this.b;
        a70Var.c = this.c;
        a70Var.d = this.d;
        a70Var.e = this.e;
        return a70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fvi.class == obj.getClass()) {
            fvi fviVar = (fvi) obj;
            if (Float.compare(fviVar.b, this.b) == 0 && Float.compare(fviVar.c, this.c) == 0 && Objects.equals(fviVar.d, this.d) && this.e == fviVar.e && this.a == fviVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        y0e y0eVar = this.a;
        int iHashCode = (y0eVar != null ? y0eVar.hashCode() : 0) * 31;
        float f = this.b;
        int iFloatToIntBits = (iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.c;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        List list = this.d;
        return ((iFloatToIntBits2 + (list != null ? list.hashCode() : 0)) * 31) + (this.e ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConvertOptions{quality=");
        sb.append(this.a);
        sb.append(", startTrimPosition=");
        sb.append(this.b);
        sb.append(", endTrimPosition=");
        sb.append(this.c);
        sb.append(", fragmentsPaths=");
        sb.append(this.d);
        sb.append(", mute=");
        return c0a.p(sb, this.e, '}');
    }
}
