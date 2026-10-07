package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class n13 extends wf4 implements eph {
    public final TextView s;
    public final TextView t;
    public final y5c u;
    public ga0 v;
    public ga0 w;
    public sgg x;
    public sgg y;
    public Long z;

    public n13(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        uf4 uf4Var = new uf4(-1, -2);
        ((ViewGroup.MarginLayoutParams) uf4Var).bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        textView.setLayoutParams(uf4Var);
        q9i.a(q9i.f, textView);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.s = textView;
        TextView textView2 = new TextView(context);
        uf4 uf4Var2 = new uf4(-1, -2);
        ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        textView2.setLayoutParams(uf4Var2);
        q9i.a(q9i.i, textView2);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.t = textView2;
        y5c y5cVar = new y5c(context);
        y5cVar.setId(R.id.profile_media_link_preview);
        y5cVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        y5cVar.setScaleType(ImageView.ScaleType.CENTER);
        this.u = y5cVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.profile_media_link_content_ll);
        linearLayout.setLayoutParams(new uf4(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        setLayoutParams(new uf4(-1, -2));
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        setPadding(iK, iK, iK, iK);
        a8g a8gVar = pq3.j;
        setBackground(col.b(((bs0) a8gVar.h(this).u().c.g).c, null, new ColorDrawable(-1)));
        addView(y5cVar);
        addView(linearLayout);
        eg4 eg4VarH = ch3.h(this);
        int id = y5cVar.getId();
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 6, y5cVar.getId(), 7);
        new bsb(6, eg4VarH, id2).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
        onThemeChanged(a8gVar.h(this));
    }

    private final void setButtonState(s70 s70Var) {
        boolean zD = cqk.d(s70Var, so2.c);
        y5c y5cVar = this.u;
        if (zD) {
            y5cVar.setPlaying(true);
        } else if (cqk.d(s70Var, zpe.c) || cqk.d(s70Var, er3.b) || cqk.d(s70Var, ou7.c)) {
            y5cVar.setPlaying(false);
        } else {
            ore.o();
        }
    }

    private final void setState(xx6 xx6Var) {
        ga0 ga0Var;
        this.v = new ga0(this, 2, xx6Var);
        if (isAttachedToWindow() && (ga0Var = this.v) != null) {
            ga0Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.v);
    }

    private final void setSubtitle(CharSequence charSequence) {
        int i = charSequence == null || charSequence.length() == 0 ? 8 : 0;
        TextView textView = this.t;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    public static final void u(n13 n13Var, la0 la0Var) {
        s70 s70Var = la0Var != null ? la0Var.d : null;
        if (s70Var == null || !cqk.d(la0Var.a, n13Var.z)) {
            n13Var.setButtonState(er3.b);
        } else {
            n13Var.setButtonState(s70Var);
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.s.setTextColor(kbcVar.getText().b);
        this.t.setTextColor(kbcVar.getText().d);
    }

    public final void setupAudio(s7a s7aVar) {
        ga0 ga0Var;
        this.z = Long.valueOf(s7aVar.b);
        setTitle(s7aVar.f);
        setSubtitle(s7aVar.g);
        setState(s7aVar.i);
        this.w = new ga0(this, 3, s7aVar.j);
        if (isAttachedToWindow() && (ga0Var = this.w) != null) {
            ga0Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.w);
    }
}
