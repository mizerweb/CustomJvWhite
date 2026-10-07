package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class kl5 {
    public static final zif f;
    public final y3e a;
    public final pbi b;
    public volatile List c = Collections.EMPTY_LIST;
    public volatile Map d = Collections.EMPTY_MAP;
    public volatile boolean e = false;

    static {
        zif zifVar = new zif();
        f = zifVar;
        zifVar.a = true;
    }

    public kl5(CidLogger cidLogger, pbi pbiVar) {
        this.a = cidLogger;
        this.b = pbiVar;
    }

    public final void a(List list) {
        List<mg1> list2 = this.e ? Collections.EMPTY_LIST : this.c;
        HashMap map = new HashMap();
        for (mg1 mg1Var : list2) {
            map.put(mg1Var.a, mg1Var);
        }
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mg1 mg1Var2 = (mg1) it.next();
            map2.put(mg1Var2.a, mg1Var2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = map2.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            x52 x52Var = (x52) it2.next();
            mg1 mg1Var3 = (mg1) map.get(x52Var);
            mg1 mg1Var4 = (mg1) map2.get(x52Var);
            if (mg1Var4 != null && (mg1Var3 == null || !mg1Var3.b.equals(mg1Var4.b))) {
                x52 x52Var2 = mg1Var4.a;
                yvi yviVar = mg1Var4.b;
                zif zifVar = new zif();
                zifVar.d = yviVar.c != 1 ? 2 : 1;
                zifVar.b = yviVar.a;
                zifVar.c = yviVar.b;
                zifVar.a = false;
                arrayList.add(new ajf(x52Var2, zifVar));
            }
        }
        for (x52 x52Var3 : map.keySet()) {
            mg1 mg1Var5 = (mg1) map.get(x52Var3);
            if (mg1Var5 != null && !map2.containsKey(x52Var3)) {
                arrayList.add(new ajf(mg1Var5.a, f));
            }
        }
        boolean z = this.e;
        if (!arrayList.isEmpty()) {
            xei xeiVar = new xei(arrayList, z);
            rve rveVarC = this.b.o.C();
            jl5 jl5Var = new jl5(this, 0);
            jl5 jl5Var2 = new jl5(this, 1);
            kr6 kr6Var = new kr6(xeiVar);
            kr6Var.b = jl5Var;
            kr6Var.c = jl5Var2;
            rveVarC.d(new dc9(kr6Var));
        }
        this.c = list;
        HashMap map3 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            mg1 mg1Var6 = (mg1) it3.next();
            yt1 yt1Var = mg1Var6.a.b;
            Set hashSet = (Set) map3.get(yt1Var);
            if (hashSet == null) {
                hashSet = new HashSet();
                map3.put(yt1Var, hashSet);
            }
            hashSet.add(mg1Var6.a);
        }
        this.d = map3;
        this.e = false;
    }
}
