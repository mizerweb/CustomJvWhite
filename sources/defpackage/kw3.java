package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class kw3 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public kw3() {
        this.a = 1;
        this.b = 0;
        this.c = 0;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, this.b, this.c);
                break;
            default:
                outline.setRect(0, this.b, view.getWidth(), view.getHeight() - this.c);
                view.setClipToOutline(true);
                break;
        }
    }

    public kw3(int i, int i2) {
        this.a = 0;
        this.b = i;
        this.c = i2;
    }
}
