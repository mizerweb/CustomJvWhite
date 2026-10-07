package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class lqf implements aw8 {
    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.A(((mqf) obj).a);
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        Object next;
        int i = r55Var.i();
        Iterator it = mqf.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((mqf) next).a != i);
        mqf mqfVar = (mqf) next;
        return mqfVar == null ? mqf.LEFT : mqfVar;
    }

    @Override // defpackage.aw8
    public final fif d() {
        return mqf.c;
    }

    public final aw8 serializer() {
        return mqf.b;
    }
}
