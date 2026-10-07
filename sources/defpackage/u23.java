package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class u23 extends wf4 implements eph {
    public final TextView s;
    public final TextView t;
    public final Drawable u;
    public final FrameLayout v;
    public final ny8 w;
    public final kwb x;
    public final ImageView y;

    public u23(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        uf4 uf4Var = new uf4(-1, -2);
        ((ViewGroup.MarginLayoutParams) uf4Var).bottomMargin = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(uf4Var);
        q9i.a(q9i.f, textView);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setLetterSpacing(0.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.s = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new uf4(-1, -2));
        q9i.a(q9i.i, textView2);
        textView2.setMaxLines(1);
        this.t = textView2;
        int iK = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_file_fill).mutate();
        this.u = drawableMutate;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.profile_media_file_icon);
        uf4 uf4Var2 = new uf4(iK, iK);
        uf4Var2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        frameLayout.setLayoutParams(uf4Var2);
        this.v = frameLayout;
        this.w = rx8.P(3, new za2(context, 7, this));
        kwb kwbVar = new kwb(context);
        kwbVar.setId(R.id.profile_media_file_preview);
        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        kwbVar.setAvatarShape(cwb.a);
        kwb.y(kwbVar, drawableMutate, null, null, null, 30);
        frameLayout.addView(kwbVar);
        this.x = kwbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.profile_media_file_content_ll);
        linearLayout.setLayoutParams(new uf4(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.profile_media_file_download_state_icon);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        imageView.setVisibility(4);
        this.y = imageView;
        setLayoutParams(new uf4(-1, -2));
        a8g a8gVar = pq3.j;
        setBackground(col.b(((bs0) a8gVar.h(this).u().c.g).c, null, new ColorDrawable(-1)));
        setMinimumHeight(gm0.K(72.0f * yl5.d().getDisplayMetrics().density));
        setPaddingRelative(0, gm0.K(yl5.d().getDisplayMetrics().density * 15.0f), 0, gm0.K(15.0f * yl5.d().getDisplayMetrics().density));
        addView(frameLayout);
        addView(linearLayout);
        addView(imageView);
        eg4 eg4VarH = ch3.h(this);
        int id = frameLayout.getId();
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 6, frameLayout.getId(), 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id2));
        eg4VarH.d(id2, 7, 0, 7);
        new bsb(7, eg4VarH, id2).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
        onThemeChanged(a8gVar.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.s.setTextColor(kbcVar.getText().b);
        this.t.setTextColor(kbcVar.getText().d);
        this.x.onThemeChanged(kbcVar);
        this.y.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
    }

    public final void setFileDescription(CharSequence charSequence) {
        this.t.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }
}
