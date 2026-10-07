package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vi8 implements taa {
    public final taa a;
    public final q76 b;

    public vi8(ru4 ru4Var, q76 q76Var) {
        this.a = ru4Var;
        this.b = q76Var;
    }

    @Override // defpackage.taa
    public final boolean a(ck0 ck0Var) {
        return this.a.a(ck0Var);
    }

    @Override // defpackage.taa
    public final au3 b(v71 v71Var, au3 au3Var) {
        q76 q76Var = this.b;
        switch (q76Var.a) {
            case 0:
                q76Var.b.getClass();
                break;
            default:
                q76Var.b.getClass();
                break;
        }
        return this.a.b(v71Var, au3Var);
    }

    @Override // defpackage.taa
    public final int c(gdd gddVar) {
        return this.a.c(gddVar);
    }

    @Override // defpackage.sba
    public final void e(qba qbaVar) {
        this.a.e(qbaVar);
    }

    @Override // defpackage.taa
    public final au3 get(Object obj) {
        au3 au3Var = this.a.get(obj);
        q76 q76Var = this.b;
        if (au3Var == null) {
            switch (q76Var.a) {
                case 0:
                    q76Var.b.getClass();
                    return au3Var;
                default:
                    q76Var.b.getClass();
                    return au3Var;
            }
        }
        switch (q76Var.a) {
            case 0:
                q76Var.b.getClass();
                return au3Var;
            default:
                q76Var.b.getClass();
                return au3Var;
        }
    }

    @Override // defpackage.taa
    public final int getCount() {
        return this.a.getCount();
    }

    @Override // defpackage.taa
    public final int getSizeInBytes() {
        return this.a.getSizeInBytes();
    }
}
