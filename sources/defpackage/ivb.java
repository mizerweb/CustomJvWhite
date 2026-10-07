package defpackage;

import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class ivb {
    public final p3c a = new p3c(22, this);
    public aec b;
    public h4d c;
    public h4d d;
    public long e;
    public final w4 f;
    public final AtomicLong g;
    public final p35 h;
    public boolean i;
    public final boolean j;
    public final zjg k;
    public final akg l;
    public final pa7 m;
    public final a5d n;

    public ivb() {
        boolean z = nec.a;
        this.e = -1L;
        this.f = new w4(8, false);
        this.g = new AtomicLong(0L);
        this.h = new p35(this);
        this.j = true;
        this.k = new zjg(this);
        this.l = new akg(this);
        this.m = new pa7(this);
        this.n = new a5d(24);
    }

    public static final void a(ivb ivbVar, aec aecVar) {
        h4d h4dVar = ivbVar.c;
        if (h4dVar == null || ivbVar.e <= 0) {
            return;
        }
        kvb.f(h4dVar, new lk8(aecVar, null, null), SystemClock.elapsedRealtime() - ivbVar.e);
        ivbVar.e = -1L;
    }

    public static final void b(ivb ivbVar, aec aecVar) {
        w4 w4Var = ivbVar.f;
        ivbVar.e(aecVar);
        ivbVar.c(aecVar);
        ivbVar.d(aecVar);
        ivbVar.i = false;
        h4d h4dVar = ivbVar.d;
        if (h4dVar != null) {
            ivbVar.c = h4dVar;
            ivbVar.d = null;
        }
        ((Set) w4Var.a).clear();
        ivbVar.e = -1L;
        h4d h4dVar2 = ivbVar.c;
        if (h4dVar2 != null) {
            qvi qviVar = (qvi) ivbVar.h.b;
            qviVar.a = -1L;
            qviVar.b = -1L;
            h4dVar2.e(SystemClock.elapsedRealtime());
        }
        h4d h4dVar3 = ivbVar.c;
        if (h4dVar3 == null || !((Set) w4Var.a).add(iw6.d)) {
            return;
        }
        kvb.l(h4dVar3, new lk8(aecVar, null, null), 0L);
    }

    public final void c(aec aecVar) {
        h4d h4dVar = this.c;
        if (h4dVar != null) {
            long andSet = this.g.getAndSet(0L);
            if (andSet > 0) {
                kvb.c(h4dVar, new lk8(aecVar, null, null), andSet);
            }
        }
    }

    public final void d(aec aecVar) {
        h4d h4dVar = this.c;
        if (h4dVar == null || this.e <= 0) {
            return;
        }
        kvb.d(h4dVar, new lk8(aecVar, null, null), SystemClock.elapsedRealtime() - this.e);
        this.e = -1L;
    }

    public final void e(aec aecVar) {
        p35 p35Var = this.h;
        if (aecVar != null) {
            long jB = p35Var.b();
            if (jB >= 0) {
                p35Var.a(jB);
            }
            c(aecVar);
            d(aecVar);
        }
        this.i = false;
        this.e = -1L;
        ((Set) this.f.a).clear();
        this.g.set(0L);
        qvi qviVar = (qvi) p35Var.b;
        qviVar.a = -1L;
        qviVar.b = -1L;
    }

    public final void f(ldc ldcVar) {
        if (cqk.d(this.b, ldcVar)) {
            return;
        }
        yjg yjgVar = new yjg(this, 0, ldcVar);
        boolean z = nec.a;
        yjgVar.invoke();
        if (this.n != null) {
            new Exception();
        }
        e(this.b);
        this.c = null;
        this.d = null;
        aec aecVar = this.b;
        zjg zjgVar = this.k;
        if (aecVar != null) {
            BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) aecVar;
            baseVideoPlayer.verifyThread("one.video.player.BaseVideoPlayer.removeListener");
            ga7 ga7Var = baseVideoPlayer.k;
            ga7Var.b.remove(zjgVar);
            ga7Var.b.size();
        }
        aec aecVar2 = this.b;
        akg akgVar = this.l;
        if (aecVar2 != null) {
            BaseVideoPlayer baseVideoPlayer2 = (BaseVideoPlayer) aecVar2;
            baseVideoPlayer2.verifyThread("one.video.player.BaseVideoPlayer.removePositionChangeListener");
            CopyOnWriteArrayList copyOnWriteArrayList = baseVideoPlayer2.l;
            copyOnWriteArrayList.remove(akgVar);
            copyOnWriteArrayList.size();
        }
        aec aecVar3 = this.b;
        pa7 pa7Var = this.m;
        if (aecVar3 != null) {
            BaseVideoPlayer baseVideoPlayer3 = (BaseVideoPlayer) aecVar3;
            pa7 pa7Var2 = baseVideoPlayer3.m;
            baseVideoPlayer3.verifyThread("one.video.player.BaseVideoPlayer.removeTransferListener");
            ((CopyOnWriteArrayList) pa7Var2.b).remove(pa7Var);
            boolean z2 = nec.a;
            ((CopyOnWriteArrayList) pa7Var2.b).size();
        }
        if (ldcVar != null) {
            ldcVar.g(zjgVar);
        }
        if (ldcVar != null) {
            ldcVar.verifyThread("one.video.player.BaseVideoPlayer.addPositionChangeListener");
            CopyOnWriteArrayList copyOnWriteArrayList2 = ldcVar.l;
            copyOnWriteArrayList2.add(akgVar);
            copyOnWriteArrayList2.size();
        }
        if (ldcVar != null) {
            ldcVar.verifyThread("one.video.player.BaseVideoPlayer.addTransferListener");
            pa7 pa7Var3 = ldcVar.m;
            ((CopyOnWriteArrayList) pa7Var3.b).add(pa7Var);
            ((CopyOnWriteArrayList) pa7Var3.b).size();
        }
        this.b = ldcVar;
    }
}
