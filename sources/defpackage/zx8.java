package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zx8 extends wod {
    public final p1c u;
    public final ny8 v;

    public zx8(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        p1c p1cVar = new p1c(context, 14);
        p1cVar.setId(R.id.profile_edit_last_name_field);
        p1cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        p1cVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        p1cVar.setSingleLine(true);
        q9i.a(q9i.e, p1cVar);
        p1cVar.setHint(p1cVar.getResources().getText(R.string.oneme_contact_last_name_placeholder));
        p1cVar.setClipToOutline(true);
        p1cVar.setOutlineProvider(new nt4(gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
        p1cVar.setInputType(p1cVar.getInputType() | 16384);
        this.u = p1cVar;
        this.v = rx8.P(3, new n52(context, 13));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(p1cVar);
        n1g.N(new ud9(this, (lq4) null, 23), linearLayout);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        yx8 yx8Var = (yx8) k79Var;
        String str = yx8Var.a;
        if (str != null) {
            this.u.setText(str);
        }
        H(yx8Var.b);
    }

    public final void H(sx3 sx3Var) {
        ny8 ny8Var = this.v;
        if (ny8Var.d() || sx3Var != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) ny8Var.getValue();
            appCompatTextView.setVisibility(sx3Var != null ? 0 : 8);
            appCompatTextView.setText(sx3Var != null ? sx3Var.a(appCompatTextView.getContext()) : null);
            yab.e((ViewGroup) this.a, appCompatTextView, null);
        }
    }
}
