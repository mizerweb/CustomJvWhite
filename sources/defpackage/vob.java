package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vob extends nq4 {
    public List d;
    public List e;
    public ArrayList f;
    public Iterator g;
    public hn6 h;
    public cpb i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yob l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vob(yob yobVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = yobVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return yob.c(this.l, null, null, false, this);
    }
}
