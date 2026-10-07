package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class h4f extends View {
    public he2 a;
    public Window b;
    public g4f c;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.b;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        tvj.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.b == null) {
            tvj.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            tvj.c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.b.getAttributes();
        attributes.screenBrightness = f;
        this.b.setAttributes(attributes);
        tvj.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(x58 x58Var) {
        he2 he2Var = this.a;
        if (he2Var == null) {
            tvj.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        e4f e4fVar = e4f.b;
        f4f f4fVar = new f4f(e4fVar, x58Var);
        f4f f4fVarI = he2Var.i();
        he2Var.I.put(e4fVar, f4fVar);
        f4f f4fVarI2 = he2Var.i();
        if (f4fVarI2 == null || f4fVarI2.equals(f4fVarI)) {
            return;
        }
        he2Var.w();
    }

    public x58 getScreenFlash() {
        return this.c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(he2 he2Var) {
        wxl.a();
        he2 he2Var2 = this.a;
        if (he2Var2 != null && he2Var2 != he2Var) {
            setScreenFlashUiInfo(null);
        }
        this.a = he2Var;
        if (he2Var == null) {
            return;
        }
        wxl.a();
        if (he2Var.e.L() == 3 && this.b == null) {
            ore.k("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        } else {
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    public void setScreenFlashWindow(Window window) {
        wxl.a();
        StringBuilder sb = new StringBuilder("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.b);
        tvj.a("ScreenFlashView", sb.toString());
        if (this.b != window) {
            this.c = window == null ? null : new g4f(this);
        }
        this.b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
