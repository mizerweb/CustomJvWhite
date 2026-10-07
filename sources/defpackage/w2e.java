package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.function.IntSupplier;
import one.me.stories.viewer.viewer.widgets.writebar.StoriesWriteBarWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w2e implements IntSupplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w2e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                View view = (View) ((WeakReference) obj).get();
                if (view != null) {
                    return view.getWidth();
                }
                return 0;
            case 1:
                zv8[] zv8VarArr = StoriesWriteBarWidget.n;
                return ((StoriesWriteBarWidget) obj).u1().l;
            default:
                return ((hak) obj).i();
        }
    }
}
