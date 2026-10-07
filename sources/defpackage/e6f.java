package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class e6f extends gpl {
    public final /* synthetic */ int a;

    public /* synthetic */ e6f(int i) {
        this.a = i;
    }

    @Override // defpackage.gpl
    public final void a(Rect rect, Rect rect2) {
        switch (this.a) {
            case 0:
                gm0.Y("ContextMenu.ScrollHelper", "AdapterView scroll is not yet supported!");
                break;
            case 1:
                gm0.Y("ContextMenu.ScrollHelper", "HorizontalScrollView scroll is not yet supported!");
                break;
            case 2:
                gm0.Y("ContextMenu.ScrollHelper", "NestedScrollView scroll is not yet supported!");
                break;
            default:
                gm0.Y("ContextMenu.ScrollHelper", "ScrollView scroll is not yet supported!");
                break;
        }
    }
}
