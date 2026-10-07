package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class bs5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ DownloadFileWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs5(DownloadFileWorker downloadFileWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = downloadFileWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.k(this);
    }
}
