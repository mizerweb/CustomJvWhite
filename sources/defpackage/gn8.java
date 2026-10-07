package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gn8 {
    public final h7f a;
    public final h7f b;
    public final ny8 c;
    public final ny8 d;

    public gn8(ny8 ny8Var, ny8 ny8Var2, h7f h7fVar, h7f h7fVar2) {
        this.a = h7fVar;
        this.b = h7fVar2;
        this.c = ny8Var;
        this.d = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    public final boolean a() {
        je9 je9Var = je9.e;
        boolean zE = ((gue) this.c.getValue()).e();
        if (((Boolean) this.a.invoke()).booleanValue()) {
            dz4 dz4Var = (dz4) ((x02) ((b95) this.d.getValue()).i.a.getValue()).z().getValue();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "is-app-interactive-now", "execute: appVisible = " + zE + " call=" + dz4Var, null);
            }
            if (dz4Var.g) {
                zE = true;
            } else {
                if (zE) {
                    boolean zIsKeyguardLocked = ((gue) this.c.getValue()).b.isKeyguardLocked();
                    String name = gue.class.getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, name, zo5.s("isKeyguardLocked=", zIsKeyguardLocked), null);
                    }
                    if (!zIsKeyguardLocked || !dz4Var.h) {
                        zE = true;
                    }
                }
                zE = false;
            }
        } else {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "is-app-interactive-now", zo5.s("execute: appVisible = ", zE), null);
            }
        }
        boolean z = ((Boolean) this.b.invoke()).booleanValue() && ((x02) ((b95) this.d.getValue()).i.a.getValue()).m();
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            a4cVar4.c(je9Var, "is-app-interactive-now", zo5.q("execute: appVisible=", ", checkActiveCall=", zE, z), null);
        }
        return zE || z;
    }
}
