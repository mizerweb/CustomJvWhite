package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class ww5 extends lvb {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww5(int i, Object obj) {
        super(12);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.lvb
    public final void C0(Object obj, float f) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ((ux6) obj2).a = f;
                break;
            default:
                float f2 = f / 100.0f;
                eu9 eu9Var = (eu9) obj2;
                eu9Var.o = f2;
                Drawable drawable = eu9Var.p;
                if (drawable != null) {
                    drawable.setAlpha(oc9.v((int) (f2 * 255.0f), 0, 255));
                }
                float f3 = 1.0f - f2;
                eu9Var.q = f3;
                Drawable drawable2 = eu9Var.r;
                if (drawable2 != null) {
                    drawable2.setAlpha(oc9.v((int) (f3 * 255.0f), 0, 255));
                }
                eu9Var.invalidateSelf();
                break;
        }
    }

    @Override // defpackage.lvb
    public final float q0(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return ((ux6) obj2).a;
            default:
                return ((eu9) obj2).o * 100.0f;
        }
    }
}
