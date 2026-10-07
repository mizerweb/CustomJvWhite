package defpackage;

import java.util.List;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class ln0 extends nq4 {
    public List d;
    public wfe e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ BacklogWorker h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln0(BacklogWorker backlogWorker, nq4 nq4Var) {
        super(nq4Var);
        this.h = backlogWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.l(null, this);
    }
}
