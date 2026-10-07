package defpackage;

import java.time.Instant;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class baf implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ baf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                return !ch3.r(str) && ((daf) this.b).g(str, (String) this.c);
            case 1:
                ybk ybkVar = (ybk) this.b;
                zbk zbkVar = (zbk) obj;
                return zbkVar.b.p().longValue() <= ybkVar.h - 3 || (zbkVar.b.p().longValue() <= ybkVar.h && zbkVar.a.isBefore((Instant) this.c));
            default:
                return ((BiPredicate) this.b).test((String) ((Map.Entry) this.c).getKey(), (String) obj);
        }
    }
}
