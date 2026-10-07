package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qmk extends j5d {
    private final float a;
    private final float b;
    private final float c;

    public qmk(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.j5d
    public final float b() {
        return this.a;
    }

    @Override // defpackage.j5d
    public final float c() {
        return this.b;
    }

    @Override // defpackage.j5d
    public final float d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j5d) {
            j5d j5dVar = (j5d) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(j5dVar.b()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(j5dVar.c()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(j5dVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) ^ ((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sbN = bc1.n("PointF3D{x=", f, ", y=", f2, ", z=");
        sbN.append(f3);
        sbN.append("}");
        return sbN.toString();
    }
}
