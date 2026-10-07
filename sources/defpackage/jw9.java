package defpackage;

import android.animation.Animator;
import one.me.mediaeditor.MediaEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class jw9 implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MediaEditScreen c;
    public final /* synthetic */ float d;

    public jw9(float f, boolean z, MediaEditScreen mediaEditScreen) {
        this.d = f;
        this.b = z;
        this.c = mediaEditScreen;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.d == 0.0f) {
                    boolean z = this.b;
                    MediaEditScreen mediaEditScreen = this.c;
                    if (z) {
                        zv8[] zv8VarArr = MediaEditScreen.w1;
                        t5a t5aVar = mediaEditScreen.m;
                        if (t5aVar != null) {
                            t5aVar.e(false);
                        }
                    }
                    zv8[] zv8VarArr2 = MediaEditScreen.w1;
                    mediaEditScreen.V1();
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                boolean z = this.b;
                MediaEditScreen mediaEditScreen = this.c;
                if (z) {
                    zv8[] zv8VarArr = MediaEditScreen.w1;
                    t5a t5aVar = mediaEditScreen.m;
                    if (t5aVar != null) {
                        t5aVar.e(true);
                    }
                }
                if (this.d == 1.0f) {
                    zv8[] zv8VarArr2 = MediaEditScreen.w1;
                    mediaEditScreen.V1();
                }
                break;
        }
    }

    public jw9(boolean z, MediaEditScreen mediaEditScreen, float f) {
        this.b = z;
        this.c = mediaEditScreen;
        this.d = f;
    }
}
