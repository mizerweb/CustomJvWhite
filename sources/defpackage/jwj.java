package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jwj extends o4m {
    public final /* synthetic */ int a;
    public final /* synthetic */ lwj b;

    public /* synthetic */ jwj(lwj lwjVar, int i) {
        this.a = i;
        this.b = lwjVar;
    }

    @Override // defpackage.e9j
    public final void c() {
        View view;
        int i = this.a;
        lwj lwjVar = this.b;
        switch (i) {
            case 0:
                if (lwjVar.o && (view = lwjVar.g) != null) {
                    view.setTranslationY(0.0f);
                    lwjVar.d.setTranslationY(0.0f);
                }
                lwjVar.d.setVisibility(8);
                lwjVar.d.setTransitioning(false);
                lwjVar.s = null;
                ih ihVar = lwjVar.k;
                if (ihVar != null) {
                    ihVar.E(lwjVar.j);
                    lwjVar.j = null;
                    lwjVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = lwjVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i7j.a;
                    w6j.c(actionBarOverlayLayout);
                }
                break;
            default:
                lwjVar.s = null;
                lwjVar.d.requestLayout();
                break;
        }
    }
}
