package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.StatFs;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zxh implements Thread.UncaughtExceptionHandler {
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws InterruptedException, IOException {
        boolean z;
        List listT1;
        long availableBytes;
        if (swh.b) {
            return;
        }
        try {
            n3 n3Var = xwh.b;
            if (n3Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            byte[] bArrA = xwh.a(th);
            if (swh.b) {
                return;
            }
            snf.c((snf) n3Var.b, null, 2);
            fbc fbcVar = a8g.g;
            if (fbcVar == null) {
                ore.k("Tracer settings are not initialized.");
                return;
            }
            if (gol.a(fbcVar, "system.shutdown.until.ts")) {
                z = true;
            } else {
                if (gol.a(fbcVar, "system.CRASH_REPORT.shutdown.until.ts")) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return;
            }
            jv4 jv4Var = (jv4) n3Var.a;
            snf snfVar = (snf) n3Var.b;
            snfVar.b();
            igh ighVar = snfVar.f;
            igh ighVar2 = ighVar == null ? null : ighVar;
            khh khhVar = (khh) n3Var.c;
            synchronized (khhVar.e) {
                listT1 = ww3.T1(khhVar.e);
            }
            Date date = new Date();
            Method method = qwh.d;
            qwh qwhVarA = gyl.a();
            Context context = swh.d;
            Context context2 = context != null ? context : null;
            long jFreeMemory = -1;
            try {
                availableBytes = new StatFs(context2.getFilesDir().getPath()).getAvailableBytes();
            } catch (Exception unused) {
                availableBytes = -1;
            }
            try {
                Runtime runtime = Runtime.getRuntime();
                jFreeMemory = runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory());
            } catch (Exception unused2) {
            }
            cv4 cv4VarB = jv4Var.b(1, bArrA, xvc.j(ighVar2, listT1, date, qwhVarA, availableBytes, jFreeMemory, 20), Thread.getAllStackTraces(), ww3.T1(((oe9) n3Var.d).i));
            if (cv4VarB != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                yxh.b(new f92(n3Var, cv4VarB, countDownLatch));
                long j = cqk.d(Looper.myLooper(), Looper.getMainLooper()) ? 5000L : 100000000L;
                try {
                    ConditionVariable conditionVariable = (ConditionVariable) ((uy8) n3Var.e).c;
                    if (conditionVariable != null) {
                        conditionVariable.block(j);
                    }
                } catch (Exception unused3) {
                }
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            }
        } catch (IllegalStateException unused4) {
        }
    }
}
