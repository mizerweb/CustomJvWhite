package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class r8j implements xee {
    @Override // defpackage.xee
    public final void b(View view) {
    }

    @Override // defpackage.xee
    public final void d(View view) {
        wee weeVar = (wee) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) weeVar).width == -1 && ((ViewGroup.MarginLayoutParams) weeVar).height == -1) {
            return;
        }
        ore.k("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
