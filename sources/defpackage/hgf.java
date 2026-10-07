package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class hgf extends gcf {
    public final /* synthetic */ AtomicReferenceArray g;

    public hgf(long j, hgf hgfVar, int i) {
        super(j, hgfVar, i);
        this.g = new AtomicReferenceArray(ggf.f);
    }

    @Override // defpackage.gcf
    public final int l() {
        return ggf.f;
    }

    @Override // defpackage.gcf
    public final void m(int i, vt4 vt4Var) {
        this.g.set(i, ggf.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
