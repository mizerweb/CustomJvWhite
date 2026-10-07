package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class n8j extends ys4 {
    public o8j a;
    public int b = 0;

    public n8j() {
    }

    @Override // defpackage.ys4
    public boolean h(et4 et4Var, View view, int i) {
        t(et4Var, view, i);
        if (this.a == null) {
            this.a = new o8j(view);
        }
        o8j o8jVar = this.a;
        View view2 = o8jVar.a;
        o8jVar.b = view2.getTop();
        o8jVar.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int s() {
        o8j o8jVar = this.a;
        if (o8jVar != null) {
            return o8jVar.d;
        }
        return 0;
    }

    public void t(et4 et4Var, View view, int i) {
        et4Var.q(view, i);
    }

    public n8j(int i) {
    }
}
