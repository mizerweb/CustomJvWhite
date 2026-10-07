package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

/* JADX INFO: loaded from: classes3.dex */
public final class z3f {
    public final ny8 a;
    public final mjg b = p90.a(Boolean.FALSE);

    public z3f(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(boolean z) {
        Object value;
        mjg mjgVar = this.b;
        do {
            value = mjgVar.getValue();
            ((Boolean) value).getClass();
        } while (!mjgVar.h(value, Boolean.valueOf(z)));
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ScreenCaptureController", zo5.s("ScreenCaptureController screen sharing audio changed=", z), null);
            }
        }
        Conversation conversationA = ((f9) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = conversationA != null ? conversationA.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setAudioCaptureEnabled(z);
        }
    }

    public final void b(boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ScreenCaptureController", zo5.s("ScreenCaptureController screen sharing changed=", z), null);
            }
        }
        Conversation conversationA = ((f9) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = conversationA != null ? conversationA.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setScreenCaptureEnabled(z, false);
        }
        if (z) {
            a(((Boolean) this.b.getValue()).booleanValue());
        } else {
            a(false);
        }
    }

    public final boolean c() {
        ny8 ny8Var = this.a;
        Conversation conversationA = ((f9) ny8Var.getValue()).a();
        if (conversationA == null || !conversationA.isPrepared()) {
            return false;
        }
        Conversation conversationA2 = ((f9) ny8Var.getValue()).a();
        ScreenCaptureManager screenCaptureManager = conversationA2 != null ? conversationA2.getScreenCaptureManager() : null;
        return screenCaptureManager != null && screenCaptureManager.isScreenCaptureEnabled();
    }
}
