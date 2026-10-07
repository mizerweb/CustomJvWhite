package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hbd implements vxe {
    public final vxe a;
    public final long b = uxl.a();
    public final /* synthetic */ obd c;

    public hbd(obd obdVar, vxe vxeVar) {
        this.c = obdVar;
        this.a = vxeVar;
    }

    @Override // defpackage.vxe
    public final void B(int i, String str) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            this.a.B(i, str);
        } else {
            n1g.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.vxe
    public final String B0(int i) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            return this.a.B0(i);
        }
        n1g.a0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.vxe
    public final boolean M0() {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            return this.a.M0();
        }
        n1g.a0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.vxe
    public final void a(int i, double d) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            this.a.a(i, d);
        } else {
            n1g.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.vxe
    public final void c(int i, long j) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            this.a.c(i, j);
        } else {
            n1g.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            this.a.close();
        } else {
            n1g.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.vxe
    public final void d(int i, byte[] bArr) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            this.a.d(i, bArr);
        } else {
            n1g.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.vxe
    public final void e(int i) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            this.a.e(i);
        } else {
            n1g.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.vxe
    public final byte[] getBlob(int i) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            return this.a.getBlob(i);
        }
        n1g.a0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.vxe
    public final int getColumnCount() {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            return this.a.getColumnCount();
        }
        n1g.a0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.vxe
    public final String getColumnName(int i) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            return this.a.getColumnName(i);
        }
        n1g.a0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.vxe
    public final double getDouble(int i) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            return this.a.getDouble(i);
        }
        n1g.a0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.vxe
    public final long getLong(int i) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            return this.a.getLong(i);
        }
        n1g.a0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.vxe
    public final boolean isNull(int i) {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            return this.a.isNull(i);
        }
        n1g.a0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.vxe
    public final void reset() {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            this.a.reset();
        } else {
            n1g.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.vxe
    public final void u() {
        if (this.c.e) {
            n1g.a0(21, "Statement is recycled");
            throw null;
        }
        if (this.b == uxl.a()) {
            this.a.u();
        } else {
            n1g.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
