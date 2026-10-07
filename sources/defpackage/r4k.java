package defpackage;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r4k implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ r4k(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() < this.b;
            case 1:
                return ((hfk) obj).a == this.b;
            case 2:
                return ((hfk) obj).a == this.b;
            case 3:
                return ((u8k) obj).a == (this.b & 3);
            case 4:
                return ((mfk) obj).a == this.b;
            case 5:
                return ((kfk) obj).a == this.b;
            default:
                return ((lfk) obj).a == this.b;
        }
    }
}
