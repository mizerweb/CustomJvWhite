package defpackage;

import android.content.Context;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class su2 {
    public static final /* synthetic */ zv8[] d;
    public final Context a;
    public final noh b = q9i.g.h();
    public final fbc c = new fbc(19, new b6(22));

    static {
        dwd dwdVar = new dwd(su2.class, "tempTextPaint", "getTempTextPaint()Landroid/text/TextPaint;", 0);
        zfe.a.getClass();
        d = new zv8[]{dwdVar};
    }

    public su2(Context context) {
        this.a = context;
    }

    public final int a(int i, ru2 ru2Var) {
        int iD = (i - c0a.d(6.0f, yl5.d().getDisplayMetrics().density, 2)) - gm0.K(68.0f * yl5.d().getDisplayMetrics().density);
        int i2 = ru2Var.a;
        if (i2 > 0 || ru2Var.b) {
            int iK = gm0.K((i2 > 0 ? 32 + (Math.max(0, l5h.a(i2).length()) * 8) : 32) * yl5.d().getDisplayMetrics().density);
            if (ru2Var.a > 0 && ru2Var.b) {
                iK += gm0.K(20.0f * yl5.d().getDisplayMetrics().density) - gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
            }
            iD -= iK;
        }
        CharSequence charSequence = ru2Var.c;
        if (charSequence != null) {
            ayb aybVar = ayb.j;
            noh nohVar = aybVar.f;
            int iD2 = zo5.D(12.0f, yl5.d().getDisplayMetrics().density, iD);
            Context context = this.a;
            fbc fbcVar = this.c;
            zv8[] zv8VarArr = d;
            zv8 zv8Var = zv8VarArr[0];
            noh.d(nohVar, context, (TextPaint) ((oqh) fbcVar.c).get(), null, null, 12);
            fbc fbcVar2 = this.c;
            zv8 zv8Var2 = zv8VarArr[0];
            iD = (iD2 - gm0.K(((TextPaint) ((oqh) fbcVar2.c).get()).measureText(charSequence, 0, charSequence.length()))) - (aybVar.e * 2);
        }
        int iD3 = zo5.D(12.0f, yl5.d().getDisplayMetrics().density, iD);
        if (iD3 >= gm0.K(yl5.d().getDisplayMetrics().density * 32.0f)) {
            return iD3;
        }
        float f = this.a.getResources().getDisplayMetrics().density;
        float f2 = yl5.d().getDisplayMetrics().density;
        int i3 = this.a.getResources().getDisplayMetrics().widthPixels;
        int i4 = this.a.getResources().getDisplayMetrics().heightPixels;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbP = qv1.p("Invalid calculatePreciseWidth: screenWidth=", i, ", calculatedWidth=", iD3, ", contextDensity=");
                c0a.u(sbP, f, ", systemDensity=", f2, ", contextSize=");
                qt4.x(i3, i4, "x", ", payload=", sbP);
                sbP.append(ru2Var);
                a4cVar.c(je9Var, "ChatCellSubtitleUiOptions", sbP.toString(), null);
            }
        }
        return gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
    }
}
