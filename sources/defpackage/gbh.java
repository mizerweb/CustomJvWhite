package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class gbh extends jbh {
    public final /* synthetic */ int d = 1;
    public final AutoCloseable e;

    public gbh(id7 id7Var, String str) {
        super(id7Var, str);
        this.e = id7Var.A(str);
    }

    @Override // defpackage.vxe
    public final void B(int i, String str) {
        int i2 = this.d;
        AutoCloseable autoCloseable = this.e;
        switch (i2) {
            case 0:
                ((hbh) autoCloseable).B(i, str);
                break;
            default:
                l();
                ((od7) autoCloseable).g0(i, str);
                break;
        }
    }

    @Override // defpackage.vxe
    public final String B0(int i) {
        switch (this.d) {
            case 0:
                return ((hbh) this.e).B0(i);
            default:
                l();
                n1g.a0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.vxe
    public final boolean M0() {
        int i = this.d;
        AutoCloseable autoCloseable = this.e;
        switch (i) {
            case 0:
                hbh hbhVar = (hbh) autoCloseable;
                boolean zM0 = hbhVar.M0();
                boolean zEqualsIgnoreCase = hbhVar.B0(0).equalsIgnoreCase("wal");
                id7 id7Var = this.a;
                if (zEqualsIgnoreCase) {
                    id7Var.a.enableWriteAheadLogging();
                } else {
                    id7Var.a.disableWriteAheadLogging();
                }
                return zM0;
            default:
                l();
                ((od7) autoCloseable).c.execute();
                return false;
        }
    }

    @Override // defpackage.vxe
    public final void a(int i, double d) {
        int i2 = this.d;
        AutoCloseable autoCloseable = this.e;
        switch (i2) {
            case 0:
                ((hbh) autoCloseable).a(i, d);
                break;
            default:
                l();
                ((od7) autoCloseable).a(i, d);
                break;
        }
    }

    @Override // defpackage.vxe
    public final void c(int i, long j) {
        int i2 = this.d;
        AutoCloseable autoCloseable = this.e;
        switch (i2) {
            case 0:
                ((hbh) autoCloseable).c(i, j);
                break;
            default:
                l();
                ((od7) autoCloseable).c(i, j);
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.d;
        AutoCloseable autoCloseable = this.e;
        switch (i) {
            case 0:
                ((hbh) autoCloseable).close();
                break;
            default:
                ((od7) autoCloseable).close();
                this.c = true;
                break;
        }
    }

    @Override // defpackage.vxe
    public final void d(int i, byte[] bArr) {
        int i2 = this.d;
        AutoCloseable autoCloseable = this.e;
        switch (i2) {
            case 0:
                ((hbh) autoCloseable).d(i, bArr);
                break;
            default:
                l();
                ((od7) autoCloseable).d(i, bArr);
                break;
        }
    }

    @Override // defpackage.vxe
    public final void e(int i) {
        int i2 = this.d;
        AutoCloseable autoCloseable = this.e;
        switch (i2) {
            case 0:
                ((hbh) autoCloseable).e(i);
                break;
            default:
                l();
                ((od7) autoCloseable).e(i);
                break;
        }
    }

    @Override // defpackage.vxe
    public final byte[] getBlob(int i) {
        switch (this.d) {
            case 0:
                return ((hbh) this.e).getBlob(i);
            default:
                l();
                n1g.a0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.vxe
    public final int getColumnCount() {
        switch (this.d) {
            case 0:
                return ((hbh) this.e).getColumnCount();
            default:
                l();
                return 0;
        }
    }

    @Override // defpackage.vxe
    public final String getColumnName(int i) {
        switch (this.d) {
            case 0:
                return ((hbh) this.e).getColumnName(i);
            default:
                l();
                n1g.a0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.vxe
    public final double getDouble(int i) {
        switch (this.d) {
            case 0:
                return ((hbh) this.e).getDouble(i);
            default:
                l();
                n1g.a0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.vxe
    public final long getLong(int i) {
        switch (this.d) {
            case 0:
                return ((hbh) this.e).getLong(i);
            default:
                l();
                n1g.a0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.vxe
    public final boolean isNull(int i) {
        switch (this.d) {
            case 0:
                return ((hbh) this.e).isNull(i);
            default:
                l();
                n1g.a0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.jbh, defpackage.vxe
    public void reset() {
        switch (this.d) {
            case 0:
                ((hbh) this.e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // defpackage.vxe
    public boolean s0() {
        switch (this.d) {
            case 0:
                return ((hbh) this.e).s0();
            default:
                return super.s0();
        }
    }

    @Override // defpackage.jbh, defpackage.vxe
    public final void u() {
        int i = this.d;
        AutoCloseable autoCloseable = this.e;
        switch (i) {
            case 0:
                ((hbh) autoCloseable).u();
                break;
            default:
                l();
                ((od7) autoCloseable).u();
                break;
        }
    }

    public gbh(id7 id7Var, String str, hbh hbhVar) {
        super(id7Var, str);
        this.e = hbhVar;
    }
}
