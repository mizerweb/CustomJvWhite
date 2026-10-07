package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f7b extends v2 implements o79 {
    public final o79 e;
    public final ex8 f;

    public f7b(o79 o79Var, ex8 ex8Var) {
        o79Var.getClass();
        this.e = o79Var;
        this.f = ex8Var;
    }

    @Override // defpackage.c7b
    public final void clear() {
        this.e.clear();
    }

    @Override // defpackage.v2
    public final Map d() {
        return new um9(this.e.b(), new oo6(28, this));
    }

    @Override // defpackage.v2
    public final Collection e() {
        return new u2(0, this);
    }

    @Override // defpackage.v2
    public final Set f() {
        return this.e.keySet();
    }

    @Override // defpackage.v2
    public final Iterator g() {
        return new vn8(this.e.a().iterator(), new zo7(19, this.f));
    }

    @Override // defpackage.c7b
    public final Collection get(Object obj) {
        return j8f.f(new kzi(this.f, obj, false), (List) this.e.get(obj));
    }

    @Override // defpackage.v2, defpackage.c7b
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // defpackage.c7b
    public final int size() {
        return this.e.size();
    }
}
