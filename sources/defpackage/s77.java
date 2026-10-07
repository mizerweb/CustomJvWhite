package defpackage;

import ru.ok.tamtam.upload.workers.ForegroundWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class s77 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ForegroundWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s77(ForegroundWorker foregroundWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = foregroundWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
