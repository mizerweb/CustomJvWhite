package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public final class xf6 implements y3j, ob0, inh, vwa, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ bg6 a;

    public xf6(bg6 bg6Var) {
        this.a = bg6Var;
    }

    @Override // defpackage.y3j
    public final void A(int i, long j) {
        r75 r75Var = this.a.t;
        wf wfVarU = r75Var.u((x4a) r75Var.d.e);
        r75Var.y(wfVarU, 1018, new b75(i, j, wfVarU));
    }

    @Override // defpackage.y3j
    public final void C(b87 b87Var, w55 w55Var) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1017, new oo(wfVarX, b87Var, w55Var, 2));
    }

    @Override // defpackage.ob0
    public final void D(Exception exc) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1029, new hs4(wfVarX, exc, 18));
    }

    @Override // defpackage.ob0
    public final void E(pu3 pu3Var) {
        v2a.i(this.a.G, pu3Var);
    }

    @Override // defpackage.y3j
    public final void F(long j, long j2, String str) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1016, new a75(wfVarX, str, j2, j, 2));
    }

    @Override // defpackage.ob0
    public final void G(final int i, final long j, final long j2) {
        r75 r75Var = this.a.t;
        final wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1011, new r89() { // from class: p75
            @Override // defpackage.r89
            public final void invoke(Object obj) {
                ((xf) obj).I0(wfVarX, i, j, j2);
            }
        });
    }

    @Override // defpackage.ob0
    public final void H(t55 t55Var) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1007, new h75(wfVarX, t55Var, 0));
    }

    @Override // defpackage.y3j
    public final void a(String str) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1019, new a75(wfVarX, str, 1));
    }

    @Override // defpackage.inh
    public final void b(ghe gheVar) {
        this.a.n.f(27, new zv2(3, gheVar));
    }

    @Override // defpackage.y3j
    public final void c(k4j k4jVar) {
        bg6 bg6Var = this.a;
        bg6Var.o0 = k4jVar;
        bg6Var.n.f(25, new s63(27, k4jVar));
    }

    @Override // defpackage.y3j
    public final void e(pu3 pu3Var) {
        v2a.i(this.a.H, pu3Var);
    }

    @Override // defpackage.ob0
    public final void f(int i) {
        ma maVar = this.a.D;
        jn4 jn4Var = new jn4(i, 2);
        maVar.getClass();
        lvb.b0(Looper.myLooper() == ((sfh) maVar.c).a.getLooper());
        maVar.a++;
        maVar.B(new qe(maVar, 15, jn4Var));
        maVar.G(Integer.valueOf(i));
    }

    @Override // defpackage.ob0
    public final void h(boolean z) {
        bg6 bg6Var = this.a;
        if (bg6Var.f0 == z) {
            return;
        }
        bg6Var.f0 = z;
        bg6Var.n.f(23, new hw2(z, 2));
    }

    @Override // defpackage.y3j
    public final void i(int i, long j) {
        r75 r75Var = this.a.t;
        wf wfVarU = r75Var.u((x4a) r75Var.d.e);
        r75Var.y(wfVarU, 1021, new i75(i, j, wfVarU));
    }

    @Override // defpackage.vwa
    public final void j(lwa lwaVar) {
        bg6 bg6Var = this.a;
        u89 u89Var = bg6Var.n;
        zz9 zz9VarA = bg6Var.s0.a();
        for (int i = 0; i < lwaVar.e(); i++) {
            lwaVar.d(i).b(zz9VarA);
        }
        bg6Var.s0 = new b0a(zz9VarA);
        b0a b0aVarN = bg6Var.N();
        if (!b0aVarN.equals(bg6Var.U)) {
            bg6Var.U = b0aVarN;
            u89Var.c(14, new s63(25, this));
        }
        u89Var.c(28, new s63(26, lwaVar));
        u89Var.b();
    }

    @Override // defpackage.inh
    public final void k(zy4 zy4Var) {
        bg6 bg6Var = this.a;
        bg6Var.g0 = zy4Var;
        bg6Var.n.f(27, new s63(24, zy4Var));
    }

    @Override // defpackage.ob0
    public final void l(String str) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1012, new a75(wfVarX, str, 3));
    }

    @Override // defpackage.ob0
    public final void m(tb0 tb0Var) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1032, new j75(wfVarX, tb0Var, 1));
    }

    @Override // defpackage.ob0
    public final void n(b87 b87Var, w55 w55Var) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1009, new hu(wfVarX, b87Var, w55Var));
    }

    @Override // defpackage.ob0
    public final void o(tb0 tb0Var) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1031, new j75(wfVarX, tb0Var, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        bg6 bg6Var = this.a;
        bg6Var.B0(surface);
        bg6Var.X = surface;
        bg6Var.m0(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bg6 bg6Var = this.a;
        bg6Var.B0(null);
        bg6Var.m0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.m0(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.ob0
    public final void p(Exception exc) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1014, new hs4(wfVarX, exc, 25));
    }

    @Override // defpackage.ob0
    public final void q(long j) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1010, new gw2(wfVarX, j, 1));
    }

    @Override // defpackage.y3j
    public final void r(Exception exc) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1030, new o75(wfVarX, exc, 3));
    }

    @Override // defpackage.y3j
    public final void s(long j, Object obj) {
        bg6 bg6Var = this.a;
        r75 r75Var = bg6Var.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 26, new jw2(wfVarX, obj, j, 1));
        if (bg6Var.W == obj) {
            bg6Var.n.f(26, new o75(26));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.m0(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        bg6 bg6Var = this.a;
        if (bg6Var.Z) {
            bg6Var.B0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        bg6 bg6Var = this.a;
        if (bg6Var.Z) {
            bg6Var.B0(null);
        }
        bg6Var.m0(0, 0);
    }

    @Override // defpackage.ob0
    public final void t(long j, long j2, String str) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1008, new a75(wfVarX, str, j2, j, 0));
    }

    @Override // defpackage.y3j
    public final void v(t55 t55Var) {
        r75 r75Var = this.a.t;
        wf wfVarU = r75Var.u((x4a) r75Var.d.e);
        r75Var.y(wfVarU, 1020, new g75(wfVarU, t55Var, 0));
    }

    @Override // defpackage.y3j
    public final void w(t55 t55Var) {
        r75 r75Var = this.a.t;
        wf wfVarX = r75Var.x();
        r75Var.y(wfVarX, 1015, new g75(wfVarX, t55Var, 1));
    }

    @Override // defpackage.ob0
    public final void x(t55 t55Var) {
        r75 r75Var = this.a.t;
        wf wfVarU = r75Var.u((x4a) r75Var.d.e);
        r75Var.y(wfVarU, 1013, new h75(wfVarU, t55Var, 1));
    }
}
