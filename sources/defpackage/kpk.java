package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kpk {
    public static final int[] a = {-15093761, -5295120};

    public static final ArrayList a(int i, int i2, String str, List list) {
        ArrayList arrayListY1 = ww3.Y1(list, i, i);
        ArrayList arrayList = new ArrayList(yw3.W0(arrayListY1, 10));
        int i3 = 0;
        for (Object obj : arrayListY1) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                xw3.V0();
                throw null;
            }
            arrayList.add(new wgc(i3, i2, str, (List) obj));
            i3 = i4;
        }
        return arrayList;
    }

    public static final sg1 b(a80 a80Var) {
        int iD = qt4.D(a80Var.a);
        if (iD == 0) {
            return new og1(a80Var);
        }
        if (iD == 1) {
            return new pg1(a80Var);
        }
        if (iD != 2) {
            return iD != 3 ? new qg1(a80Var) : new rg1(a80Var);
        }
        return new ng1(a80Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    public static final gp1 c(tmc tmcVar, boolean z, boolean z2, boolean z3, p32 p32Var, pi6 pi6Var, fu1 fu1Var) {
        int i;
        int i2;
        String string;
        q42 q42Var = tmcVar.b;
        hu1 hu1Var = tmcVar.a;
        Context context = p32Var.a;
        if (z && hu1Var.c()) {
            i = 2;
        } else {
            i = 4;
            if (!z) {
                if (z2 && cqk.d(hu1Var.getId(), fu1Var)) {
                    i = 3;
                } else if (z2) {
                    i = 1;
                }
            }
        }
        boolean z4 = pi6Var instanceof mi6;
        if (!z4) {
            i2 = 3;
        } else if (hu1Var.h()) {
            i2 = 1;
        } else if (hu1Var.d()) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        boolean z5 = !z ? hu1Var.isConnected() || hu1Var.m() : z4 || (pi6Var instanceof oi6);
        fu1 id = hu1Var.getId();
        ok0 ok0Var = new ok0(gm0.a(q42Var.g(), Long.valueOf(q42Var.p())), q42Var.a());
        CharSequence name = q42Var.getName();
        boolean zC = hu1Var.c();
        boolean zD = hu1Var.d();
        boolean zH = hu1Var.h();
        boolean zK = hu1Var.k();
        boolean zS = hu1Var.s();
        boolean zQ = hu1Var.q();
        npi npiVar = new npi(hu1Var.getId().a, z, hu1Var.c(), hu1Var.v(), z || hu1Var.isConnected(), hu1Var.w(), hu1Var.isScreenCaptureEnabled(), hu1Var.t());
        boolean z6 = z5;
        e61 e61Var = new e61(i, z, cqk.d(fu1Var, hu1Var.getId()), false);
        CharSequence name2 = q42Var.getName();
        boolean zIsScreenCaptureEnabled = hu1Var.isScreenCaptureEnabled();
        boolean z7 = hu1Var.u() == 3;
        if (z) {
            name2 = context.getString(R.string.call_me_member);
        }
        String str = z7 ? "  " : "";
        boolean z8 = z7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append(name2);
        if (z8) {
            Drawable drawableE = o7j.e(R.drawable.ic_connection_fill_16, pq3.j.k(context).b.getIcon().j, context);
            drawableE.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            spannableStringBuilder.setSpan(new FitFontImageSpan(drawableE, null, false, false, 14, null), 0, 1, 17);
        }
        int i3 = i2;
        SpannableStringBuilder spannableStringBuilderD = p32Var.d(spannableStringBuilder, z, i3, z6, z3, zIsScreenCaptureEnabled, pi6Var);
        boolean zL = hu1Var.l();
        CharSequence name3 = q42Var.getName();
        if (zL) {
            name3 = context.getString(R.string.call_me_member);
        }
        if (hu1Var.l() && !hu1Var.isConnected()) {
            string = context.getString(R.string.call_user_connection_accessibility);
        } else if (hu1Var.h()) {
            string = context.getString(R.string.call_user_talking_accessibility);
        } else {
            string = !hu1Var.d() ? context.getString(R.string.call_user_microphone_disabled_accessibility) : null;
        }
        return new gp1(id, name, spannableStringBuilderD, ((Object) name3) + " " + string, ok0Var, zH, zK, z6, zC, zD, z2 ? hu1Var.f() : false, hu1Var.m(), z, zS, zQ, npiVar, e61Var, i3, q42Var.b());
    }

    public static final ty1 d(t4f t4fVar, tmc tmcVar, boolean z) {
        m4f m4fVar;
        hu1 hu1Var = tmcVar.a;
        fu1 fu1Var = (t4fVar == null || (m4fVar = t4fVar.b) == null) ? null : m4fVar.c;
        return new ty1(cqk.d(fu1Var, hu1Var.getId()), hu1Var.j(), (t4fVar != null ? t4fVar.a : null) == u4f.a, fu1Var, !z, t4fVar != null ? t4fVar.d : null);
    }

    public static final ll9 e(gp1 gp1Var, ao1 ao1Var, p32 p32Var) {
        boolean z;
        int i;
        boolean z2;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilderG;
        int i2;
        boolean z3 = ao1Var.n;
        ok0 ok0Var = gp1Var.e;
        CharSequence charSequence2 = gp1Var.b;
        fu1 fu1Var = gp1Var.a;
        boolean z4 = ao1Var.h;
        boolean z5 = z4 ? false : gp1Var.f;
        boolean z6 = gp1Var.h;
        boolean z7 = gp1Var.g;
        boolean z8 = ao1Var.n;
        npi npiVar = gp1Var.p;
        boolean z9 = gp1Var.m;
        int i3 = gp1Var.r;
        if (ao1Var.v || z4) {
            z = z7;
            i = i3;
            z2 = z9;
            charSequence = charSequence2;
            spannableStringBuilderG = null;
        } else {
            z2 = z9;
            z = z7;
            i = i3;
            charSequence = charSequence2;
            spannableStringBuilderG = p32Var.g(z2, i, charSequence, z4, z6, z8, npiVar.g, ao1Var.f, gp1Var.l);
        }
        String str = gp1Var.d;
        boolean z10 = gp1Var.k;
        boolean z11 = gp1Var.l;
        if (z11 && z3) {
            i2 = 4;
        } else if (z3) {
            i2 = ao1Var.f instanceof ni6 ? 3 : 2;
        } else {
            i2 = 1;
        }
        return new ll9(ok0Var, charSequence, fu1Var, gp1Var.s, z5, z8, z, z6, npiVar, z2, z10, i, spannableStringBuilderG, str, i2, z11);
    }

    public static final qgc f(gp1 gp1Var, boolean z, boolean z2, boolean z3) {
        fu1 fu1Var = gp1Var.a;
        ok0 ok0Var = gp1Var.e;
        boolean z4 = z ? gp1Var.f : false;
        CharSequence charSequence = gp1Var.b;
        CharSequence charSequence2 = gp1Var.c;
        boolean z5 = (z2 || z3) ? gp1Var.h : false;
        npi npiVar = gp1Var.p;
        int i = z ? gp1Var.q.c : 0;
        if (i == 0) {
            i = 4;
        }
        return new qgc(ok0Var, charSequence, fu1Var, z4, gp1Var.j, z5, npiVar, i, gp1Var.m, charSequence2);
    }
}
