package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class jy7 {
    public final View a;
    public final af7 b;
    public Boolean c;
    public boolean d;

    public jy7(View view, af7 af7Var) {
        this.a = view;
        this.b = af7Var;
    }

    public final void a(boolean z, boolean z2) {
        if (cqk.d(this.c, Boolean.valueOf(z))) {
            return;
        }
        boolean z3 = z2 && this.c != null;
        this.c = Boolean.valueOf(z);
        View view = this.a;
        if (z && !this.d) {
            view.setBackground((Drawable) this.b.invoke());
            this.d = true;
        }
        view.animate().cancel();
        if (z && z3) {
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(300L).start();
        } else if (z) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        } else if (z3) {
            view.animate().alpha(0.0f).setDuration(300L).withEndAction(new k36(15, this)).start();
        } else {
            view.setAlpha(0.0f);
            view.setVisibility(8);
        }
    }
}
