package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tri {
    public final sri a;
    public final qri b;
    public final qri c;
    public final List d;
    public final List e;
    public final Integer f;

    public tri(sri sriVar, qri qriVar, qri qriVar2, List list, ArrayList arrayList, Integer num) {
        this.a = sriVar;
        this.b = qriVar;
        this.c = qriVar2;
        this.d = list;
        this.e = arrayList;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tri)) {
            return false;
        }
        tri triVar = (tri) obj;
        return cqk.d(this.a, triVar.a) && cqk.d(this.b, triVar.b) && cqk.d(this.c, triVar.c) && cqk.d(this.d, triVar.d) && cqk.d(this.e, triVar.e) && cqk.d(this.f, triVar.f);
    }

    public final int hashCode() {
        sri sriVar = this.a;
        int iHashCode = (sriVar == null ? 0 : sriVar.hashCode()) * 31;
        qri qriVar = this.b;
        int iHashCode2 = (iHashCode + (qriVar == null ? 0 : qriVar.hashCode())) * 31;
        qri qriVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (qriVar2 == null ? 0 : qriVar2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "VectorBackgroundModel(pattern=" + this.a + ", gradient=" + this.b + ", patternGradient=" + this.c + ", gradientEllipse=" + this.d + ", patternGradientEllipse=" + this.e + ", fillColor=" + this.f + ")";
    }
}
