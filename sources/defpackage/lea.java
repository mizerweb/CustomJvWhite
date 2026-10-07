package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class lea extends FitFontImageSpan implements ff3 {
    public final /* synthetic */ Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lea(Drawable drawable) {
        super(drawable, null, false, false, 14, null);
        this.a = drawable;
    }

    @Override // defpackage.ff3
    public final void a(xac xacVar) {
        sb8.m0(xacVar.c.j, this.a);
    }
}
