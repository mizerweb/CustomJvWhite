package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class u0c extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ v0c d;

    /* JADX WARN: Illegal instructions before constructor call */
    public u0c(v0c v0cVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 2:
                this.d = v0cVar;
                super(i2, null);
                break;
            case 3:
                this.d = v0cVar;
                super(i2, p0c.a);
                break;
            case 4:
                this.d = v0cVar;
                super(i2, q0c.a);
                break;
            case 5:
                Boolean bool = Boolean.FALSE;
                this.d = v0cVar;
                super(i2, bool);
                break;
            case 6:
                Boolean bool2 = Boolean.FALSE;
                this.d = v0cVar;
                super(i2, bool2);
                break;
            case 7:
            default:
                this.d = v0cVar;
                super(i2, bx5.b);
                break;
            case 8:
                Boolean bool3 = Boolean.TRUE;
                this.d = v0cVar;
                super(i2, bool3);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        v0c v0cVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2) && !v0cVar.p) {
                    v0cVar.a(v0cVar.getTextFont());
                    break;
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2) && !v0cVar.p) {
                    v0cVar.a(v0cVar.getTextFont());
                    break;
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    v0cVar.m(v0cVar.getTheme());
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    v0cVar.m(v0cVar.getTheme());
                }
                break;
            case 4:
                if (!cqk.d(obj, obj2)) {
                    v0cVar.m(v0cVar.getTheme());
                }
                break;
            case 5:
                if (!cqk.d(obj, obj2)) {
                    v0cVar.m(v0cVar.getTheme());
                }
                break;
            case 6:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    GradientDrawable gradientDrawable = v0cVar.o;
                    if (!zBooleanValue) {
                        gradientDrawable.setStroke(gm0.K(0.0f * yl5.d().getDisplayMetrics().density), (ColorStateList) null);
                    } else {
                        gradientDrawable.setStroke(v0cVar.getBackgroundStrokeWidth(), v0cVar.getTheme().k().k);
                    }
                }
                break;
            case 7:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    if (v0cVar.getHasBackgroundStroke()) {
                        v0cVar.o.setStroke(iIntValue, v0cVar.getTheme().k().k);
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    v0cVar.setBackground(zBooleanValue2 ? v0cVar.o : null);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0c(Object obj, v0c v0cVar, int i) {
        super(4, obj);
        this.c = i;
        this.d = v0cVar;
    }
}
