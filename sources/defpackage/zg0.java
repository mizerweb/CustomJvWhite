package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zg0 {
    public zc2 b;
    public i88 c;
    public i88 d;
    public final Size f;
    public final int g;
    public final ArrayList h;
    public final boolean i;
    public final ux5 j;
    public final ux5 k;
    public zc2 a = new ol2();
    public final i88 e = null;

    public zg0(Size size, int i, ArrayList arrayList, boolean z, ux5 ux5Var, ux5 ux5Var2) {
        if (size == null) {
            ore.n("Null size");
            throw null;
        }
        this.f = size;
        this.g = i;
        this.h = arrayList;
        this.i = z;
        this.j = ux5Var;
        this.k = ux5Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zg0) {
            zg0 zg0Var = (zg0) obj;
            return this.f.equals(zg0Var.f) && this.g == zg0Var.g && this.h.equals(zg0Var.h) && this.i == zg0Var.i && this.j == zg0Var.j && this.k == zg0Var.k;
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() ^ ((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 583896283) ^ this.j.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
