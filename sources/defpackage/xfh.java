package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class xfh implements a3f {
    public static final String f = n1g.Z("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final vfh c;
    public final WorkDatabase d;
    public final ja4 e;

    public xfh(Context context, WorkDatabase workDatabase, ja4 ja4Var) {
        JobScheduler jobSchedulerA = kp8.a(context);
        vfh vfhVar = new vfh(context, ja4Var.d, ja4Var.l);
        this.a = context;
        this.b = jobSchedulerA;
        this.c = vfhVar;
        this.d = workDatabase;
        this.e = ja4Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            n1g.x().t(f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = kp8.a;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            n1g.x().t(kp8.a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static iyj f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new iyj(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.a3f
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList<JobInfo> arrayListD = d(context, jobScheduler);
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListD) {
                iyj iyjVarF = f(jobInfo);
                if (iyjVarF != null && str.equals(iyjVarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        ch3.G(this.d.u().a, false, true, new rh5(str, 3));
    }

    @Override // defpackage.a3f
    public final void c(mzj... mzjVarArr) {
        int iIntValue;
        ja4 ja4Var = this.e;
        WorkDatabase workDatabase = this.d;
        final w4 w4Var = new w4(workDatabase);
        for (mzj mzjVar : mzjVarArr) {
            workDatabase.b();
            try {
                qzj qzjVarX = workDatabase.x();
                String str = mzjVar.a;
                mzj mzjVarD = qzjVarX.d(str);
                String str2 = f;
                if (mzjVarD == null) {
                    n1g.x().j0(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (mzjVarD.b != kyj.a) {
                    n1g.x().j0(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    iyj iyjVarN = wk8.n(mzjVar);
                    int i = iyjVarN.b;
                    String str3 = iyjVarN.a;
                    tfh tfhVar = (tfh) ch3.G(workDatabase.u().a, true, false, new yqe(str3, i, 1));
                    if (tfhVar != null) {
                        iIntValue = tfhVar.c;
                    } else {
                        ja4Var.getClass();
                        final int i2 = ja4Var.i;
                        iIntValue = ((Number) ((WorkDatabase) w4Var.a).o(new Callable() { // from class: g48
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = (WorkDatabase) w4Var.a;
                                Long lA = workDatabase2.s().a("next_job_scheduler_id");
                                int i3 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                int i4 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                                odd oddVarS = workDatabase2.s();
                                ch3.G(oddVarS.a, false, true, new ol(oddVarS, 12, new ndd("next_job_scheduler_id", Long.valueOf(i4))));
                                if (iLongValue < 0 || iLongValue > i2) {
                                    odd oddVarS2 = workDatabase2.s();
                                    ch3.G(oddVarS2.a, false, true, new ol(oddVarS2, 12, new ndd("next_job_scheduler_id", 1L)));
                                } else {
                                    i3 = iLongValue;
                                }
                                return Integer.valueOf(i3);
                            }
                        })).intValue();
                    }
                    if (tfhVar == null) {
                        tfh tfhVar2 = new tfh(str3, i, iIntValue);
                        ufh ufhVarU = workDatabase.u();
                        ch3.G(ufhVarU.a, false, true, new ol(ufhVarU, 22, tfhVar2));
                    }
                    g(mzjVar, iIntValue);
                    workDatabase.p();
                }
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    @Override // defpackage.a3f
    public final boolean e() {
        return true;
    }

    public final void g(mzj mzjVar, int i) {
        int i2;
        List<JobInfo> allPendingJobs;
        String str;
        vfh vfhVar = this.c;
        vfhVar.getClass();
        kg4 kg4Var = mzjVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = mzjVar.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", mzjVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", mzjVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, vfhVar.a);
        boolean z = kg4Var.c;
        Set<jg4> set = kg4Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = kg4Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = kg4Var.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            int i4 = kg4Var.a;
            if (i3 < 30 || i4 != 6) {
                int iD = qt4.D(i4);
                if (iD == 0) {
                    i2 = 0;
                } else if (iD != 1) {
                    i2 = 2;
                    if (iD != 2) {
                        if (iD != 3) {
                            i2 = 4;
                            if (iD != 4) {
                                n1g.x().p(vfh.d, "API version too low. Cannot convert network type value ".concat(c0a.x(i4)));
                                i2 = 1;
                            }
                        } else {
                            i2 = 3;
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            hvl.b(extras, networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(mzjVar.m, mzjVar.l == rn0.b ? 0 : 1);
        }
        long jA = mzjVar.a();
        vfhVar.b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!mzjVar.q && vfhVar.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (jg4 jg4Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(jg4Var.a(), jg4Var.b() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(kg4Var.g);
            extras.setTriggerContentMaxDelay(kg4Var.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(kg4Var.e);
        extras.setRequiresStorageNotLow(kg4Var.f);
        boolean z3 = mzjVar.k > 0;
        boolean z4 = jMax > 0;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31 && mzjVar.q && !z3 && !z4) {
            extras.setExpedited(true);
        }
        if (i5 >= 35 && (str = mzjVar.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        n1g n1gVarX = n1g.x();
        String strR = nbh.r(i, "Scheduling work ID ", str2, "Job ID ");
        String str3 = f;
        n1gVarX.p(str3, strR);
        try {
            if (this.b.schedule(jobInfoBuild) == 0) {
                n1g.x().j0(str3, "Unable to schedule work ID " + str2);
                if (mzjVar.q && mzjVar.r == yic.a) {
                    mzjVar.q = false;
                    n1g.x().p(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(mzjVar, i);
                }
            }
        } catch (IllegalStateException e) {
            String str4 = kp8.a;
            int i6 = Build.VERSION.SDK_INT;
            int i7 = i6 >= 31 ? 150 : 100;
            int size = ((List) ch3.G(this.d.x().a, true, false, new hfj(3))).size();
            Context context = this.a;
            String strZ1 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i6 >= 34) {
                JobScheduler jobSchedulerA = kp8.a(context);
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                } catch (Throwable th) {
                    n1g.x().t(kp8.a, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListD = d(context, jobSchedulerA);
                    int size2 = arrayListD != null ? allPendingJobs.size() - arrayListD.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    ArrayList arrayListD2 = d(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = arrayListD2 != null ? arrayListD2.size() : 0;
                    strZ1 = ww3.z1(a.Y0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListD3 = d(context, kp8.a(context));
                if (arrayListD3 != null) {
                    strZ1 = arrayListD3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sbA = nbh.A(i7, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", strZ1, ".\nThere are ");
            sbA.append(size);
            sbA.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strP = qt4.p(sbA, this.e.k, '.');
            n1g.x().s(str3, strP);
            ore.l(strP, e);
        } catch (Throwable th2) {
            n1g.x().t(str3, "Unable to schedule " + mzjVar, th2);
        }
    }
}
