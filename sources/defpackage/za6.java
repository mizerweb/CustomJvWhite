package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class za6 implements xu5 {
    public final DrmSession$DrmSessionException a;

    public za6(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.a = drmSession$DrmSessionException;
    }

    @Override // defpackage.xu5
    public final UUID a() {
        return f71.a;
    }

    @Override // defpackage.xu5
    public final boolean b() {
        return false;
    }

    @Override // defpackage.xu5
    public final DrmSession$DrmSessionException c() {
        return this.a;
    }

    @Override // defpackage.xu5
    public final cd7 d() {
        return null;
    }

    @Override // defpackage.xu5
    public final void f(av5 av5Var) {
    }

    @Override // defpackage.xu5
    public final void g(av5 av5Var) {
    }

    @Override // defpackage.xu5
    public final int getState() {
        return 1;
    }

    @Override // defpackage.xu5
    public final boolean h(String str) {
        return false;
    }
}
