package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z00 implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        y1g y1gVarF;
        int i = this.a;
        sbi sbiVar = sbi.a;
        boolean z = true;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                y10 y10Var = (y10) obj3;
                y10Var.b.r("failed " + ((vt4) obj) + " with " + ((Throwable) obj2) + " @" + System.identityHashCode(y10Var));
                return sbiVar;
            case 1:
                rl3 rl3Var = (rl3) obj3;
                Set set = (Set) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ic6 ic6Var = rl3Var.L1;
                if (iIntValue == R.id.oneme_chat_action_add_to_folder) {
                    a8j.x(ic6Var, new f2g(set));
                } else {
                    if (iIntValue != R.id.oneme_chat_action_mute) {
                        if (iIntValue == R.id.oneme_chat_action_delete_chat) {
                            rl3Var.A1 = new nk3(set);
                            if (set.size() == 1) {
                                rt2 rt2Var = (rt2) rl3Var.I().k(((Number) ww3.q1(set)).longValue()).a.getValue();
                                if (rt2Var != null) {
                                    if (rt2Var.h0()) {
                                        y1gVarF = vt2.g(rt2Var);
                                    } else if (rt2Var.d0() && rt2Var.i()) {
                                        y1gVarF = vt2.d(rt2Var);
                                    } else {
                                        y1gVarF = (rt2Var.e0() && rt2Var.i()) ? vt2.f(rt2Var) : vt2.e(rt2Var);
                                    }
                                    a8j.x(ic6Var, y1gVarF);
                                }
                            } else {
                                a8j.x(ic6Var, vt2.h());
                            }
                        } else {
                            a8j.t(rl3Var, ((n0c) rl3Var.h).a(), new ht1(iIntValue, rl3Var, set, (lq4) null, 6), 2);
                        }
                        return Boolean.valueOf(z);
                    }
                    rl3Var.A1 = new ok3(set);
                    a8j.x(ic6Var, vt2.m());
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                ((as6) obj3).d.o((String) obj, obj2);
                return sbiVar;
            case 3:
                wed wedVar = (wed) obj3;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                for (Map.Entry entry : ((LinkedHashMap) obj2).entrySet()) {
                    Object key = entry.getKey();
                    LinkedHashSet linkedHashSet = (LinkedHashSet) entry.getValue();
                    linkedHashSet.removeAll(wedVar.b);
                    wedVar.f(linkedHashSet);
                    if (!linkedHashSet.isEmpty()) {
                        LinkedHashSet linkedHashSet2 = (LinkedHashSet) linkedHashMap.get(key);
                        if (linkedHashSet2 == null) {
                            linkedHashMap.put(key, linkedHashSet);
                        } else {
                            linkedHashSet2.addAll(linkedHashSet);
                        }
                    }
                }
                return linkedHashMap;
            case 4:
                ArrayList arrayList = (ArrayList) obj2;
                arrayList.add(((qfd) obj3).b);
                return arrayList;
            case 5:
                vjd vjdVar = (vjd) obj3;
                f9b f9bVar = (f9b) obj2;
                if (f9bVar == null) {
                    return p90.a(vjdVar);
                }
                f9bVar.setValue(vjdVar);
                return f9bVar;
            case 6:
                dme dmeVar = (dme) obj3;
                ole oleVar = (ole) obj2;
                if (oleVar == null) {
                    oleVar = new ole();
                }
                oleVar.a++;
                oleVar.b = ew5.g(dmeVar.a.m());
                return oleVar;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                tt4 tt4Var = (tt4) obj2;
                ut4 key2 = tt4Var.getKey();
                tt4 tt4VarX0 = ((yxe) obj3).e.x0(key2);
                if (key2 == nhb.h) {
                    vo8 vo8Var = (vo8) tt4VarX0;
                    vo8 vo8Var2 = (vo8) tt4Var;
                    while (true) {
                        vo8 parent = null;
                        if (vo8Var2 == null) {
                            vo8Var2 = null;
                        } else if (vo8Var2 != vo8Var && (vo8Var2 instanceof s3f)) {
                            vp3 vp3VarH = ((s3f) vo8Var2).H();
                            if (vp3VarH != null) {
                                parent = vp3VarH.getParent();
                            }
                            vo8Var2 = parent;
                        }
                    }
                    if (vo8Var2 != vo8Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + vo8Var2 + ", expected child of " + vo8Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (vo8Var != null) {
                        iIntValue2++;
                    }
                } else if (tt4Var != tt4VarX0) {
                    iIntValue2 = Integer.MIN_VALUE;
                } else {
                    iIntValue2++;
                }
                return Integer.valueOf(iIntValue2);
        }
    }
}
