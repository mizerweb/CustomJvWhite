package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class tr5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ DownloadFileFromWebAppWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr5(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = downloadFileFromWebAppWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(0, this);
    }
}
