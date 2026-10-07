package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
public final class kia extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ lia d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kia(lia liaVar, int i) {
        super(4, iia.a);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.d = liaVar;
                super(4, bool);
                break;
            default:
                this.d = liaVar;
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        float f;
        float f2;
        int i = this.c;
        lia liaVar = this.d;
        switch (i) {
            case 0:
                liaVar.e = null;
                liaVar.f = null;
                liaVar.g = null;
                liaVar.h = null;
                ny8 ny8Var = liaVar.i;
                if (ny8Var.d()) {
                    ((kwb) ny8Var.getValue()).setVisibility(8);
                }
                liaVar.m = null;
                ny8 ny8Var2 = liaVar.p;
                if (ny8Var2.d()) {
                    ((l1c) ny8Var2.getValue()).setVisibility(8);
                }
                liaVar.k = null;
                liaVar.j = null;
                liaVar.requestLayout();
                liaVar.invalidate();
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    Paint paint = liaVar.t;
                    if (zBooleanValue) {
                        f = yl5.d().getDisplayMetrics().density;
                        f2 = 4.0f;
                    } else {
                        f = yl5.d().getDisplayMetrics().density;
                        f2 = 2.0f;
                    }
                    paint.setStrokeWidth(f * f2);
                    liaVar.requestLayout();
                    liaVar.invalidate();
                }
                break;
        }
    }
}
