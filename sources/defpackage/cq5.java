package defpackage;

import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class cq5 extends nq4 {
    public e70 d;
    public sfa e;
    public /* synthetic */ Object f;
    public final /* synthetic */ DownloadAttachesWorker g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq5(DownloadAttachesWorker downloadAttachesWorker, nq4 nq4Var) {
        super(nq4Var);
        this.g = downloadAttachesWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.s(null, null, this);
    }
}
