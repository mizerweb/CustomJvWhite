package defpackage;

import android.animation.Animator;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class g53 implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ChatMediaViewerScreen b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;

    public g53(ChatMediaViewerScreen chatMediaViewerScreen, float f, boolean z) {
        this.b = chatMediaViewerScreen;
        this.d = f;
        this.c = z;
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
        t5a t5aVar;
        switch (this.a) {
            case 0:
                ChatMediaViewerScreen chatMediaViewerScreen = this.b;
                if (chatMediaViewerScreen.getView() != null && this.d == 0.0f) {
                    zv8[] zv8VarArr = ChatMediaViewerScreen.Z;
                    chatMediaViewerScreen.S1().setVisibility(8);
                    chatMediaViewerScreen.R1().setVisibility(8);
                    chatMediaViewerScreen.T1().setVisibility(8);
                    fl2 fl2VarQ1 = chatMediaViewerScreen.Q1();
                    if (fl2VarQ1 != null) {
                        fl2VarQ1.setVisibility(8);
                    }
                    if (this.c && (t5aVar = chatMediaViewerScreen.m) != null) {
                        t5aVar.e(false);
                    }
                    ji0 ji0Var = chatMediaViewerScreen.G;
                    if (ji0Var != null) {
                        ji0Var.c(false);
                    }
                    chatMediaViewerScreen.P1(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        boolean z;
        t5a t5aVar;
        fl2 fl2VarQ1;
        int i;
        switch (this.a) {
            case 0:
                break;
            default:
                zv8[] zv8VarArr = ChatMediaViewerScreen.Z;
                ChatMediaViewerScreen chatMediaViewerScreen = this.b;
                if (chatMediaViewerScreen.S1().getVisibility() != 0) {
                    chatMediaViewerScreen.S1().setVisibility(0);
                }
                if (chatMediaViewerScreen.R1().getVisibility() != 0) {
                    chatMediaViewerScreen.R1().setVisibility(0);
                }
                if (chatMediaViewerScreen.T1().getVisibility() != 0 && !r5h.X0(chatMediaViewerScreen.T1().getText())) {
                    chatMediaViewerScreen.T1().setVisibility(0);
                }
                fl2 fl2VarQ2 = chatMediaViewerScreen.Q1();
                if (fl2VarQ2 != null && fl2VarQ2.getVisibility() != 0 && (fl2VarQ1 = chatMediaViewerScreen.Q1()) != null) {
                    fl2 fl2VarQ3 = chatMediaViewerScreen.Q1();
                    if (fl2VarQ3 == null) {
                        i = 8;
                    } else {
                        CharSequence text = fl2VarQ3.s.getText();
                        if (!(text == null || r5h.X0(text))) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                    }
                    fl2VarQ1.setVisibility(i);
                }
                if (this.c && (t5aVar = chatMediaViewerScreen.m) != null) {
                    t5aVar.e(true);
                }
                ji0 ji0Var = chatMediaViewerScreen.G;
                if (ji0Var != null) {
                    if (chatMediaViewerScreen.Q1() != null) {
                        fl2 fl2VarQ4 = chatMediaViewerScreen.Q1();
                        z = (fl2VarQ4 != null ? fl2VarQ4.getState() : null) == dl2.a;
                    }
                    ji0Var.c(z);
                }
                if (this.d == 1.0f) {
                    chatMediaViewerScreen.P1(true);
                    td8 td8VarR1 = chatMediaViewerScreen.R1();
                    bdc.a(td8VarR1, new pi(9, td8VarR1, chatMediaViewerScreen));
                }
                break;
        }
    }

    public g53(ChatMediaViewerScreen chatMediaViewerScreen, boolean z, float f) {
        this.b = chatMediaViewerScreen;
        this.c = z;
        this.d = f;
    }
}
