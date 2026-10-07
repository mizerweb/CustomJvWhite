package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class iv8 extends nq4 {
    public w65 d;
    public s84 e;
    public LinkedHashMap f;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ s84 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv8(s84 s84Var, mq0 mq0Var) {
        super(mq0Var);
        this.i = s84Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return s84.a(this.i, null, this);
    }
}
