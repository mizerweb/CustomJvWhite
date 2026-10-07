package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class jr5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ DownloadFileAttachWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr5(DownloadFileAttachWorker downloadFileAttachWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = downloadFileAttachWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.k(this);
    }
}
