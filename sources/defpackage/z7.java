package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ z7(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.a = i;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        switch (i) {
            case 0:
                actionBarOverlayLayout.d();
                actionBarOverlayLayout.w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.x);
                break;
            default:
                actionBarOverlayLayout.d();
                actionBarOverlayLayout.w = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.x);
                break;
        }
    }
}
