package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ydf extends wod {
    public final ImageView u;
    public final AppCompatTextView v;
    public final AppCompatTextView w;

    public ydf(Context context) {
        wf4 wf4Var = new wf4(context);
        super(wf4Var);
        ImageView imageView = new ImageView(context);
        uf4 uf4Var = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        imageView.setId(R.id.profile_edit_selectable_item_checkbox);
        uf4Var.t = 0;
        uf4Var.i = 0;
        uf4Var.l = 0;
        imageView.setLayoutParams(uf4Var);
        this.u = imageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.profile_edit_selectable_item_title);
        uf4 uf4Var2 = new uf4(0, -2);
        appCompatTextView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingEnd(), appCompatTextView.getPaddingBottom());
        uf4Var2.s = R.id.profile_edit_selectable_item_checkbox;
        uf4Var2.i = 0;
        uf4Var2.v = 0;
        appCompatTextView.setLayoutParams(uf4Var2);
        appCompatTextView.setSingleLine(true);
        q9i.a(q9i.f, appCompatTextView);
        this.v = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.profile_edit_selectable_item_subtitle);
        uf4 uf4Var3 = new uf4(0, -2);
        uf4Var3.t = R.id.profile_edit_selectable_item_title;
        uf4Var3.j = R.id.profile_edit_selectable_item_title;
        uf4Var3.l = 0;
        uf4Var3.v = 0;
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        appCompatTextView2.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), iK, appCompatTextView2.getPaddingEnd(), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        appCompatTextView2.setLayoutParams(uf4Var3);
        q9i.a(q9i.i, appCompatTextView2);
        this.w = appCompatTextView2;
        wf4Var.setLayoutParams(new uf4(-1, -2));
        wf4Var.addView(imageView);
        wf4Var.addView(appCompatTextView);
        wf4Var.addView(appCompatTextView2);
        wf4Var.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        n1g.N(new vqa(this, (lq4) null, 27), wf4Var);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        xdf xdfVar = (xdf) k79Var;
        Integer numValueOf = Integer.valueOf(xdfVar.a);
        View view = this.a;
        tre.E0(R.id.profile_selectable_item_tag, view, numValueOf);
        this.v.setText(xdfVar.c.b(view.getContext()));
        this.w.setText(xdfVar.d.b(view.getContext()));
        boolean z = xdfVar.b;
        ImageView imageView = this.u;
        imageView.setSelected(z);
        imageView.setImageDrawable(z ? view.getContext().getDrawable(R.drawable.icon_check) : null);
    }
}
