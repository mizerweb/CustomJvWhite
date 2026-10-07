package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class phi extends nq4 {
    public AtomicLong d;
    public UploadFileAttachWorker e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ UploadFileAttachWorker h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phi(UploadFileAttachWorker uploadFileAttachWorker, lq4 lq4Var) {
        super(lq4Var);
        this.h = uploadFileAttachWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.x(null, this);
    }
}
