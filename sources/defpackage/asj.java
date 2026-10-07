package defpackage;

import java.util.Collections;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class asj implements os8 {
    public final tt8 a;
    public final ny8 b;
    public final Set c = Collections.singleton("unsupported_method_handler");
    public final p41 d = yab.b(0, 0, null, 7);
    public jdj e;

    public asj(tt8 tt8Var, ny8 ny8Var) {
        this.a = tt8Var;
        this.b = ny8Var;
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        this.e = jdjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        zrj zrjVar;
        tt8 tt8Var = this.a;
        if (lq4Var instanceof zrj) {
            zrjVar = (zrj) lq4Var;
            int i = zrjVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrjVar.f = i - Integer.MIN_VALUE;
            } else {
                zrjVar = new zrj(this, (nq4) lq4Var);
            }
        } else {
            zrjVar = new zrj(this, (nq4) lq4Var);
        }
        Object obj = zrjVar.d;
        int i2 = zrjVar.f;
        Object objA = null;
        if (i2 == 0) {
            ch3.d0(obj);
            try {
                objA = tt8Var.a(aei.Companion.serializer(), str2);
            } catch (IllegalArgumentException e) {
                gm0.V(tt8.class.getName(), "json parse error", new WebAppJsonException(e));
            }
            aei aeiVar = (aei) objA;
            if (aeiVar != null) {
                fs8 fs8Var = new fs8("unsupported_method", tt8Var.b(ya6.Companion.serializer(), new ya6(aeiVar.a, new xa6("client.unsupported_method.unsupported_method"))), false);
                zrjVar.f = 1;
                Object objA2 = this.d.a(zrjVar, fs8Var);
                hu4 hu4Var = hu4.a;
                if (objA2 == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        jdj jdjVar = this.e;
        if (jdjVar != null) {
            fgj.a((fgj) this.b.getValue(), "unsupported_method", jdjVar.a, jdjVar.b, false, 1, new Integer(0), new Integer(1), np0.m);
        }
        return sbi.a;
    }

    @Override // defpackage.os8
    public final p41 d() {
        return this.d;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.c;
    }
}
