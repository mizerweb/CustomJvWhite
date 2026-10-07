package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class v1d extends wod {
    public final /* synthetic */ int u;

    public v1d(Context context) {
        this.u = 1;
        TextView textView = new TextView(context);
        super(textView);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        int i2 = 8;
        lq4 lq4Var = null;
        View view = this.a;
        switch (i) {
            case 0:
                TextView textView = (TextView) view;
                CharSequence charSequenceB = ((c2d) k79Var).a.b(textView.getContext());
                textView.setText(charSequenceB != null ? charSequenceB : "");
                n1g.N(new xc9(3, lq4Var, i2), textView);
                break;
            case 1:
                kaf kafVar = (kaf) k79Var;
                TextView textView2 = (TextView) view;
                CharSequence charSequenceB2 = kafVar.a.b(textView2.getContext());
                textView2.setText(charSequenceB2 != null ? charSequenceB2 : "");
                n1g.N(new vzc(kafVar, lq4Var, i2), textView2);
                noh nohVar = q9i.a;
                q9i.a(kafVar.c, textView2);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1d(View view, int i) {
        super(view);
        this.u = i;
    }
}
