package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class cq4 extends FrameLayout implements eph {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq4(kbc kbcVar, Activity activity, ri riVar, boolean z) {
        super(activity);
        this.a = z;
        setClickable(true);
        setClipChildren(false);
        setClipToPadding(false);
        qe7.H(this, 300L, new t8(25, riVar));
        onThemeChanged(kbcVar);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        if (this.a) {
            setBackgroundColor(kbcVar.b().g);
        }
    }
}
