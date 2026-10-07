package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o97 {
    public final t40 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public o97(ny8 ny8Var, ny8 ny8Var2, t40 t40Var, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = t40Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (r4 == r14) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.sfa r18, java.lang.Long r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o97.a(sfa, java.lang.Long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, nq4 nq4Var, List list) {
        n97 n97Var;
        if (nq4Var instanceof n97) {
            n97Var = (n97) nq4Var;
            int i = n97Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                n97Var.g = i - Integer.MIN_VALUE;
            } else {
                n97Var = new n97(this, nq4Var);
            }
        } else {
            n97Var = new n97(this, nq4Var);
        }
        Object objV = n97Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = n97Var.g;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3Var = (xn3) this.d.getValue();
            n97Var.d = list;
            n97Var.g = 1;
            objV = xn3Var.v(j, n97Var);
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = n97Var.d;
            ch3.d0(objV);
        }
        rt2 rt2Var = (rt2) objV;
        rt2Var.K0();
        CharSequence charSequence = rt2Var.j;
        boolean zU0 = rt2Var.u0();
        int size = list.size();
        return new l97(new rnh(R.plurals.picker_chats_list_forward_messages, size, a.n1(new Object[]{new Integer(size), charSequence})), zU0, null, ((lk7) this.e.getValue()).a(rt2Var, list));
    }
}
