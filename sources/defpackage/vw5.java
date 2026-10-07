package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class vw5 extends lvb {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw5(int i) {
        super(12);
        this.f = i;
    }

    @Override // defpackage.lvb
    public final void C0(Object obj, float f) {
        switch (this.f) {
            case 0:
                ((View) obj).setY(f);
                break;
            case 1:
                ((View) obj).setAlpha(f);
                break;
            case 2:
                ((View) obj).setTranslationX(f);
                break;
            case 3:
                ((View) obj).setTranslationY(f);
                break;
            case 4:
                ((View) obj).setScaleX(f);
                break;
            case 5:
                ((View) obj).setScaleY(f);
                break;
            case 6:
                ((View) obj).setRotation(f);
                break;
            case 7:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }

    @Override // defpackage.lvb
    public final float q0(Object obj) {
        switch (this.f) {
            case 0:
                return ((View) obj).getY();
            case 1:
                return ((View) obj).getAlpha();
            case 2:
                return ((View) obj).getTranslationX();
            case 3:
                return ((View) obj).getTranslationY();
            case 4:
                return ((View) obj).getScaleX();
            case 5:
                return ((View) obj).getScaleY();
            case 6:
                return ((View) obj).getRotation();
            case 7:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }
}
