package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t44 extends s2 {
    public final Object a;
    public int b;
    public final /* synthetic */ u44 c;

    public t44(u44 u44Var, int i) {
        this.c = u44Var;
        Object obj = u44.j;
        this.a = u44Var.j()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        u44 u44Var = this.c;
        if (i != -1 && i < u44Var.size()) {
            if (ndl.c(obj, u44Var.j()[this.b])) {
                return;
            }
        }
        Object obj2 = u44.j;
        this.b = u44Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        u44 u44Var = this.c;
        Map mapC = u44Var.c();
        if (mapC != null) {
            return mapC.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return u44Var.k()[i];
    }

    @Override // defpackage.s2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        u44 u44Var = this.c;
        Map mapC = u44Var.c();
        Object obj2 = this.a;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            u44Var.put(obj2, obj);
            return null;
        }
        Object obj3 = u44Var.k()[i];
        u44Var.k()[this.b] = obj;
        return obj3;
    }
}
