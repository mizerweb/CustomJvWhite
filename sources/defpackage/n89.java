package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n89 implements cle, tp7 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.cle
    public final void A(jme jmeVar, long j, xg xgVar) {
        f(jmeVar.E(), xgVar);
    }

    @Override // defpackage.cle
    public final void E(jme jmeVar) {
        for (uoe uoeVar : this.a) {
            long jE = jmeVar.E();
            synchronized (uoeVar) {
                if (uoeVar.g == null) {
                    uoeVar.g = new kme(jE);
                }
            }
        }
    }

    @Override // defpackage.cle
    public final void W(jme jmeVar, long j, wg wgVar) {
        f(jmeVar.E(), wgVar.b);
    }

    @Override // defpackage.tp7
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uoe) it.next()).a();
        }
    }

    @Override // defpackage.tp7
    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uoe) it.next()).a();
        }
    }

    @Override // defpackage.tp7
    public final void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uoe) it.next()).a();
        }
    }

    public final void e(uoe uoeVar) {
        this.a.add(uoeVar);
    }

    public final void f(long j, xg xgVar) {
        Integer num;
        for (uoe uoeVar : this.a) {
            if (!uoeVar.d.W() && !uoeVar.d.isCancelled()) {
                synchronized (uoeVar) {
                    kme kmeVar = uoeVar.g;
                    if (kmeVar != null && j >= kmeVar.a) {
                        Long l = (Long) xgVar.a.get(CaptureResult.SENSOR_TIMESTAMP);
                        long frameNumber = xgVar.a.getFrameNumber();
                        if (l != null && uoeVar.f == null) {
                            uoeVar.f = l;
                        }
                        Long l2 = uoeVar.f;
                        if (uoeVar.c == null || l2 == null || l == null || l.longValue() - l2.longValue() <= uoeVar.c.longValue()) {
                            if (uoeVar.e == null) {
                                uoeVar.e = new tc7(frameNumber);
                            }
                            tc7 tc7Var = uoeVar.e;
                            if (tc7Var != null && (num = uoeVar.b) != null && frameNumber - tc7Var.a > num.intValue()) {
                                uoeVar.d.Q(new toe(1, xgVar));
                            } else if (((Boolean) uoeVar.a.invoke(xgVar)).booleanValue()) {
                                uoeVar.d.Q(new toe(0, xgVar));
                            }
                        } else {
                            uoeVar.d.Q(new toe(2, xgVar));
                        }
                    }
                }
            }
            this.a.remove(uoeVar);
        }
    }
}
