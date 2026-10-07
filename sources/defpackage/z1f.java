package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z1f implements qf7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c2f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z1f(c2f c2fVar, String str, Long l, Object obj) {
        this.b = c2fVar;
        this.c = str;
        this.d = l;
        this.e = obj;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        vo8 vo8Var;
        switch (this.a) {
            case 0:
                Object obj3 = this.e;
                c2f c2fVar = this.b;
                String str = this.c;
                Long l = this.d;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap(1);
                }
                concurrentHashMap.computeIfAbsent(obj3, new am(20, new nb(c2fVar, str, l, obj3)));
                return concurrentHashMap;
            default:
                c2f c2fVar2 = this.b;
                String str2 = this.c;
                Long l2 = this.d;
                Object obj4 = this.e;
                Set set = (Set) obj2;
                je9 je9Var = je9.e;
                String str3 = c2fVar2.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, "cancelScheduling: find owners for id: value=" + obj4 + ", owners=[" + set + "]", null);
                }
                set.remove(str2);
                boolean zIsEmpty = set.isEmpty();
                String str4 = c2fVar2.g;
                if (zIsEmpty) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str4, "cancelScheduling: owners for " + obj4 + " are empty, try to cancel job", null);
                    }
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) c2fVar2.j.get(l2);
                    if (concurrentHashMap2 != null && (vo8Var = (vo8) concurrentHashMap2.remove(obj4)) != null) {
                        vo8Var.b(null);
                    }
                } else {
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str4, "cancelScheduling: owners for " + obj4 + " not empty empty [" + set + "]", null);
                    }
                }
                ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet(set.size());
                keySetViewNewKeySet.addAll(set);
                return keySetViewNewKeySet;
        }
    }

    public /* synthetic */ z1f(Object obj, c2f c2fVar, String str, Long l) {
        this.e = obj;
        this.b = c2fVar;
        this.c = str;
        this.d = l;
    }
}
