package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class b0c extends nq4 {
    public rt2 d;
    public List e;
    public MessageModel f;
    public wfe g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ d0c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0c(d0c d0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = d0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(null, 0, null, this);
    }
}
