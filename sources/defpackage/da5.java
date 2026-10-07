package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class da5 implements dv5 {
    public final av5 a;
    public xu5 b;
    public boolean c;
    public final /* synthetic */ ea5 d;

    public da5(ea5 ea5Var, av5 av5Var) {
        this.d = ea5Var;
        this.a = av5Var;
    }

    @Override // defpackage.dv5
    public final void release() {
        Handler handler = this.d.u;
        handler.getClass();
        vqi.d0(handler, new jj2(15, this));
    }
}
