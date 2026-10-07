package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class cqf extends ViewGroup implements eph {
    public static final /* synthetic */ zv8[] f;
    public final TextView a;
    public final TextView b;
    public final ifh c;
    public final e8c d;
    public final t5d e;

    static {
        z8b z8bVar = new z8b(cqf.class, "currentLabelState", "getCurrentLabelState()Lone/me/settings/media/domain/SectionMediaItem$Step;");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public cqf(Context context) {
        super(context);
        TextView textView = new TextView(context);
        noh nohVar = q9i.k;
        q9i.a(nohVar, textView);
        textView.setTextColor(pq3.j.h(textView).getText().e);
        addView(textView);
        this.a = textView;
        TextView textView2 = new TextView(context);
        q9i.a(nohVar, textView2);
        addView(textView2);
        this.b = textView2;
        this.c = new ifh(new xre(context, 8, this));
        e8c e8cVar = new e8c(context);
        e8cVar.p = false;
        e8cVar.setValueFrom(0.0f);
        e8cVar.setValueTo(3.0f);
        e8cVar.setStepSize(1.0f);
        addView(e8cVar);
        this.d = e8cVar;
        this.e = new t5d(new dbf(ynh.b, -1.0f), 7, this);
    }

    public final TextView getCurrentLabel() {
        return (TextView) this.c.getValue();
    }

    public final void b(kbc kbcVar, float f2) {
        e8c e8cVar = this.d;
        float from = e8cVar.getFrom();
        ifh ifhVar = this.c;
        TextView textView = this.b;
        TextView textView2 = this.a;
        if (f2 == from) {
            if (n7j.o(ifhVar)) {
                ((TextView) ifhVar.getValue()).setVisibility(8);
            }
            textView2.setTextColor(kbcVar.getText().b);
            textView.setTextColor(kbcVar.getText().d);
            return;
        }
        if (f2 == e8cVar.getTo()) {
            if (n7j.o(ifhVar)) {
                ((TextView) ifhVar.getValue()).setVisibility(8);
            }
            textView2.setTextColor(kbcVar.getText().d);
            textView.setTextColor(kbcVar.getText().b);
            return;
        }
        if (ifhVar.d() && f2 >= 0.0f) {
            getCurrentLabel().setVisibility(0);
            getCurrentLabel().setTextColor(kbcVar.getText().b);
        }
        textView2.setTextColor(kbcVar.getText().d);
        textView.setTextColor(kbcVar.getText().d);
    }

    public final dbf getCurrentLabelState() {
        zv8 zv8Var = f[0];
        return (dbf) this.e.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        TextView textView = this.a;
        qyj.M(textView, iK, iK2, 0, 12);
        int measuredWidth = getMeasuredWidth();
        TextView textView2 = this.b;
        qyj.M(textView2, zo5.D(16.0f, yl5.d().getDisplayMetrics().density, measuredWidth - textView2.getMeasuredWidth()), textView.getTop(), 0, 12);
        if (n7j.o(this.c)) {
            qyj.M(getCurrentLabel(), (getMeasuredWidth() / 2) - (getCurrentLabel().getMeasuredWidth() / 2), textView.getTop(), 0, 12);
        }
        qyj.M(this.d, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), textView.getBottom(), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        TextView textView = this.a;
        textView.measure(i, i2);
        int measuredHeight = textView.getMeasuredHeight();
        this.b.measure(i, i2);
        if (n7j.o(this.c)) {
            getCurrentLabel().measure(i, i2);
        }
        int iF = r5a.f(12.0f, yl5.d().getDisplayMetrics().density, 2, size);
        e8c e8cVar = this.d;
        e8cVar.measure(iF, i2);
        setMeasuredDimension(size, zo5.b(16.0f, yl5.d().getDisplayMetrics().density, e8cVar.getMeasuredHeight() + measuredHeight));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        e8c e8cVar = this.d;
        b(kbcVar, e8cVar.getValue());
        e8cVar.onThemeChanged(kbcVar);
    }

    public final void setCurrentLabelState(dbf dbfVar) {
        this.e.B(this, f[0], dbfVar);
    }

    public final void setSliderAction(cf7 cf7Var) {
        e8c e8cVar = this.d;
        if (cf7Var == null) {
            e8cVar.v.clear();
        } else {
            e8cVar.v.add(new dvc(2, cf7Var));
        }
    }
}
