package defpackage;

import android.os.Build;
import java.io.File;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class sr5 implements o18 {
    public final /* synthetic */ DownloadFileFromWebAppWorker a;

    public sr5(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker) {
        this.a = downloadFileFromWebAppWorker;
    }

    @Override // defpackage.o18
    public final Object a(nq4 nq4Var) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileFromWebAppWorker", "onFileDownloadCancelled: " + downloadFileFromWebAppWorker.o(), null);
            }
        }
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker2 = this.a;
        qrc.o(downloadFileFromWebAppWorker2.m, ls5.USER_CANCELLED, downloadFileFromWebAppWorker2.z, null, null, 28);
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker3 = this.a;
        t51 t51Var = downloadFileFromWebAppWorker3.n;
        long j = downloadFileFromWebAppWorker3.o().a;
        String str = this.a.o().c;
        t51Var.c(new rq6(j));
        this.a.A = lr5.a;
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object b(nq4 nq4Var) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileFromWebAppWorker", "onFileDownloadFailed: " + downloadFileFromWebAppWorker.o(), null);
            }
        }
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker2 = this.a;
        t51 t51Var = downloadFileFromWebAppWorker2.n;
        long j = downloadFileFromWebAppWorker2.o().a;
        String str = this.a.o().c;
        t51Var.c(new tq6(j));
        this.a.A = nr5.a;
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object c(nq4 nq4Var, String str, boolean z, boolean z2) {
        or5 or5Var;
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileFromWebAppWorker", "onFileDownloadInterrupted: " + downloadFileFromWebAppWorker.o() + ", isNetworkProblem:" + z + ", retryCount:" + downloadFileFromWebAppWorker.x.get(), null);
            }
        }
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker2 = this.a;
        t51 t51Var = downloadFileFromWebAppWorker2.n;
        long j = downloadFileFromWebAppWorker2.o().a;
        String str2 = this.a.o().c;
        t51Var.c(new tq6(j));
        int iIncrementAndGet = z ? this.a.x.incrementAndGet() : 0;
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker3 = this.a;
        if (!z || iIncrementAndGet > 10) {
            os5 os5Var = downloadFileFromWebAppWorker3.m;
            if (z2) {
                qrc.o(os5Var, ls5.NOT_ENOUGH_SPACE, downloadFileFromWebAppWorker3.z, null, null, 28);
            } else {
                qrc.o(os5Var, ls5.INTERRUPTED_UNKNOWN, downloadFileFromWebAppWorker3.z, null, str, 20);
            }
            or5Var = new or5(false);
        } else {
            or5Var = new or5(true);
        }
        downloadFileFromWebAppWorker3.A = or5Var;
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object d(nq4 nq4Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileFromWebAppWorker", "onUrlExpired", null);
            }
        }
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        qrc.o(downloadFileFromWebAppWorker.m, ls5.URL_EXPIRED_FOR_NON_AUDIO, downloadFileFromWebAppWorker.z, null, null, 28);
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker2 = this.a;
        t51 t51Var = downloadFileFromWebAppWorker2.n;
        long j = downloadFileFromWebAppWorker2.o().a;
        String str = this.a.o().c;
        t51Var.c(new tq6(j));
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object e(float f, long j, long j2, nq4 nq4Var) {
        int i;
        Object objN;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        if (jCurrentTimeMillis - downloadFileFromWebAppWorker.y >= 500) {
            downloadFileFromWebAppWorker.y = jCurrentTimeMillis;
            int i2 = 0;
            if (Float.isNaN(f)) {
                i = i2;
            } else {
                int iK = gm0.K(f);
                if (iK < 0) {
                    i2 = -1;
                } else if (iK != 0) {
                    if (1 > iK || iK >= 101) {
                        i2 = 100;
                    } else {
                        i = iK;
                    }
                }
                i = i2;
            }
            downloadFileFromWebAppWorker.A = new pr5(i, this.a.o().e, this.a.o().b);
            qr5 qr5Var = this.a.A;
            pr5 pr5Var = qr5Var instanceof pr5 ? (pr5) qr5Var : null;
            if (pr5Var == null) {
                gm0.Y("workers:DownloadFileFromWebAppWorker", "Early return in onFileDownloadProgress cuz of state as? State.Loading is null");
                return sbiVar;
            }
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "workers:DownloadFileFromWebAppWorker", "update notification ".concat(ezl.e(pr5Var.a)), null);
                }
            }
            DownloadFileFromWebAppWorker downloadFileFromWebAppWorker2 = this.a;
            if ((!downloadFileFromWebAppWorker2.m(pr5Var.a) && Build.VERSION.SDK_INT < 34) || (objN = downloadFileFromWebAppWorker2.n(nq4Var)) != hu4Var) {
                objN = sbiVar;
            }
            if (objN == hu4Var) {
                return objN;
            }
        }
        return sbiVar;
    }

    @Override // defpackage.o18
    public final String f() {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        long j = downloadFileFromWebAppWorker.o().b;
        long j2 = downloadFileFromWebAppWorker.o().e;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(j2);
        return sb.toString();
    }

    @Override // defpackage.o18
    public final Object g(File file, nq4 nq4Var) {
        gm0.m("workers:DownloadFileFromWebAppWorker", "onFileDownloadCompleted: %s", this.a.o());
        if (file != null) {
            DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
            t51 t51Var = downloadFileFromWebAppWorker.n;
            long j = downloadFileFromWebAppWorker.o().a;
            String str = this.a.o().c;
            t51Var.c(new uq6(file, j));
            this.a.o.b(file);
        }
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker2 = this.a;
        downloadFileFromWebAppWorker2.m.B(downloadFileFromWebAppWorker2.z);
        this.a.A = mr5.a;
        return sbi.a;
    }
}
