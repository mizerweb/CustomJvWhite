package defpackage;

import android.animation.Animator;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class s2j implements Animator.AnimatorListener {
    public final /* synthetic */ VideoMessageWidget a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public s2j(VideoMessageWidget videoMessageWidget, boolean z, boolean z2) {
        this.a = videoMessageWidget;
        this.b = z;
        this.c = z2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zv8[] zv8VarArr = VideoMessageWidget.B;
        VideoMessageWidget videoMessageWidget = this.a;
        videoMessageWidget.u1().setVisibility(this.b ? 0 : 8);
        videoMessageWidget.r1().setVisibility(0);
        videoMessageWidget.t1().setVisibility(this.c ? 0 : 8);
    }
}
