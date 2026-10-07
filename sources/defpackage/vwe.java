package defpackage;

import android.util.MutableBoolean;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vwe extends nq4 {
    public int d;
    public int e;
    public Throwable f;
    public ArrayList g;
    public m8b h;
    public m8b i;
    public MutableBoolean j;
    public Iterator k;
    public Iterator l;
    public tjh m;
    public /* synthetic */ Object n;
    public final /* synthetic */ dxe o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwe(dxe dxeVar, nq4 nq4Var) {
        super(nq4Var);
        this.o = dxeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return dxe.a(this.o, this);
    }
}
