package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class c83 extends wod {
    public final jac u;
    public final ny8 v;

    public c83(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        jac jacVar = new jac(context);
        jacVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jacVar.setBackgroundColorAttr(Integer.valueOf(R.attr.background_card));
        jacVar.setHintColorAttr(R.attr.text_tertiary);
        jacVar.setClipToOutline(true);
        jacVar.setOutlineProvider(new nt4(gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
        this.u = jacVar;
        this.v = rx8.P(3, new n52(context, 3));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(jacVar);
        linearLayout.setBackground(null);
        n1g.N(new ud9(this, (lq4) null, 9), linearLayout);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        b83 b83Var = (b83) k79Var;
        CharSequence charSequenceA = b83Var.b.a(this);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        String string = charSequenceA.toString();
        jac jacVar = this.u;
        jacVar.setHint(string);
        jacVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(b83Var.d)});
        String str = b83Var.a;
        if (str != null) {
            jacVar.setText(str);
        }
        H(b83Var.c);
    }

    public final void H(sx3 sx3Var) {
        ny8 ny8Var = this.v;
        if (ny8Var.d() || sx3Var != null) {
            TextView textView = (TextView) ny8Var.getValue();
            textView.setVisibility(sx3Var != null ? 0 : 8);
            textView.setText(sx3Var != null ? sx3Var.a(textView.getContext()) : null);
            yab.e((ViewGroup) this.a, textView, -1);
        }
    }
}
