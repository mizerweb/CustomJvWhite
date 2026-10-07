package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vna extends nq4 {
    public wna d;
    public Iterator e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ wna h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vna(wna wnaVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = wnaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return wna.c(this.h, null, this);
    }
}
