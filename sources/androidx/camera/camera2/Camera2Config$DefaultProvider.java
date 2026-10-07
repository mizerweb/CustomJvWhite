package androidx.camera.camera2;

import defpackage.bh0;
import defpackage.dhc;
import defpackage.qe2;
import defpackage.si2;
import defpackage.ti2;
import defpackage.ui2;
import defpackage.w8b;
import defpackage.yb2;
import defpackage.zb2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/camera/camera2/Camera2Config$DefaultProvider", "Lti2;", "<init>", "()V", "Lui2;", "getCameraXConfig", "()Lui2;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2Config$DefaultProvider implements ti2 {
    @Override // defpackage.ti2
    public ui2 getCameraXConfig() {
        qe2 qe2Var = new qe2();
        si2 si2Var = new si2();
        bh0 bh0Var = ui2.b;
        w8b w8bVar = si2Var.a;
        w8bVar.m(bh0Var, qe2Var);
        w8bVar.m(ui2.c, new yb2());
        w8bVar.m(ui2.d, new zb2());
        w8bVar.m(ui2.l, Boolean.TRUE);
        return new ui2(dhc.a(w8bVar));
    }
}
