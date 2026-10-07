package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class oyj {
    public static oyj k;
    public static oyj l;
    public static final Object m;
    public final Context a;
    public final ja4 b;
    public final WorkDatabase c;
    public final azj d;
    public final List e;
    public final ijd f;
    public final t3a g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final azh j;

    static {
        n1g.Z("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public oyj(Context context, final ja4 ja4Var, azj azjVar, final WorkDatabase workDatabase, final List list, ijd ijdVar, azh azhVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            ore.k("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        ye9 ye9Var = new ye9(ja4Var.h);
        synchronized (n1g.d) {
            try {
                if (n1g.e == null) {
                    n1g.e = ye9Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = azjVar;
        this.c = workDatabase;
        this.f = ijdVar;
        this.j = azhVar;
        this.b = ja4Var;
        this.e = list;
        dq4 dq4VarA = cqk.a(azjVar.b);
        this.g = new t3a(workDatabase);
        final iif iifVar = azjVar.a;
        String str = j3f.a;
        ijdVar.a(new md6() { // from class: d3f
            @Override // defpackage.md6
            public final void a(iyj iyjVar, boolean z) {
                iifVar.execute(new w77(list, iyjVar, ja4Var, workDatabase, 4));
            }
        });
        azjVar.a(new n77(applicationContext, this));
        String str2 = obi.a;
        if (cjd.a(applicationContext)) {
            e9i.j0(new fz6(e9i.I(e9i.m(new j3(ch3.i(workDatabase.x().a, new String[]{"workspec"}, new nre(21)), 15, new nbi(4, null)), -1, 2)), new yd7(1, null, applicationContext), 3), dq4VarA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static oyj d(Context context) {
        oyj oyjVarD;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        oyjVarD = k;
                        if (oyjVarD == null) {
                            oyjVarD = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return oyjVarD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oyjVarD == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof ha4)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            e(applicationContext, ((ha4) applicationContext).a());
            oyjVarD = d(applicationContext);
        }
        return oyjVarD;
    }

    public static void e(Context context, ja4 ja4Var) {
        synchronized (m) {
            try {
                oyj oyjVar = k;
                if (oyjVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (oyjVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = qyj.t(applicationContext, ja4Var);
                    }
                    k = l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final PendingIntent a(UUID uuid) {
        String string = uuid.toString();
        Context context = this.a;
        return PendingIntent.getService(context, 0, qfh.b(context, string), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public final void b(WorkRequest workRequest) {
        List listSingletonList = Collections.singletonList(workRequest);
        if (listSingletonList.isEmpty()) {
            ore.p("enqueue needs at least one WorkRequest.");
        } else {
            new cyj(this, null, ve6.b, listSingletonList, 0).N();
        }
    }

    public final ogc c(String str, int i, gsc gscVar) {
        if (i == 3) {
            return lvb.v0(this.b.m, "enqueueUniquePeriodic_".concat(str), this.d.a, new z5(this, str, gscVar, 12));
        }
        return new cyj(this, str, i == 2 ? ve6.b : ve6.a, Collections.singletonList(gscVar), 0).N();
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() throws Throwable {
        khb khbVar = this.b.m;
        xlf xlfVar = new xlf(8, this);
        boolean zY = cqk.y();
        if (zY) {
            try {
                cqk.f("ReschedulingWork");
            } finally {
                if (zY) {
                    Trace.endSection();
                }
            }
        }
        xlfVar.invoke();
    }
}
