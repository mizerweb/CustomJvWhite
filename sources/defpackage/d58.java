package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.LinearLayout;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class d58 extends s7g implements e5e {
    public final kbc u;
    public final wj7 v;
    public final dpe w;

    public d58(Context context) {
        super(new izb(context, false));
        this.u = pq3.j.e(context).j().b;
        xj7 xj7Var = new xj7(yl5.d());
        xj7Var.l = i1f.n;
        xj7Var.b = 0;
        this.v = xj7Var.a();
        this.w = new dpe();
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof c58) {
            izb izbVar = (izb) this.a;
            izbVar.setCustomTheme(this.u);
            izbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            izbVar.setPadding(gm0.K(16.0f * yl5.d().getDisplayMetrics().density), izbVar.getPaddingTop(), izbVar.getPaddingRight(), izbVar.getPaddingBottom());
            Uri uri = ((c58) k79Var).a;
            v78 v78VarA = w78.d(uri).a();
            b78 b78VarA = vd7.A();
            b78VarA.getClass();
            z68 z68Var = new z68(b78VarA, v78VarA, uri, u78.FULL_FETCH);
            dpe dpeVar = this.w;
            dpeVar.a(z68Var);
            t1d t1dVar = vd7.a.get();
            t1dVar.j = izbVar.getDraweeController();
            t1dVar.e = dpeVar;
            izbVar.l(this.v, t1dVar.a());
            String string = izbVar.getContext().getString(R.string.original);
            if (string.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = string.charAt(0);
                sb.append((Object) (Character.isLowerCase(cCharAt) ? tre.H0(cCharAt, Locale.getDefault()) : String.valueOf(cCharAt)));
                sb.append(string.substring(1));
                string = sb.toString();
            }
            izbVar.setTitle(string);
        }
    }

    @Override // defpackage.e5e
    public final void b(k79 k79Var, kx kxVar) {
        B(k79Var);
        qe7.H(this.a, 300L, new o37(6, kxVar));
    }
}
