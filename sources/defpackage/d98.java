package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class d98 extends nr0 implements o79, Serializable {
    public final transient lhe e;
    public final transient int f;

    public d98(lhe lheVar, int i) {
        this.e = lheVar;
        this.f = i;
    }

    @Override // defpackage.v2, defpackage.c7b
    public final Collection a() {
        return (s88) super.a();
    }

    @Override // defpackage.v2
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // defpackage.c7b
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v2
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.v2
    public final Collection e() {
        return new m98(this);
    }

    @Override // defpackage.v2
    public final Set f() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.v2
    public final Iterator g() {
        return new l98(this);
    }

    @Override // defpackage.c7b
    public final Collection get(Object obj) {
        c98 c98Var = (c98) this.e.get(obj);
        if (c98Var != null) {
            return c98Var;
        }
        a98 a98Var = c98.b;
        return ghe.e;
    }

    @Override // defpackage.v2, defpackage.c7b
    /* JADX INFO: renamed from: h */
    public g98 b() {
        return this.e;
    }

    @Override // defpackage.v2, defpackage.c7b
    public final Set keySet() {
        return this.e.keySet();
    }

    @Override // defpackage.v2, defpackage.c7b
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.c7b
    public final int size() {
        return this.f;
    }
}
