package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5a b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ j5a(k5a k5aVar, Pair pair, int i) {
        this.a = i;
        this.b = k5aVar;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Pair pair = this.c;
        k5a k5aVar = this.b;
        switch (i) {
            case 0:
                ((r75) k5aVar.b.i).r(((Integer) pair.first).intValue(), (x4a) pair.second);
                break;
            default:
                ((r75) k5aVar.b.i).i(((Integer) pair.first).intValue(), (x4a) pair.second);
                break;
        }
    }
}
