package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n9a extends a8j {
    public final cf7 c;
    public final af7 d;
    public final kc5 e;
    public final ic6 f = new ic6(null);
    public final ic6 g = new ic6(null);
    public final mjg h;
    public final r8e i;
    public final mjg j;
    public final r8e k;

    public n9a(cf7 cf7Var, af7 af7Var, kc5 kc5Var) {
        this.c = cf7Var;
        this.d = af7Var;
        this.e = kc5Var;
        mjg mjgVarA = p90.a(null);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(null);
        this.j = mjgVarA2;
        this.k = new r8e(mjgVarA2);
    }

    public final void B() {
        this.h.setValue(null);
    }

    public final boolean C() {
        return this.i.a.getValue() != null;
    }

    public final void D(Collection collection) {
        a8j.x(this.g, new d9a(collection));
    }

    public final void E(long j, boolean z) {
        mjg mjgVar;
        Object value;
        Set setW1;
        if (!C()) {
            a8j.x(this.f, new i9a(j));
            return;
        }
        if (z) {
            do {
                mjgVar = this.h;
                value = mjgVar.getValue();
                Set set = (Set) value;
                setW1 = set != null ? ww3.W1(set) : new LinkedHashSet();
                if (setW1.contains(Long.valueOf(j))) {
                    setW1.remove(Long.valueOf(j));
                } else {
                    setW1.add(Long.valueOf(j));
                }
            } while (!mjgVar.h(value, setW1));
        }
    }

    public final void F(String str) {
        this.j.setValue(str);
    }
}
