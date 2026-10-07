package defpackage;

import android.content.Context;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes4.dex */
public final class up2 extends tp2 {
    public up2(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        super.dispatchApplyWindowInsets(windowInsets);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
