package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class sda implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ sda(View view, View view2, int i) {
        this.a = i;
        this.b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                view.setPivotX(view.getMeasuredWidth());
                view.setPivotY(0.0f);
                view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(150L).setInterpolator(new DecelerateInterpolator(1.2f)).start();
                break;
            default:
                view.setAlpha(0.0f);
                break;
        }
    }
}
