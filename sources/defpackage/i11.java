package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class i11 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final float b;

    public i11(int i, float f) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = f;
                break;
            default:
                this.b = f;
                break;
        }
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, -gm0.K(this.b), view.getWidth(), view.getHeight(), this.b);
                view.setClipToOutline(true);
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.b);
                break;
        }
    }
}
