package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class lhf {
    public final ViewGroup a;
    public final ny8 b = rx8.P(3, new ize(6, this));

    public lhf(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final int a() {
        return ((jhf) this.b.getValue()).getMeasuredHeight();
    }

    public final int b() {
        return ((jhf) this.b.getValue()).getMeasuredWidth();
    }

    public final void c(int i, int i2) {
        qyj.M((View) this.b.getValue(), i, i2, 0, 12);
    }

    public final void d(int i, int i2) {
        ((jhf) this.b.getValue()).measure(i, i2);
    }

    public final void e(Layout layout) {
        ny8 ny8Var = this.b;
        if (layout == null) {
            if (ny8Var.d()) {
                ((jhf) ny8Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        jhf jhfVar = (jhf) ny8Var.getValue();
        jhfVar.a = layout;
        TextPaint paint = layout.getPaint();
        if (paint != null) {
            paint.setColor(jhfVar.b);
        }
        vd7.h(layout.getText(), pq3.j.e(jhfVar.getContext()).m());
        jhfVar.requestLayout();
        jhfVar.invalidate();
        if (jhfVar.getParent() == null) {
            this.a.addView(jhfVar, new ViewGroup.LayoutParams(-2, -2));
        }
        jhfVar.setVisibility(0);
    }

    public final void f(int i) {
        CharSequence text;
        TextPaint paint;
        ny8 ny8Var = this.b;
        if (ny8Var.d()) {
            jhf jhfVar = (jhf) ny8Var.getValue();
            jhfVar.b = i;
            Layout layout = jhfVar.a;
            if (layout != null && (paint = layout.getPaint()) != null) {
                paint.setColor(i);
            }
            Layout layout2 = jhfVar.a;
            if (layout2 != null && (text = layout2.getText()) != null) {
                vd7.h(text, pq3.j.e(jhfVar.getContext()).m());
            }
            jhfVar.invalidate();
        }
    }
}
