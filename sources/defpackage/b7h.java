package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class b7h extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c7h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7h(c7h c7hVar, int i) {
        super(4, -871625458);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.TRUE;
                this.d = c7hVar;
                super(4, bool);
                break;
            default:
                this.d = c7hVar;
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        c7h c7hVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    Drawable background = c7hVar.getBackground();
                    GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(iIntValue);
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    c7hVar.E0();
                    a7h a7hVar = c7hVar.n2;
                    if (a7hVar.i != zBooleanValue) {
                        a7hVar.i = zBooleanValue;
                        a7hVar.o();
                    }
                    c7hVar.G0(zBooleanValue);
                }
                break;
        }
    }
}
