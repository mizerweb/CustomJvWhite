package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;

/* JADX INFO: loaded from: classes2.dex */
public final class nd5 implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ od5 b;

    public nd5(oeg oegVar, ViewGroup viewGroup, od5 od5Var) {
        this.a = viewGroup;
        this.b = od5Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.a;
        viewGroup.post(new f92(viewGroup, 26, this.b));
        if (c.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (c.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
