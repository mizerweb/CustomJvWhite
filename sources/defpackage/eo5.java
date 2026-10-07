package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
public final class eo5 implements DisplayManager.DisplayListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eo5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.a) {
            case 0:
                fo5 fo5Var = (fo5) this.b;
                synchronized (fo5Var.c) {
                    fo5Var.d = null;
                    fo5Var.f = null;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                fo5 fo5Var = (fo5) this.b;
                synchronized (fo5Var.c) {
                    fo5Var.d = null;
                    fo5Var.f = null;
                }
                return;
            default:
                ghd ghdVar = (ghd) this.b;
                Display defaultDisplay = ghdVar.getDefaultDisplay();
                if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                    return;
                }
                ghdVar.b();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.a) {
            case 0:
                fo5 fo5Var = (fo5) this.b;
                synchronized (fo5Var.c) {
                    fo5Var.d = null;
                    fo5Var.f = null;
                }
                return;
            default:
                return;
        }
    }
}
