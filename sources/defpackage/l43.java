package defpackage;

import java.util.Set;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l43 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz9 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l43(Object obj, wz9 wz9Var, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = wz9Var;
        this.d = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                x43 x43Var = (x43) this.c;
                ifh ifhVar = x43Var.Z;
                wz9 wz9Var = this.b;
                fda fdaVar = (fda) this.d;
                if (wz9Var == null) {
                    zv8[] zv8VarArr = x43.q1;
                } else if (wz9Var.d == x43Var.c && wz9Var.c.containsAll((Set) ifhVar.getValue())) {
                    return wz9Var;
                }
                sfa sfaVar = fdaVar.a;
                long j = sfaVar != null ? sfaVar.b : 0L;
                return new wz9(j, j, (Set) ifhVar.getValue(), x43Var.c);
            case 1:
                l63 l63Var = (l63) this.c;
                wz9 wz9Var2 = this.b;
                sfa sfaVar2 = (sfa) this.d;
                if (l63.F(l63Var, wz9Var2)) {
                    return wz9Var2;
                }
                long j2 = sfaVar2.b;
                return new wz9(j2, j2, l63Var.G, l63Var.c);
            default:
                b2a b2aVar = (b2a) this.c;
                wz9 wz9Var3 = this.b;
                wz9 wz9Var4 = (wz9) this.d;
                if (wz9Var3 != null) {
                    s1a s1aVar = b2aVar.n;
                    if (s1aVar != null && s1aVar.b == wz9Var3.d && cqk.d(wz9Var3.c, b2a.A)) {
                        return wz9Var3;
                    }
                } else {
                    b2aVar.getClass();
                }
                return wz9Var4;
        }
    }
}
