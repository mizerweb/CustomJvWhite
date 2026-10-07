package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class umg extends u96 implements eph {
    public boolean d;

    public umg(Context context) {
        super(new EnhancedAnimatedVectorDrawable(context, R.drawable.sticker_typing));
    }

    @Override // defpackage.u96
    public final void a() {
        if (this.d) {
            return;
        }
        start();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = kbcVar.getIcon().d;
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_4_G_D_0_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_4_G_D_1_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_4_G_D_2_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_3_G_D_0_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_2_G_D_0_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_2_G_D_1_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_2_G_D_2_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_1_G_D_0_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_D_0_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_D_1_P_0", i);
        lvb.A0(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_D_2_P_0", i);
    }

    @Override // defpackage.u96, android.graphics.drawable.Animatable
    public final void start() {
        this.d = false;
        super.start();
    }

    @Override // defpackage.u96, android.graphics.drawable.Animatable
    public final void stop() {
        this.d = true;
        super.stop();
    }
}
