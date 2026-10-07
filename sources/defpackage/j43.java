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
public final class j43 extends wf4 implements eph {
    public static final /* synthetic */ int z = 0;
    public final TextView s;
    public final TextView t;
    public final y5c u;
    public ga0 v;
    public sgg w;
    public Long x;
    public k1j y;

    public j43(Context context) {
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

    private final void setButtonState(k1j k1jVar) {
        int iOrdinal = k1jVar.ordinal();
        y5c y5cVar = this.u;
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                y5cVar.setPlaying(true);
                return;
            } else if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                ore.o();
                return;
            }
        }
        y5cVar.setPlaying(false);
    }

    private final void setState(xx6 xx6Var) {
        ga0 ga0Var;
        this.v = new ga0(this, 4, xx6Var);
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

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.s.setTextColor(kbcVar.getText().b);
        this.t.setTextColor(kbcVar.getText().d);
    }

    public final void setupVideo(w7a w7aVar) {
        this.x = Long.valueOf(w7aVar.b);
        this.u.setCover(w7aVar.e);
        setTitle(w7aVar.f);
        setSubtitle(w7aVar.g);
        lzf lzfVar = w7aVar.h;
        if (lzfVar.d().isEmpty()) {
            u(null);
        }
        setState(lzfVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    public final void u(l1j l1jVar) {
        k1j k1jVar = l1jVar != null ? l1jVar.f : null;
        k1j k1jVar2 = this.y;
        if (k1jVar != k1jVar2 || k1jVar2 == null) {
            if (k1jVar != null) {
                long j = l1jVar.b;
                Long l = this.x;
                if (l != null && j == l.longValue()) {
                    setButtonState(k1jVar);
                } else {
                    setButtonState(k1j.a);
                }
            } else {
                setButtonState(k1j.a);
            }
        }
        this.y = k1jVar;
        this.u.setProgress(l1jVar != null ? l1jVar.g : 0.0f);
    }
}
