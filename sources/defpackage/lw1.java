package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lw1 implements qf7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ha9 b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lw1(String str, ha9 ha9Var, AtomicBoolean atomicBoolean, boolean z) {
        this.a = str;
        this.b = ha9Var;
        this.c = atomicBoolean;
        this.d = z;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        String str = this.a;
        ha9 ha9Var = this.b;
        AtomicBoolean atomicBoolean = this.c;
        boolean z = this.d;
        Set set = (Set) obj2;
        je9 je9Var = je9.d;
        if (set == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallRegistrationManager", "onSessionEnded(" + str + "): no registration for " + ha9Var + ", nothing to do", null);
            }
            return null;
        }
        set.remove(str);
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallRegistrationManager", "onSessionEnded(" + str + ") for " + ha9Var + ", sessions=" + set.size(), null);
        }
        if (set.isEmpty()) {
            atomicBoolean.set(true);
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallRegistrationManager", "onSessionEnded(" + str + "): " + ha9Var + " active sessions=" + set.size() + ", removeOnEmpty=" + z, null);
            }
        }
        return set;
    }
}
