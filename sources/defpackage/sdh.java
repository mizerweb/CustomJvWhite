package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sdh extends nq4 {
    public List d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vdh g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdh(vdh vdhVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = vdhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(null, this);
    }
}
