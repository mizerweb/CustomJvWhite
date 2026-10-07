package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hah extends nq4 {
    public List d;
    public Map e;
    public /* synthetic */ Object f;
    public final /* synthetic */ jah g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hah(jah jahVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = jahVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return jah.b(this.g, null, null, this);
    }
}
