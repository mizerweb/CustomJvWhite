package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zrf extends wf4 implements eph, oqe {
    public yrf s;
    public final TextView t;
    public final TextView u;
    public final ShapeDrawable v;
    public final RippleDrawable w;

    public zrf(Context context) {
        super(context, null);
        this.s = yrf.a;
        TextView textView = new TextView(context, null);
        textView.setId(R.id.oneme_section_title);
        textView.setLayoutParams(new uf4(-1, -2));
        q9i.a(q9i.f, textView);
        textView.setPadding(0, 0, 0, 0);
        textView.setTextColor(getCurrentTheme().getText().d);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.t = textView;
        TextView textViewE = qv1.e(context, R.id.oneme_section_description);
        textViewE.setLayoutParams(new uf4(-1, -2));
        q9i.a(q9i.i, textViewE);
        textViewE.setTextColor(getCurrentTheme().getText().b);
        textViewE.setPadding(0, gm0.K(2.0f * yl5.d().getDisplayMetrics().density), 0, 0);
        this.u = textViewE;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.v = shapeDrawable;
        RippleDrawable rippleDrawableB = col.b(((bs0) pq3.j.h(this).u().c.g).c, null, shapeDrawable);
        this.w = rippleDrawableB;
        setLayoutParams(new uf4(-1, -2));
        setMinHeight(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        setBackground(rippleDrawableB);
        addView(textView);
        addView(textViewE);
        eg4 eg4VarH = ch3.h(this);
        int id = textView.getId();
        eg4VarH.d(id, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id));
        eg4VarH.d(id, 3, 0, 3);
        qt4.w(10.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
        eg4VarH.d(id, 7, 0, 7);
        new bsb(7, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id2 = textViewE.getId();
        eg4VarH.d(id2, 6, textView.getId(), 6);
        new bsb(6, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id2, 3, textView.getId(), 4);
        eg4VarH.d(id2, 7, 0, 7);
        new bsb(7, eg4VarH, id2).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
    }

    private final kbc getCurrentTheme() {
        int iOrdinal = this.s.ordinal();
        a8g a8gVar = pq3.j;
        if (iOrdinal == 0) {
            return a8gVar.h(this);
        }
        if (iOrdinal == 1) {
            return a8gVar.l(this).b;
        }
        ore.o();
        return null;
    }

    private static /* synthetic */ void getDescription$annotations() {
    }

    public final yrf getThemeDepended() {
        return this.s;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.w.setColor(ColorStateList.valueOf(((bs0) getCurrentTheme().u().c.g).c));
    }

    @Override // defpackage.oqe
    public void setRippleMask(Shape shape) {
        this.v.setShape(shape);
    }

    public final void setThemeDepended(yrf yrfVar) {
        if (this.s == yrfVar) {
            return;
        }
        this.s = yrfVar;
        onThemeChanged(getCurrentTheme());
    }
}
