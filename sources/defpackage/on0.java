package defpackage;

import java.util.List;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* JADX INFO: loaded from: classes.dex */
public final class on0 extends nq4 {
    public List d;
    public int e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ BacklogWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on0(BacklogWorker backlogWorker, nq4 nq4Var) {
        super(nq4Var);
        this.j = backlogWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.o(null, this);
    }
}
