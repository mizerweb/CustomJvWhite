package defpackage;

import android.util.MutableBoolean;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class axe extends nq4 {
    public long d;
    public ArrayList e;
    public m8b f;
    public m8b g;
    public MutableBoolean h;
    public tjh i;
    public btc j;
    public wfe k;
    public Serializable l;
    public wfe m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ dxe q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axe(dxe dxeVar, nq4 nq4Var) {
        super(nq4Var);
        this.q = dxeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.h(0L, null, null, null, null, this);
    }
}
