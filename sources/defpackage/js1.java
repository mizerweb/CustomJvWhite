package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class js1 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public js1(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, String str, boolean z, long j2, nq4 nq4Var) {
        is1 is1Var;
        if (nq4Var instanceof is1) {
            is1Var = (is1) nq4Var;
            int i = is1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                is1Var.g = i - Integer.MIN_VALUE;
            } else {
                is1Var = new is1(this, nq4Var);
            }
        } else {
            is1Var = new is1(this, nq4Var);
        }
        Object objB = is1Var.e;
        int i2 = is1Var.g;
        if (i2 == 0) {
            ch3.d0(objB);
            cic cicVar = (cic) this.f.getValue();
            Long l = new Long(j2);
            is1Var.d = str;
            is1Var.g = 1;
            objB = cicVar.b(l, is1Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = is1Var.d;
            ch3.d0(objB);
        }
        yhc yhcVar = (yhc) objB;
        StringBuilder sb = new StringBuilder("💼  · ");
        if (str != null) {
            sb.append(str);
            sb.append(" · ");
        }
        if (yhcVar != null) {
            sb.append(yhcVar.b);
        } else {
            sb.append(((Context) this.d.getValue()).getString(R.string.call_incoming_from_organization));
        }
        return ((b56) this.a.getValue()).d(sb.toString());
    }
}
