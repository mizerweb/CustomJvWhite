package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yld extends cmd {
    public final tnh b;
    public final ynh c;
    public final Integer d;
    public final List e;
    public final y3f f;

    public yld(tnh tnhVar, ynh ynhVar, Integer num, List list, y3f y3fVar) {
        this.b = tnhVar;
        this.c = ynhVar;
        this.d = num;
        this.e = list;
        this.f = y3fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yld)) {
            return false;
        }
        yld yldVar = (yld) obj;
        return cqk.d(this.b, yldVar.b) && cqk.d(this.c, yldVar.c) && cqk.d(this.d, yldVar.d) && cqk.d(this.e, yldVar.e) && this.f == yldVar.f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.b.c) * 31;
        ynh ynhVar = this.c;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        Integer num = this.d;
        int iC = qv1.c((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        y3f y3fVar = this.f;
        return iC + (y3fVar != null ? y3fVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowConfirmation(title=" + this.b + ", description=" + this.c + ", icon=" + this.d + ", buttons=" + this.e + ", screen=" + this.f + ")";
    }

    public /* synthetic */ yld(tnh tnhVar, tnh tnhVar2, List list) {
        this(tnhVar, tnhVar2, null, list, null);
    }
}
