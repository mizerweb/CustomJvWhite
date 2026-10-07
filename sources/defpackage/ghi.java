package defpackage;

import android.app.PendingIntent;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class ghi extends nq4 {
    public PendingIntent d;
    public rt2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ UploadFileAttachWorker g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghi(UploadFileAttachWorker uploadFileAttachWorker, nq4 nq4Var) {
        super(nq4Var);
        this.g = uploadFileAttachWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.j(this);
    }
}
