package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nt8 implements fif {
    public final ifh a;

    public nt8(af7 af7Var) {
        this.a = new ifh(af7Var);
    }

    public final fif a() {
        return (fif) this.a.getValue();
    }

    @Override // defpackage.fif
    public final boolean b() {
        return false;
    }

    @Override // defpackage.fif
    public final int c(String str) {
        return a().c(str);
    }

    @Override // defpackage.fif
    public final lvb d() {
        return a().d();
    }

    @Override // defpackage.fif
    public final int e() {
        return a().e();
    }

    @Override // defpackage.fif
    public final String f(int i) {
        return a().f(i);
    }

    @Override // defpackage.fif
    public final List g(int i) {
        return a().g(i);
    }

    @Override // defpackage.fif
    public final List getAnnotations() {
        return r66.a;
    }

    @Override // defpackage.fif
    public final fif h(int i) {
        return a().h(i);
    }

    @Override // defpackage.fif
    public final String i() {
        return a().i();
    }

    @Override // defpackage.fif
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.fif
    public final boolean j(int i) {
        return a().j(i);
    }
}
