package defpackage;

import com.vk.push.common.AppInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class t6k extends nq4 {
    public Object d;
    public Object e;
    public Object f;
    public AppInfo g;
    public /* synthetic */ Object h;
    public final /* synthetic */ n7k i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6k(n7k n7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = n7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.e(this);
    }
}
