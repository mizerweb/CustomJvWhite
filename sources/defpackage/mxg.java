package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mxg {
    public final swg a;
    public final lxg b;
    public final ixg c;
    public final List d;
    public final List e;
    public final xwg f;

    public mxg(swg swgVar, lxg lxgVar, ixg ixgVar, List list, List list2, xwg xwgVar) {
        this.a = swgVar;
        this.b = lxgVar;
        this.c = ixgVar;
        this.d = list;
        this.e = list2;
        this.f = xwgVar;
    }

    public final swg a() {
        return this.a;
    }

    public final List b() {
        return this.e;
    }

    public final xwg c() {
        return this.f;
    }

    public final ixg d() {
        return this.c;
    }

    public final List e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxg)) {
            return false;
        }
        mxg mxgVar = (mxg) obj;
        return this.a.equals(mxgVar.a) && cqk.d(this.b, mxgVar.b) && cqk.d(this.c, mxgVar.c) && this.d.equals(mxgVar.d) && this.e.equals(mxgVar.e) && cqk.d(this.f, mxgVar.f);
    }

    public final lxg f() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lxg lxgVar = this.b;
        int iHashCode2 = (iHashCode + (lxgVar == null ? 0 : lxgVar.hashCode())) * 31;
        ixg ixgVar = this.c;
        int iC = qv1.c(qv1.c((iHashCode2 + (ixgVar == null ? 0 : ixgVar.hashCode())) * 31, 31, this.d), 31, this.e);
        xwg xwgVar = this.f;
        return iC + (xwgVar != null ? xwgVar.hashCode() : 0);
    }

    public final String toString() {
        return "StoryDraftWithRelations(draft=" + this.a + ", videoAttrs=" + this.b + ", textAttrs=" + this.c + ", textLayers=" + this.d + ", drawingLayers=" + this.e + ", mediaTransform=" + this.f + ")";
    }
}
