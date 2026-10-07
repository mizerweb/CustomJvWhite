package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ps2 implements oub {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final mjg g;
    public final r8e h;
    public final cvb i;
    public final mjg j;

    public ps2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        mjg mjgVarA = p90.a(pub.a);
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        this.i = cvb.CHANNELS_FOLDER;
        this.j = p90.a(0);
        ((kub) ny8Var6.getValue()).b.put(this.i, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(ps2 ps2Var, nq4 nq4Var) {
        os2 os2Var;
        if (nq4Var instanceof os2) {
            os2Var = (os2) nq4Var;
            int i = os2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                os2Var.f = i - Integer.MIN_VALUE;
            } else {
                os2Var = new os2(ps2Var, nq4Var);
            }
        } else {
            os2Var = new os2(ps2Var, nq4Var);
        }
        Object objC = os2Var.d;
        int i2 = os2Var.f;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(objC);
            r17 r17VarI = ps2Var.i();
            if (r17VarI == null) {
                return sbiVar;
            }
            uy2 uy2Var = (uy2) ps2Var.e.getValue();
            LinkedHashSet linkedHashSet = r17VarI.j;
            ni3 li3Var = r17VarI.a() ? new li3(linkedHashSet) : new mi3(r17VarI.a, r17VarI.e, r17VarI.d, r17VarI.p, r17VarI.q, r17VarI.g, new zc6(linkedHashSet));
            os2Var.f = 1;
            objC = uy2Var.c(li3Var);
            Object obj = hu4.a;
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objC);
        }
        int size = ((List) objC).size();
        mjg mjgVar = ps2Var.j;
        Integer num = new Integer(size);
        mjgVar.getClass();
        mjgVar.j(null, num);
        return sbiVar;
    }

    @Override // defpackage.oub
    public final Long a() {
        xb9 xb9Var = (xb9) ((et3) this.b.getValue());
        return (Long) xb9Var.a1.m(xb9Var, xb9.g1[45]);
    }

    @Override // defpackage.oub
    public final boolean b() {
        r17 r17VarI;
        int i = 0;
        if (((Boolean) ((e5d) this.a.getValue()).x6.a(e5d.S6[389]).i()).booleanValue()) {
            kub kubVar = (kub) this.f.getValue();
            cvb cvbVar = this.i;
            kubVar.getClass();
            y1 y1Var = new y1(i, cvb.f);
            while (y1Var.hasNext()) {
                cvb cvbVar2 = (cvb) y1Var.next();
                if (cvbVar2.a < cvbVar.a) {
                    oub oubVar = (oub) kubVar.b.get(cvbVar2);
                    if (oubVar == null) {
                        String name = kub.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, name, zo5.o(cvbVar2.name(), " logic not registered, let skip it"), null);
                            }
                        }
                    } else if (oubVar.b()) {
                    }
                }
            }
            if (!e() && (r17VarI = i()) != null && r17VarI.s && ((Number) this.j.getValue()).intValue() < 20) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oub
    public final long c() {
        return ((s7f) ((et3) this.b.getValue())).f();
    }

    @Override // defpackage.oub
    public final void d() {
        if (a() != null) {
            return;
        }
        et3 et3Var = (et3) this.b.getValue();
        xb9 xb9Var = (xb9) et3Var;
        xb9Var.a1.B(xb9Var, xb9.g1[45], Long.valueOf(c()));
    }

    @Override // defpackage.oub
    public final void dismiss() {
        ((kub) this.f.getValue()).a.h(this.i, null);
        mjg mjgVar = this.g;
        mjgVar.getClass();
        mjgVar.j(null, pub.a);
    }

    @Override // defpackage.oub
    public final void f() {
        xb9 xb9Var = (xb9) ((et3) this.b.getValue());
        xb9Var.a1.B(xb9Var, xb9.g1[45], Long.MIN_VALUE);
    }

    @Override // defpackage.oub
    public final r8e getState() {
        return this.h;
    }

    public final Object h(af7 af7Var, lq4 lq4Var) {
        Object objK0 = yab.K0(((n0c) ((xhh) this.d.getValue())).a(), new qob(this, af7Var, null, 13), lq4Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public final r17 i() {
        return (r17) ((sy4) this.c.getValue()).j("chat.channel.folder").getValue();
    }
}
