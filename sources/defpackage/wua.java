package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wua implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ wua(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new bva(2, false, true, null, 0L, this.b, 0, 90);
            default:
                LinkedHashSet linkedHashSet = new LinkedHashSet((Set) obj);
                linkedHashSet.removeIf(new u6(15, new aa2(this.b, 19)));
                return linkedHashSet;
        }
    }
}
