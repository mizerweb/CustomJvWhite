package defpackage;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.c;

/* JADX INFO: loaded from: classes2.dex */
public final class rd5 extends neg {
    public final pd5 b;
    public AnimatorSet c;

    public rd5(pd5 pd5Var) {
        this.b = pd5Var;
    }

    @Override // defpackage.neg
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.c;
        animatorSet.getClass();
        animatorSet.start();
        if (c.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // defpackage.neg
    public final void b(sl0 sl0Var) {
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // defpackage.neg
    public final void c(ViewGroup viewGroup) {
        pd5 pd5Var = this.b;
        if (pd5Var.b()) {
            return;
        }
        uvc uvcVarC = pd5Var.c(viewGroup.getContext());
        this.c = uvcVarC != null ? (AnimatorSet) uvcVarC.c : null;
        throw null;
    }
}
