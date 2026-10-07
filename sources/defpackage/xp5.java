package defpackage;

import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class xp5 extends nq4 {
    public e70 d;
    public sfa e;
    public j60 f;
    public er5 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ DownloadAttachesWorker i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp5(DownloadAttachesWorker downloadAttachesWorker, nq4 nq4Var) {
        super(nq4Var);
        this.i = downloadAttachesWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.q(null, null, this);
    }
}
