package defpackage;

import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.TextPaint;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vti extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wti d;

    /* JADX WARN: Illegal instructions before constructor call */
    public vti(wti wtiVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 1:
                this.d = wtiVar;
                super(i2, -1);
                break;
            case 2:
                Boolean bool = Boolean.FALSE;
                this.d = wtiVar;
                super(i2, bool);
                break;
            case 3:
                Boolean bool2 = Boolean.TRUE;
                this.d = wtiVar;
                super(i2, bool2);
                break;
            case 4:
                Boolean bool3 = Boolean.TRUE;
                this.d = wtiVar;
                super(i2, bool3);
                break;
            default:
                this.d = wtiVar;
                super(i2, null);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        Drawable drawableMutate;
        int i = this.c;
        wti wtiVar = this.d;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!cqk.d((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    BoringLayout.Metrics metrics = wtiVar.getMetrics();
                    TextPaint textPaint = wti.p;
                    metrics.width = gm0.K(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(wtiVar.getTextColor());
                    wtiVar.l = ky8.a(wtiVar.a, charSequence, textPaint, metrics.width, 1, false, null, 0.0f, false, 464);
                    wtiVar.invalidate();
                    wtiVar.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    wtiVar.invalidate();
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    wtiVar.requestLayout();
                    wtiVar.invalidate();
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    wtiVar.invalidate();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (zBooleanValue) {
                        drawableMutate = wtiVar.getContext().getDrawable(R.drawable.icon_video_call_fill).mutate();
                        int i2 = wtiVar.c;
                        drawableMutate.setBounds(0, 0, i2, i2);
                        drawableMutate.setTint(wtiVar.getDrawableColor());
                    } else {
                        drawableMutate = null;
                    }
                    wtiVar.k = drawableMutate;
                    wtiVar.requestLayout();
                    wtiVar.invalidate();
                }
                break;
        }
    }
}
