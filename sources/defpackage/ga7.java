package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.exo.error.OneVideoExoPlaybackException;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class ga7 implements xdc {
    public final v56 a = new v56((Looper) null);
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // defpackage.xdc
    public final void a(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 3));
    }

    @Override // defpackage.xdc
    public final void b(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 9));
    }

    @Override // defpackage.xdc
    public final void c(BaseVideoPlayer baseVideoPlayer, float f) {
        this.a.K(new z97(this, baseVideoPlayer, f, 1));
    }

    @Override // defpackage.xdc
    public final void d(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 7));
    }

    @Override // defpackage.xdc
    public final void e(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 0));
    }

    @Override // defpackage.xdc
    public final void f(ldc ldcVar, t4j t4jVar) {
        this.a.K(new da7(this, ldcVar, t4jVar, 0));
    }

    @Override // defpackage.xdc
    public final void g(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 8));
    }

    @Override // defpackage.xdc
    public final void h(aec aecVar, int i) {
        this.a.K(new x97(this, aecVar, i, 1));
    }

    @Override // defpackage.xdc
    public final void i(wdc wdcVar, aec aecVar, p4d p4dVar, p4d p4dVar2) {
        this.a.K(new aa7(this, aecVar, wdcVar, p4dVar, p4dVar2, 0));
    }

    @Override // defpackage.xdc
    public final void j(aec aecVar, boolean z) {
        this.a.K(new y97(this, aecVar, z, 0));
    }

    @Override // defpackage.xdc
    public final void k(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 1));
    }

    @Override // defpackage.xdc
    public final void l(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 2));
    }

    @Override // defpackage.xdc
    public final void m(aec aecVar, boolean z) {
        this.a.K(new y97(this, aecVar, z, 1));
    }

    @Override // defpackage.xdc
    public final void n(aec aecVar, int i) {
        this.a.K(new x97(this, aecVar, i, 0));
    }

    @Override // defpackage.xdc
    public final void o(ldc ldcVar) {
        this.a.K(new dx4(this, 18, ldcVar));
    }

    @Override // defpackage.xdc
    public final void p(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 5));
    }

    @Override // defpackage.xdc
    public final void q(OneVideoExoPlaybackException oneVideoExoPlaybackException, m4j m4jVar, aec aecVar) {
        this.a.K(new ja1(this, oneVideoExoPlaybackException, m4jVar, aecVar, 6));
    }

    @Override // defpackage.xdc
    public final void r(aec aecVar, float f) {
        this.a.K(new z97(this, aecVar, f, 0));
    }

    @Override // defpackage.xdc
    public final void s(final BaseVideoPlayer baseVideoPlayer, final int i, final int i2) {
        this.a.K(new af7() { // from class: ca7
            @Override // defpackage.af7
            public final Object invoke() {
                Iterator it = this.a.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).s(baseVideoPlayer, i, i2);
                }
                return sbi.a;
            }
        });
    }

    @Override // defpackage.xdc
    public final void t(final ldc ldcVar, final ooh oohVar, final boolean z) {
        this.a.K(new af7() { // from class: ea7
            @Override // defpackage.af7
            public final Object invoke() {
                Iterator it = this.a.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).t(ldcVar, oohVar, z);
                }
                return sbi.a;
            }
        });
    }

    @Override // defpackage.xdc
    public final void u(ldc ldcVar, t4j t4jVar) {
        this.a.K(new da7(this, ldcVar, t4jVar, 1));
    }

    @Override // defpackage.xdc
    public final void v(ldc ldcVar, ec0 ec0Var) {
        this.a.K(new wre(this, ldcVar, ec0Var, 18));
    }

    @Override // defpackage.xdc
    public final void w(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 6));
    }

    @Override // defpackage.xdc
    public final void x(aec aecVar, long j) {
        this.a.K(new k01(this, aecVar, j));
    }

    @Override // defpackage.xdc
    public final void y(aec aecVar) {
        this.a.K(new ba7(this, aecVar, 4));
    }
}
