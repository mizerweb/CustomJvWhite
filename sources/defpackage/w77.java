package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w77 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w77(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        Bundle bundleB;
        int i = this.a;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj4;
                af7 af7Var = (af7) obj3;
                c46 c46Var = (c46) obj2;
                String str = (String) obj;
                long jNanoTime = System.nanoTime();
                ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((x77) it.next()).b);
                }
                ForkJoinTask.invokeAll(arrayList);
                long jNanoTime2 = System.nanoTime();
                af7Var.invoke();
                ((ConcurrentSkipListSet) c46Var.a).add(new rp9(str, jNanoTime2 - jNanoTime, System.nanoTime() - jNanoTime2, Thread.currentThread().getName(), jNanoTime));
                return;
            case 1:
                m0a m0aVar = (m0a) obj4;
                l0a l0aVar = (l0a) obj2;
                k2a k2aVar = (k2a) obj;
                try {
                    iu9 iu9Var = (iu9) ((qu9) obj3).get(0L, TimeUnit.MILLISECONDS);
                    if (m0aVar.d(k2aVar)) {
                        l0aVar.a.g(l0aVar.b, false);
                    }
                    iu9Var.d(l0aVar);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    m0aVar.a.h(k2aVar);
                    return;
                }
            case 2:
                m3a m3aVar = (m3a) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (((AtomicInteger) obj3).incrementAndGet() == arrayList2.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i2 < arrayList3.size()) {
                        e89 e89Var = (e89) arrayList3.get(i2);
                        if (e89Var != null) {
                            try {
                                bitmap = (Bitmap) rx8.F(e89Var);
                            } catch (CancellationException | ExecutionException e) {
                                lvb.h0("MediaSessionLegacyStub", "Failed to get bitmap", e);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        arrayList4.add(new t2a(mz8.f((ry9) arrayList2.get(i2), bitmap), i2 == -1 ? -1L : i2));
                        i2++;
                        break;
                    }
                    o3a.C(((o3a) m3aVar.e).m, arrayList4);
                    return;
                }
                return;
            case 3:
                t4a t4aVar = (t4a) obj4;
                i2a i2aVar = (i2a) obj3;
                d3a d3aVar = (d3a) obj2;
                y28 y28Var = (y28) obj;
                gvb gvbVar = t4aVar.d;
                try {
                    t4aVar.e.remove(i2aVar);
                    if (!d3aVar.j()) {
                        o4a o4aVar = (o4a) i2aVar.d;
                        o4aVar.getClass();
                        IBinder iBinderAsBinder = o4aVar.a.asBinder();
                        g2a g2aVarM = d3aVar.m(i2aVar);
                        if (gvbVar.M(i2aVar)) {
                            lvb.G0("MediaSessionStub", "Controller " + i2aVar + " has sent connection request multiple times");
                        }
                        gvbVar.a(iBinderAsBinder, i2aVar, g2aVarM.a, g2aVarM.b);
                        xhf xhfVarI = gvbVar.I(i2aVar);
                        if (xhfVarI == null) {
                            lvb.G0("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            j4d j4dVar = d3aVar.t;
                            c4d c4dVar = d3aVar.s;
                            h3d h3dVar = g2aVarM.b;
                            c4d c4dVarK0 = t4aVar.k0(c4dVar);
                            MediaSession.Token token = ((q2a) d3aVar.h.m.b).c.b;
                            PendingIntent pendingIntent = d3aVar.u;
                            c98 c98Var = g2aVarM.c;
                            if (c98Var == null) {
                                c98Var = d3aVar.B;
                            }
                            c98 c98Var2 = g2aVarM.d;
                            if (c98Var2 == null) {
                                c98Var2 = d3aVar.C;
                            }
                            re4 re4Var = new re4(1009003300, 8, t4aVar, pendingIntent, c98Var, c98Var2, d3aVar.r, g2aVarM.a, h3dVar, j4dVar.R(), d3aVar.j.a.getExtras(), d3aVar.D, c4dVarK0, token);
                            if (!d3aVar.j()) {
                                try {
                                    int iB = xhfVarI.b();
                                    if (y28Var instanceof sv9) {
                                        bundleB = new Bundle();
                                        bundleB.putBinder(re4.B, new qe4(re4Var));
                                    } else {
                                        bundleB = re4Var.b(i2aVar.c);
                                    }
                                    y28Var.i(iB, bundleB);
                                    i2 = 1;
                                } catch (RemoteException unused2) {
                                }
                                if (i2 != 0 && (!d3aVar.A || !d3a.k(i2aVar))) {
                                    d3aVar.e.getClass();
                                }
                                if (i2 != 0) {
                                    return;
                                }
                            }
                        }
                    }
                    cqk.l(y28Var);
                    return;
                } catch (Throwable th) {
                    if (0 == 0) {
                        cqk.l(y28Var);
                    }
                    throw th;
                }
            case 4:
                List list = (List) obj4;
                iyj iyjVar = (iyj) obj3;
                ja4 ja4Var = (ja4) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((a3f) it2.next()).b(iyjVar.a);
                }
                j3f.b(ja4Var, workDatabase, list);
                return;
            default:
                View view = (View) obj3;
                ((Handler) obj4).removeCallbacksAndMessages(null);
                view.removeOnLayoutChangeListener((k7j) obj2);
                ((cf7) obj).invoke(view);
                return;
        }
    }
}
