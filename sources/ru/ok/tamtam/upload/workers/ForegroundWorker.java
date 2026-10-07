package ru.ok.tamtam.upload.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.b5d;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.e5d;
import defpackage.ezl;
import defpackage.f55;
import defpackage.f89;
import defpackage.gm0;
import defpackage.gue;
import defpackage.gvd;
import defpackage.hu4;
import defpackage.hyj;
import defpackage.ja1;
import defpackage.je9;
import defpackage.l89;
import defpackage.lq4;
import defpackage.nq4;
import defpackage.ore;
import defpackage.q77;
import defpackage.r77;
import defpackage.s77;
import defpackage.sbi;
import defpackage.t77;
import defpackage.u77;
import defpackage.ubb;
import defpackage.xt4;
import defpackage.zv8;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lubb;", "needUpdateWorkerProgressNotifUseCase", "Lr77;", "foregroundServiceVisibility", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lubb;Lr77;)V", "ezl", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class ForegroundWorker extends SdkCoroutineWorker {
    public final ubb g;
    public final r77 h;
    public long i;
    public final AtomicBoolean j;
    public int k;
    public final long l;

    public ForegroundWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ubb ubbVar, r77 r77Var) {
        super(context, workerParameters, xt4Var);
        this.g = ubbVar;
        this.h = r77Var;
        this.j = new AtomicBoolean(false);
        this.k = 0;
        this.l = 1000L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object d(lq4 lq4Var) {
        s77 s77Var;
        int i;
        je9 je9Var = je9.d;
        if (lq4Var instanceof s77) {
            s77Var = (s77) lq4Var;
            int i2 = s77Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s77Var.f = i2 - Integer.MIN_VALUE;
            } else {
                s77Var = new s77(this, (nq4) lq4Var);
            }
        } else {
            s77Var = new s77(this, (nq4) lq4Var);
        }
        Object objK = s77Var.d;
        Object obj = hu4.a;
        int i3 = s77Var.f;
        if (i3 == 0) {
            ch3.d0(objK);
            this.i = System.currentTimeMillis();
            r77 r77Var = this.h;
            String strL = l();
            gue gueVar = (gue) r77Var;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                gueVar.getClass();
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "gue", "onForegroundServiceStarted:".concat(strL), null);
                }
            }
            gueVar.d++;
            s77Var.f = 1;
            objK = k(s77Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK);
        }
        l89 l89Var = (l89) objK;
        r77 r77Var2 = this.h;
        String strL2 = l();
        gue gueVar2 = (gue) r77Var2;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            gueVar2.getClass();
            if (a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "gue", "onForegroundServiceStropped:".concat(strL2), null);
            }
        }
        if (gueVar2.d <= 0) {
            i = 0;
        } else {
            gueVar2.d--;
            i = gueVar2.d;
        }
        gueVar2.d = i;
        return l89Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object f(lq4 lq4Var) {
        t77 t77Var;
        if (lq4Var instanceof t77) {
            t77Var = (t77) lq4Var;
            int i = t77Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                t77Var.f = i - Integer.MIN_VALUE;
            } else {
                t77Var = new t77(this, (nq4) lq4Var);
            }
        } else {
            t77Var = new t77(this, (nq4) lq4Var);
        }
        Object objJ = t77Var.d;
        int i2 = t77Var.f;
        if (i2 == 0) {
            ch3.d0(objJ);
            this.j.set(true);
            t77Var.f = 1;
            objJ = j(t77Var);
            Object obj = hu4.a;
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objJ);
        }
        q77 q77Var = (q77) objJ;
        gm0.m(l(), "foreground info = %s", q77Var);
        return q77Var;
    }

    public abstract Object j(lq4 lq4Var);

    public abstract Object k(nq4 nq4Var);

    public abstract String l();

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    public final boolean m(int i) {
        boolean z = true;
        if (this.j.get()) {
            if (ezl.c(i)) {
                gm0.n(l(), "needToShowNotification: ignore indeterminate (already shown)");
            } else if (ezl.b(i)) {
                ubb ubbVar = this.g;
                int i2 = this.k;
                long j = this.i;
                ubbVar.getClass();
                if (ezl.d(i)) {
                    z = false;
                } else if (!ezl.d(i2)) {
                    if (i <= i2) {
                        z = false;
                    } else {
                        int i3 = i - i2;
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        b5d b5dVar = ((e5d) ubbVar.a.getValue()).l0;
                        zv8[] zv8VarArr = e5d.S6;
                        boolean z2 = jCurrentTimeMillis > ((Number) b5dVar.a(zv8VarArr[61]).i()).longValue();
                        if (i3 > ((gvd) ((e5d) ubbVar.a.getValue()).n0.a(zv8VarArr[63]).i()).a && !z2) {
                            z = false;
                        }
                    }
                }
                String strL = l();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, strL, "needToShowNotification: " + z + ", oldProgress=" + ezl.e(this.k) + ", newProgress=" + ezl.e(i) + ", startTime=" + this.i, null);
                    }
                }
            } else {
                gm0.n(l(), "needToShowNotification: none progress, skip");
            }
            z = false;
        } else {
            gm0.n(l(), "needToShowNotification: first foreground show");
        }
        this.k = i;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(lq4 lq4Var) throws Throwable {
        u77 u77Var;
        if (lq4Var instanceof u77) {
            u77Var = (u77) lq4Var;
            int i = u77Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                u77Var.g = i - Integer.MIN_VALUE;
            } else {
                u77Var = new u77(this, lq4Var);
            }
        } else {
            u77Var = new u77(this, lq4Var);
        }
        Object objF = u77Var.e;
        int i2 = u77Var.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objF);
            u77Var.d = this;
            u77Var.g = 1;
            objF = f(u77Var);
            if (objF != hu4Var) {
            }
        }
        if (i2 == 1) {
            this = u77Var.d;
            ch3.d0(objF);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objF);
        }
        q77 q77Var = (q77) objF;
        u77Var.d = null;
        u77Var.g = 2;
        WorkerParameters workerParameters = this.b;
        hyj hyjVar = workerParameters.g;
        Object objE = cqk.e(f55.m(new f89(hyjVar.a.a, "setForegroundAsync", new ja1(hyjVar, workerParameters.a, q77Var, this.a, 16))), u77Var);
        if (objE != hu4Var) {
            objE = sbiVar;
        }
        return objE == hu4Var ? hu4Var : sbiVar;
    }
}
