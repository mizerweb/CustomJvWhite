package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ej0 {
    public final Size a;
    public final LinkedHashMap b;
    public final Size c;
    public final LinkedHashMap d;
    public final Size e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public ej0(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        if (size == null) {
            ore.n("Null analysisSize");
            throw null;
        }
        this.a = size;
        this.b = linkedHashMap;
        if (size2 == null) {
            ore.n("Null previewSize");
            throw null;
        }
        this.c = size2;
        this.d = linkedHashMap2;
        this.e = size3;
        this.f = linkedHashMap3;
        this.g = linkedHashMap4;
        this.h = linkedHashMap5;
        this.i = linkedHashMap6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ej0)) {
            return false;
        }
        ej0 ej0Var = (ej0) obj;
        return this.a.equals(ej0Var.a) && this.b.equals(ej0Var.b) && this.c.equals(ej0Var.c) && this.d.equals(ej0Var.d) && this.e.equals(ej0Var.e) && this.f.equals(ej0Var.f) && this.g.equals(ej0Var.g) && this.h.equals(ej0Var.h) && this.i.equals(ej0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}
