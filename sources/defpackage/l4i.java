package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l4i extends k4i {
    public boolean b;
    public Iterator c;
    public boolean d;
    public final /* synthetic */ at6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4i(at6 at6Var, Object obj) {
        super(obj);
        this.e = at6Var;
    }

    @Override // defpackage.p4i
    public final Object a() {
        q4i q4iVar = (q4i) this.e.e;
        boolean z = this.d;
        Object obj = this.a;
        if (!z && this.c == null) {
            if (!((Boolean) q4iVar.d.invoke(obj)).booleanValue()) {
                return null;
            }
            ohf ohfVar = (ohf) q4iVar.b.invoke(obj);
            Iterator it = ohfVar != null ? ohfVar.iterator() : null;
            this.c = it;
            if (it == null) {
                this.d = true;
            }
        }
        Iterator it2 = this.c;
        if (it2 != null && it2.hasNext()) {
            return this.c.next();
        }
        if (this.b) {
            return null;
        }
        this.b = true;
        return obj;
    }
}
