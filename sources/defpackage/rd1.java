package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public final class rd1 {
    public final ny8 a;
    public final c51 b;

    public rd1(y82 y82Var, ny8 ny8Var) {
        this.a = ny8Var;
        CameraManager cameraManagerA = a();
        boolean z = false;
        if (cameraManagerA != null && cameraManagerA.isCameraEnabled()) {
            z = true;
        }
        this.b = new c51(Boolean.valueOf(z), new g3(6, this), y82Var);
    }

    public final CameraManager a() {
        Conversation conversationA = ((f9) this.a.getValue()).a();
        if (conversationA != null) {
            return conversationA.getCameraManager();
        }
        return null;
    }

    public final boolean b() {
        CameraManager cameraManagerA = a();
        return cameraManagerA != null && cameraManagerA.isCapturingFromFrontCamera();
    }

    public final boolean c() {
        return ((Boolean) this.b.c.getValue()).booleanValue();
    }

    public final void d(boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallCameraControllerTag", zo5.s("CallCameraController camera changed=", z), null);
            }
        }
        this.b.g.c(new a51(Boolean.valueOf(z)));
    }
}
