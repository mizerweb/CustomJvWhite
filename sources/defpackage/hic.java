package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class hic extends s7g {
    public final ny8 u;
    public CharSequence v;

    public hic(Context context) {
        gic gicVar = new gic(context);
        super(gicVar);
        this.u = rx8.P(3, new bzb(context, 16));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 30.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(30.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        gicVar.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.s7g
    public final void G() {
        CharSequence charSequence = this.v;
        if (charSequence != null) {
            ((r59) this.u.getValue()).getClass();
            r59.a(charSequence);
        }
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(eic eicVar) {
        CharSequence charSequence = eicVar.a;
        this.v = charSequence;
        gic gicVar = (gic) this.a;
        TextView textView = gicVar.d;
        gicVar.j = eicVar;
        boolean z = charSequence == null || charSequence.length() == 0;
        textView.setVisibility(z ? 8 : 0);
        String str = eicVar.b;
        l1c l1cVar = gicVar.b;
        if (str == null || str.length() == 0) {
            l1cVar.setController(null);
        } else {
            w78 w78VarD = w78.d(Uri.parse(str));
            w78VarD.f = gicVar.e;
            w78VarD.k = new vj0(gm0.K(yl5.d().getDisplayMetrics().density * 72.0f), gm0.K(72.0f * yl5.d().getDisplayMetrics().density));
            v78 v78VarA = w78VarD.a();
            t1d t1dVar = vd7.a.get();
            t1dVar.c = v78VarA;
            t1dVar.j = l1cVar.getController();
            l1cVar.setController(t1dVar.a());
        }
        if (!z) {
            textView.setText(dll.a(charSequence));
            q9i.a(q9i.d, textView);
            gicVar.a(pq3.j.h(gicVar));
        }
        gicVar.requestLayout();
    }
}
