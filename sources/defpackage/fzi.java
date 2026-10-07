package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public final class fzi implements Animator.AnimatorListener {
    public final /* synthetic */ izi a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public fzi(izi iziVar, int i, int i2, int i3, int i4) {
        this.a = iziVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        izi iziVar = this.a;
        v0i v0iVar = iziVar.g;
        if (!v0iVar.d) {
            oxi model = iziVar.getModel();
            l1j l1jVarE = model != null ? model.e() : null;
            if (model != null && l1jVarE != null) {
                if (izi.c0(model)) {
                    izi.R(iziVar, model, l1jVarE, null, 8);
                    iziVar.e.s(false);
                }
                if (l1jVarE.b == model.a && l1jVarE.f == k1j.d) {
                    yab.e(iziVar, iziVar.getDurationSlider(), -1);
                    iziVar.getDurationSlider().setVisibility(0);
                    iziVar.getDurationSlider().l(l1jVarE.g, false);
                    iziVar.getDurationSlider().j();
                }
            }
        }
        izi.L(iziVar);
        iziVar.s1 = Integer.valueOf(this.b);
        int i = this.c;
        iziVar.t1 = Integer.valueOf(i);
        int i2 = this.d;
        iziVar.u1 = Integer.valueOf(i2);
        iziVar.getAudioWaveView().setVisibility(v0iVar.d ? 0 : 8);
        iziVar.o1 = Integer.valueOf(this.e);
        iziVar.getTranscriptionBackground().setBounds(0, 0, i2, i);
        iziVar.q1 = null;
        iziVar.p1 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        izi iziVar = this.a;
        v0i v0iVar = iziVar.g;
        if (!v0iVar.d) {
            oxi model = iziVar.getModel();
            l1j l1jVarE = model != null ? model.e() : null;
            if (model != null && l1jVarE != null) {
                if (izi.c0(model)) {
                    izi.R(iziVar, model, l1jVarE, null, 8);
                    iziVar.e.s(false);
                }
                if (l1jVarE.b == model.a && l1jVarE.f == k1j.d) {
                    yab.e(iziVar, iziVar.getDurationSlider(), -1);
                    iziVar.getDurationSlider().setVisibility(0);
                    iziVar.getDurationSlider().l(l1jVarE.g, false);
                    iziVar.getDurationSlider().j();
                }
            }
        }
        izi.L(iziVar);
        iziVar.s1 = Integer.valueOf(this.b);
        int i = this.c;
        iziVar.t1 = Integer.valueOf(i);
        int i2 = this.d;
        iziVar.u1 = Integer.valueOf(i2);
        iziVar.getAudioWaveView().setVisibility(v0iVar.d ? 0 : 8);
        iziVar.o1 = Integer.valueOf(this.e);
        iziVar.getTranscriptionBackground().setBounds(0, 0, i2, i);
        iziVar.q1 = null;
        iziVar.p1 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
