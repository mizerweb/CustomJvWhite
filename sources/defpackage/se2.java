package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class se2 {
    public final String a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final ai2 e;
    public final int f;
    public final Map g;
    public final int h;
    public final int i;
    public final Map j;
    public final List k;
    public final List l;
    public final Map m;
    public final hxa n;
    public final ue2 o;

    public se2(String str, List list, List list2, ArrayList arrayList, ai2 ai2Var, int i, LinkedHashMap linkedHashMap, int i2, ul9 ul9Var, List list3, List list4, ue2 ue2Var) {
        hxa hxaVar = new hxa();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = arrayList;
        this.e = ai2Var;
        this.f = i;
        this.g = linkedHashMap;
        this.h = i2;
        this.i = 1;
        this.j = ul9Var;
        this.k = list3;
        this.l = list4;
        this.m = s66.a;
        this.n = hxaVar;
        this.o = ue2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se2)) {
            return false;
        }
        se2 se2Var = (se2) obj;
        return cqk.d(this.a, se2Var.a) && cqk.d(this.b, se2Var.b) && cqk.d(this.c, se2Var.c) && cqk.d(this.d, se2Var.d) && cqk.d(this.e, se2Var.e) && this.f == se2Var.f && cqk.d(this.g, se2Var.g) && this.h == se2Var.h && this.i == se2Var.i && cqk.d(this.j, se2Var.j) && cqk.d(this.k, se2Var.k) && cqk.d(this.l, se2Var.l) && cqk.d(this.m, se2Var.m) && cqk.d(this.n, se2Var.n) && cqk.d(this.o, se2Var.o);
    }

    public final int hashCode() {
        int iC = qv1.c(qv1.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ArrayList arrayList = this.d;
        int iHashCode = (iC + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ai2 ai2Var = this.e;
        return (this.o.hashCode() + ((this.n.hashCode() + v0h.c(this.m, qv1.c(qv1.c(v0h.c(this.j, zo5.c(this.i, zo5.c(this.h, v0h.c(this.g, zo5.c(this.f, (iHashCode + (ai2Var != null ? ai2Var.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31, this.k), 31, this.l), 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) ef2.b(this.a)) + ", streams=" + this.b + ", exclusiveStreamGroups=" + this.c + ", input=" + this.d + ", postviewStream=" + this.e + ", sessionTemplate=" + ((Object) pme.b(this.f)) + ", sessionParameters=" + this.g + ", sessionMode=" + ((Object) bjl.b(this.h)) + ", defaultTemplate=" + ((Object) pme.b(this.i)) + ", defaultParameters=" + this.j + ", defaultListeners=" + this.k + ", graphStateListeners=" + this.l + ", requiredParameters=" + this.m + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=null, metadataTransform=" + this.n + ", flags=" + this.o + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
