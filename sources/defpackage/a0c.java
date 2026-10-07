package defpackage;

import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class a0c extends nq4 {
    public mm9 d;
    public MessageModel e;
    public MessageModel f;
    public wfe g;
    public /* synthetic */ Object h;
    public final /* synthetic */ d0c i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0c(d0c d0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = d0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(null, null, null, this);
    }
}
