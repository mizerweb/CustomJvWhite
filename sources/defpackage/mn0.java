package defpackage;

import ru.ok.tamtam.workmanager.BacklogWorker;

/* JADX INFO: loaded from: classes.dex */
public final class mn0 extends nq4 {
    public wfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ BacklogWorker f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(BacklogWorker backlogWorker, nq4 nq4Var) {
        super(nq4Var);
        this.f = backlogWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.m(this);
    }
}
