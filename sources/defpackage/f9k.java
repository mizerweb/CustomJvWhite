package defpackage;

import com.vk.push.common.clientid.ClientId;

/* JADX INFO: loaded from: classes3.dex */
public final class f9k extends nq4 {
    public q9k d;
    public ClientId e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public /* synthetic */ Object o;
    public final /* synthetic */ q9k p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9k(q9k q9kVar, lq4 lq4Var) {
        super(lq4Var);
        this.p = q9kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(this);
    }
}
