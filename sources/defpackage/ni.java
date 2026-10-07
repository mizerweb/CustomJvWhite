package defpackage;

import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ni implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnhancedAnimatedVectorDrawable b;

    public /* synthetic */ ni(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable, int i) {
        this.a = i;
        this.b = enhancedAnimatedVectorDrawable;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        switch (i) {
            case 0:
                return enhancedAnimatedVectorDrawable.findPath("circle");
            case 1:
                return enhancedAnimatedVectorDrawable.findPath("hours");
            case 2:
                return enhancedAnimatedVectorDrawable.findPath("minutes");
            case 3:
                return enhancedAnimatedVectorDrawable.findPath("wave_small");
            case 4:
                return enhancedAnimatedVectorDrawable.findPath("wave_big");
            case 5:
                return enhancedAnimatedVectorDrawable.findPath("circle");
            case 6:
                return enhancedAnimatedVectorDrawable.findPath("circleL");
            case 7:
                return enhancedAnimatedVectorDrawable.findPath("circleM");
            default:
                return enhancedAnimatedVectorDrawable.findPath("circleR");
        }
    }
}
