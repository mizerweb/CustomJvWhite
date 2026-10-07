package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s84 {
    public int a = -1;
    public boolean b;
    public Object c;

    public s84(Context context) {
        this.c = context;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(s84 s84Var, w65 w65Var, mq0 mq0Var) {
        iv8 iv8Var;
        byte bI;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        s84 s84Var2;
        byte bH;
        vyh vyhVar;
        vyh vyhVar2 = (vyh) s84Var.c;
        if (mq0Var instanceof iv8) {
            iv8Var = (iv8) mq0Var;
            int i = iv8Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                iv8Var.j = i - Integer.MIN_VALUE;
            } else {
                iv8Var = new iv8(s84Var, mq0Var);
            }
        } else {
            iv8Var = new iv8(s84Var, mq0Var);
        }
        Object obj = iv8Var.h;
        int i2 = iv8Var.j;
        if (i2 != 0) {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = iv8Var.g;
            linkedHashMap2 = iv8Var.f;
            s84Var2 = iv8Var.e;
            w65 w65Var2 = iv8Var.d;
            ch3.d0(obj);
            linkedHashMap2.put(str, (jt8) obj);
            bH = ((vyh) s84Var2.c).h();
            if (bH == 4) {
                bI = bH;
                s84Var = s84Var2;
                linkedHashMap = linkedHashMap2;
                w65Var = w65Var2;
            } else if (bH != 7) {
                vyh.q((vyh) s84Var2.c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            vyhVar = (vyh) s84Var2.c;
            if (bH == 6) {
                vyhVar.i((byte) 7);
            } else if (bH == 4) {
                xd2.j(vyhVar);
                throw null;
            }
            return new cu8(linkedHashMap2);
        }
        ch3.d0(obj);
        bI = vyhVar2.i((byte) 6);
        if (vyhVar2.E() == 4) {
            vyh.q(vyhVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        vyh vyhVar3 = (vyh) s84Var.c;
        if (vyhVar3.e()) {
            String strM = s84Var.b ? vyhVar3.m() : vyhVar3.l();
            vyhVar3.i((byte) 5);
            iv8Var.d = w65Var;
            iv8Var.e = s84Var;
            iv8Var.f = linkedHashMap;
            iv8Var.g = strM;
            iv8Var.j = 1;
            w65Var.a(iv8Var);
            return hu4.a;
        }
        linkedHashMap2 = linkedHashMap;
        s84Var2 = s84Var;
        bH = bI;
        vyhVar = (vyh) s84Var2.c;
        if (bH == 6) {
            vyhVar.i((byte) 7);
        } else if (bH == 4) {
            xd2.j(vyhVar);
            throw null;
        }
        return new cu8(linkedHashMap2);
    }

    public jt8 b() {
        jt8 cu8Var;
        vyh vyhVar = (vyh) this.c;
        byte bE = vyhVar.E();
        if (bE == 1) {
            return d(true);
        }
        if (bE == 0) {
            return d(false);
        }
        if (bE != 6) {
            if (bE == 8) {
                return c();
            }
            vyh.q(vyhVar, "Cannot read Json element because of unexpected ".concat(n1g.d0(bE)), 0, null, 6);
            throw null;
        }
        int i = this.a + 1;
        this.a = i;
        if (i == 200) {
            cu8Var = (jt8) arl.b(new zo7(12, new hv8(this, null)));
        } else {
            byte bI = vyhVar.i((byte) 6);
            if (vyhVar.E() == 4) {
                vyh.q(vyhVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (vyhVar.e()) {
                String strM = this.b ? vyhVar.m() : vyhVar.l();
                vyhVar.i((byte) 5);
                linkedHashMap.put(strM, b());
                bI = vyhVar.h();
                if (bI != 4) {
                    if (bI == 7) {
                        break;
                    }
                    vyh.q(vyhVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bI == 6) {
                vyhVar.i((byte) 7);
            } else if (bI == 4) {
                xd2.j(vyhVar);
                throw null;
            }
            cu8Var = new cu8(linkedHashMap);
        }
        this.a--;
        return cu8Var;
    }

    public ss8 c() {
        vyh vyhVar = (vyh) this.c;
        byte bH = vyhVar.h();
        if (vyhVar.E() == 4) {
            vyh.q(vyhVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (vyhVar.e()) {
            arrayList.add(b());
            bH = vyhVar.h();
            if (bH != 4) {
                boolean z = bH == 9;
                int i = vyhVar.b;
                if (!z) {
                    vyh.q(vyhVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bH == 8) {
            vyhVar.i((byte) 9);
        } else if (bH == 4) {
            xd2.i(vyhVar, "array");
            throw null;
        }
        return new ss8(arrayList);
    }

    public pu8 d(boolean z) {
        vyh vyhVar = (vyh) this.c;
        String strM = (this.b || !z) ? vyhVar.m() : vyhVar.l();
        return (z || !cqk.d(strM, "null")) ? new vt8(strM, z, null) : zt8.INSTANCE;
    }
}
