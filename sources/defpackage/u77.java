package defpackage;

import ru.ok.tamtam.upload.workers.ForegroundWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class u77 extends nq4 {
    public ForegroundWorker d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ForegroundWorker f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u77(ForegroundWorker foregroundWorker, lq4 lq4Var) {
        super(lq4Var);
        this.f = foregroundWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.n(this);
    }
}
