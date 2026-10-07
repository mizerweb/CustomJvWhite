package defpackage;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wbk implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ybk b;

    public /* synthetic */ wbk(ybk ybkVar, int i) {
        this.a = i;
        this.b = ybkVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean z;
        int i = this.a;
        ybk ybkVar = this.b;
        switch (i) {
            case 0:
                Long l = (Long) obj;
                if (!ybkVar.f.containsKey(l)) {
                    return false;
                }
                zbk zbkVar = (zbk) ybkVar.f.get(l);
                synchronized (zbkVar) {
                    z = zbkVar.e;
                }
                return !z;
            default:
                return ((zbk) obj).b.p().longValue() <= ybkVar.h;
        }
    }
}
