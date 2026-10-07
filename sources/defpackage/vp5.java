package defpackage;

import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class vp5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ DownloadAttachesWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp5(DownloadAttachesWorker downloadAttachesWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = downloadAttachesWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.k(this);
    }
}
