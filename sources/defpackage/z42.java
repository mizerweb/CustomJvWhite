package defpackage;

import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z42 implements z52, a62 {
    public final /* synthetic */ g52 a;

    public /* synthetic */ z42(g52 g52Var) {
        this.a = g52Var;
    }

    public void a(TextureViewRenderer textureViewRenderer, boolean z) {
        i72 i72Var = this.a.w1;
        if (i72Var != null) {
            boolean z2 = !z;
            boolean z3 = i72Var.y != z2;
            i72Var.y = z2;
            if (textureViewRenderer == null) {
                i72Var.e(false);
                i72Var.f(null);
            } else {
                if (z3) {
                    i72Var.e(false);
                }
                i72Var.f(textureViewRenderer);
            }
        }
    }

    @Override // defpackage.z52
    public void c(boolean z) {
        g52.w(this.a, z);
    }
}
