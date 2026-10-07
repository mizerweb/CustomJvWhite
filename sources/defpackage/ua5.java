package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes4.dex */
public final class ua5 extends yb7 {
    public final boolean i;
    public final long j;
    public long k;
    public long l;
    public int m;
    public dn7 n;

    public ua5(Context context, boolean z, float f) {
        super(1, context, z);
        this.i = z;
        this.j = (long) (1000000.0f / f);
        this.l = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.er0, defpackage.cn7
    public final void a() {
        super.a();
        try {
            dn7 dn7Var = this.n;
            if (dn7Var != null) {
                dn7Var.a();
            }
        } catch (GlUtil$GlException e) {
            this.e.execute(new dr0(this, e, 1));
        }
        this.l = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.m = 0;
    }

    @Override // defpackage.er0, defpackage.cn7
    public final void b(wm7 wm7Var, dn7 dn7Var, long j) {
        int i = this.m + 1;
        this.m = i;
        if (i == 1) {
            j(wm7Var, dn7Var, j);
            k(wm7Var);
            this.b.z(dn7Var);
            this.b.y();
            return;
        }
        if (i != 2) {
            long j2 = this.k;
            long j3 = this.l;
            long j4 = j2 - j3;
            long j5 = this.j;
            if (Math.abs(j4 - j5) < Math.abs((j - j3) - j5)) {
                k(wm7Var);
            }
        }
        j(wm7Var, dn7Var, j);
        this.b.z(dn7Var);
        if (this.a.e() > 0) {
            this.b.y();
        }
    }

    @Override // defpackage.er0, defpackage.cn7
    public final void flush() {
        super.flush();
        try {
            dn7 dn7Var = this.n;
            if (dn7Var != null) {
                dn7Var.a();
            }
        } catch (GlUtil$GlException e) {
            this.e.execute(new dr0(this, e, 1));
        }
        this.l = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.m = 0;
    }

    public final void j(wm7 wm7Var, dn7 dn7Var, long j) {
        try {
            dn7 dn7Var2 = this.n;
            boolean z = this.i;
            if (dn7Var2 == null) {
                int i = dn7Var.c;
                int i2 = dn7Var.d;
                this.n = wm7Var.o(tab.n(i, i2, z), dn7Var.c, i2);
            }
            dn7 dn7VarO = this.n;
            dn7VarO.getClass();
            int i3 = dn7VarO.d;
            int i4 = dn7Var.d;
            int i5 = dn7Var.c;
            if (i3 != i4 || dn7VarO.c != i5) {
                dn7VarO.a();
                dn7VarO = wm7Var.o(tab.n(i5, i4, z), i5, i4);
            }
            tab.r(dn7VarO.b, dn7VarO.c, dn7VarO.d);
            tab.g();
            h(dn7Var.a, j);
            this.k = j;
            this.n = dn7VarO;
        } catch (VideoFrameProcessingException e) {
            e = e;
            this.e.execute(new dr0(this, e, 1));
        } catch (GlUtil$GlException e2) {
            e = e2;
            this.e.execute(new dr0(this, e, 1));
        }
    }

    public final void k(wm7 wm7Var) {
        p11 p11Var = this.a;
        try {
            dn7 dn7Var = this.n;
            dn7Var.getClass();
            lag lagVar = new lag(dn7Var.c, dn7Var.d);
            p11Var.d(wm7Var, lagVar.a, lagVar.b);
            dn7 dn7VarF = p11Var.f();
            tab.r(dn7VarF.b, dn7VarF.c, dn7VarF.d);
            tab.g();
            h(dn7Var.a, this.k);
            this.c.o(dn7VarF, this.k);
            this.l = this.k;
        } catch (VideoFrameProcessingException | GlUtil$GlException e) {
            this.e.execute(new dr0(this, e, 1));
        }
    }

    @Override // defpackage.yb7, defpackage.cn7
    public final void release() throws VideoFrameProcessingException {
        super.release();
        try {
            dn7 dn7Var = this.n;
            if (dn7Var != null) {
                dn7Var.a();
            }
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
