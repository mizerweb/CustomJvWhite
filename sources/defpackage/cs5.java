package defpackage;

import android.os.Build;
import java.io.File;
import ru.ok.tamtam.upload.workers.DownloadFileWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class cs5 implements o18 {
    public final /* synthetic */ DownloadFileWorker a;

    public cs5(DownloadFileWorker downloadFileWorker) {
        this.a = downloadFileWorker;
    }

    @Override // defpackage.o18
    public final Object a(nq4 nq4Var) {
        DownloadFileWorker downloadFileWorker = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileWorker", "onFileDownloadCancelled: " + downloadFileWorker.o(), null);
            }
        }
        DownloadFileWorker downloadFileWorker2 = this.a;
        t51 t51Var = downloadFileWorker2.m;
        long j = downloadFileWorker2.o().a;
        String str = this.a.o().b;
        t51Var.c(new rq6(j));
        this.a.x = vr5.a;
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object b(nq4 nq4Var) {
        DownloadFileWorker downloadFileWorker = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileWorker", "onFileDownloadFailed: " + downloadFileWorker.o(), null);
            }
        }
        DownloadFileWorker downloadFileWorker2 = this.a;
        t51 t51Var = downloadFileWorker2.m;
        long j = downloadFileWorker2.o().a;
        String str = this.a.o().b;
        t51Var.c(new tq6(j));
        this.a.x = xr5.a;
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object c(nq4 nq4Var, String str, boolean z, boolean z2) {
        DownloadFileWorker downloadFileWorker = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileWorker", "onFileDownloadInterrupted: " + downloadFileWorker.o() + ", isNetworkProblem:" + z + ", retryCount:" + downloadFileWorker.v.get(), null);
            }
        }
        DownloadFileWorker downloadFileWorker2 = this.a;
        t51 t51Var = downloadFileWorker2.m;
        long j = downloadFileWorker2.o().a;
        String str2 = this.a.o().b;
        t51Var.c(new tq6(j));
        this.a.x = (!z || (z ? this.a.v.incrementAndGet() : 0) > 10) ? new yr5(false) : new yr5(true);
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object e(float f, long j, long j2, nq4 nq4Var) {
        Object objN;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        DownloadFileWorker downloadFileWorker = this.a;
        if (jCurrentTimeMillis - downloadFileWorker.w >= 500) {
            downloadFileWorker.w = jCurrentTimeMillis;
            int i = 0;
            if (!Float.isNaN(f)) {
                int iK = gm0.K(f);
                if (iK < 0) {
                    i = -1;
                } else if (iK != 0) {
                    i = (1 > iK || iK >= 101) ? 100 : iK;
                }
            }
            downloadFileWorker.x = new zr5(i, this.a.o().e);
            as5 as5Var = this.a.x;
            zr5 zr5Var = as5Var instanceof zr5 ? (zr5) as5Var : null;
            if (zr5Var == null) {
                gm0.Y("workers:DownloadFileWorker", "Early return in onFileDownloadProgress cuz of state as? State.Loading is null");
                return sbiVar;
            }
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "workers:DownloadFileWorker", "update notification ".concat(ezl.e(zr5Var.a)), null);
                }
            }
            DownloadFileWorker downloadFileWorker2 = this.a;
            if ((!downloadFileWorker2.m(zr5Var.a) && Build.VERSION.SDK_INT < 34) || (objN = downloadFileWorker2.n(nq4Var)) != hu4Var) {
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
        DownloadFileWorker downloadFileWorker = this.a;
        return downloadFileWorker.o().b + downloadFileWorker.o().e;
    }

    @Override // defpackage.o18
    public final Object g(File file, nq4 nq4Var) {
        gm0.m("workers:DownloadFileWorker", "onFileDownloadCompleted: %s", this.a.o());
        if (file != null) {
            DownloadFileWorker downloadFileWorker = this.a;
            t51 t51Var = downloadFileWorker.m;
            long j = downloadFileWorker.o().a;
            String str = this.a.o().b;
            t51Var.c(new uq6(file, j));
            this.a.n.b(file);
        }
        this.a.x = wr5.a;
        return sbi.a;
    }
}
