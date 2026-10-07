package defpackage;

import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class jhi extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ UploadFileAttachWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhi(UploadFileAttachWorker uploadFileAttachWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = uploadFileAttachWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.t(null, this);
    }
}
