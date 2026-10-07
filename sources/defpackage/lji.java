package defpackage;

import one.video.transloader.task.UploadTask;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lji implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadTask b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ lji(UploadTask uploadTask, Throwable th, int i) {
        this.a = i;
        this.b = uploadTask;
        this.c = th;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Throwable th = this.c;
        UploadTask uploadTask = this.b;
        switch (i) {
            case 0:
                uploadTask.d(new fji(th));
                break;
            case 1:
                uploadTask.d(new fji(th));
                break;
            case 2:
                uploadTask.d(new fji(th));
                break;
            default:
                uploadTask.d(new fji(th));
                break;
        }
        return sbiVar;
    }
}
