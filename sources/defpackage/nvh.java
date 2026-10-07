package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class nvh extends ViewOutlineProvider {
    public float a;

    public nvh(float f) {
        this.a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        float f = this.a;
        outline.setRoundRect(0, 0, width, height + ((int) f), f);
        view.setClipToOutline(true);
    }
}
