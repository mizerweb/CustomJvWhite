package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class eqh extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(aqh aqhVar) {
        cqh cqhVar = (cqh) this.a;
        cqhVar.setThemeName(aqhVar.b);
        Drawable drawable = aqhVar.d;
        if (drawable != null) {
            cqhVar.setBackgroundPattern(drawable);
        }
        cqhVar.setSelected(aqhVar.a);
        cqhVar.setContentDescription(aqhVar.c.c);
    }
}
