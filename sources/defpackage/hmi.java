package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hmi {
    public final dli a;
    public final lh2 b;
    public final iq7 c;
    public final dli d;
    public final ifh e;
    public final ifh f;

    public hmi(dli dliVar, lh2 lh2Var, iq7 iq7Var, dli dliVar2) {
        this.a = dliVar;
        this.b = lh2Var;
        this.c = iq7Var;
        this.d = dliVar2;
        final int i = 0;
        this.e = new ifh(new af7(this) { // from class: gmi
            public final /* synthetic */ hmi b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                hmi hmiVar = this.b;
                switch (i2) {
                    case 0:
                        return (ze2) hmiVar.a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) hmiVar.d.get()).entrySet()) {
                            ai2 ai2Var = (ai2) entry.getKey();
                            wf5 wf5Var = (wf5) entry.getValue();
                            bi2 bi2Var = (bi2) hmiVar.a().c.b.get(ai2Var);
                            if (bi2Var != null) {
                                linkedHashMap.put(wf5Var, new j4h(bi2Var.a));
                            }
                        }
                        return wm9.X0(linkedHashMap);
                }
            }
        });
        final int i2 = 1;
        this.f = new ifh(new af7(this) { // from class: gmi
            public final /* synthetic */ hmi b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                hmi hmiVar = this.b;
                switch (i3) {
                    case 0:
                        return (ze2) hmiVar.a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) hmiVar.d.get()).entrySet()) {
                            ai2 ai2Var = (ai2) entry.getKey();
                            wf5 wf5Var = (wf5) entry.getValue();
                            bi2 bi2Var = (bi2) hmiVar.a().c.b.get(ai2Var);
                            if (bi2Var != null) {
                                linkedHashMap.put(wf5Var, new j4h(bi2Var.a));
                            }
                        }
                        return wm9.X0(linkedHashMap);
                }
            }
        });
    }

    public final ze2 a() {
        return (ze2) this.e.getValue();
    }

    public final LinkedHashSet b(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j4h j4hVar = (j4h) ((Map) this.f.getValue()).get((wf5) it.next());
            if (j4hVar != null) {
                linkedHashSet.add(new j4h(j4hVar.a));
            }
        }
        return linkedHashSet;
    }
}
