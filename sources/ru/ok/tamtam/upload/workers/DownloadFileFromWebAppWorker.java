package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.af7;
import defpackage.ch3;
import defpackage.dr6;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.je9;
import defpackage.jjf;
import defpackage.lq4;
import defpackage.lr5;
import defpackage.ls5;
import defpackage.n0c;
import defpackage.no4;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.or6;
import defpackage.ore;
import defpackage.os5;
import defpackage.oyj;
import defpackage.poe;
import defpackage.pr5;
import defpackage.q18;
import defpackage.q77;
import defpackage.qr5;
import defpackage.qrc;
import defpackage.r77;
import defpackage.rq6;
import defpackage.sbi;
import defpackage.sr5;
import defpackage.t51;
import defpackage.tr5;
import defpackage.ubb;
import defpackage.vg4;
import defpackage.xhh;
import defpackage.xjh;
import defpackage.xt4;
import defpackage.zo5;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001#B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileFromWebAppWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lubb;", "needUpdateWorkerProgressNotifUseCase", "Lr77;", "foregroundServiceVisibility", "Lny8;", "Lxhh;", "dispatchers", "Lno4;", "contactsRepository", "Los5;", "downloadPerfRegistrar", "Le5d;", "pmsProperties", "Lrs6;", "fileSystem", "Lq18;", "downloader", "Lt51;", "uiBus", "Ldr6;", "fileDownloadedNotifier", "Lwd4;", "connectionInfo", "Lor6;", "fileLoadingNotifications", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lubb;Lr77;Lny8;Lny8;Los5;Lny8;Lny8;Lny8;Lt51;Ldr6;Lny8;Lny8;)V", "qr5", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadFileFromWebAppWorker extends ForegroundWorker {
    public volatile qr5 A;
    public File B;
    public final sr5 C;
    public final os5 m;
    public final t51 n;
    public final dr6 o;
    public final ifh p;
    public final ifh q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public final AtomicInteger x;
    public long y;
    public volatile String z;

    public DownloadFileFromWebAppWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ubb ubbVar, r77 r77Var, ny8 ny8Var, ny8 ny8Var2, os5 os5Var, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, t51 t51Var, dr6 dr6Var, ny8 ny8Var6, ny8 ny8Var7) {
        super(context, workerParameters, xt4Var, ubbVar, r77Var);
        this.m = os5Var;
        this.n = t51Var;
        this.o = dr6Var;
        final int i = 0;
        this.p = new ifh(new af7(this) { // from class: kr5
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                switch (i2) {
                    case 0:
                        d25 d25Var = downloadFileFromWebAppWorker.b.b;
                        long jC = d25Var.c("requestId", 0L);
                        long jC2 = d25Var.c("botId", 0L);
                        String strD = d25Var.d("fileName");
                        String str = strD == null ? "" : strD;
                        String strD2 = d25Var.d("fileUrl");
                        return new xjh(jC, jC2, strD2 == null ? "" : strD2, str);
                    default:
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.o().b) * 31) + (downloadFileFromWebAppWorker.o().c.hashCode() * 31) + 1500490718);
                }
            }
        });
        final int i2 = 1;
        this.q = new ifh(new af7(this) { // from class: kr5
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                switch (i3) {
                    case 0:
                        d25 d25Var = downloadFileFromWebAppWorker.b.b;
                        long jC = d25Var.c("requestId", 0L);
                        long jC2 = d25Var.c("botId", 0L);
                        String strD = d25Var.d("fileName");
                        String str = strD == null ? "" : strD;
                        String strD2 = d25Var.d("fileUrl");
                        return new xjh(jC, jC2, strD2 == null ? "" : strD2, str);
                    default:
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.o().b) * 31) + (downloadFileFromWebAppWorker.o().c.hashCode() * 31) + 1500490718);
                }
            }
        });
        this.r = ny8Var4;
        this.s = ny8Var5;
        this.t = ny8Var;
        this.u = ny8Var6;
        this.v = ny8Var2;
        this.w = ny8Var7;
        this.x = new AtomicInteger();
        this.z = "";
        this.C = new sr5(this);
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* JADX INFO: renamed from: e */
    public final xt4 getI() {
        return ((n0c) ((xhh) this.t.getValue())).d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object g(int i, lq4 lq4Var) {
        tr5 tr5Var;
        if (lq4Var instanceof tr5) {
            tr5Var = (tr5) lq4Var;
            int i2 = tr5Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tr5Var.f = i2 - Integer.MIN_VALUE;
            } else {
                tr5Var = new tr5(this, (nq4) lq4Var);
            }
        } else {
            tr5Var = new tr5(this, (nq4) lq4Var);
        }
        Object obj = tr5Var.d;
        hu4 hu4Var = hu4.a;
        int i3 = tr5Var.f;
        if (i3 == 0) {
            ch3.d0(obj);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "workers:DownloadFileFromWebAppWorker", zo5.h(i, "File download. onStopWork with reason "), null);
                }
            }
            t51 t51Var = this.n;
            long jB = o().b();
            o().getClass();
            t51Var.c(new rq6(jB));
            this.A = lr5.a;
            q18 q18Var = (q18) this.s.getValue();
            File file = this.B;
            if (file == null) {
                file = null;
            }
            tr5Var.f = 1;
            if (q18Var.c(file, null, tr5Var) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        qrc.o(this.m, ls5.USER_CANCELLED, this.z, null, null, 28);
        return sbi.a;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object j(lq4 lq4Var) {
        int iB;
        long jA;
        long jC;
        Object poeVar;
        PendingIntent pendingIntentA = oyj.d(this.a).a(this.b.a);
        qr5 qr5Var = this.A;
        File file = null;
        pr5 pr5Var = qr5Var instanceof pr5 ? (pr5) qr5Var : null;
        if (pr5Var != null) {
            iB = pr5Var.b();
            jC = pr5Var.c();
            jA = pr5Var.a();
        } else {
            iB = -1;
            jA = 0;
            jC = 0;
        }
        int i = iB;
        Context context = this.a;
        ((or6) this.w.getValue()).getClass();
        String string = context.getString(R.string.tt_notification_file_downloading_title);
        vg4 vg4Var = (vg4) ((no4) this.v.getValue()).j(jA).a.getValue();
        String strK = vg4Var != null ? vg4Var.k() : null;
        or6 or6Var = (or6) this.w.getValue();
        try {
            File file2 = this.B;
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
        return new q77(((Number) this.q.getValue()).intValue(), or6Var.b(jA, strK, jC, string + " " + poeVar, i, pendingIntentA), jjf.a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0115 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011b A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0123 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x012a A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0136 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013e A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0148 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014e A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0158 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0167 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016e A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0043, B:48:0x00f8, B:50:0x00fe, B:52:0x0115, B:54:0x011b, B:56:0x0123, B:57:0x012a, B:59:0x0136, B:61:0x013e, B:62:0x0148, B:64:0x014e, B:65:0x0158, B:69:0x0163, B:71:0x0167, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:20:0x004b, B:45:0x00d5, B:42:0x00a9), top: B:98:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d4, code lost:
    
        if (r2 == r4) goto L95;
     */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker.k(nq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String l() {
        String strD = this.b.b.d("taskName");
        return strD == null ? "workers:DownloadFileFromWebAppWorker" : strD;
    }

    public final xjh o() {
        return (xjh) this.p.getValue();
    }
}
