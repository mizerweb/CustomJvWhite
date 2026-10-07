package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zk0 implements jj6 {
    public final /* synthetic */ int a;
    public final nmc b;
    public final n9g c;

    public zk0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new nmc(4);
                this.c = new n9g(-1, -1, "image/webp");
                break;
            default:
                this.b = new nmc(4);
                this.c = new n9g(-1, -1, "image/avif");
                break;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        int i = this.a;
        n9g n9gVar = this.c;
        switch (i) {
            case 0:
                n9gVar.A(lj6Var);
                break;
            default:
                n9gVar.A(lj6Var);
                break;
        }
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        int i = this.a;
        nmc nmcVar = this.b;
        switch (i) {
            case 0:
                kj6Var.z(4);
                nmcVar.K(4);
                kj6Var.u(0, nmcVar.a, 4);
                if (nmcVar.C() == 1718909296) {
                    nmcVar.K(4);
                    kj6Var.u(0, nmcVar.a, 4);
                    if (nmcVar.C() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                nmcVar.K(4);
                kj6Var.u(0, nmcVar.a, 4);
                if (nmcVar.C() == 1380533830) {
                    kj6Var.z(4);
                    nmcVar.K(4);
                    kj6Var.u(0, nmcVar.a, 4);
                    if (nmcVar.C() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.g(j, j2);
                break;
            default:
                this.c.g(j, j2);
                break;
        }
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c.l(kj6Var, s8Var);
    }

    @Override // defpackage.jj6
    public final void release() {
        int i = this.a;
    }
}
