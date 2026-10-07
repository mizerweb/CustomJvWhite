package defpackage;

import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d6 implements ToLongFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((Number) p6.b.get(obj)).longValue();
            default:
                return ((ex2) obj).a;
        }
    }
}
