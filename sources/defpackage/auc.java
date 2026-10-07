package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class auc extends nq4 {
    public List d;
    public List e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public HashMap j;
    public HashMap k;
    public Iterator l;
    public Iterator m;
    public rtc n;
    public rtc o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ku6 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auc(ku6 ku6Var, nq4 nq4Var) {
        super(nq4Var);
        this.u = ku6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.n(null, null, false, this);
    }
}
