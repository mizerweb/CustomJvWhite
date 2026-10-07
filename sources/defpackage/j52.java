package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class j52 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public j52(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var3;
        this.b = ny8Var2;
        this.c = ny8Var;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Comparable a(j52 j52Var, nq4 nq4Var) {
        h52 h52Var;
        if (nq4Var instanceof h52) {
            h52Var = (h52) nq4Var;
            int i = h52Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h52Var.f = i - Integer.MIN_VALUE;
            } else {
                h52Var = new h52(j52Var, nq4Var);
            }
        } else {
            h52Var = new h52(j52Var, nq4Var);
        }
        Object objB = h52Var.d;
        int i2 = h52Var.f;
        if (i2 == 0) {
            ch3.d0(objB);
            utd utdVar = (utd) j52Var.e.getValue();
            long jT = ((s7f) ((et3) j52Var.a.getValue())).t();
            h52Var.f = 1;
            objB = utdVar.b(jT, h52Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objB);
        }
        return ((vjd) objB).d;
    }

    public final CharSequence b(String str, boolean z) {
        if (str == null || r5h.X0(str)) {
            if (str != null) {
                return str.toString();
            }
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (z) {
            sb8.b(spannableStringBuilder, (char) 8203, new qsi((Context) this.f.getValue(), 2, false, l6m.e));
        }
        return spannableStringBuilder;
    }

    public final Object c(Set set, nq4 nq4Var) {
        return yab.K0(((n0c) ((xhh) this.c.getValue())).b(), new in1(set, this, null, 5), nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, nq4 nq4Var) {
        i52 i52Var;
        if (nq4Var instanceof i52) {
            i52Var = (i52) nq4Var;
            int i = i52Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                i52Var.f = i - Integer.MIN_VALUE;
            } else {
                i52Var = new i52(this, nq4Var);
            }
        } else {
            i52Var = new i52(this, nq4Var);
        }
        Object objI = i52Var.d;
        int i2 = i52Var.f;
        if (i2 == 0) {
            ch3.d0(objI);
            no4 no4Var = (no4) this.b.getValue();
            i52Var.f = 1;
            objI = no4Var.i(j);
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        vg4 vg4Var = (vg4) objI;
        return Boolean.valueOf(vg4Var != null ? vg4Var.I() : true);
    }

    public final Object e(Set set, mdh mdhVar) {
        boolean zIsEmpty = set.isEmpty();
        sbi sbiVar = sbi.a;
        if (zIsEmpty) {
            gm0.Y(j52.class.getName(), "Early return in loadMissedUsersByIds cuz of ids.isEmpty()");
            return sbiVar;
        }
        a0b a0bVar = (a0b) this.d.getValue();
        m8b m8bVarJ0 = rx8.j0(set);
        ghb ghbVar = ew5.b;
        Object objT = a0bVar.t(m8bVarJ0, qe7.O(30, lw5.SECONDS), mdhVar);
        return objT == hu4.a ? objT : sbiVar;
    }
}
