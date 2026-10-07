package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k2b implements jwa {
    public final float a;
    public final j2b b;
    public final j2b c;

    public k2b(float f, j2b j2bVar, j2b j2bVar2) {
        this.a = f;
        this.b = j2bVar;
        this.c = j2bVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k2b)) {
            return false;
        }
        k2b k2bVar = (k2b) obj;
        return Float.compare(this.a, k2bVar.a) == 0 && Objects.equals(this.b, k2bVar.b) && Objects.equals(this.c, k2bVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        j2b j2bVar = this.b;
        int iHashCode2 = (iHashCode + (j2bVar != null ? j2bVar.hashCode() : 0)) * 31;
        j2b j2bVar2 = this.c;
        return iHashCode2 + (j2bVar2 != null ? j2bVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
