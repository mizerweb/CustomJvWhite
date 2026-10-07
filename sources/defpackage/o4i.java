package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o4i extends k4i {
    public boolean b;
    public Iterator c;
    public final /* synthetic */ at6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4i(at6 at6Var, Object obj) {
        super(obj);
        this.d = at6Var;
    }

    @Override // defpackage.p4i
    public final Object a() {
        q4i q4iVar = (q4i) this.d.e;
        boolean z = this.b;
        Object obj = this.a;
        if (!z) {
            if (!((Boolean) q4iVar.d.invoke(obj)).booleanValue()) {
                return null;
            }
            this.b = true;
            return obj;
        }
        Iterator it = this.c;
        if (it != null && !it.hasNext()) {
            return null;
        }
        if (this.c == null) {
            ohf ohfVar = (ohf) q4iVar.b.invoke(obj);
            Iterator it2 = ohfVar != null ? ohfVar.iterator() : null;
            this.c = it2;
            if (it2 == null || !it2.hasNext()) {
                return null;
            }
        }
        return this.c.next();
    }
}
