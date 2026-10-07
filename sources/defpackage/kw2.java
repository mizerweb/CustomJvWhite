package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kw2 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kw2(Collection collection, Object obj, int i) {
        this.a = i;
        this.b = collection;
        this.c = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Collection collection = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                rt2 rt2Var = (rt2) obj2;
                if (collection.contains((Long) obj)) {
                    arrayList.add(rt2Var);
                }
                break;
            default:
                mw mwVar = (mw) obj3;
                Long l = (Long) obj;
                vg4 vg4Var = (vg4) obj2;
                if (((Set) collection).contains(l)) {
                    mwVar.put(l, vg4Var);
                }
                break;
        }
    }
}
