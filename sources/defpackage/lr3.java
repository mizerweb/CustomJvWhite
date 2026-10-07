package defpackage;

import android.content.Context;
import android.content.res.Resources;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public class lr3 extends is0 {
    public static final /* synthetic */ int m = 0;

    public lr3(Context context) {
        super(R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, context);
        mr3 mr3Var = (mr3) this.a;
        gr3 gr3Var = new gr3(mr3Var);
        Context context2 = getContext();
        yc8 yc8Var = new yc8(context2, mr3Var, gr3Var, new ir3(mr3Var));
        Resources resources = context2.getResources();
        dsi dsiVar = new dsi();
        ThreadLocal threadLocal = mne.a;
        dsiVar.a = resources.getDrawable(R.drawable.indeterminate_static, null);
        new csi(dsiVar.a.getConstantState());
        yc8Var.n = dsiVar;
        setIndeterminateDrawable(yc8Var);
        setProgressDrawable(new dj5(getContext(), mr3Var, gr3Var));
    }

    @Override // defpackage.is0
    public final js0 a(Context context) {
        return new mr3(context);
    }

    public int getIndicatorDirection() {
        return ((mr3) this.a).j;
    }

    public int getIndicatorInset() {
        return ((mr3) this.a).i;
    }

    public int getIndicatorSize() {
        return ((mr3) this.a).h;
    }

    public void setIndicatorDirection(int i) {
        ((mr3) this.a).j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        js0 js0Var = this.a;
        if (((mr3) js0Var).i != i) {
            ((mr3) js0Var).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        js0 js0Var = this.a;
        if (((mr3) js0Var).h != iMax) {
            ((mr3) js0Var).h = iMax;
            ((mr3) js0Var).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.is0
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((mr3) this.a).a();
    }
}
