package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pz8 implements z0f {
    public final void a(c1f c1fVar) {
        if (!(c1fVar instanceof i8j)) {
            ore.k("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            return;
        }
        h8j h8jVarB = ((i8j) c1fVar).b();
        b1f b1fVarC = c1fVar.c();
        h8jVarB.getClass();
        LinkedHashMap linkedHashMap = h8jVarB.a;
        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            tfb.b((b8j) linkedHashMap.get((String) it.next()), b1fVarC, c1fVar.f());
        }
        if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
            return;
        }
        b1fVarC.d();
    }
}
