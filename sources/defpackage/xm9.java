package defpackage;

import android.content.Context;
import android.net.Uri;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xm9 {
    public static final int a = gm0.K(114.0f * yl5.d().getDisplayMetrics().density);
    public static final int b = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);

    public static final t6g a(Context context, ny8 ny8Var, zl9 zl9Var) {
        t6g t6gVar = new t6g(context);
        t6gVar.setId(R.id.oneme_location_map_logo_view);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        t6gVar.setPadding(iK, iK2, iK, iK2);
        ((wj7) t6gVar.getHierarchy()).h(i1f.n);
        b(t6gVar, context, zl9Var);
        qe7.H(t6gVar, 300L, new z36(context, 18, ny8Var));
        return t6gVar;
    }

    public static final void b(t6g t6gVar, Context context, zl9 zl9Var) {
        String str = null;
        if (pq3.j.e(context).n()) {
            if (zl9Var != null) {
                str = zl9Var.e;
            }
        } else if (zl9Var != null) {
            str = zl9Var.d;
        }
        if (str == null || r5h.X0(str)) {
            t6gVar.setVisibility(8);
            return;
        }
        t1d t1dVar = vd7.a.get();
        if (str.isEmpty()) {
            t1dVar.c = v78.b(str);
        } else {
            t1dVar.b(Uri.parse(str));
        }
        t1dVar.j = t6gVar.getController();
        t6gVar.setController(t1dVar.a());
        t6gVar.setVisibility(0);
    }
}
