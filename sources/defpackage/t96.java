package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class t96 extends gi {
    public final /* synthetic */ int b;
    public final /* synthetic */ Drawable.Callback c;

    public /* synthetic */ t96(Drawable.Callback callback, int i) {
        this.b = i;
        this.c = callback;
    }

    @Override // defpackage.gi
    public final void a(Drawable drawable) {
        int i = this.b;
        Drawable.Callback callback = this.c;
        switch (i) {
            case 0:
                ((u96) callback).a();
                break;
            default:
                ColorStateList colorStateList = ((fo9) callback).o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    @Override // defpackage.gi
    public final void b(Drawable drawable) {
        int i = this.b;
        Drawable.Callback callback = this.c;
        switch (i) {
            case 0:
                ((u96) callback).b();
                break;
            default:
                fo9 fo9Var = (fo9) callback;
                ColorStateList colorStateList = fo9Var.o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(fo9Var.s, colorStateList.getDefaultColor()));
                }
                break;
        }
    }
}
