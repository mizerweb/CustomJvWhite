package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fdh extends nq4 {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ldh f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdh(ldh ldhVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = ldhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ldh.d(this.f, null, this);
    }
}
