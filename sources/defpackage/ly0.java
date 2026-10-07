package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class ly0 extends u7e {
    public final LinkedBlockingQueue e;
    public final wm7 f;
    public final boolean g;
    public md5 h;
    public dn7 i;
    public int j;
    public boolean k;
    public boolean l;

    public ly0(wm7 wm7Var, o02 o02Var, boolean z) {
        super(o02Var);
        this.f = wm7Var;
        this.e = new LinkedBlockingQueue();
        this.g = z;
    }

    public final void D() {
        Gainmap gainmap;
        if (this.e.isEmpty() || this.j == 0) {
            return;
        }
        ky0 ky0Var = (ky0) this.e.element();
        oc7 oc7Var = ky0Var.b;
        lf4 lf4Var = ky0Var.c;
        lvb.b0(lf4Var.b());
        long j = ky0Var.b.b;
        lvb.b0(lf4Var.b());
        int i = lf4Var.e;
        lf4Var.e = i + 1;
        long jRound = Math.round(lf4Var.b * ((double) i));
        lvb.b0(jRound >= 0);
        long j2 = jRound + j;
        if (!this.l) {
            this.l = true;
            Bitmap bitmap = ky0Var.a;
            try {
                dn7 dn7Var = this.i;
                if (dn7Var != null) {
                    dn7Var.a();
                }
                int iS = tab.s();
                tab.y(bitmap, iS);
                b87 b87Var = oc7Var.a;
                this.i = new dn7(iS, -1, b87Var.u, b87Var.v);
                if (Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
                    md5 md5Var = this.h;
                    md5Var.getClass();
                    Gainmap gainmap2 = bitmap.getGainmap();
                    gainmap2.getClass();
                    Gainmap gainmapF = rh.f(gainmap2);
                    if (md5Var.k && ((gainmap = md5Var.s) == null || !rzl.c(gainmap, gainmapF))) {
                        md5Var.v = false;
                        md5Var.s = gainmapF;
                        int i2 = md5Var.t;
                        if (i2 == -1) {
                            Bitmap gainmapContents = gainmapF.getGainmapContents();
                            int iS2 = tab.s();
                            tab.y(gainmapContents, iS2);
                            md5Var.t = iS2;
                        } else {
                            tab.y(gainmapF.getGainmapContents(), i2);
                        }
                    }
                }
                if (this.g) {
                    md5 md5Var2 = this.h;
                    md5Var2.getClass();
                    lvb.b0(md5Var2.a.b == 1);
                    md5Var2.u = true;
                    md5Var2.v = false;
                }
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(-9223372036854775807L, e);
            }
        }
        this.j--;
        md5 md5Var3 = this.h;
        md5Var3.getClass();
        wm7 wm7Var = this.f;
        dn7 dn7Var2 = this.i;
        dn7Var2.getClass();
        md5Var3.b(wm7Var, dn7Var2, j2);
        b87 b87Var2 = oc7Var.a;
        int i3 = b87Var2.u;
        int i4 = b87Var2.v;
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
        }
        if (ky0Var.c.b()) {
            return;
        }
        this.l = false;
        ((ky0) this.e.remove()).a.recycle();
        if (this.e.isEmpty() && this.k) {
            md5 md5Var4 = this.h;
            md5Var4.getClass();
            md5Var4.a();
            g55.a();
            this.k = false;
        }
    }

    @Override // defpackage.u7e
    public final void b() throws VideoFrameProcessingException {
        this.e.clear();
        this.l = false;
        this.k = false;
        this.j = 0;
        dn7 dn7Var = this.i;
        if (dn7Var != null) {
            try {
                dn7Var.a();
                this.i = null;
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(-9223372036854775807L, e);
            }
        }
        super.b();
    }

    @Override // defpackage.u7e
    public final int f() {
        return 0;
    }

    @Override // defpackage.u7e
    public final void i(final Bitmap bitmap, final oc7 oc7Var, final lf4 lf4Var) {
        ((o02) this.a).q(new pwi() { // from class: jy0
            @Override // defpackage.pwi
            public final void run() {
                lf4 lf4Var2 = lf4Var;
                lvb.O("Bitmap queued but no timestamps provided.", lf4Var2.b());
                ly0 ly0Var = this.a;
                ly0Var.e.add(new ky0(bitmap, oc7Var, lf4Var2));
                ly0Var.D();
                ly0Var.k = false;
            }
        }, true);
    }

    @Override // defpackage.u7e
    public final void m() {
        ((o02) this.a).q(new iy0(this, 2), true);
    }

    @Override // defpackage.u7e
    public final void s(md5 md5Var) {
        this.j = 0;
        this.h = md5Var;
    }

    @Override // defpackage.u7e
    public final void t() {
        ((o02) this.a).q(new iy0(this, 0), true);
    }

    @Override // defpackage.an7
    public final void y() {
        ((o02) this.a).q(new iy0(this, 1), true);
    }
}
