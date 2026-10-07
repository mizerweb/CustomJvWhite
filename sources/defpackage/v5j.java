package defpackage;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: loaded from: classes3.dex */
public final class v5j extends TextureView {
    public final /* synthetic */ x5j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5j(x5j x5jVar, Context context) {
        super(context);
        this.a = x5jVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x5j x5jVar = this.a;
        uvi uviVar = x5jVar.e;
        if (uviVar != null) {
            uviVar.a.setPlayer(null);
        }
        q5j q5jVar = x5jVar.f;
        if (q5jVar != null) {
            q5jVar.onSurfaceTextureDestroyed(getSurfaceTexture());
        }
    }
}
