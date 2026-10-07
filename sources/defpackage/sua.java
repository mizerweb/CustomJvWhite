package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import one.me.sdk.database.OneMeRoomDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class sua implements j44 {
    public final uoa a;
    public final ifh b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public sua(uoa uoaVar, ifh ifhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = uoaVar;
        this.b = ifhVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
    }

    @Override // defpackage.j44
    public final Object a(rt2 rt2Var, ArrayList arrayList, lq4 lq4Var) {
        return ((ose) this.a).w(rt2Var.a, (nq4) lq4Var, arrayList);
    }

    @Override // defpackage.j44
    public final Object b(long j, nq4 nq4Var) {
        ose oseVar = (ose) this.a;
        toa toaVar = (toa) oseVar.h();
        gga ggaVar = (gga) ch3.G(toaVar.a, true, false, new hoa(j, toaVar, 4));
        if (ggaVar == null) {
            return null;
        }
        Object objK = oseVar.k(ggaVar, nq4Var);
        return objK == hu4.a ? objK : (sfa) objK;
    }

    @Override // defpackage.j44
    public final void c(Map map) {
        ose oseVar = (ose) this.a;
        oseVar.e().a(new xre(map, 0, oseVar));
    }

    @Override // defpackage.j44
    public final Object d(l8b l8bVar, long j, t7e t7eVar) {
        ose oseVar = (ose) this.a;
        wna wnaVarH = oseVar.h();
        k35 k35Var = (k35) oseVar.h.getValue();
        wnaVarH.getClass();
        Object objI = ch3.I(t7eVar, (OneMeRoomDatabase) k35Var.a.getValue(), false, true, new o6e(1, l8bVar, j));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    @Override // defpackage.j44
    public final Object e(long j, rt2 rt2Var, nq4 nq4Var) {
        return p(rt2Var.a, j, nq4Var);
    }

    @Override // defpackage.j44
    public final Object f(long j, lq4 lq4Var) {
        return ((ose) this.a).m(j, lq4Var);
    }

    @Override // defpackage.j44
    public final Object g(Map map, rka rkaVar) {
        toa toaVar = (toa) ((ose) this.a).h();
        Object objH = ch3.H(rkaVar, new wj1(toaVar, map, null, 3), toaVar.a);
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objH != hu4Var) {
            objH = sbiVar;
        }
        if (objH != hu4Var) {
            objH = sbiVar;
        }
        return objH == hu4Var ? objH : sbiVar;
    }

    @Override // defpackage.j44
    public final Object h(long j, kja kjaVar, long j2, nq4 nq4Var) {
        Object objK0 = yab.K0(((n0c) ((xhh) this.e.getValue())).b(), new h01(this, j, kjaVar, j2, (lq4) null), nq4Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    @Override // defpackage.j44
    public final Object i(long[] jArr, lq4 lq4Var) {
        return ((ose) this.a).o(jArr, (nq4) lq4Var);
    }

    @Override // defpackage.j44
    public final Object j(Collection collection, nq4 nq4Var) {
        return ((ose) this.a).n(collection, nq4Var);
    }

    @Override // defpackage.j44
    public final Object k(rt2 rt2Var, Collection collection, mdh mdhVar) {
        long j = rt2Var.a;
        toa toaVar = (toa) ((ose) this.a).h();
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT server_id FROM messages WHERE chat_id = ? AND id in (");
        vd7.b(sb, collection.size());
        sb.append(")");
        return ch3.I(mdhVar, toaVar.a, true, false, new t14(sb.toString(), j, collection, 3));
    }

    public final long l() {
        return ((Number) this.b.getValue()).longValue();
    }

    public final Object m(long j, gda gdaVar, nq4 nq4Var) {
        return ((ose) this.a).e().b(new fn6(this, j, gdaVar, (lq4) null), nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    public final Object n(LinkedHashMap linkedHashMap, long j, gfa gfaVar) {
        Object objI;
        ose oseVar = (ose) this.a;
        oseVar.getClass();
        boolean zIsEmpty = linkedHashMap.isEmpty();
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (zIsEmpty) {
            objI = sbiVar;
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new zea(((Number) entry.getValue()).intValue(), ((Number) entry.getKey()).longValue(), j));
            }
            yea yeaVarG = oseVar.g();
            objI = ch3.I(gfaVar, yeaVarG.a, false, true, new iaa(yeaVarG, 2, arrayList));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
                objI = sbiVar;
            }
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(long j, nq4 nq4Var, String str) {
        pua puaVar;
        c46 c46Var;
        if (nq4Var instanceof pua) {
            puaVar = (pua) nq4Var;
            int i = puaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                puaVar.g = i - Integer.MIN_VALUE;
            } else {
                puaVar = new pua(this, nq4Var);
            }
        } else {
            puaVar = new pua(this, nq4Var);
        }
        Object objF = puaVar.e;
        int i2 = puaVar.g;
        if (i2 == 0) {
            ch3.d0(objF);
            puaVar.d = str;
            puaVar.g = 1;
            objF = f(j, puaVar);
            Object obj = hu4.a;
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = puaVar.d;
            ch3.d0(objF);
        }
        sfa sfaVar = (sfa) objF;
        if (sfaVar == null || (c46Var = sfaVar.n) == null) {
            return null;
        }
        return c46Var.k(str);
    }

    public final Object p(long j, long j2, nq4 nq4Var) {
        return ((ose) this.a).p(j, j2, nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object q(long j, long j2, long j3, boolean z, int i, mg5 mg5Var, nq4 nq4Var) {
        qua quaVar;
        boolean z2;
        if (nq4Var instanceof qua) {
            quaVar = (qua) nq4Var;
            int i2 = quaVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quaVar.g = i2 - Integer.MIN_VALUE;
            } else {
                quaVar = new qua(this, nq4Var);
            }
        } else {
            quaVar = new qua(this, nq4Var);
        }
        Object objK0 = quaVar.e;
        int i3 = quaVar.g;
        if (i3 == 0) {
            ch3.d0(objK0);
            quaVar.d = z;
            quaVar.g = 1;
            ose oseVar = (ose) this.a;
            objK0 = yab.K0(((n0c) ((xhh) oseVar.c.getValue())).b(), new ise(mg5Var, oseVar, j, j2, j3, i, z, null), quaVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            z2 = z;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = quaVar.d;
            ch3.d0(objK0);
        }
        List list = (List) objK0;
        if (z2) {
            ww3.J1(list);
        }
        return objK0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable r(ArrayList arrayList, nq4 nq4Var) {
        rua ruaVar;
        if (nq4Var instanceof rua) {
            ruaVar = (rua) nq4Var;
            int i = ruaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ruaVar.f = i - Integer.MIN_VALUE;
            } else {
                ruaVar = new rua(this, nq4Var);
            }
        } else {
            ruaVar = new rua(this, nq4Var);
        }
        Object objJ = ruaVar.d;
        int i2 = ruaVar.f;
        if (i2 == 0) {
            ch3.d0(objJ);
            ruaVar.f = 1;
            objJ = j(arrayList, ruaVar);
            hu4 hu4Var = hu4.a;
            if (objJ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objJ);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (Iterable) objJ) {
            if (((sfa) obj).B(y60.d)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void s(long j, String str, cf7 cf7Var) {
        ((ose) this.a).C(j, new fv9(str, 17, cf7Var));
    }
}
