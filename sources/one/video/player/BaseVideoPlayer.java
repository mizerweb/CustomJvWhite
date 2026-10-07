package one.video.player;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import defpackage.aec;
import defpackage.b6;
import defpackage.bt0;
import defpackage.cqk;
import defpackage.et0;
import defpackage.fbc;
import defpackage.ga7;
import defpackage.ifh;
import defpackage.j85;
import defpackage.ldc;
import defpackage.m4d;
import defpackage.m4j;
import defpackage.n4d;
import defpackage.nec;
import defpackage.nql;
import defpackage.o4d;
import defpackage.p4d;
import defpackage.pa;
import defpackage.pa7;
import defpackage.q97;
import defpackage.u97;
import defpackage.wje;
import defpackage.wx;
import defpackage.x5;
import defpackage.xdc;
import defpackage.xqi;
import defpackage.xva;
import defpackage.yx;
import defpackage.yxb;
import defpackage.zdc;
import defpackage.zo5;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import one.video.player.error.OneVideoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/video/player/BaseVideoPlayer;", "Laec;", "", "event", "Lsbi;", "verifyThread", "(Ljava/lang/String;)V", "one-video-player_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseVideoPlayer implements aec {
    public static final wx C;
    public static final ifh D;
    public int A;
    public volatile int B;
    public final int a = xqi.a.getAndIncrement();
    public final Thread b = Thread.currentThread();
    public final b6 c;
    public final wje d;
    public final fbc e;
    public long f;
    public long g;
    public long h;
    public String i;
    public String j;
    public final ga7 k;
    public final CopyOnWriteArrayList l;
    public final pa7 m;
    public final q97 n;
    public final CopyOnWriteArrayList o;
    public final u97 p;
    public double q;
    public long r;
    public final bt0 s;
    public final j85 t;
    public m4d u;
    public final pa v;
    public float w;
    public float x;
    public volatile xva y;
    public OneVideoPlaybackException z;

    static {
        yx yxVar = yx.a;
        C = yx.a("Player");
        D = new ifh(new b6(13));
    }

    public BaseVideoPlayer() {
        C.a(cqk.d(Looper.myLooper(), Looper.getMainLooper()), "BaseVideoPlayer.constructor", new b6(14));
        this.c = new b6(15);
        this.d = (wje) D.getValue();
        boolean z = nec.a;
        fbc fbcVar = new fbc(Looper.myLooper());
        this.e = fbcVar;
        this.f = -1L;
        this.g = -1L;
        this.h = -1L;
        this.k = new ga7();
        this.l = new CopyOnWriteArrayList();
        this.m = new pa7();
        this.n = new q97();
        this.o = new CopyOnWriteArrayList();
        this.p = new u97();
        SystemClock.elapsedRealtime();
        ldc ldcVar = (ldc) this;
        bt0 bt0Var = new bt0(ldcVar);
        this.s = bt0Var;
        this.t = n4d.a;
        this.v = pa.d;
        this.w = 1.0f;
        this.x = 1.0f;
        this.A = 1;
        et0 et0Var = new et0(ldcVar);
        h("BaseVideoPlayer constructor");
        ((LinkedHashSet) fbcVar.b).add(bt0Var);
        g(et0Var);
        boolean z2 = nec.a;
        this.B = 1;
    }

    public static void t(BaseVideoPlayer baseVideoPlayer, int i) {
        if (baseVideoPlayer.B != i) {
            boolean z = nec.a;
            int i2 = baseVideoPlayer.B;
            baseVideoPlayer.B = i;
            baseVideoPlayer.z = null;
            baseVideoPlayer.k.s(baseVideoPlayer, i2, i);
        }
    }

    @Override // defpackage.aec
    public String a() {
        verifyThread("one.video.player.BaseVideoPlayer.getDebugInfoString");
        return nql.c(this, this.i, this.j);
    }

    public final void g(xdc xdcVar) {
        verifyThread("one.video.player.BaseVideoPlayer.addListener");
        ga7 ga7Var = this.k;
        ga7Var.b.add(xdcVar);
        boolean z = nec.a;
        ga7Var.b.size();
        xdcVar.toString();
    }

    public final void h(String str) {
        Log.d("BaseVideoPlayer", zo5.i(this.a, "[", "] ", str), null);
    }

    public o4d i() {
        return this.t;
    }

    public final int j() {
        verifyThread("one.video.player.BaseVideoPlayer.getState");
        return this.B;
    }

    public long k() {
        verifyThread("one.video.player.BaseVideoPlayer.getVideoFrameProcessingOffsetAverage");
        return 100L;
    }

    public Float l(float f) {
        return null;
    }

    public int m(int i) {
        return 0;
    }

    public Float n(float f) {
        return null;
    }

    public final void o(long j) {
        ldc ldcVar = (ldc) this;
        m4j m4jVarZ = ldcVar.z();
        boolean z = false;
        if (m4jVarZ != null && m4jVarZ.b()) {
            z = true;
        }
        long jY = ldcVar.y();
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.getBufferedPosition");
        long jR = ldcVar.V.R();
        SystemClock.elapsedRealtime();
        boolean z2 = nec.a;
        if (jY == this.f && jR == this.g && (!z || j == this.h)) {
            return;
        }
        this.f = jY;
        this.g = jR;
        this.h = j;
        if ((jY <= -1 || j <= -1) && !z) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((zdc) it.next()).a(this, this.f);
        }
    }

    public abstract void p(m4d m4dVar, p4d p4dVar, boolean z);

    public final void q(m4j m4jVar, long j) {
        verifyThread("one.video.player.BaseVideoPlayer.play");
        boolean z = nec.a;
        m4jVar.toString();
        m4d m4dVar = new m4d(Collections.singletonList(m4jVar));
        p4d p4dVarC = p4d.d.c(j);
        verifyThread("one.video.player.BaseVideoPlayer.play");
        boolean z2 = nec.a;
        m4dVar.toString();
        p4dVarC.toString();
        m4d m4dVarG = i().g(m4dVar.a());
        this.u = m4dVarG;
        p(m4dVarG, p4dVarC, true);
    }

    public final void r(m4d m4dVar, p4d p4dVar) {
        verifyThread("one.video.player.BaseVideoPlayer.prepare");
        boolean z = nec.a;
        m4dVar.toString();
        p4dVar.toString();
        m4d m4dVarG = i().g(m4dVar.a());
        this.u = m4dVarG;
        p(m4dVarG, p4dVar, false);
    }

    public final void s(m4j m4jVar, long j) {
        verifyThread("one.video.player.BaseVideoPlayer.prepare");
        boolean z = nec.a;
        m4jVar.toString();
        r(new m4d(Collections.singletonList(m4jVar)), p4d.d.c(j));
    }

    public final void u(xva xvaVar) {
        verifyThread("one.video.player.BaseVideoPlayer.setSurfaceHolder");
        boolean z = nec.a;
        Objects.toString(xvaVar);
        if (this.y == xvaVar) {
            return;
        }
        this.y = xvaVar;
        Surface surfaceB = xvaVar != null ? xvaVar.B() : null;
        if (surfaceB == null) {
            ldc ldcVar = (ldc) this;
            ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.clearVideoSurface");
            ldc.w(ldcVar.G);
            wje wjeVar = ldcVar.d;
            if (wjeVar != null) {
                wjeVar.g(ldcVar, null);
                return;
            } else {
                ldcVar.V.P();
                return;
            }
        }
        ldc ldcVar2 = (ldc) this;
        ldcVar2.verifyThread("one.video.exo.OneVideoExoPlayer.setVideoSurface");
        yxb yxbVar = ldcVar2.G;
        boolean z2 = nec.a;
        surfaceB.toString();
        if (yxbVar != null) {
            yxbVar.invoke();
        }
        wje wjeVar2 = ldcVar2.d;
        if (wjeVar2 != null) {
            wjeVar2.g(ldcVar2, surfaceB);
        } else {
            ldcVar2.V.C0(surfaceB);
        }
    }

    public final void verifyThread(String event) {
        boolean z = nec.a;
        Thread threadCurrentThread = Thread.currentThread();
        C.a(this.b == threadCurrentThread, event, new x5(threadCurrentThread, 5, this));
    }
}
