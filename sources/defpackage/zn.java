package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import one.me.android.vendor.FatalException;
import one.me.chats.list.ChatsListWidget;
import one.me.login.inputphone.InputPhoneScreen;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zn(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        au3 au3Var;
        int i;
        boolean zQ;
        synchronized (((rcd) this.b)) {
            rcd rcdVar = (rcd) this.b;
            au3Var = rcdVar.g;
            i = rcdVar.h;
            rcdVar.g = null;
            rcdVar.i = false;
        }
        if (au3.W(au3Var)) {
            try {
                rcd.m((rcd) this.b, au3Var, i);
                au3Var.close();
            } catch (Throwable th) {
                au3.E(au3Var);
                throw th;
            }
        }
        rcd rcdVar2 = (rcd) this.b;
        synchronized (rcdVar2) {
            rcdVar2.j = false;
            zQ = rcdVar2.q();
        }
        if (zQ) {
            ((Executor) rcdVar2.k.d).execute(new zn(11, rcdVar2));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsEmpty;
        ArrayList arrayList;
        Object obj;
        kjh kjhVarC;
        long jNanoTime;
        int i = 0;
        switch (this.a) {
            case 0:
                ((ek2) this.b).resumeWith(sbi.a);
                return;
            case 1:
                vr vrVar = (vr) this.b;
                if ((vrVar.y1 & 1) != 0) {
                    vrVar.x(0);
                }
                if ((vrVar.y1 & np0.r) != 0) {
                    vrVar.x(108);
                }
                vrVar.x1 = false;
                vrVar.y1 = 0;
                return;
            case 2:
                throw new FatalException((Throwable) this.b);
            case 3:
                Activity activity = ((ChatsListWidget) this.b).getActivity();
                if (activity != null) {
                    try {
                        activity.reportFullyDrawn();
                        return;
                    } catch (SecurityException e) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar == null) {
                            return;
                        }
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "ActivityExt", "tryReportFullyDrawn: failed to call Activity::reportFullyDrawn", e);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 4:
                kd5 kd5Var = (kd5) this.b;
                AtomicInteger atomicInteger = kd5Var.f;
                String str = kd5Var.a;
                LinkedBlockingQueue linkedBlockingQueue = kd5Var.d;
                try {
                    Runnable runnable = (Runnable) linkedBlockingQueue.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        int i2 = kd5.h;
                        pj6.d(kd5.class, str, "%s: Worker has nothing to run");
                    }
                    if (zIsEmpty) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    if (linkedBlockingQueue.isEmpty()) {
                        int i3 = kd5.h;
                        pj6.e(kd5.class, "%s: worker finished; %d workers left", str, Integer.valueOf(iDecrementAndGet));
                    } else {
                        kd5Var.l();
                    }
                }
            case 5:
                synchronized (((ag5) this.b).a) {
                    ag5 ag5Var = (ag5) this.b;
                    ArrayList arrayList2 = (ArrayList) ag5Var.d;
                    arrayList = (ArrayList) ag5Var.c;
                    ag5Var.d = arrayList;
                    ag5Var.c = arrayList2;
                    break;
                }
                int size = arrayList.size();
                while (true) {
                    ArrayList arrayList3 = (ArrayList) ((ag5) this.b).d;
                    if (i >= size) {
                        arrayList3.clear();
                        return;
                    } else {
                        ((u0) ((zf5) arrayList3.get(i))).m();
                        i++;
                    }
                }
                break;
            case 6:
                a aVar = (a) this.b;
                if (aVar.K != null) {
                    aVar.g().getClass();
                    return;
                }
                return;
            case 7:
                ((c) this.b).A(true);
                return;
            case 8:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.b;
                zv8[] zv8VarArr = InputPhoneScreen.v;
                try {
                    inputPhoneScreen.requireActivity().reportFullyDrawn();
                    return;
                } catch (SecurityException e2) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 == null) {
                        return;
                    }
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "ActivityExt", "tryReportFullyDrawn: failed to call Activity::reportFullyDrawn", e2);
                        return;
                    }
                    return;
                }
            case 9:
                synchronized (((b99) this.b).a) {
                    obj = ((b99) this.b).f;
                    ((b99) this.b).f = b99.k;
                    break;
                }
                ((b99) this.b).k(obj);
                return;
            case 10:
                ((z9c) this.b).a = false;
                return;
            case 11:
                a();
                return;
            case 12:
                hve hveVar = (hve) this.b;
                hveVar.g = true;
                hveVar.B();
                return;
        }
        while (true) {
            pkh pkhVar = (pkh) this.b;
            synchronized (pkhVar) {
                kjhVarC = pkhVar.c();
            }
            if (kjhVarC == null) {
                return;
            }
            fkh fkhVar = kjhVarC.c;
            pkh pkhVar2 = (pkh) this.b;
            boolean zIsLoggable = pkh.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                pkh pkhVar3 = fkhVar.a;
                jNanoTime = System.nanoTime();
                cwl.a(kjhVarC, fkhVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                pkh.a(pkhVar2, kjhVarC);
                if (zIsLoggable) {
                    pkh pkhVar4 = fkhVar.a;
                    cwl.a(kjhVarC, fkhVar, "finished run in ".concat(cwl.c(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) pkhVar2.a.b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        pkh pkhVar5 = fkhVar.a;
                        cwl.a(kjhVarC, fkhVar, "failed a run in ".concat(cwl.c(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ zn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
