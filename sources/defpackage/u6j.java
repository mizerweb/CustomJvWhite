package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class u6j extends sl9 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6j(int i, Class cls, int i2, int i3, int i4) {
        super(i, cls, i2, i3);
        this.e = i4;
    }

    @Override // defpackage.sl9
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(c7j.c(view));
            case 1:
                return c7j.a(view);
            case 2:
                return e7j.b(view);
            default:
                return Boolean.valueOf(c7j.b(view));
        }
    }

    @Override // defpackage.sl9
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                c7j.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                c7j.e(view, (CharSequence) obj);
                break;
            case 2:
                e7j.c(view, (CharSequence) obj);
                break;
            default:
                c7j.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.sl9
    public final boolean f(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
