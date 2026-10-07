package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class ir5 extends nq4 {
    public ufe d;
    public vfe e;
    public vfe f;
    public DownloadFileAttachWorker g;
    public /* synthetic */ Object h;
    public final /* synthetic */ DownloadFileAttachWorker i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir5(DownloadFileAttachWorker downloadFileAttachWorker, nq4 nq4Var) {
        super(nq4Var);
        this.i = downloadFileAttachWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.j(this);
    }
}
