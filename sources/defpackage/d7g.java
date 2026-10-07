package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class d7g extends nq4 {
    public String d;
    public z4a e;
    public MediaPlayer f;
    public int g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ m7g j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7g(m7g m7gVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = m7gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return m7g.f(this.j, null, null, 0, false, this);
    }
}
