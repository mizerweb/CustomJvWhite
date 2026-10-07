package defpackage;

import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class sc4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnhancedAnimatedVectorDrawable b;

    public /* synthetic */ sc4(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable, int i) {
        this.a = i;
        this.b = enhancedAnimatedVectorDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        switch (i) {
            case 0:
                enhancedAnimatedVectorDrawable.start();
                break;
            default:
                enhancedAnimatedVectorDrawable.start();
                break;
        }
    }
}
