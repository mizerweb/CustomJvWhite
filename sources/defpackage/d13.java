package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;

/* JADX INFO: loaded from: classes.dex */
public final class d13 extends mj9 {
    public final /* synthetic */ ny8 g;
    public final /* synthetic */ ny8 h;
    public final /* synthetic */ e13 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d13(ny8 ny8Var, ny8 ny8Var2, e13 e13Var) {
        super(100);
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = e13Var;
    }

    @Override // defpackage.mj9
    public final Object a(Object obj) {
        Object poeVar;
        a13 a13Var = (a13) obj;
        ny8 ny8Var = this.g;
        ny8 ny8Var2 = this.h;
        e13 e13Var = this.i;
        try {
            String strF = ((oc8) ny8Var.getValue()).f(a13Var.a());
            if (strF != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                sb8.b(spannableStringBuilder, (char) 8203, new tdg(gm0.K(16.0f * yl5.d().getDisplayMetrics().density) + gm0.K(4.0f * yl5.d().getDisplayMetrics().density)), 33);
                spannableStringBuilder.append(((p4c) ny8Var2.getValue()).k.d(strF), new fqh(pq3.j.e(e13Var.b).m(), new xk1(25)), 33);
                poeVar = new SpannedString(spannableStringBuilder);
            } else {
                poeVar = null;
            }
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(e13Var.H, "Fail process typing", new z03(thA));
        }
        return (CharSequence) (poeVar instanceof poe ? null : poeVar);
    }
}
