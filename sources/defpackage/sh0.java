package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class sh0 implements m68 {
    public final ghh a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public sh0(ghh ghhVar, long j, int i, Matrix matrix, int i2) {
        if (ghhVar == null) {
            ore.n("Null tagBundle");
            throw null;
        }
        this.a = ghhVar;
        this.b = j;
        this.c = i;
        if (matrix == null) {
            ore.n("Null sensorToBufferTransformMatrix");
            throw null;
        }
        this.d = matrix;
        this.e = i2;
    }

    @Override // defpackage.m68
    public final void a(ke6 ke6Var) {
        ke6Var.d(this.c);
    }

    @Override // defpackage.m68
    public final int b() {
        return this.c;
    }

    @Override // defpackage.m68
    public final int c() {
        return this.e;
    }

    @Override // defpackage.m68
    public final ghh d() {
        return this.a;
    }

    @Override // defpackage.m68
    public final Matrix e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sh0) {
            sh0 sh0Var = (sh0) obj;
            if (this.a.equals(sh0Var.a) && this.b == sh0Var.b && this.c == sh0Var.c && this.d.equals(sh0Var.d) && this.e == sh0Var.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m68
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.e ^ ((((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        sb.append(this.c);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.d);
        sb.append(", flashState=");
        return zo5.t(sb, this.e, "}");
    }
}
