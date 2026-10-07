package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class i24 extends sr implements k24 {
    public final int c;
    public af7 d;

    public i24(int i) {
        super(new hb8(i, 5));
        this.c = i;
    }

    @Override // defpackage.k24
    public final void h(int i) {
        KeyEvent.Callback callbackQ = Q();
        h24 h24Var = callbackQ instanceof h24 ? (h24) callbackQ : null;
        if (h24Var != null) {
            h24Var.p(i);
        }
        qe7.H(Q(), 300L, new t8(18, this));
        r();
    }

    @Override // defpackage.k24
    public final boolean k() {
        return this.c == 2;
    }

    @Override // defpackage.k24
    public final void o() {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            Q().setVisibility(8);
        }
    }

    @Override // defpackage.k24
    public final void setCommentCompactShareProgress(float f) {
        if (this.c != 2) {
            return;
        }
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((View) ny8Var.getValue()).setAlpha(1.0f - f);
        }
    }

    @Override // defpackage.k24
    public final void setOnCommentsEntryClickListener(af7 af7Var) {
        this.d = af7Var;
    }

    @Override // defpackage.k24
    public final void v(xac xacVar) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            KeyEvent.Callback callbackQ = Q();
            h24 h24Var = callbackQ instanceof h24 ? (h24) callbackQ : null;
            if (h24Var != null) {
                h24Var.a(xacVar);
            }
        }
    }
}
