package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class zgj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final Set c;
    public final p41 d;

    public zgj(qs8 qs8Var, ny8 ny8Var) {
        this.a = qs8Var;
        this.b = ny8Var;
        ma6 ma6Var = vgj.c;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            ((vgj) y1Var.next()).getClass();
            arrayList.add("WebAppOpenCodeReader");
        }
        this.c = ww3.X1(arrayList);
        this.d = yab.b(0, 0, null, 7);
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object next;
        sbi sbiVar = sbi.a;
        Iterator it = vgj.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((vgj) next).getClass();
        } while (!"WebAppOpenCodeReader".equals(str));
        vgj vgjVar = (vgj) next;
        if (vgjVar == null) {
            String name = zgj.class.getName();
            String str3 = "Unknown method with name = " + str + " in JsDelegate: " + this;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, name, str3, null, null, 8);
                return sbiVar;
            }
        } else {
            if (wgj.$EnumSwitchMapping$0[vgjVar.ordinal()] != 1) {
                ore.o();
                return null;
            }
            Object objF = f(str2, (nq4) lq4Var);
            if (objF == hu4.a) {
                return objF;
            }
        }
        return sbiVar;
    }

    @Override // defpackage.os8
    public final p41 d() {
        return this.d;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object f(String str, nq4 nq4Var) {
        xgj xgjVar;
        vgj vgjVar;
        vgj vgjVar2;
        Object objA;
        wlj wljVar;
        pgj pgjVar;
        p41 p41Var;
        vgj vgjVar3;
        Object objC;
        wlj wljVar2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof xgj) {
            xgjVar = (xgj) nq4Var;
            int i = xgjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgjVar.i = i - Integer.MIN_VALUE;
            } else {
                xgjVar = new xgj(this, nq4Var);
            }
        } else {
            xgjVar = new xgj(this, nq4Var);
        }
        xgj xgjVar2 = xgjVar;
        Object obj = xgjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = xgjVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                vgjVar2 = xgjVar2.d;
                ch3.d0(obj);
            } else {
                if (i2 == 2) {
                    pgjVar = xgjVar2.f;
                    wlj wljVar3 = xgjVar2.e;
                    vgj vgjVar4 = xgjVar2.d;
                    ch3.d0(obj);
                    wljVar = wljVar3;
                    vgjVar3 = vgjVar4;
                    ygj ygjVar = new ygj(this, wljVar, vgjVar3, (lq4) null);
                    xgjVar2.d = vgjVar3;
                    xgjVar2.e = wljVar;
                    xgjVar2.f = null;
                    xgjVar2.i = 3;
                    objC = pgjVar.c(ygjVar, xgjVar2);
                    if (objC != hu4Var) {
                        wljVar2 = wljVar;
                        obj = objC;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wljVar2 = xgjVar2.e;
                vgjVar3 = xgjVar2.d;
                ch3.d0(obj);
            }
            ygj ygjVar2 = new ygj(this, vgjVar3, wljVar2, (lq4) null);
            xgjVar2.d = null;
            xgjVar2.e = null;
            xgjVar2.f = null;
            xgjVar2.i = 4;
            return ((es8) obj).d(ygjVar2, xgjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(obj);
        vgjVar = vgj.a;
        qs8 qs8Var = this.a;
        l44 l44Var = (l44) this.b.getValue();
        p41 p41Var2 = this.d;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(wlj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + vgjVar, webAppJsonException);
                }
            }
            xgjVar2.d = vgjVar;
            xgjVar2.e = null;
            xgjVar2.f = null;
            xgjVar2.i = 1;
            if (l44Var.a(p41Var2, ks8Var, vgjVar, null, xgjVar2) != hu4Var) {
                vgjVar2 = vgjVar;
                vgjVar = vgjVar2;
                objA = null;
            }
        }
        wljVar = (wlj) objA;
        if (wljVar != null) {
            Boolean bool = wljVar.b;
            pgjVar = new pgj(bool != null ? bool.booleanValue() : true);
            p41Var = this.d;
            xgjVar2.d = vgjVar;
            xgjVar2.e = wljVar;
            xgjVar2.f = pgjVar;
            xgjVar2.i = 2;
            if (p41Var.a(xgjVar2, pgjVar) != hu4Var) {
                vgjVar3 = vgjVar;
                ygj ygjVar3 = new ygj(this, wljVar, vgjVar3, (lq4) null);
                xgjVar2.d = vgjVar3;
                xgjVar2.e = wljVar;
                xgjVar2.f = null;
                xgjVar2.i = 3;
                objC = pgjVar.c(ygjVar3, xgjVar2);
                if (objC != hu4Var) {
                    wljVar2 = wljVar;
                    obj = objC;
                    ygj ygjVar4 = new ygj(this, vgjVar3, wljVar2, (lq4) null);
                    xgjVar2.d = null;
                    xgjVar2.e = null;
                    xgjVar2.f = null;
                    xgjVar2.i = 4;
                    if (((es8) obj).d(ygjVar4, xgjVar2) == hu4Var) {
                    }
                }
            }
        }
        vgjVar = vgjVar2;
        objA = null;
        wljVar = (wlj) objA;
        if (wljVar != null) {
            Boolean bool2 = wljVar.b;
            pgjVar = new pgj(bool2 != null ? bool2.booleanValue() : true);
            p41Var = this.d;
            xgjVar2.d = vgjVar;
            xgjVar2.e = wljVar;
            xgjVar2.f = pgjVar;
            xgjVar2.i = 2;
            if (p41Var.a(xgjVar2, pgjVar) != hu4Var) {
                vgjVar3 = vgjVar;
                ygj ygjVar5 = new ygj(this, wljVar, vgjVar3, (lq4) null);
                xgjVar2.d = vgjVar3;
                xgjVar2.e = wljVar;
                xgjVar2.f = null;
                xgjVar2.i = 3;
                objC = pgjVar.c(ygjVar5, xgjVar2);
                if (objC != hu4Var) {
                    wljVar2 = wljVar;
                    obj = objC;
                    ygj ygjVar6 = new ygj(this, vgjVar3, wljVar2, (lq4) null);
                    xgjVar2.d = null;
                    xgjVar2.e = null;
                    xgjVar2.f = null;
                    xgjVar2.i = 4;
                    if (((es8) obj).d(ygjVar6, xgjVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
