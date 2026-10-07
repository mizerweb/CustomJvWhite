package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl9 implements tf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ jl9(int i) {
        this.a = i;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                kbc kbcVar = (kbc) obj3;
                Drawable drawable = ((ImageView) obj).getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = drawable instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable : null;
                if (enhancedAnimatedVectorDrawable != null) {
                    lvb.A0(enhancedAnimatedVectorDrawable, "left_dot", kbcVar.k().b);
                    lvb.A0(enhancedAnimatedVectorDrawable, "middle_dot", kbcVar.k().b);
                    lvb.A0(enhancedAnimatedVectorDrawable, "right_dot", kbcVar.k().b);
                    lvb.A0(enhancedAnimatedVectorDrawable, "shape", zBooleanValue ? kbcVar.v().c : kbcVar.v().b);
                }
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                kbc kbcVar2 = (kbc) obj3;
                Drawable drawable2 = ((ImageView) obj).getDrawable();
                sk0 sk0Var = drawable2 instanceof sk0 ? (sk0) drawable2 : null;
                if (sk0Var != null) {
                    sk0Var.b(zBooleanValue2);
                    sk0Var.a(kbcVar2.getIcon().h);
                }
                break;
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                kbc kbcVar3 = (kbc) obj3;
                Drawable drawable3 = ((ImageView) obj).getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable2 = drawable3 instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable3 : null;
                if (enhancedAnimatedVectorDrawable2 != null) {
                    lvb.A0(enhancedAnimatedVectorDrawable2, "cutout", kbcVar3.k().b);
                    lvb.A0(enhancedAnimatedVectorDrawable2, "gear", zBooleanValue3 ? kbcVar3.v().c : kbcVar3.v().b);
                }
                break;
            default:
                Log.println(((je9) obj).a, (String) obj2, (String) obj3);
                break;
        }
        return sbiVar;
    }
}
