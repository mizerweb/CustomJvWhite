package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ye4 implements vxe {
    public final vxe a;

    public ye4(vxe vxeVar) {
        this.a = vxeVar;
    }

    @Override // defpackage.vxe
    public final void B(int i, String str) {
        this.a.B(i, str);
    }

    @Override // defpackage.vxe
    public final String B0(int i) {
        return this.a.B0(i);
    }

    @Override // defpackage.vxe
    public final boolean M0() {
        return this.a.M0();
    }

    @Override // defpackage.vxe
    public final void a(int i, double d) {
        this.a.a(i, d);
    }

    @Override // defpackage.vxe
    public final void c(int i, long j) {
        this.a.c(i, j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        vxe vxeVar = this.a;
        vxeVar.reset();
        vxeVar.u();
    }

    @Override // defpackage.vxe
    public final void d(int i, byte[] bArr) {
        this.a.d(i, bArr);
    }

    @Override // defpackage.vxe
    public final void e(int i) {
        this.a.e(i);
    }

    @Override // defpackage.vxe
    public final byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    @Override // defpackage.vxe
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // defpackage.vxe
    public final String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // defpackage.vxe
    public final double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // defpackage.vxe
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // defpackage.vxe
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // defpackage.vxe
    public final void reset() {
        this.a.reset();
    }

    @Override // defpackage.vxe
    public final boolean s0() {
        return this.a.s0();
    }

    @Override // defpackage.vxe
    public final void u() {
        this.a.u();
    }
}
