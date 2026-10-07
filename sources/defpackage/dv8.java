package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class dv8 extends v1 {
    public final cu8 f;
    public final fif g;
    public int h;
    public boolean i;

    public /* synthetic */ dv8(qs8 qs8Var, cu8 cu8Var, String str, int i) {
        this(qs8Var, cu8Var, (i & 4) != 0 ? null : str, (fif) null);
    }

    @Override // defpackage.v1, defpackage.r55
    public final boolean A() {
        return !this.i && super.A();
    }

    @Override // defpackage.v1
    public jt8 F(String str) {
        return (jt8) wm9.N0(T(), str);
    }

    @Override // defpackage.v1
    public String R(fif fifVar, int i) {
        qs8 qs8Var = this.c;
        oc9.U(qs8Var, fifVar);
        String strF = fifVar.f(i);
        if (this.e.h && !T().a.keySet().contains(strF)) {
            ue4 ue4VarA = xs3.a(qs8Var);
            a8g a8gVar = oc9.v;
            dx4 dx4Var = new dx4(fifVar, 23, qs8Var);
            ConcurrentHashMap concurrentHashMap = ue4VarA.a;
            Map map = (Map) concurrentHashMap.get(fifVar);
            Object obj = null;
            Object objInvoke = map != null ? map.get(a8gVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = dx4Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(fifVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(fifVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(a8gVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : T().a.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // defpackage.v1
    /* JADX INFO: renamed from: Y */
    public cu8 T() {
        return this.f;
    }

    @Override // defpackage.v1, defpackage.r55
    public final v74 a(fif fifVar) {
        fif fifVar2 = this.g;
        if (fifVar != fifVar2) {
            return super.a(fifVar);
        }
        jt8 jt8VarG = G();
        String strI = fifVar2.i();
        if (jt8VarG instanceof cu8) {
            return new dv8(this.c, (cu8) jt8VarG, this.d, fifVar2);
        }
        throw xd2.e("Expected " + zfe.a(cu8.class).h() + ", but had " + zfe.a(jt8VarG.getClass()).h() + " as the serialized body of " + strI + " at element: " + V(), jt8VarG.toString(), -1);
    }

    @Override // defpackage.v1, defpackage.v74
    public void j(fif fifVar) {
        Set setZ;
        at8 at8Var = this.e;
        if (at8Var.b || (fifVar.d() instanceof tad)) {
            return;
        }
        qs8 qs8Var = this.c;
        oc9.U(qs8Var, fifVar);
        if (at8Var.h) {
            Set setB = yl2.b(fifVar);
            ue4 ue4VarA = xs3.a(qs8Var);
            a8g a8gVar = oc9.v;
            Map map = (Map) ue4VarA.a.get(fifVar);
            Object obj = map != null ? map.get(a8gVar) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = c76.a;
            }
            setZ = lof.Z(setB, setKeySet);
        } else {
            setZ = yl2.b(fifVar);
        }
        for (String str : T().a.keySet()) {
            if (!setZ.contains(str) && !cqk.d(str, this.d)) {
                throw xd2.f(str, T().toString());
            }
        }
    }

    @Override // defpackage.v74
    public int v(fif fifVar) {
        while (this.h < fifVar.e()) {
            int i = this.h;
            this.h = i + 1;
            String strS = S(fifVar, i);
            int i2 = this.h - 1;
            this.i = false;
            boolean zContainsKey = T().containsKey(strS);
            qs8 qs8Var = this.c;
            if (!zContainsKey) {
                boolean z = (qs8Var.a.d || fifVar.j(i2) || !fifVar.h(i2).b()) ? false : true;
                this.i = z;
                if (!z) {
                    continue;
                }
            }
            if (this.e.f) {
                boolean zJ = fifVar.j(i2);
                fif fifVarH = fifVar.h(i2);
                if (!zJ || fifVarH.b() || !(F(strS) instanceof zt8)) {
                    if (cqk.d(fifVarH.d(), lif.f) && (!fifVarH.b() || !(F(strS) instanceof zt8))) {
                        jt8 jt8VarF = F(strS);
                        pu8 pu8Var = jt8VarF instanceof pu8 ? (pu8) jt8VarF : null;
                        String strE = pu8Var != null ? kt8.e(pu8Var) : null;
                        if (strE != null) {
                            int iN = oc9.N(fifVarH, qs8Var, strE);
                            boolean z2 = !qs8Var.a.d && fifVarH.b();
                            if (iN != -3 || (!zJ && !z2)) {
                            }
                        }
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public dv8(qs8 qs8Var, cu8 cu8Var, String str, fif fifVar) {
        super(qs8Var, str);
        this.f = cu8Var;
        this.g = fifVar;
    }
}
