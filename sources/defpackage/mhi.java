package defpackage;

import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class mhi extends nq4 {
    public String d;
    public vfi e;
    public long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ UploadFileAttachWorker i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhi(UploadFileAttachWorker uploadFileAttachWorker, lq4 lq4Var) {
        super(lq4Var);
        this.i = uploadFileAttachWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.v(null, this);
    }
}
