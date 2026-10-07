package defpackage;

import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class c0c extends nq4 {
    public mm9 d;
    public vg4 e;
    public MessageModel f;
    public MessageModel g;
    public MessageModel h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d0c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0c(d0c d0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = d0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(null, this);
    }
}
