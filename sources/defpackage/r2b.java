package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r2b implements jwa {
    public final float a;
    public final float b;

    public r2b(float f, float f2) {
        lvb.O("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r2b.class == obj.getClass()) {
            r2b r2bVar = (r2b) obj;
            if (this.a == r2bVar.a && this.b == r2bVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
