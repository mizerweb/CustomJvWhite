package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Supplier;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class bec implements e3j, r80 {
    public final ed6 a;
    public final d4d b;
    public final gue c;
    public final dti d;
    public final wo6 e;
    public final e5d f;
    public final df6 g;
    public final ny8 h;
    public final String i;
    public final a84 j;
    public rui k;
    public int l;
    public boolean m;
    public final s80 n;
    public final ldc o;
    public final fbc p;
    public final ivb q;

    /* JADX WARN: Type inference failed for: r2v26, types: [udc] */
    public bec(Context context, ed6 ed6Var, d4d d4dVar, gue gueVar, dti dtiVar, wo6 wo6Var, e5d e5dVar, df6 df6Var, ny8 ny8Var) {
        this.a = ed6Var;
        this.b = d4dVar;
        this.c = gueVar;
        this.d = dtiVar;
        this.e = wo6Var;
        this.f = e5dVar;
        this.g = df6Var;
        this.h = ny8Var;
        ifh ifhVar = new ifh(new yxb(11));
        this.i = bec.class.getName();
        this.j = new a84();
        this.l = 1;
        this.m = true;
        this.n = new s80(context, this);
        boolean z = nec.a;
        pgg pggVar = new pgg(10);
        myh myhVar = myh.c;
        z55 z55Var = new z55();
        ybf ybfVar = new ybf(0L, 0L);
        m6h m6hVar = new m6h();
        Supplier supplier = new Supplier() { // from class: tdc
            @Override // java.util.function.Supplier
            public final Object get() {
                d4d d4dVar2 = this.a.b;
                return new pdc(d4dVar2.e, d4dVar2.f, d4dVar2.g, d4dVar2.d, 0, d4dVar2.c);
            }
        };
        HashMap map = new HashMap();
        map.put(z3d.d.a, 144179200);
        odc odcVar = new odc(new y65(), 1000, 50000, 1000, 1000, -1, true, map, supplier);
        ldc ldcVar = new ldc(context.getApplicationContext(), ((Handler) ifhVar.getValue()).getLooper(), odcVar, pggVar, z55Var, ybfVar, m6hVar);
        ldcVar.g(new ydc(this));
        if (((Boolean) e5dVar.K6.a(e5d.S6[403]).i()).booleanValue()) {
            ?? r2 = new s25() { // from class: udc
                @Override // defpackage.s25
                public final u25 a() {
                    return this.a.g.a(false, null).a();
                }
            };
            ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.setBaseDataSourceFactory");
            boolean z2 = nec.a;
            yxb yxbVar = ldcVar.G;
            if (yxbVar != null) {
                yxbVar.invoke();
            }
            ldcVar.X = r2;
        }
        this.o = ldcVar;
        this.p = new fbc(ldcVar, 7, e5dVar);
        ivb ivbVar = new ivb();
        ivbVar.f(ldcVar);
        this.q = ivbVar;
    }

    @Override // defpackage.e3j
    public final void C(uvi uviVar) {
        if (uviVar != null) {
            uviVar.setPlayer(this.o);
        }
    }

    @Override // defpackage.e3j
    public final void H(Surface surface) {
        xva xvaVar;
        if (surface == null) {
            gm0.Y(bec.class.getName(), "Early return in createSurfaceHolder cuz of surface == null");
            xvaVar = null;
        } else {
            xvaVar = new xva(21, surface);
        }
        this.o.u(xvaVar);
    }

    @Override // defpackage.e3j
    public final boolean P() {
        return this.o.j() == 4;
    }

    @Override // defpackage.e3j
    public final long V() {
        rui ruiVar = this.k;
        if (ruiVar == null) {
            return 0L;
        }
        boolean z = ruiVar instanceof c5i;
        ldc ldcVar = this.o;
        return z ? cec.a(ldcVar, ruiVar) : cec.a(ldcVar, ruiVar) - ruiVar.j();
    }

    @Override // defpackage.r80
    public final boolean W() {
        return this.c.e() || this.m;
    }

    @Override // defpackage.e3j
    public final void X(pgg pggVar) {
        iec iecVar = (iec) this.f.l().i();
        iecVar.getClass();
        if (iecVar instanceof gec) {
            ldc ldcVar = this.o;
            if (ldcVar == null) {
                ldcVar = null;
            }
            if (ldcVar != null) {
                h3j h3jVar = (h3j) pggVar.a;
                ldcVar.H = h3jVar != null ? h3jVar.a() : null;
            }
        }
    }

    @Override // defpackage.e3j, defpackage.r80
    public final float a() {
        return this.o.x;
    }

    @Override // defpackage.e3j, defpackage.r80
    public final void b(float f) {
        ldc ldcVar = this.o;
        float f2 = ldcVar.x;
        ldcVar.verifyThread("one.video.player.BaseVideoPlayer.<set-volume>");
        if (ldcVar.x != f) {
            ct0 ct0Var = new ct0(1, f);
            b6 b6Var = ldcVar.c;
            boolean z = nec.a;
            ct0Var.invoke();
            if (b6Var != null) {
                b6Var.invoke();
            }
            Float fN = ldcVar.n(f);
            if (fN != null) {
                if (!cqk.c(fN, f)) {
                    boolean z2 = nec.a;
                    wx wxVar = BaseVideoPlayer.C;
                }
                if (ldcVar.x != fN.floatValue()) {
                    ldcVar.x = fN.floatValue();
                    ldcVar.k.r(ldcVar, fN.floatValue());
                }
            } else {
                ldcVar.h("Volume change is not supported by the implementation");
            }
        }
        s80 s80Var = this.n;
        if (f2 == 0.0f && f > 0.0f) {
            s80Var.v(3, this.l, 1);
        } else {
            if (f2 <= 0.0f || f != 0.0f) {
                return;
            }
            s80Var.u();
        }
    }

    public final boolean c() {
        return this.o.j() == 5;
    }

    @Override // defpackage.e3j
    public final void clear() {
        this.o.u(null);
        this.j.a.clear();
        this.k = null;
    }

    @Override // defpackage.e3j, defpackage.r80
    public final boolean d() {
        int iD = qt4.D(this.o.j());
        return iD == 1 || iD == 2;
    }

    @Override // defpackage.e3j
    public final long e() {
        rui ruiVar = this.k;
        if (ruiVar == null) {
            return 0L;
        }
        return cec.b(this.o, ruiVar);
    }

    public final void f(boolean z) {
        bg6 bg6Var;
        if (((Boolean) ((f5d) this.e).a.e3.a(e5d.S6[214]).i()).booleanValue()) {
            ldc ldcVar = this.o;
            if (ldcVar == null) {
                ldcVar = null;
            }
            if (ldcVar == null || (bg6Var = ldcVar.V) == null) {
                return;
            }
            bg6Var.A0(z);
        }
    }

    @Override // defpackage.e3j
    public final long getDuration() {
        rui ruiVar = this.k;
        if (ruiVar == null) {
            return 0L;
        }
        if (ruiVar instanceof w2b) {
            ldc ldcVar = this.o;
            ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.getDuration");
            long jA = ldcVar.A(ldcVar.z());
            if (jA > 0) {
                return jA;
            }
        }
        return ruiVar.a() - ruiVar.j();
    }

    @Override // defpackage.e3j
    public final boolean isIdle() {
        return this.o.j() == 1;
    }

    @Override // defpackage.e3j
    public final float l0() {
        return this.o.w;
    }

    @Override // defpackage.e3j
    public final void o0(boolean z) {
        int i = z ? 3 : 1;
        ldc ldcVar = this.o;
        ldcVar.verifyThread("one.video.player.BaseVideoPlayer.<set-repeatMode>");
        if (ldcVar.A != i) {
            dt0 dt0Var = new dt0(i, 0);
            b6 b6Var = ldcVar.c;
            boolean z2 = nec.a;
            dt0Var.invoke();
            if (b6Var != null) {
                b6Var.invoke();
            }
            ldcVar.m(i);
            if (ldcVar.A != i) {
                ldcVar.A = i;
                ldcVar.k.h(ldcVar, i);
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.n.t(i);
    }

    @Override // defpackage.e3j, defpackage.r80
    public final void pause() {
        ldc ldcVar = this.o;
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.pause");
        ldc.w(ldcVar.G);
        ldcVar.V.n(false);
        f(true);
    }

    @Override // defpackage.e3j, defpackage.r80
    public final void play() {
        if (c()) {
            seekTo(0L);
        }
        f(false);
        ldc ldcVar = this.o;
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.resume");
        ldc.w(ldcVar.G);
        ldcVar.B();
        ldcVar.C(null);
        ldcVar.V.n(true);
        this.j.c();
        this.n.v(3, this.l, 1);
    }

    @Override // defpackage.e3j
    public final void q(c3j c3jVar) {
        this.j.a.remove(c3jVar);
    }

    @Override // defpackage.e3j
    public final void q0(c3j c3jVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.j.a;
        if (copyOnWriteArraySet.contains(c3jVar)) {
            return;
        }
        copyOnWriteArraySet.add(c3jVar);
    }

    @Override // defpackage.e3j
    public final void release() {
        a84 a84Var = this.j;
        a84Var.k();
        a84Var.a.clear();
        this.k = null;
        this.q.f(null);
        ldc ldcVar = this.o;
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.release");
        ldc.w(ldcVar.G);
        bg6 bg6Var = ldcVar.V;
        bg6Var.p0(ldcVar.P);
        jdc jdcVar = ldcVar.Q;
        bg6Var.I0();
        r75 r75Var = bg6Var.t;
        jdcVar.getClass();
        r75Var.f.e(jdcVar);
        gzh gzhVar = ldcVar.K;
        bg6Var.p0(gzhVar);
        bg6Var.I0();
        r75Var.f.e(gzhVar);
        bg6Var.P();
        bg6Var.o0();
        wje wjeVar = ldcVar.d;
        if (wjeVar != null) {
            wjeVar.b(ldcVar);
        }
        boolean z = nec.a;
        r66 r66Var = r66.a;
        gzhVar.c = r66Var;
        gzhVar.d = r66Var;
        gzhVar.e = null;
        gzhVar.l = null;
        gzhVar.f = null;
        gzhVar.g = null;
        gzhVar.k = null;
        gzhVar.h = null;
        BaseVideoPlayer.t(ldcVar, 7);
        ldcVar.verifyThread("one.video.player.BaseVideoPlayer.release");
        ldcVar.h("release()");
        fbc fbcVar = ldcVar.e;
        if (fbcVar != null) {
            ((LinkedHashSet) fbcVar.b).remove(ldcVar.s);
        }
        if (fbcVar != null) {
            ((LinkedHashSet) fbcVar.b).clear();
            ((hsh) fbcVar.c).b();
        }
        this.n.u();
    }

    @Override // defpackage.e3j
    public final void seekTo(long j) {
        long jX;
        rui ruiVar = this.k;
        if (ruiVar == null) {
            gm0.Y(bec.class.getName(), "Early return in seekTo cuz of videoContent is null");
            return;
        }
        if (ruiVar instanceof c5i) {
            jX = oc9.x(j, 0L, ((c5i) ruiVar).getDuration());
        } else {
            jX = oc9.x(ruiVar.j() + j, ruiVar.j(), getDuration() + ruiVar.j());
        }
        cec.f(this.o, ruiVar, jX);
    }

    @Override // defpackage.e3j
    public final void setPlaybackSpeed(float f) {
        ldc ldcVar = this.o;
        ldcVar.verifyThread("one.video.player.BaseVideoPlayer.<set-playbackSpeed>");
        if (ldcVar.w == f) {
            return;
        }
        ct0 ct0Var = new ct0(0, f);
        b6 b6Var = ldcVar.c;
        boolean z = nec.a;
        ct0Var.invoke();
        if (b6Var != null) {
            b6Var.invoke();
        }
        Float fL = ldcVar.l(f);
        if (fL == null) {
            ldcVar.h("Playback speed change is not supported by the implementation");
        } else {
            if (ldcVar.w == fL.floatValue()) {
                return;
            }
            ldcVar.w = fL.floatValue();
            ldcVar.k.c(ldcVar, fL.floatValue());
        }
    }

    @Override // defpackage.e3j
    public final void stop() {
        ldc ldcVar = this.o;
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.stop");
        ldc.w(ldcVar.G);
        ldcVar.verifyThread("one.video.player.BaseVideoPlayer.stop");
        ldcVar.h("stop()");
        ldcVar.u = null;
        bg6 bg6Var = ldcVar.V;
        bg6Var.stop();
        bg6Var.O();
        wje wjeVar = ldcVar.d;
        if (wjeVar != null) {
            wjeVar.f(ldcVar);
        }
        if (ldcVar.j() == 6) {
            BaseVideoPlayer.t(ldcVar, 1);
        }
    }

    @Override // defpackage.e3j
    public final void x(rui ruiVar, boolean z, d3j d3jVar, int i, boolean z2, float f, boolean z3) {
        m4d m4dVarC;
        ylc ylcVar;
        ip4 ip4Var;
        je9 je9Var = je9.d;
        boolean zEquals = ruiVar.equals(this.k);
        String str = this.i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            boolean zIsIdle = isIdle();
            boolean zC = c();
            StringBuilder sbB = zo5.B("Player: prepare() isSameContent=", zEquals, ", isIdle=", zIsIdle, ", isEnded=");
            sbB.append(zC);
            a4cVar.c(je9Var, str, sbB.toString(), null);
        }
        if (!zEquals || isIdle()) {
            fbc fbcVar = this.p;
            boolean zC2 = c();
            iec iecVar = (iec) ((e5d) fbcVar.c).l().i();
            iecVar.getClass();
            if (iecVar instanceof gec) {
                ArrayList arrayListB = new vog(ruiVar).b();
                ylcVar = new ylc(arrayListB != null ? new m4d(arrayListB) : null, fbcVar.h(ruiVar, zEquals, zC2));
            } else {
                if (ruiVar.b() && (ruiVar instanceof v84)) {
                    c79 c79VarW = yab.w();
                    Iterator it = ((v84) ruiVar).l().iterator();
                    while (it.hasNext()) {
                        c79VarW.add(new z15(((u84) it.next()).a(), 2));
                    }
                    m4dVarC = new m4d(yab.j(c79VarW));
                } else if (ruiVar.b() && (ruiVar instanceof c5i)) {
                    c5i c5iVar = (c5i) ruiVar;
                    m4dVarC = fbc.C(new ot3(new z15(c5iVar.d(), 2), vqi.X(c5iVar.j()), vqi.X(c5iVar.a())));
                } else if (ruiVar.b()) {
                    m4dVarC = fbc.C(new z15(ruiVar.d(), 2));
                } else if (cqk.d(ruiVar.getContentType(), ewi.b(2))) {
                    m4dVarC = ruiVar.h() ? fbc.C(new j15(ruiVar.d())) : fbc.C(new z15(ruiVar.d(), 0));
                } else if (cqk.d(ruiVar.getContentType(), ewi.b(1))) {
                    m4dVarC = ruiVar.h() ? fbc.C(new hx7(ruiVar.d())) : fbc.C(new z15(ruiVar.d(), 1));
                } else {
                    m4dVarC = cqk.d(ruiVar.getContentType(), ewi.b(3)) ? fbc.C(new z15(ruiVar.d(), 3)) : null;
                }
                ylcVar = new ylc(m4dVarC, fbcVar.h(ruiVar, zEquals, zC2));
            }
            m4d m4dVar = (m4d) ylcVar.a;
            p4d p4dVar = (p4d) ylcVar.b;
            String str2 = this.i;
            if (m4dVar == null) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    return;
                }
                je9 je9Var2 = je9.g;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "Unknown source: " + ruiVar, null);
                    return;
                }
                return;
            }
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str2, "Player: Prepare new video content; " + ruiVar, null);
            }
            dti dtiVar = this.d;
            dtiVar.l = d3jVar;
            dtiVar.m = new iua(15, this);
            CopyOnWriteArraySet copyOnWriteArraySet = this.j.a;
            if (!copyOnWriteArraySet.contains(dtiVar)) {
                copyOnWriteArraySet.add(dtiVar);
            }
            ivb ivbVar = this.q;
            ll5 ll5Var = new ll5();
            ll5Var.g(String.valueOf(ruiVar.k()));
            ll5Var.f(ruiVar.h());
            ll5Var.d(ruiVar.d().getHost());
            String contentType = ruiVar.getContentType();
            if (cqk.d(contentType, ewi.b(2))) {
                ip4Var = ip4.b;
            } else if (cqk.d(contentType, ewi.b(1))) {
                ip4Var = ip4.c;
            } else {
                ip4Var = cqk.d(contentType, ewi.b(3)) ? ip4.a : null;
            }
            if (ip4Var != null) {
                ll5Var.e(ip4Var);
            }
            h4d h4dVarA = ll5Var.a();
            a5d a5dVar = ivbVar.n;
            boolean z4 = nec.a;
            h4dVarA.toString();
            if (a5dVar != null) {
                a5dVar.invoke();
            }
            ivbVar.d = h4dVarA;
            this.j.j(ruiVar);
            ldc ldcVar = this.o;
            ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.setPauseAtEndOfMediaItems");
            yxb yxbVar = ldcVar.G;
            boolean z5 = nec.a;
            if (yxbVar != null) {
                yxbVar.invoke();
            }
            bg6 bg6Var = ldcVar.V;
            bg6Var.I0();
            if (bg6Var.S != z3) {
                bg6Var.S = z3;
                bg6Var.m.h.b(23, z3 ? 1 : 0, 0).b();
            }
            this.o.r(m4dVar, p4dVar);
            this.k = ruiVar;
        } else {
            String str3 = this.i;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str3, "Player: prepare() fast path (skip player.prepare), content=" + ruiVar, null);
            }
            if (c()) {
                seekTo(0L);
            }
            this.j.q(z);
        }
        setPlaybackSpeed(f);
        this.l = i;
        this.m = z2;
        if (!z) {
            ldc ldcVar2 = this.o;
            ldcVar2.verifyThread("one.video.exo.OneVideoExoPlayer.pause");
            ldc.w(ldcVar2.G);
            ldcVar2.V.n(false);
            f(true);
            return;
        }
        f(false);
        ldc ldcVar3 = this.o;
        ldcVar3.verifyThread("one.video.exo.OneVideoExoPlayer.resume");
        ldc.w(ldcVar3.G);
        ldcVar3.B();
        ldcVar3.C(null);
        ldcVar3.V.n(true);
        this.j.c();
        this.n.v(3, this.l, 1);
    }
}
