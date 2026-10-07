package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ekf extends nq4 {
    public List d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ fkf g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekf(fkf fkfVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = fkfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return fkf.C(this.g, null, this);
    }
}
