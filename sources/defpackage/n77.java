package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n77 implements Runnable {
    public static final String e = n1g.Z("ForceStopRunnable");
    public static final long f = 315360000000L;
    public final Context a;
    public final oyj b;
    public final t3a c;
    public int d = 0;

    public n77(Context context, oyj oyjVar) {
        this.a = context.getApplicationContext();
        this.b = oyjVar;
        this.c = oyjVar.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7  */
    public final void a() throws Throwable {
        boolean z;
        t3a t3aVar = this.c;
        oyj oyjVar = this.b;
        WorkDatabase workDatabase = oyjVar.c;
        ja4 ja4Var = oyjVar.b;
        t3a t3aVar2 = oyjVar.g;
        WorkDatabase workDatabase2 = oyjVar.c;
        String str = xfh.f;
        Context context = this.a;
        JobScheduler jobSchedulerA = kp8.a(context);
        ArrayList<JobInfo> arrayListD = xfh.d(context, jobSchedulerA);
        List list = (List) ch3.G(workDatabase.u().a, true, false, new nre(11));
        HashSet hashSet = new HashSet(arrayListD != null ? arrayListD.size() : 0);
        if (arrayListD != null && !arrayListD.isEmpty()) {
            for (JobInfo jobInfo : arrayListD) {
                iyj iyjVarF = xfh.f(jobInfo);
                if (iyjVarF != null) {
                    hashSet.add(iyjVarF.a);
                } else {
                    xfh.a(jobSchedulerA, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    n1g.x().p(xfh.f, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                qzj qzjVarX = workDatabase.x();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    qzjVarX.f(-1L, (String) it2.next());
                }
                workDatabase.p();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        qzj qzjVarX2 = workDatabase2.x();
        fzj fzjVarW = workDatabase2.w();
        workDatabase2.b();
        try {
            List<mzj> list2 = (List) ch3.G(qzjVarX2.a, true, false, new nre(19));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (mzj mzjVar : list2) {
                    kyj kyjVar = kyj.a;
                    String str2 = mzjVar.a;
                    qzjVarX2.g(kyjVar, str2);
                    qzjVarX2.h(-512, str2);
                    qzjVarX2.f(-1L, str2);
                }
            }
            ch3.G(fzjVarW.a, false, true, new nre(18));
            workDatabase2.p();
            workDatabase2.f();
            boolean z3 = z2 || z;
            Long lA = ((WorkDatabase) t3aVar2.a).s().a("reschedule_needed");
            int i = 12;
            String str3 = e;
            if (lA != null && lA.longValue() == 1) {
                n1g.x().p(str3, "Rescheduling Workers.");
                oyjVar.g();
                t3aVar2.getClass();
                ndd nddVar = new ndd("reschedule_needed", 0L);
                odd oddVarS = ((WorkDatabase) t3aVar2.a).s();
                ch3.G(oddVarS.a, false, true, new ol(oddVarS, i, nddVar));
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        c(context);
                        n1g.x().p(str3, "Application was force-stopped, rescheduling.");
                        oyjVar.g();
                        ja4Var.d.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        t3aVar.getClass();
                        ndd nddVar2 = new ndd("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        odd oddVarS2 = ((WorkDatabase) t3aVar.a).s();
                        ch3.G(oddVarS2.a, false, true, new ol(oddVarS2, i, nddVar2));
                        return;
                    }
                    if (z3) {
                        n1g.x().p(str3, "Found unfinished work, scheduling it.");
                        j3f.b(ja4Var, workDatabase2, oyjVar.e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = ((WorkDatabase) t3aVar.a).s().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfoD = r4.d(historicalProcessExitReasons.get(i4));
                        if (applicationExitInfoD.getReason() == 10 && applicationExitInfoD.getTimestamp() >= jLongValue) {
                            n1g.x().p(str3, "Application was force-stopped, rescheduling.");
                            oyjVar.g();
                            ja4Var.d.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            t3aVar.getClass();
                            ndd nddVar3 = new ndd("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            odd oddVarS3 = ((WorkDatabase) t3aVar.a).s();
                            ch3.G(oddVarS3.a, false, true, new ol(oddVarS3, i, nddVar3));
                            return;
                        }
                    }
                }
                if (z3) {
                    n1g.x().p(str3, "Found unfinished work, scheduling it.");
                    j3f.b(ja4Var, workDatabase2, oyjVar.e);
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                n1g.x().k0(str3, "Ignoring exception", e);
            } catch (SecurityException e3) {
                e = e3;
                n1g.x().k0(str3, "Ignoring exception", e);
            }
        } catch (Throwable th2) {
            workDatabase2.f();
            throw th2;
        }
    }

    public final boolean b() {
        this.b.b.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = e;
        if (zIsEmpty) {
            n1g.x().p(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = cjd.a(this.a);
        n1g.x().p(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        String str = e;
        oyj oyjVar = this.b;
        try {
            if (!b()) {
                oyjVar.f();
                return;
            }
            while (true) {
                try {
                    vd7.G(context);
                    n1g.x().p(str, "Performing cleanup operations.");
                    try {
                        a();
                        oyjVar.f();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            String str2 = e2m.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            n1g.x().t(str, str2, e2);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e2);
                            oyjVar.b.getClass();
                            throw illegalStateException;
                        }
                        n1g.x().q(str, "Retrying after " + (((long) i) * 300), e2);
                        try {
                            Thread.sleep(((long) this.d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    n1g.x().s(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    oyjVar.b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            oyjVar.f();
            throw th;
        }
    }
}
