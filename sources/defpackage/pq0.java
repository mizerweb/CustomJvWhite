package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pq0 implements u25 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public a35 d;

    public pq0(boolean z) {
        this.a = z;
    }

    public final void a(int i) {
        a35 a35Var = this.d;
        String str = vqi.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((v1i) this.b.get(i2)).d(this, a35Var, this.a, i);
        }
    }

    public final void b() {
        a35 a35Var = this.d;
        String str = vqi.a;
        for (int i = 0; i < this.c; i++) {
            ((v1i) this.b.get(i)).h(this, a35Var, this.a);
        }
        this.d = null;
    }

    public final void c(a35 a35Var) {
        for (int i = 0; i < this.c; i++) {
            ((v1i) this.b.get(i)).c(this, a35Var, this.a);
        }
    }

    public final void d(a35 a35Var) {
        this.d = a35Var;
        for (int i = 0; i < this.c; i++) {
            ((v1i) this.b.get(i)).i(this, a35Var, this.a);
        }
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        v1iVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(v1iVar)) {
            return;
        }
        arrayList.add(v1iVar);
        this.c++;
    }
}
