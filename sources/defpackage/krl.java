package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class krl {
    public static void a(qlb qlbVar) {
        qlbVar.E = 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(u8b u8bVar, m20 m20Var, nq4 nq4Var) {
        qkg qkgVar;
        if (nq4Var instanceof qkg) {
            qkgVar = (qkg) nq4Var;
            int i = qkgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qkgVar.f = i - Integer.MIN_VALUE;
            } else {
                qkgVar = new qkg(nq4Var);
            }
        } else {
            qkgVar = new qkg(nq4Var);
        }
        Object objInvoke = qkgVar.e;
        Object obj = hu4.a;
        int i2 = qkgVar.f;
        if (i2 == 0) {
            ch3.d0(objInvoke);
            if (u8bVar.i()) {
                return cqb.b;
            }
            m8b m8bVar = new m8b(u8bVar.b);
            Object[] objArr = u8bVar.a;
            int i3 = u8bVar.b;
            for (int i4 = 0; i4 < i3; i4++) {
                m8bVar.m(((jwg) objArr[i4]).a);
            }
            qkgVar.d = u8bVar;
            qkgVar.f = 1;
            objInvoke = m20Var.invoke(m8bVar, qkgVar);
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u8bVar = qkgVar.d;
            ch3.d0(objInvoke);
        }
        Map map = (Map) objInvoke;
        u8b u8bVar2 = new u8b(u8bVar.b);
        Object[] objArr2 = u8bVar.a;
        int i5 = u8bVar.b;
        for (int i6 = 0; i6 < i5; i6++) {
            jwg jwgVar = (jwg) objArr2[i6];
            vg4 vg4Var = (vg4) map.get(new Long(jwgVar.a));
            if (vg4Var == null) {
                String name = u8bVar.getClass().getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, zo5.j(jwgVar.a, "toViewerModels: no contact for userId="), null);
                    }
                }
            } else {
                cmf cmfVar = jwgVar.b;
                u8bVar2.b(new l3h(vg4Var, cmfVar != null ? gvk.i(cmfVar) : null));
            }
        }
        return u8bVar2;
    }
}
