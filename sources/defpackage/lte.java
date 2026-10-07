package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.work.WorkerParameters;
import defpackage.ae9;
import defpackage.dkh;
import defpackage.ew5;
import defpackage.gm0;
import defpackage.gn8;
import defpackage.j0d;
import defpackage.k89;
import defpackage.lq4;
import defpackage.ny8;
import defpackage.pvb;
import defpackage.s7f;
import defpackage.su7;
import defpackage.svb;
import defpackage.vo8;
import defpackage.wzj;
import defpackage.xb9;
import defpackage.zed;
import java.util.Collections;
import java.util.Set;
import one.me.android.DailyAnalyticsWorker;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;
import one.me.stories.core.workers.SaveStoryToGalleryWorker;
import one.me.stories.core.workers.StoriesCleanupScheduler$StoriesCleanupWorker;
import one.me.stories.core.workers.StoryPublishWorker;
import one.me.upload.cleanup.UploadsCleanupScheduler$UploadsCleanupWorker;
import ru.ok.tamtam.android.messages.comments.MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.services.DbCleanUpScheduler$DbCleanUpWorker;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;
import ru.ok.tamtam.upload.workers.DownloadFileWorker;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;
import ru.ok.tamtam.workmanager.BacklogWorker;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
public final class lte extends oc9 {
    public static final Set B = Collections.singleton("ru.ok.tracer.disk.usage.DiskUsageWorker");
    public final String A = lte.class.getName();

    @Override // defpackage.oc9
    public final m89 A(Context context, String str, WorkerParameters workerParameters) {
        r3f r3fVarB;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        if (B.contains(str)) {
            String str2 = this.A;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var2)) {
                a4cVar.c(je9Var2, str2, c0a.o("Skipping custom factory for ", str, " because it in whitelist"), null);
                return null;
            }
        } else {
            wfe wfeVar = new wfe();
            wfeVar.a = new ha9(workerParameters.b.b("local_account_id", -1));
            String str3 = this.A;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str3, nbh.r(((ha9) wfeVar.a).a, "Request for create worker ", str, ", localAccountId="), null);
            }
            if (cqk.d(wfeVar.a, ha9.c)) {
                float fB = i4e.b.b();
                String str4 = this.A;
                if (fB < 0.001f) {
                    gm0.V(str4, "Account id not provided", new yyj(str));
                } else {
                    gm0.l(str4, "Account id not provided", new yyj(str));
                }
                wfeVar.a = ha9.b;
            }
            if (Looper.getMainLooper().isCurrentThread()) {
                String str5 = this.A;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str5, "Work manger create worker on main thread!", null);
                }
                r7 r7Var = r7.a;
                r3fVarB = r7.b((ha9) wfeVar.a);
            } else {
                y6 y6Var = (y6) yab.A0(k66.a, new kte(wfeVar, null, 1));
                r3fVarB = y6Var != null ? y6Var.a : null;
            }
            if (r3fVarB == null) {
                gm0.V(this.A, "Account id not initialized", new zyj(str));
                return null;
            }
            vz4 vz4Var = (vz4) new ca2(r3fVarB).getAccessor().c(1107);
            xt4 xt4VarA = ((n0c) ((xhh) vz4Var.r.getValue())).a();
            if (str.equals("ru.ok.messages.analytics.DailyAnalyticsWorker") || str.equals(DailyAnalyticsWorker.class.getName())) {
                return new DailyAnalyticsWorker(context, workerParameters, (rsc) vz4Var.W.getValue());
            }
            if (str.equals(TaskMonitor$TaskMonitorWorker.class.getName())) {
                return new TaskMonitor$TaskMonitorWorker(context, workerParameters, xt4VarA, (okh) vz4Var.U.getValue(), (wzj) vz4Var.b.getValue(), vz4Var.a().a);
            }
            if (str.equals(HeartbeatScheduler$TaskHeartbeatWorker.class.getName())) {
                return new SdkCoroutineWorker(context, workerParameters, xt4VarA, (su7) vz4Var.V.getValue()) { // from class: ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker
                    public final su7 g;

                    {
                        this.g = su7Var;
                    }

                    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
                    public final Object d(lq4 lq4Var) {
                        WorkerParameters workerParameters2 = this.b;
                        gm0.m("tu7", "work %s started", workerParameters2.a);
                        su7 su7Var = this.g;
                        String str6 = su7Var.b;
                        ny8 ny8Var = su7Var.h;
                        ny8 ny8Var2 = su7Var.d;
                        Log.d(str6, "onHeartbeat");
                        if (((svb) su7Var.c.getValue()).b()) {
                            long jG = ew5.g(su7Var.a.m());
                            xb9 xb9Var = ((zed) ny8Var2.getValue()).a;
                            if (Math.abs(jG - ((Number) xb9Var.y.m(xb9Var, s7f.j0[21])).longValue()) > 2.88E7d) {
                                Log.d(str6, "time since last successful request less than needed, force connection");
                                ((zed) ny8Var2.getValue()).a.D(true);
                                ((dkh) su7Var.e.getValue()).a();
                            }
                            j0d j0dVar = (j0d) ny8Var.getValue();
                            vo8 vo8Var = (vo8) j0dVar.l.m(j0dVar, j0d.n[0]);
                            if (vo8Var == null || !vo8Var.isActive()) {
                                j0d j0dVar2 = (j0d) ny8Var.getValue();
                                ((pvb) j0dVar2.d.getValue()).A(((gn8) j0dVar2.e.getValue()).a());
                                ((wzj) su7Var.f.getValue()).b();
                            }
                        }
                        ((ae9) su7Var.g.getValue()).l("heartbeat", false);
                        gm0.m("tu7", "work %s finished", workerParameters2.a);
                        return new k89();
                    }
                };
            }
            if (str.equals(DbCleanUpScheduler$DbCleanUpWorker.class.getName())) {
                return new DbCleanUpScheduler$DbCleanUpWorker(context, workerParameters, xt4VarA, (mkg) vz4Var.g.getValue(), (ed6) vz4Var.i.getValue());
            }
            if (str.equals(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class.getName())) {
                return new NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(context, workerParameters, xt4VarA, ((n0c) ((xhh) vz4Var.r.getValue())).b(), (es3) vz4Var.a.getValue(), vz4Var.a().a);
            }
            if (str.equals(MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker.class.getName())) {
                return new MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker(context, workerParameters, xt4VarA, (uoa) vz4Var.h.getValue(), vz4Var.a().b.a());
            }
            if (str.equals(UploadsCleanupScheduler$UploadsCleanupWorker.class.getName())) {
                return new UploadsCleanupScheduler$UploadsCleanupWorker(context, workerParameters, ((n0c) ((xhh) vz4Var.r.getValue())).b(), (kki) vz4Var.j.getValue(), (rs6) vz4Var.k.getValue());
            }
            if (str.equals(DownloadAttachesWorker.class.getName())) {
                return new DownloadAttachesWorker(context, workerParameters, xt4VarA, vz4Var.c, vz4Var.d, vz4Var.e, vz4Var.f, vz4Var.k, vz4Var.l, vz4Var.m, vz4Var.n, vz4Var.o, vz4Var.p, vz4Var.q, vz4Var.r, vz4Var.s, vz4Var.t, vz4Var.u, vz4Var.w, vz4Var.x, vz4Var.L, vz4Var.y);
            }
            if (str.equals(DownloadFileAttachWorker.class.getName())) {
                return new DownloadFileAttachWorker(context, workerParameters, xt4VarA, vz4Var.c, vz4Var.d, vz4Var.e, vz4Var.f, vz4Var.r, vz4Var.y, vz4Var.k, vz4Var.l, vz4Var.m, vz4Var.n, vz4Var.p, vz4Var.q, vz4Var.s, vz4Var.t, vz4Var.w, vz4Var.L);
            }
            if (str.equals(DownloadFileFromWebAppWorker.class.getName())) {
                return new DownloadFileFromWebAppWorker(context, workerParameters, xt4VarA, vz4Var.c, vz4Var.d, vz4Var.r, vz4Var.z, (os5) vz4Var.A.getValue(), vz4Var.y, vz4Var.k, vz4Var.m, (t51) vz4Var.p.getValue(), (dr6) vz4Var.q.getValue(), vz4Var.s, vz4Var.f);
            }
            if (str.equals(DownloadFileWorker.class.getName())) {
                return new DownloadFileWorker(context, workerParameters, xt4VarA, vz4Var.c, vz4Var.d, vz4Var.r, vz4Var.k, vz4Var.m, (t51) vz4Var.p.getValue(), (dr6) vz4Var.q.getValue(), vz4Var.s, vz4Var.f);
            }
            if (str.equals(UploadFileAttachWorker.class.getName())) {
                return new UploadFileAttachWorker(context, workerParameters, xt4VarA, vz4Var.c, vz4Var.d, vz4Var.p, vz4Var.B, vz4Var.C, vz4Var.b, vz4Var.D, vz4Var.E, vz4Var.F, vz4Var.G, vz4Var.f, new ifh(new d2(15, vz4Var)), vz4Var.r, vz4Var.t, vz4Var.s, vz4Var.H, vz4Var.k, vz4Var.I, vz4Var.J);
            }
            if (str.equals(BacklogWorker.class.getName())) {
                return new BacklogWorker(context, workerParameters, xt4VarA, vz4Var.r, vz4Var.K, vz4Var.y);
            }
            if (str.equals(StoryPublishWorker.class.getName())) {
                return new StoryPublishWorker(context, workerParameters, xt4VarA, vz4Var.c, vz4Var.d, vz4Var.M, vz4Var.N, vz4Var.O, vz4Var.P, vz4Var.Q, vz4Var.R, vz4Var.S, vz4Var.f, vz4Var.s);
            }
            if (str.equals(SaveStoryToGalleryWorker.class.getName())) {
                return new SaveStoryToGalleryWorker(context, workerParameters, xt4VarA, vz4Var.c, vz4Var.d, vz4Var.r, vz4Var.k, vz4Var.m, vz4Var.f, vz4Var.u, vz4Var.v, vz4Var.A, vz4Var.a().b.b());
            }
            if (str.equals(StoriesCleanupScheduler$StoriesCleanupWorker.class.getName())) {
                return new StoriesCleanupScheduler$StoriesCleanupWorker(context, workerParameters, ((n0c) ((xhh) vz4Var.r.getValue())).b(), (ltg) vz4Var.Q.getValue(), (erg) vz4Var.P.getValue(), vz4Var.a().a);
            }
            String name = vz4.class.getName();
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, name, "unknown worker ".concat(str), null);
            }
        }
        return null;
    }
}
