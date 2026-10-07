package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class af4 implements qxe, j9b {
    public final qxe a;
    public final j9b b;
    public vt4 c;
    public Throwable d;
    public final ze4 e;

    public af4(qxe qxeVar) {
        l9b l9bVar = new l9b();
        this.a = qxeVar;
        this.b = l9bVar;
        this.e = new ze4(this);
    }

    @Override // defpackage.qxe
    public final boolean G0() {
        return this.a.G0();
    }

    @Override // defpackage.qxe
    public final vxe O0(String str) {
        ze4 ze4Var = this.e;
        return ze4Var != null ? new ye4((vxe) ze4Var.c(str)) : this.a.O0(str);
    }

    @Override // defpackage.j9b
    public final Object b(lq4 lq4Var) {
        return this.b.b(lq4Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        ze4 ze4Var = this.e;
        if (ze4Var != null) {
            ze4Var.i(-1);
        }
        this.a.close();
    }

    @Override // defpackage.j9b
    public final void g(Object obj) {
        this.b.g(obj);
    }

    public final void l(StringBuilder sb) {
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            vt4 vt4Var = this.c;
            if (vt4Var != null) {
                sb.append("\t\tCoroutine: " + vt4Var);
                sb.append('\n');
            }
            Throwable th = this.d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = ww3.l1(r5h.a1(gm0.N(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        ze4 ze4Var = this.e;
        if (ze4Var != null) {
            sb.append("\t\tPrepared Statement Cache Size: " + ze4Var.g());
            sb.append('\n');
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
