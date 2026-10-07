package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class hs0 extends gi {
    public final /* synthetic */ int b;
    public final /* synthetic */ is0 c;

    public /* synthetic */ hs0(is0 is0Var, int i) {
        this.b = i;
        this.c = is0Var;
    }

    @Override // defpackage.gi
    public final void a(Drawable drawable) {
        int i = this.b;
        is0 is0Var = this.c;
        switch (i) {
            case 0:
                is0Var.setIndeterminate(false);
                is0Var.b(is0Var.b, is0Var.c);
                break;
            default:
                if (!is0Var.g) {
                    is0Var.setVisibility(is0Var.h);
                }
                break;
        }
    }
}
