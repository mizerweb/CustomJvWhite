package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uib extends nq4 {
    public Map d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vib g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uib(vib vibVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = vibVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
