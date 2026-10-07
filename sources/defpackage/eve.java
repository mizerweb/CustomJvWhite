package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class eve {
    public int a = 2;
    public boolean b = false;
    public float[] c = null;
    public final int d = 0;
    public final float e = 0.0f;
    public final int f = 0;
    public float g = 0.0f;

    public static eve a() {
        eve eveVar = new eve();
        eveVar.b = true;
        return eveVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eve.class != obj.getClass()) {
            return false;
        }
        eve eveVar = (eve) obj;
        if (this.b == eveVar.b && this.d == eveVar.d && Float.compare(eveVar.e, this.e) == 0 && this.f == eveVar.f && Float.compare(eveVar.g, this.g) == 0 && this.a == eveVar.a) {
            return Arrays.equals(this.c, eveVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int iD = (((i != 0 ? qt4.D(i) : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int iHashCode = (((iD + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f = this.e;
        int iFloatToIntBits = (((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f) * 31;
        float f2 = this.g;
        return (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 961;
    }
}
