package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m4i extends k4i {
    public final Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4i(at6 at6Var, Object obj) {
        super(obj);
        q4i q4iVar = (q4i) at6Var.e;
        ohf ohfVar = (ohf) q4iVar.b.invoke(obj);
        this.b = ohfVar != null ? ohfVar.iterator() : null;
    }

    @Override // defpackage.p4i
    public final Object a() {
        Iterator it = this.b;
        if (it == null || !it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
