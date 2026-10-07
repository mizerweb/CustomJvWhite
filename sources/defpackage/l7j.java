package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class l7j extends ViewOutlineProvider {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ float b;

    public l7j(Rect rect, float f) {
        this.a = rect;
        this.b = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(this.a, this.b);
    }
}
