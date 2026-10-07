package defpackage;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk3 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ hk3(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) throws Exception {
        int i = this.a;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((w03) cf7Var).invoke(obj)).booleanValue();
            case 1:
                ((g3) cf7Var).invoke(obj);
                return Boolean.FALSE.booleanValue();
            default:
                return ((Boolean) ((lh3) cf7Var).invoke(obj)).booleanValue();
        }
    }
}
