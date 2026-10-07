package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nph {
    public final mph a;
    public final kph b;
    public final kph c;
    public final List d;
    public final List e;
    public final Integer f;

    public nph(mph mphVar, kph kphVar, kph kphVar2, List list, List list2, Integer num) {
        this.a = mphVar;
        this.b = kphVar;
        this.c = kphVar2;
        this.d = list;
        this.e = list2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nph)) {
            return false;
        }
        nph nphVar = (nph) obj;
        return cqk.d(this.a, nphVar.a) && cqk.d(this.b, nphVar.b) && cqk.d(this.c, nphVar.c) && cqk.d(this.d, nphVar.d) && cqk.d(this.e, nphVar.e) && cqk.d(this.f, nphVar.f);
    }

    public final int hashCode() {
        mph mphVar = this.a;
        int iHashCode = (mphVar == null ? 0 : mphVar.hashCode()) * 31;
        kph kphVar = this.b;
        int iHashCode2 = (iHashCode + (kphVar == null ? 0 : kphVar.hashCode())) * 31;
        kph kphVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (kphVar2 == null ? 0 : kphVar2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ThemeBackgroundDrawModel(pattern=" + this.a + ", gradient=" + this.b + ", patternGradient=" + this.c + ", gradientEllipse=" + this.d + ", patternGradientEllipse=" + this.e + ", fillColor=" + this.f + ")";
    }
}
