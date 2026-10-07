package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5a b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ uz9 d;

    public /* synthetic */ g5a(k5a k5aVar, Pair pair, uz9 uz9Var, int i) {
        this.a = i;
        this.b = k5aVar;
        this.c = pair;
        this.d = uz9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        uz9 uz9Var = this.d;
        Pair pair = this.c;
        k5a k5aVar = this.b;
        switch (i) {
            case 0:
                r75 r75Var = (r75) k5aVar.b.i;
                int iIntValue = ((Integer) pair.first).intValue();
                x4a x4aVar = (x4a) pair.second;
                x4aVar.getClass();
                r75Var.b(iIntValue, x4aVar, uz9Var);
                break;
            default:
                ((r75) k5aVar.b.i).o(((Integer) pair.first).intValue(), (x4a) pair.second, uz9Var);
                break;
        }
    }
}
