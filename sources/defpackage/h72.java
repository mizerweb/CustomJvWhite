package defpackage;

import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* JADX INFO: loaded from: classes2.dex */
public final class h72 implements TextureViewRenderer.SizeChangeListener {
    public final /* synthetic */ i72 a;

    public h72(i72 i72Var) {
        this.a = i72Var;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.TextureViewRenderer.SizeChangeListener
    public final void onFrameSizeChanged(int i, int i2) {
        i72 i72Var = this.a;
        if (i72Var.e == i && i72Var.f == i2) {
            return;
        }
        i72Var.e = i;
        i72Var.f = i2;
        i72Var.e(true);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.TextureViewRenderer.SizeChangeListener
    public final void onTextureSizeChanged(int i, int i2) {
        i72 i72Var = this.a;
        if ((i72Var.c == i && i72Var.d == i2) || i == 0 || i2 == 0) {
            return;
        }
        i72Var.c = i;
        i72Var.d = i2;
        float[] fArr = i72Var.q;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = i;
        fArr[3] = i2;
        i72Var.e(false);
    }
}
