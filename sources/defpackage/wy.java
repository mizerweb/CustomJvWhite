package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wy extends aq implements qih {
    public final int f;
    public final long g;

    public wy(int i, long j, long j2) {
        super(j);
        this.f = i;
        this.g = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [a4c] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Throwable, lq4, vt4] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, vdh] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a4c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [lq4] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.qih
    public final void b(kih kihVar) {
        ArrayList arrayList;
        int i;
        ?? r15;
        ArrayList arrayList2;
        xy xyVar = (xy) kihVar;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        yy yyVar = (yy) bqVar.t.getValue();
        int i2 = this.f;
        yyVar.getClass();
        je9 je9Var = je9.d;
        gm0.n("yy", "onAssetsUpdate");
        if (i2 == 0) {
            i2 = 2;
        }
        ArrayList arrayList3 = new ArrayList();
        List<jaf> list = Collections.EMPTY_LIST;
        if (xyVar.d.isEmpty()) {
            arrayList = arrayList3;
        } else {
            List<iaf> list2 = xyVar.d;
            m7f m7fVar = yyVar.f;
            ArrayList<jaf> arrayList4 = new ArrayList();
            for (iaf iafVar : list2) {
                ldf ldfVar = iafVar.a;
                if (ldfVar == ldf.m) {
                    arrayList4.add(new xng(iafVar.b, iafVar.d));
                    arrayList2 = arrayList3;
                } else if (ldfVar == ldf.n) {
                    arrayList2 = arrayList3;
                    arrayList4.add(new qmg(iafVar.g, iafVar.b, iafVar.e));
                } else {
                    arrayList2 = arrayList3;
                    if (ldfVar == ldf.o) {
                        ArrayList arrayListJ = pm9.j(iafVar.k);
                        arrayListJ.addAll(pm9.m(iafVar.l, m7fVar));
                        arrayList4.add(new xae(iafVar.b, arrayListJ));
                    } else {
                        gm0.q("pm9", "Unknown section " + iafVar);
                    }
                }
                arrayList3 = arrayList2;
            }
            ArrayList arrayList5 = arrayList3;
            ?? r4 = yyVar.a;
            r4.getClass();
            ArrayList arrayList6 = new ArrayList();
            for (jaf jafVar : arrayList4) {
                int iD = qt4.D(jafVar.a);
                if (iD != 0) {
                    if (iD == 1) {
                        arrayList6.addAll(r4.e(((xng) jafVar).c));
                    } else if (iD == 2) {
                        continue;
                    } else if (iD == 3) {
                        ArrayList arrayList7 = ((xae) jafVar).c;
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj : arrayList7) {
                            if (obj instanceof cmg) {
                                arrayList8.add(obj);
                            }
                        }
                        ArrayList arrayList9 = new ArrayList(yw3.W0(arrayList8, 10));
                        Iterator it = arrayList8.iterator();
                        while (it.hasNext()) {
                            arrayList9.add(Long.valueOf(((cmg) it.next()).c));
                        }
                        arrayList6.addAll(r4.e(arrayList9));
                    } else if (iD != 4) {
                        ore.o();
                        return;
                    }
                }
            }
            arrayList = arrayList5;
            arrayList.addAll(arrayList6);
            list = arrayList4;
        }
        if (list.isEmpty()) {
            i = 2;
            r15 = 0;
        } else {
            vdh vdhVar = yyVar.a;
            gm0.n(vdhVar.d, "Update recent section");
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                jaf jafVar2 = (jaf) list.get(i3);
                if ("RECENT".equals(jafVar2.b) && jafVar2.a == 4) {
                    vdhVar.j.B(vdhVar, vdh.n[0], yab.i0(vdhVar.b, null, 2, new ryf(jafVar2, vdhVar, null, 18), 1));
                    break;
                }
            }
            ConcurrentHashMap concurrentHashMap = vdhVar.i;
            for (jaf jafVar3 : list) {
                Iterator it2 = concurrentHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    if (cqk.d(((Map.Entry) it2.next()).getKey(), jafVar3.b)) {
                        it2.remove();
                    }
                }
            }
            for (jaf jafVar4 : list) {
                int i4 = jafVar4.a;
                String str = jafVar4.b;
                if (i4 == 3) {
                    if (!((qmg) jafVar4).c.isEmpty()) {
                        concurrentHashMap.put(str, jafVar4);
                    }
                } else if (i4 == 2 && !((xng) jafVar4).c.isEmpty()) {
                    concurrentHashMap.put(str, jafVar4);
                }
            }
            vdhVar.l.setValue(concurrentHashMap.values());
            r15 = 0;
            i = 2;
            yab.i0(vdhVar.b, ((n0c) vdhVar.c).b(), 0, new fpf(vdhVar, 0 == true ? 1 : 0, 7), 2);
        }
        if (i2 == i) {
            yyVar.b.a.K(xyVar.c);
        } else if (i2 == 5 || i2 == 4) {
            gm0.m("yy", "onAssetsUpdate: set favorites sync=%d", Long.valueOf(xyVar.c));
            yyVar.b.a.C(xyVar.c);
            ldh ldhVar = yyVar.d;
            List<iaf> list3 = xyVar.d;
            ldhVar.getClass();
            for (iaf iafVar2 : list3) {
                if ("FAVORITE_STICKER_SETS".equals(iafVar2.b)) {
                    List list4 = iafVar2.e;
                    long j = iafVar2.j;
                    long j2 = iafVar2.g;
                    String str2 = ldhVar.j;
                    ?? r12 = gm0.f;
                    if (r12 != 0 && r12.b(je9Var)) {
                        StringBuilder sb = new StringBuilder("onAssetsUpdate: sets=");
                        sb.append(list4);
                        sb.append(", marker=");
                        sb.append(j2);
                        r12.c(je9Var, str2, qt4.k(j, ", updateTime=", sb), r15);
                    }
                    ldhVar.t(j);
                    yab.i0(ldhVar.b, r15, 0, new xra(ldhVar, list4, (lq4) r15, 22), 3);
                    if (j2 != 0) {
                        ldhVar.o(j2);
                    }
                }
            }
            um6 um6Var = yyVar.e;
            List list5 = xyVar.d;
            String str3 = um6Var.a;
            ?? r6 = gm0.f;
            if (r6 != 0 && r6.b(je9Var)) {
                r6.c(je9Var, str3, zo5.h(list5.size(), "onAssetsUpdate size="), r15);
            }
            yab.i0((gu4) um6Var.h.getValue(), r15, 0, new jm6(list5, um6Var, r15), 3);
        } else if (i2 == 10) {
            xm xmVar = yyVar.g;
            List list6 = xyVar.d;
            Map map = xyVar.h;
            ((s7f) xmVar.e).I(xyVar.c);
            xmVar.k.B(xmVar, xm.o[1], yab.i0(xmVar.i, r15, 2, new dn0(xmVar, list6, map, r15, 6), 1));
        }
        if (!xyVar.e.isEmpty()) {
            for (Map.Entry entry : xyVar.e.entrySet()) {
                vdh vdhVar2 = yyVar.a;
                Long l = (Long) entry.getKey();
                l.getClass();
                clg clgVar = (clg) vdhVar2.h.get(l);
                if (clgVar == null || clgVar.e < ((Long) entry.getValue()).longValue()) {
                    arrayList.add((Long) entry.getKey());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            p90.K(arrayList);
            Iterator it3 = p90.R(arrayList).iterator();
            while (it3.hasNext()) {
                yyVar.c.b(2, (List) it3.next());
            }
        }
        Map map2 = xyVar.f;
        if (map2.isEmpty()) {
            return;
        }
        ArrayList arrayList10 = new ArrayList();
        List list7 = (List) yyVar.d.i.getValue();
        if (!p90.D(list7)) {
            for (Map.Entry entry2 : map2.entrySet()) {
                Long l2 = (Long) entry2.getKey();
                Iterator it4 = list7.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        arrayList10.add(l2);
                        break;
                    }
                    emg emgVar = (emg) it4.next();
                    if (emgVar.a == l2.longValue() && emgVar.f >= ((Long) entry2.getValue()).longValue()) {
                        break;
                    }
                }
            }
        } else {
            arrayList10.addAll(map2.keySet());
        }
        if (arrayList10.isEmpty()) {
            return;
        }
        yyVar.c.b(3, arrayList10);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.b().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.aq
    public final Object m() {
        return new ky(this.f, this.g, 0L, 0L);
    }
}
