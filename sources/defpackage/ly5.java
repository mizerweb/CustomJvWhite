package defpackage;

import android.animation.Animator;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ly5 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ EditAndReplyScreen c;

    public /* synthetic */ ly5(boolean z, EditAndReplyScreen editAndReplyScreen, int i) {
        this.a = i;
        this.b = z;
        this.c = editAndReplyScreen;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    EditAndReplyScreen editAndReplyScreen = this.c;
                    if (editAndReplyScreen.getView() != null) {
                        zv8[] zv8VarArr = EditAndReplyScreen.w;
                        editAndReplyScreen.q1().setVisibility(8);
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    EditAndReplyScreen editAndReplyScreen = this.c;
                    if (editAndReplyScreen.getView() != null) {
                        zv8[] zv8VarArr = EditAndReplyScreen.w;
                        editAndReplyScreen.q1().setVisibility(8);
                    }
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
                if (this.b) {
                    EditAndReplyScreen editAndReplyScreen = this.c;
                    if (editAndReplyScreen.getView() != null) {
                        zv8[] zv8VarArr = EditAndReplyScreen.w;
                        editAndReplyScreen.q1().setVisibility(0);
                    }
                }
                break;
        }
    }
}
