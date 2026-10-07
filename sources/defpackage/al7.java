package defpackage;

import android.content.Context;
import android.text.Spannable;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class al7 {
    public final ny8 a;
    public final ny8 b;

    public al7(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final CharSequence a(String str, List list) {
        p4c p4cVar = (p4c) this.a.getValue();
        Pattern pattern = xoh.a;
        if (!ch3.r(str)) {
            str = xoh.i.matcher(str).replaceAll("\n");
        }
        Spannable spannableK = xr8.k(tre.z0(p4cVar.b(p4cVar.n(p4cVar.k.d(str), list, true, (int) (vl5.e(q9i.i.k(bx5.b)) * yl5.d().getDisplayMetrics().density), true), false, false, false, true, list, true, true)), ((xac) pq3.j.e((Context) this.b.getValue()).m().f().a).b.a, (24 & 4) != 0, null);
        return spannableK == null ? "" : spannableK;
    }
}
