package defpackage;

import com.vk.push.common.AppInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class v6k extends nq4 {
    public n7k d;
    public AppInfo e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ n7k h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6k(n7k n7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = n7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(null, false, this);
    }
}
