package defpackage;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cp4 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ cp4(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                return ((Long) ((Map.Entry) obj).getValue()).longValue() < j;
            default:
                return ((zii) obj).b == j;
        }
    }
}
