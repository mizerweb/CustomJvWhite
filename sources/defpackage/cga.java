package defpackage;

import java.util.EnumSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cga {
    public static final EnumSet g = EnumSet.of(bga.c, bga.d, bga.e, bga.f, bga.g, bga.i, bga.j, bga.h, bga.l);
    public final long a;
    public final String b;
    public final bga c;
    public final int d;
    public final int e;
    public final Map f;

    public cga(long j, String str, bga bgaVar, int i, int i2, Map map) {
        this.a = j;
        this.b = str;
        this.c = bgaVar;
        this.d = i;
        this.e = i2;
        this.f = map;
    }

    public static cga a(cga cgaVar, int i, int i2, int i3) {
        long j = cgaVar.a;
        String str = cgaVar.b;
        bga bgaVar = cgaVar.c;
        if ((i3 & 8) != 0) {
            i = cgaVar.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = cgaVar.e;
        }
        Map map = cgaVar.f;
        cgaVar.getClass();
        return new cga(j, str, bgaVar, i4, i2, map);
    }

    public final cga b() {
        if (this.e <= 0 || this.d < 0) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cga)) {
            return false;
        }
        cga cgaVar = (cga) obj;
        return this.a == cgaVar.a && cqk.d(this.b, cgaVar.b) && this.c == cgaVar.c && this.d == cgaVar.d && this.e == cgaVar.e && cqk.d(this.f, cgaVar.f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iC = zo5.c(this.e, zo5.c(this.d, (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        Map map = this.f;
        return iC + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "MessageElementData(entityId=", ", entityName=", this.b);
        sbT.append(", type=");
        sbT.append(this.c);
        sbT.append(", from=");
        sbT.append(this.d);
        sbT.append(", length=");
        sbT.append(this.e);
        sbT.append(", attributes=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
