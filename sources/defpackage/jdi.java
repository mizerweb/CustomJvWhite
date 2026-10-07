package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jdi extends kdi {
    @Override // defpackage.kdi
    public final boolean c(long j, Object obj) {
        return this.a.getBoolean(obj, j);
    }

    @Override // defpackage.kdi
    public final byte d(long j, Object obj) {
        return this.a.getByte(obj, j);
    }

    @Override // defpackage.kdi
    public final double e(long j, Object obj) {
        return this.a.getDouble(obj, j);
    }

    @Override // defpackage.kdi
    public final float f(long j, Object obj) {
        return this.a.getFloat(obj, j);
    }

    @Override // defpackage.kdi
    public final void k(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // defpackage.kdi
    public final void l(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // defpackage.kdi
    public final void m(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // defpackage.kdi
    public final void n(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }
}
