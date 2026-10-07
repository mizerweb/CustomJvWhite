package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jch {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final int c;

    public jch(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jch)) {
            return false;
        }
        jch jchVar = (jch) obj;
        return this.a.equals(jchVar.a) && this.b.equals(jchVar.b) && this.c == jchVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.a);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.b);
        sb.append(", maxSupportedFrameRate=");
        return qt4.p(sb, this.c, ')');
    }
}
