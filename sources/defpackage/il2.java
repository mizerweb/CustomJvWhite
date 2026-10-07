package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class il2 implements cle {
    public final /* synthetic */ AtomicReference a;

    public il2(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.cle
    public final void W(jme jmeVar, long j, wg wgVar) throws Exception {
        l78 l78Var = (l78) this.a.getAndSet(null);
        if (l78Var != null) {
            l78Var.close();
        }
    }

    @Override // defpackage.cle
    public final void Y(jme jmeVar, long j, eme emeVar) throws Exception {
        l78 l78Var = (l78) this.a.getAndSet(null);
        if (l78Var != null) {
            l78Var.close();
        }
    }

    @Override // defpackage.cle
    public final void k0(jme jmeVar, long j, wg wgVar) throws Exception {
        l78 l78Var = (l78) this.a.getAndSet(null);
        if (l78Var != null) {
            l78Var.close();
        }
    }

    @Override // defpackage.cle
    public final void o0(fle fleVar) throws Exception {
        l78 l78Var = (l78) this.a.getAndSet(null);
        if (l78Var != null) {
            l78Var.close();
        }
    }
}
