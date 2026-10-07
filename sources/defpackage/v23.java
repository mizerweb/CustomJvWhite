package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class v23 extends wf4 implements eph {
    public final ny8 s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final kwb w;
    public final LinearLayout x;

    public v23(Context context) {
        super(context, null);
        this.s = rx8.P(3, new yk1(27, this));
        TextView textView = new TextView(context);
        uf4 uf4Var = new uf4(-1, -2);
        ((ViewGroup.MarginLayoutParams) uf4Var).bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        textView.setLayoutParams(uf4Var);
        q9i.a(q9i.f, textView);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.t = textView;
        TextView textView2 = new TextView(context);
        uf4 uf4Var2 = new uf4(-1, -2);
        ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        textView2.setLayoutParams(uf4Var2);
        noh nohVar = q9i.i;
        q9i.a(nohVar, textView2);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.u = textView2;
        TextView textView3 = new TextView(context);
        textView3.setLayoutParams(new uf4(-1, -2));
        q9i.a(nohVar, textView3);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        a8g a8gVar = pq3.j;
        textView3.setBackground(col.b(((bs0) a8gVar.h(textView3).u().c.g).c, null, new ColorDrawable(-1)));
        this.v = textView3;
        kwb kwbVar = new kwb(context);
        kwbVar.setId(R.id.profile_media_link_preview);
        kwbVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
        kwbVar.setAvatarShape(cwb.a);
        this.w = kwbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.profile_media_link_content_ll);
        linearLayout.setLayoutParams(new uf4(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        this.x = linearLayout;
        setLayoutParams(new uf4(-1, -2));
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        setPadding(iK, iK, iK, iK);
        setBackground(col.b(((bs0) a8gVar.h(this).u().c.g).c, null, new ColorDrawable(-1)));
        addView(kwbVar);
        addView(linearLayout);
        onThemeChanged(a8gVar.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.t.setTextColor(kbcVar.getText().b);
        this.u.setTextColor(kbcVar.getText().d);
        this.v.setTextColor(kbcVar.getText().h);
        this.w.onThemeChanged(kbcVar);
    }

    public final void setLink(CharSequence charSequence) {
        int i = charSequence != null ? 0 : 8;
        TextView textView = this.v;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final void setLinkOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.v.setOnLongClickListener(onLongClickListener);
    }

    public final void setLinkPhoto(String str) {
        tj0 tj0VarA = gm0.a(this.t.getText(), 9223372036854775806L);
        kwb kwbVar = this.w;
        kwbVar.setAvatarUrl(str);
        kwbVar.t(tj0VarA, false);
        u();
    }

    public final void setOnLinkClickListener(View.OnClickListener onClickListener) {
        qe7.H(this.v, 300L, onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i = charSequence == null || charSequence.length() == 0 ? 8 : 0;
        TextView textView = this.u;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.t.setText(charSequence);
    }

    public final void u() {
        eg4 eg4VarH = ch3.h(this);
        kwb kwbVar = this.w;
        qf4 qf4Var = new qf4(eg4VarH, kwbVar.getId());
        qf4Var.o(0);
        qf4Var.q(0);
        qf4Var.a(0);
        qf4 qf4Var2 = new qf4(eg4VarH, this.x.getId());
        qf4Var2.q(0);
        qf4Var2.a(0);
        qf4Var2.f(0);
        qf4Var2.n(kwbVar.getId()).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
    }
}
