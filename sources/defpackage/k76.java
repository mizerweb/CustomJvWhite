package defpackage;

import android.text.SpannableString;
import android.text.Spanned;
import java.util.List;
import java.util.Objects;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class k76 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;

    public k76(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var5;
        this.e = ny8Var4;
        this.f = ny8Var6;
        this.g = ny8Var7;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    public static final d76 a(k76 k76Var, hi4 hi4Var, rt2 rt2Var, tnh tnhVar, tnh tnhVar2) {
        CharSequence charSequenceY1;
        SpannableString spannableString;
        CharSequence charSequenceY2;
        o60 o60Var;
        k76Var.getClass();
        String str = hi4Var.b;
        e70 e70Var = hi4Var.a;
        if (str != null) {
            al7 al7Var = (al7) k76Var.e.getValue();
            List list = hi4Var.c;
            if (list == null) {
                list = r66.a;
            }
            charSequenceY1 = al7Var.a(str, list);
        } else {
            charSequenceY1 = "";
        }
        g58 g58VarA = (e70Var == null || (o60Var = e70Var.b) == null) ? null : ((quc) k76Var.d.getValue()).a(o60Var, e70Var, dul.g, rt2Var.A(), 0L);
        if (charSequenceY1 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequenceY1;
            Object objB1 = a.b1(spanned.getSpans(0, charSequenceY1.length(), ju7.class));
            if (objB1 == null) {
                spannableString = null;
            } else {
                int spanStart = spanned.getSpanStart(objB1);
                int spanEnd = spanned.getSpanEnd(objB1);
                if (spanStart < 0 || spanEnd <= spanStart) {
                    spannableString = null;
                } else {
                    spannableString = new SpannableString(charSequenceY1.subSequence(spanStart, spanEnd));
                    for (Object obj : spanned.getSpans(spanStart, spanEnd, Object.class)) {
                        int spanStart2 = spanned.getSpanStart(obj);
                        int spanEnd2 = spanned.getSpanEnd(obj);
                        int spanFlags = spanned.getSpanFlags(obj);
                        int iMax = Math.max(spanStart2, spanStart) - spanStart;
                        int iMin = Math.min(spanEnd2, spanEnd) - spanStart;
                        if (iMax < iMin) {
                            spannableString.setSpan(obj, iMax, iMin, spanFlags);
                        }
                    }
                }
            }
        } else {
            spannableString = null;
        }
        if (spannableString == null) {
            spannableString = null;
        }
        if (spannableString != null) {
            try {
                for (Object obj2 : spannableString.getSpans(0, spannableString.length(), ju7.class)) {
                    spannableString.removeSpan(obj2);
                }
            } catch (Throwable unused) {
            }
            charSequenceY2 = r5h.y1(spannableString);
        } else {
            charSequenceY2 = null;
        }
        if (charSequenceY2 != null && charSequenceY2.length() != 0) {
            charSequenceY1 = r5h.y1(charSequenceY1.subSequence(charSequenceY2.length(), charSequenceY1.length()));
        }
        ynh xnhVar = (charSequenceY2 == null || charSequenceY2.length() == 0) ? tnhVar : new xnh(charSequenceY2);
        ynh xnhVar2 = charSequenceY1.length() == 0 ? tnhVar2 : new xnh(dll.a(charSequenceY1));
        String strS = rt2Var.s(us0.c, rs0.a);
        vg4 vg4VarW = rt2Var.w();
        return new d76(strS, vg4VarW != null ? vg4VarW.u() : null, rt2Var.q(), g58VarA, xnhVar, xnhVar2, true, hi4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(k76 k76Var, vg4 vg4Var, tlg tlgVar, nq4 nq4Var) {
        j76 j76Var;
        String strI;
        k76Var.getClass();
        if (nq4Var instanceof j76) {
            j76Var = (j76) nq4Var;
            int i = j76Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                j76Var.h = i - Integer.MIN_VALUE;
            } else {
                j76Var = new j76(k76Var, nq4Var);
            }
        } else {
            j76Var = new j76(k76Var, nq4Var);
        }
        Object objI = j76Var.f;
        int i2 = j76Var.h;
        if (i2 == 0) {
            ch3.d0(objI);
            no4 no4Var = (no4) k76Var.g.getValue();
            long jT = ((s7f) ((et3) k76Var.a.getValue())).t();
            j76Var.d = vg4Var;
            j76Var.e = tlgVar;
            j76Var.h = 1;
            objI = no4Var.i(jT);
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tlgVar = j76Var.e;
            vg4Var = j76Var.d;
            ch3.d0(objI);
        }
        vg4 vg4Var2 = (vg4) objI;
        if (!((Boolean) ((f5d) ((wo6) k76Var.b.getValue())).a.m5.a(e5d.S6[326]).i()).booleanValue() || vg4Var2 == null || vg4Var == null) {
            return new e76(tlgVar);
        }
        if (vg4Var.h() || Objects.equals(vg4Var2.a.b.w, vg4Var.a.b.w) || (strI = vg4Var.i()) == null || strI.length() == 0) {
            return new e76(tlgVar);
        }
        return null;
    }
}
