package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes3.dex */
public final class pyf extends nq4 {
    public ShareData d;
    public List e;
    public List f;
    public String g;
    public List h;
    public g4b i;
    public u8b j;
    public Collection k;
    public Iterator l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ qyf q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyf(qyf qyfVar, nq4 nq4Var) {
        super(nq4Var);
        this.q = qyfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, null, null, null, null, this);
    }
}
