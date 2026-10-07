package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.view.ViewGroup;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class h11 extends wf4 implements eph {
    public final TextView s;
    public final cs t;
    public final v0c u;
    public final g1c v;
    public int w;
    public final f11 x;
    public tf7 y;

    public h11(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        textView.setId(R.id.oneme_bottom_bar_item_label);
        textView.setVisibility(0);
        textView.setLayoutParams(new uf4(-2, -2));
        q9i.a(q9i.o, textView);
        Rect rect = n7j.a;
        i7j.n(textView, false);
        this.s = textView;
        cs csVar = new cs(context);
        csVar.setId(R.id.oneme_bottom_bar_item_icon);
        csVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density)));
        csVar.setVisibility(0);
        i7j.n(csVar, false);
        this.t = csVar;
        v0c v0cVar = new v0c(context);
        v0cVar.setId(R.id.oneme_bottom_bar_item_counter);
        v0cVar.setLayoutParams(new uf4(-2, -2));
        v0cVar.setAppearance(p0c.d);
        v0cVar.setHasBackgroundStroke(true);
        v0cVar.setVisibility(8);
        i7j.n(v0cVar, false);
        this.u = v0cVar;
        g1c g1cVar = new g1c(context);
        g1cVar.setId(R.id.oneme_bottom_bar_item_dot);
        uf4 uf4Var = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        uf4Var.setMarginStart(gm0.K(7.0f * yl5.d().getDisplayMetrics().density));
        g1cVar.setLayoutParams(uf4Var);
        g1cVar.setAppearance(f1c.c);
        g1cVar.setVisibility(8);
        i7j.n(g1cVar, false);
        this.v = g1cVar;
        this.w = 2;
        f11 f11Var = new f11(0, this);
        this.x = f11Var;
        this.y = f11Var;
        setLayoutParams(new ViewGroup.LayoutParams(0, -1));
        addView(csVar);
        addView(v0cVar);
        addView(g1cVar);
        addView(textView);
        eg4 eg4VarH = ch3.h(this);
        int id = csVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = textView.getId();
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 3, csVar.getId(), 4);
        new bsb(3, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 2.0f));
        int id3 = v0cVar.getId();
        eg4VarH.d(id3, 6, csVar.getId(), 6);
        qt4.w(14.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
        eg4VarH.d(id3, 3, 0, 3);
        int id4 = g1cVar.getId();
        eg4VarH.d(id4, 3, csVar.getId(), 3);
        eg4VarH.d(id4, 7, csVar.getId(), 7);
        new bsb(7, eg4VarH, id4).a(-gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
        i7j.n(this, true);
        i7j.l(this, new g11(this, 0));
    }

    public final CharSequence getText() {
        return this.s.getText();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        u();
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        v0c v0cVar = this.u;
        v0cVar.setVisibility(i2);
        pu4.c(v0cVar, Integer.valueOf(i), false, 6);
        if (i > 0) {
            u();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.w = z ? 1 : 2;
        u();
        if (z) {
            Object drawable = this.t.getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        super.setSelected(z);
    }

    public final void setText(int i) {
        this.s.setText(i);
    }

    public final void u() {
        int i;
        int i2 = this.w;
        a8g a8gVar = pq3.j;
        kbc kbcVarH = a8gVar.h(this);
        int iD = qt4.D(i2);
        if (iD == 0) {
            i = kbcVarH.getText().h;
        } else {
            if (iD != 1) {
                ore.o();
                return;
            }
            i = kbcVarH.getText().d;
        }
        this.s.setTextColor(i);
        this.y.i(this.t, Boolean.valueOf(this.w == 1), a8gVar.h(this));
        this.u.onThemeChanged(a8gVar.h(this));
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.s.setText(charSequence);
    }
}
