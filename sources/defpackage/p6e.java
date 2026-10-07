package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class p6e extends sr implements b8e {
    public boolean c;
    public cf7 d;
    public t5e e;
    public int f;
    public boolean g;

    public p6e() {
        super(new skd(13));
        this.c = true;
        this.f = n6e.a;
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            y5e y5eVar = (y5e) Q();
            y5eVar.getClass();
            int i = 0;
            while (i < y5eVar.getChildCount()) {
                int i2 = i + 1;
                View childAt = y5eVar.getChildAt(i);
                if (childAt == null) {
                    ore.i();
                    return;
                }
                w5e w5eVar = (w5e) childAt;
                w56 w56Var = xacVar.b.q;
                w56 w56Var2 = xacVar.a.l;
                if (z) {
                    w5eVar.e = w56Var2.b;
                    w5eVar.f = w56Var2.c;
                    w5eVar.g = w56Var.b;
                    w5eVar.h = w56Var.c;
                } else {
                    w5eVar.e = w56Var2.d;
                    w5eVar.f = w56Var2.e;
                    w5eVar.g = w56Var.d;
                    w5eVar.h = w56Var.e;
                }
                w5eVar.invalidate();
                i = i2;
            }
        }
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((y5e) Q()).f(null, 0, z);
        }
    }

    @Override // defpackage.b8e
    public final void setChipObserver(t5e t5eVar) {
        if (((ny8) this.b).d()) {
            ((y5e) Q()).setChipObserver(t5eVar);
        } else {
            this.e = t5eVar;
        }
    }

    @Override // defpackage.b8e
    public final void setIsIncoming(boolean z) {
        this.c = z;
    }

    @Override // defpackage.b8e
    public final void setMaxReactionsCount(int i) {
        this.f = i;
    }

    @Override // defpackage.b8e
    public final void setOnClickListener(cf7 cf7Var) {
        this.d = cf7Var;
    }

    @Override // defpackage.b8e
    public final void setStackFromEnd(boolean z) {
        this.g = z;
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        ((y5e) Q()).setOnChipClickListener(this.d);
        t5e t5eVar = this.e;
        if (t5eVar != null) {
            ((y5e) Q()).setChipObserver(t5eVar);
        }
        ((y5e) Q()).setStackFromEnd(this.g);
        ((y5e) Q()).setIncoming(this.c);
        ((y5e) Q()).f(kjaVar, this.f, z);
        r();
    }
}
