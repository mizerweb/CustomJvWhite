package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ikl {
    public static final ul9 a(Map map, i4h i4hVar) {
        ul9 ul9Var = new ul9();
        for (bi2 bi2Var : i4hVar.g) {
            Surface surface = (Surface) map.get(new j4h(bi2Var.a));
            if (surface != null) {
                Iterator it = bi2Var.b.iterator();
                while (it.hasNext()) {
                    ul9Var.put(new ojc(((h4h) it.next()).a), surface);
                }
            }
        }
        return ul9Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kjc b(se2 se2Var, i4h i4hVar, Map map) {
        LinkedHashMap linkedHashMap;
        Object obj;
        m78 m78Var;
        bi2 bi2VarB;
        String str = se2Var.a;
        LinkedHashMap linkedHashMap2 = i4hVar.d;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it = ((vl9) i4hVar.e.entrySet()).iterator();
        do {
            int i = 1;
            kjc kjcVar = null;
            if (!it.hasNext()) {
                for (bi2 bi2Var : i4hVar.g) {
                    ArrayList<h4h> arrayList2 = bi2Var.b;
                    int i2 = bi2Var.a;
                    if (arrayList2.size() == i) {
                        Surface surface = (Surface) map.get(new j4h(i2));
                        if (surface != null) {
                            linkedHashMap4.put(new ojc(((h4h) ww3.K1(arrayList2)).a), surface);
                        }
                    } else {
                        for (h4h h4hVar : arrayList2) {
                            Object obj2 = linkedHashMap2.get(h4hVar);
                            kjcVar = kjcVar;
                            if (obj2 == null) {
                                ore.k("Required value was null.");
                                return kjcVar;
                            }
                            OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap5.get((g4h) obj2);
                            Surface surface2 = outputConfiguration != null ? outputConfiguration.getSurface() : (Surface) map.get(new j4h(i2));
                            if (surface2 != null) {
                                linkedHashMap4.put(new ojc(h4hVar.a), surface2);
                                i = 1;
                            }
                        }
                    }
                }
                kjc kjcVar2 = kjcVar;
                Iterator it2 = i4hVar.c.iterator();
                Object obj3 = kjcVar2;
                while (it2.hasNext()) {
                    g4h g4hVar = (g4h) it2.next();
                    ArrayList arrayList3 = g4hVar.l;
                    ArrayList arrayList4 = g4hVar.l;
                    List list = g4hVar.k;
                    Integer num = g4hVar.e;
                    String str2 = g4hVar.d;
                    it2 = it2;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ArrayList arrayList6 = arrayList4;
                        List list2 = list;
                        Surface surface3 = (Surface) map.get(new j4h(((bi2) it3.next()).a));
                        if (surface3 != null) {
                            arrayList5.add(surface3);
                        }
                        arrayList4 = arrayList6;
                        list = list2;
                    }
                    ArrayList arrayList7 = arrayList4;
                    List list3 = list;
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap5.get(g4hVar);
                    linkedHashMap5 = linkedHashMap5;
                    if (outputConfiguration2 == null) {
                        if (g4hVar.f != null) {
                            linkedHashMap = linkedHashMap4;
                            obj = obj3;
                            if (arrayList5.size() != arrayList3.size()) {
                                kh khVarA = er3.A(null, null, g4hVar.f, g4hVar.g, g4hVar.h, g4hVar.i, list3, g4hVar.b, arrayList7.size() > 1, num != null ? num.intValue() : -1, !cqk.d(str2, str) ? str2 : kjcVar2, 2);
                                if (khVarA == null) {
                                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + g4hVar);
                                } else {
                                    arrayList.add(khVarA);
                                    Iterator it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        linkedHashMap3.put(new j4h(((bi2) it4.next()).a), khVarA);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                            obj = obj3;
                        }
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj4 : arrayList3) {
                                if (!map.containsKey(new j4h(((bi2) obj4).a))) {
                                    arrayList8.add(obj4);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + g4hVar + "! Missing surfaces for " + arrayList8 + '!').toString());
                        }
                        kh khVarA2 = er3.A((Surface) ww3.r1(arrayList5), null, null, g4hVar.g, g4hVar.h, g4hVar.i, list3, g4hVar.b, arrayList7.size() > 1, num != null ? num.intValue() : -1, !cqk.d(str2, str) ? str2 : kjcVar2, 6);
                        if (khVarA2 == null) {
                            Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + g4hVar);
                        } else {
                            Iterator it5 = ww3.l1(arrayList5, 1).iterator();
                            while (it5.hasNext()) {
                                khVarA2.a.addSurface((Surface) it5.next());
                            }
                            ai2 ai2Var = se2Var.e;
                            if (ai2Var != null) {
                                bi2 bi2Var2 = (bi2) i4hVar.b.get(ai2Var);
                                if (bi2Var2 == null) {
                                    ore.k("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                    return kjcVar2;
                                }
                                if (obj == null && arrayList3.contains(bi2Var2)) {
                                    obj3 = khVarA2;
                                    linkedHashMap4 = linkedHashMap;
                                } else {
                                    arrayList.add(khVarA2);
                                }
                            } else {
                                arrayList.add(khVarA2);
                            }
                            linkedHashMap4 = linkedHashMap;
                            obj3 = obj;
                        }
                    } else {
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj5 : arrayList3) {
                                if (!map.containsKey(new j4h(((bi2) obj5).a))) {
                                    arrayList9.add(obj5);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + g4hVar + "! Missing surfaces for " + arrayList9 + '!').toString());
                        }
                        arrayList.add(new kh(outputConfiguration2));
                        linkedHashMap = linkedHashMap4;
                        obj = obj3;
                    }
                    linkedHashMap4 = linkedHashMap;
                    obj3 = obj;
                }
                return new kjc(arrayList, linkedHashMap3, obj3, linkedHashMap4);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i3 = ((j4h) entry.getKey()).a;
            m78Var = (m78) entry.getValue();
            bi2VarB = i4hVar.b(i3);
            if (bi2VarB == null) {
                ore.k("Required value was null.");
                return null;
            }
        } while (bi2VarB.b.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            ore.p("Cannot configure multiple outputs pre-S!");
            return null;
        }
        zfe.a(jh.class);
        m78Var.getClass();
        throw null;
    }

    public static eoc c(String str, ex8 ex8Var) {
        rl0 rl0Var = rl0.k;
        ao5 ao5Var = ao5.a;
        return new eoc(str, ex8Var, rl0Var, cqk.a(lvb.x0(lb5.c, wk8.a())));
    }
}
