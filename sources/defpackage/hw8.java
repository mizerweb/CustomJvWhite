package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hw8 {
    public float a;
    public float b;
    public float c;
    public float d;

    public hw8(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw8)) {
            return false;
        }
        hw8 hw8Var = (hw8) obj;
        return Float.compare(this.a, hw8Var.a) == 0 && Float.compare(this.b, hw8Var.b) == 0 && Float.compare(this.c, hw8Var.c) == 0 && Float.compare(this.d, hw8Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbN = bc1.n("KeyFrame(t=", f, ", alpha=", f2, ", trimStart=");
        sbN.append(f3);
        sbN.append(", trimEnd=");
        sbN.append(f4);
        sbN.append(")");
        return sbN.toString();
    }
}
