package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ea8 implements q9b {
    public final s2b a;
    public final LinkedHashSet b = new LinkedHashSet();

    public ea8(s2b s2bVar) {
        this.a = s2bVar;
    }

    @Override // defpackage.q9b
    public final int b0(b87 b87Var) {
        s2b s2bVar = this.a;
        int iB0 = s2bVar.b0(b87Var);
        if (uya.m(b87Var.n)) {
            s2bVar.k(new t2b(b87Var.z));
        }
        return iB0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            s2b s2bVar = this.a;
            if (!zHasNext) {
                s2bVar.close();
                return;
            }
            s2bVar.k((jwa) it.next());
        }
    }

    @Override // defpackage.q9b
    public final void k(jwa jwaVar) {
        if (hwk.c(jwaVar)) {
            this.b.add(jwaVar);
        }
    }

    @Override // defpackage.q9b
    public final void w0(int i, ByteBuffer byteBuffer, u31 u31Var) {
        this.a.w0(i, byteBuffer, u31Var);
    }
}
