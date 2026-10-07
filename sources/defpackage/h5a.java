package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5a b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ t99 d;
    public final /* synthetic */ uz9 e;

    public /* synthetic */ h5a(k5a k5aVar, Pair pair, t99 t99Var, uz9 uz9Var, int i) {
        this.a = i;
        this.b = k5aVar;
        this.c = pair;
        this.d = t99Var;
        this.e = uz9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        uz9 uz9Var = this.e;
        t99 t99Var = this.d;
        Pair pair = this.c;
        k5a k5aVar = this.b;
        switch (i) {
            case 0:
                ((r75) k5aVar.b.i).p(((Integer) pair.first).intValue(), (x4a) pair.second, t99Var, uz9Var);
                break;
            default:
                ((r75) k5aVar.b.i).q(((Integer) pair.first).intValue(), (x4a) pair.second, t99Var, uz9Var);
                break;
        }
    }
}
