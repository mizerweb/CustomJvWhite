package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.af7;
import defpackage.as5;
import defpackage.cs5;
import defpackage.dr6;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.je9;
import defpackage.jjf;
import defpackage.lq4;
import defpackage.n0c;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.or6;
import defpackage.oyj;
import defpackage.poe;
import defpackage.q18;
import defpackage.q77;
import defpackage.r77;
import defpackage.rq6;
import defpackage.sbi;
import defpackage.t51;
import defpackage.ubb;
import defpackage.vr5;
import defpackage.wjh;
import defpackage.xhh;
import defpackage.xt4;
import defpackage.zo5;
import defpackage.zr5;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.ok.tamtam.upload.workers.DownloadFileWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001dB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lubb;", "needUpdateWorkerProgressNotifUseCase", "Lr77;", "foregroundServiceVisibility", "Lny8;", "Lxhh;", "dispatchers", "Lrs6;", "fileSystem", "Lq18;", "downloader", "Lt51;", "uiBus", "Ldr6;", "fileDownloadedNotifier", "Lwd4;", "connectionInfo", "Lor6;", "fileLoadingNotifications", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lubb;Lr77;Lny8;Lny8;Lny8;Lt51;Ldr6;Lny8;Lny8;)V", "as5", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadFileWorker extends ForegroundWorker {
    public final t51 m;
    public final dr6 n;
    public final ifh o;
    public final ifh p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final AtomicInteger v;
    public long w;
    public volatile as5 x;
    public File y;
    public final cs5 z;

    public DownloadFileWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ubb ubbVar, r77 r77Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, t51 t51Var, dr6 dr6Var, ny8 ny8Var4, ny8 ny8Var5) {
        super(context, workerParameters, xt4Var, ubbVar, r77Var);
        this.m = t51Var;
        this.n = dr6Var;
        final int i = 0;
        this.o = new ifh(new af7(this) { // from class: ur5
            public final /* synthetic */ DownloadFileWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                DownloadFileWorker downloadFileWorker = this.b;
                switch (i2) {
                    case 0:
                        d25 d25Var = downloadFileWorker.b.b;
                        long jC = d25Var.c("requestId", 0L);
                        String strD = d25Var.d("fileName");
                        String str = strD == null ? "" : strD;
                        String strD2 = d25Var.d("fileUrl");
                        String str2 = strD2 == null ? "" : strD2;
                        String strD3 = d25Var.d("notifTitle");
                        return new wjh(jC, str2, str, strD3 == null ? "" : strD3);
                    default:
                        return Integer.valueOf((downloadFileWorker.o().b.hashCode() * 31) + 366385607);
                }
            }
        });
        final int i2 = 1;
        this.p = new ifh(new af7(this) { // from class: ur5
            public final /* synthetic */ DownloadFileWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                DownloadFileWorker downloadFileWorker = this.b;
                switch (i3) {
                    case 0:
                        d25 d25Var = downloadFileWorker.b.b;
                        long jC = d25Var.c("requestId", 0L);
                        String strD = d25Var.d("fileName");
                        String str = strD == null ? "" : strD;
                        String strD2 = d25Var.d("fileUrl");
                        String str2 = strD2 == null ? "" : strD2;
                        String strD3 = d25Var.d("notifTitle");
                        return new wjh(jC, str2, str, strD3 == null ? "" : strD3);
                    default:
                        return Integer.valueOf((downloadFileWorker.o().b.hashCode() * 31) + 366385607);
                }
            }
        });
        this.q = ny8Var2;
        this.r = ny8Var3;
        this.s = ny8Var;
        this.t = ny8Var4;
        this.u = ny8Var5;
        this.v = new AtomicInteger();
        this.z = new cs5(this);
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* JADX INFO: renamed from: e */
    public final xt4 getI() {
        return ((n0c) ((xhh) this.s.getValue())).d();
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object g(int i, lq4 lq4Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileWorker", zo5.h(i, "File download. onStopWork with reason "), null);
            }
        }
        t51 t51Var = this.m;
        long jB = o().b();
        o().getClass();
        t51Var.c(new rq6(jB));
        this.x = vr5.a;
        q18 q18Var = (q18) this.r.getValue();
        File file = this.y;
        if (file == null) {
            file = null;
        }
        Object objC = q18Var.c(file, null, (nq4) lq4Var);
        return objC == hu4.a ? objC : sbi.a;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object j(lq4 lq4Var) {
        int iA;
        long jB;
        Object poeVar;
        PendingIntent pendingIntentA = oyj.d(this.a).a(this.b.a);
        as5 as5Var = this.x;
        File file = null;
        zr5 zr5Var = as5Var instanceof zr5 ? (zr5) as5Var : null;
        if (zr5Var != null) {
            iA = zr5Var.a();
            jB = zr5Var.b();
        } else {
            iA = -1;
            jB = 0;
        }
        int i = iA;
        long j = jB;
        Context context = this.a;
        ((or6) this.u.getValue()).getClass();
        String string = context.getString(R.string.tt_notification_file_downloading_title);
        or6 or6Var = (or6) this.u.getValue();
        String strA = o().a();
        try {
            File file2 = this.y;
            if (file2 != null) {
                file = file2;
            }
            poeVar = file.getName();
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = "";
        }
        return new q77(((Number) this.p.getValue()).intValue(), or6Var.c(strA, j, string + " " + poeVar, i, pendingIntentA), jjf.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0109 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010f A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0119 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0128 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012e A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x003f, B:39:0x00bc, B:41:0x00c2, B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:49:0x00ed, B:51:0x00f7, B:53:0x00ff, B:55:0x0109, B:57:0x010f, B:59:0x0119, B:63:0x0124, B:65:0x0128, B:67:0x012e, B:68:0x0133, B:69:0x0134, B:20:0x0047, B:36:0x0099, B:33:0x006d), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0194, code lost:
    
        if (r0 == r2) goto L90;
     */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileWorker.k(nq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String l() {
        String strD = this.b.b.d("taskName");
        return strD == null ? "workers:DownloadFileWorker" : strD;
    }

    public final wjh o() {
        return (wjh) this.o.getValue();
    }
}
