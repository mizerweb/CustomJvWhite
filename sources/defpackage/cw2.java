package defpackage;

import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw2 implements LongFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cw2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((bi4) ((qw2) obj).t.get()).f(j, true);
            case 1:
                return (vg4) ((cw2) obj).apply(j);
            case 2:
                return ((bi4) ((ny2) obj).b.getValue()).f(j, true);
            default:
                return ((bi4) ((qw2) ((h03) obj)).t.get()).f(j, true);
        }
    }
}
