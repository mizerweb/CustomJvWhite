package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class yp5 implements o18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadAttachesWorker b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yp5(DownloadAttachesWorker downloadAttachesWorker, Object obj, int i) {
        this.a = i;
        this.b = downloadAttachesWorker;
        this.c = obj;
    }

    @Override // defpackage.o18
    public final Object e(float f, long j, long j2, nq4 nq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.c;
        DownloadAttachesWorker downloadAttachesWorker = this.b;
        switch (i) {
            case 0:
                downloadAttachesWorker.J.put(new Long(((j60) obj).a), new Float(f));
                Object objN = downloadAttachesWorker.n(nq4Var);
                return objN == hu4Var ? objN : sbiVar;
            default:
                downloadAttachesWorker.J.put(new Long(((e70) obj).d.a), new Float(f));
                Object objN2 = downloadAttachesWorker.n(nq4Var);
                return objN2 == hu4Var ? objN2 : sbiVar;
        }
    }

    @Override // defpackage.o18
    public final String f() {
        switch (this.a) {
        }
        return null;
    }

    @Override // defpackage.o18
    public final Object g(File file, nq4 nq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.c;
        DownloadAttachesWorker downloadAttachesWorker = this.b;
        switch (i) {
            case 0:
                downloadAttachesWorker.J.put(new Long(((j60) obj).a), new Float(100.0f));
                Object objN = downloadAttachesWorker.n(nq4Var);
                return objN == hu4Var ? objN : sbiVar;
            default:
                downloadAttachesWorker.J.put(new Long(((e70) obj).d.a), new Float(100.0f));
                Object objN2 = downloadAttachesWorker.n(nq4Var);
                return objN2 == hu4Var ? objN2 : sbiVar;
        }
    }
}
