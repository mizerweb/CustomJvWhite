package defpackage;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m42 extends mdh implements wf7 {
    public final /* synthetic */ n42 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m42(n42 n42Var, lq4 lq4Var) {
        super(5, lq4Var);
        this.e = n42Var;
    }

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        return new m42(this.e, (lq4) serializable).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        Set set = n42.g;
        return this.e.b();
    }
}
