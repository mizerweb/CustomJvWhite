package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m5a implements e5a {
    public final nn9 a;
    public int d;
    public boolean e;
    public final ArrayList c = new ArrayList();
    public final Object b = new Object();

    public m5a(ur0 ur0Var, boolean z) {
        this.a = new nn9(ur0Var, z);
    }

    @Override // defpackage.e5a
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.e5a
    public final ush b() {
        return this.a.o;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}
