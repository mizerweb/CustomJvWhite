package defpackage;

import java.util.concurrent.Future;
import one.video.transloader.task.UploadTask;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i0i implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadTask b;

    public /* synthetic */ i0i(UploadTask uploadTask, int i) {
        this.a = i;
        this.b = uploadTask;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Long lValueOf;
        int i = this.a;
        UploadTask uploadTask = this.b;
        switch (i) {
            case 0:
                uploadTask.verifyThread("one.video.transloader.task.UploadTask.startUploadCompleteFile");
                uploadTask.a.b("UploadTask", new yfi(1));
                if (!uploadTask.b()) {
                    try {
                        lValueOf = Long.valueOf(uploadTask.e.length());
                    } catch (Throwable th) {
                        uploadTask.a.r("UploadTask", new yfi(3), new bpg(19, th));
                        if (!uploadTask.b()) {
                            Future future = uploadTask.n;
                            if (future != null) {
                                future.cancel(true);
                            }
                            uploadTask.d(new fji(th));
                            lValueOf = null;
                        }
                        return sbi.a;
                    }
                    if (lValueOf != null) {
                        uploadTask.f();
                        uploadTask.c(lValueOf.longValue(), true);
                    }
                    break;
                }
                return sbi.a;
            case 1:
                uploadTask.d(dji.a);
                return sbi.a;
            case 2:
                uploadTask.d(new eji(uploadTask.m));
                return sbi.a;
            case 3:
                return "cancel, current state: " + uploadTask.l;
            case 4:
                uploadTask.d(hji.a);
                return sbi.a;
            default:
                uploadTask.d(dji.a);
                return sbi.a;
        }
    }
}
