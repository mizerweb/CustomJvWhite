package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aeh extends nq4 {
    public List d;
    public ArrayList e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ceh i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeh(ceh cehVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = cehVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(null, this);
    }
}
