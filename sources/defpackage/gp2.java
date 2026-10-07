package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gp2 extends r2i {
    public static final String[] D = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final cp2 E = new cp2(0, PointF.class, "topLeft");
    public static final cp2 F = new cp2(1, PointF.class, "bottomRight");
    public static final cp2 G = new cp2(2, PointF.class, "bottomRight");
    public static final cp2 H = new cp2(3, PointF.class, "topLeft");
    public static final cp2 I = new cp2(4, PointF.class, "position");

    public static void O(c3i c3iVar) {
        View view = c3iVar.b;
        HashMap map = c3iVar.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.r2i
    public final void e(c3i c3iVar) {
        O(c3iVar);
    }

    @Override // defpackage.r2i
    public final void h(c3i c3iVar) {
        O(c3iVar);
    }

    @Override // defpackage.r2i
    public final Animator l(ViewGroup viewGroup, c3i c3iVar, c3i c3iVar2) {
        int i;
        gp2 gp2Var;
        Animator animatorC;
        if (c3iVar == null) {
            return null;
        }
        HashMap map = c3iVar.a;
        if (c3iVar2 == null) {
            return null;
        }
        HashMap map2 = c3iVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c3iVar2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        q9j.c(view, i2, i4, i6, i8);
        if (i14 != 2) {
            gp2Var = this;
            if (i2 == i3 && i4 == i5) {
                gp2Var.w.getClass();
                animatorC = fdl.c(view, G, lhb.k(i6, i8, i7, i9));
            } else {
                gp2Var.w.getClass();
                animatorC = fdl.c(view, H, lhb.k(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            gp2Var = this;
            gp2Var.w.getClass();
            animatorC = fdl.c(view, I, lhb.k(i2, i4, i3, i5));
        } else {
            gp2Var = this;
            fp2 fp2Var = new fp2(view);
            gp2Var.w.getClass();
            ObjectAnimator objectAnimatorC = fdl.c(fp2Var, E, lhb.k(i2, i4, i3, i5));
            gp2Var.w.getClass();
            ObjectAnimator objectAnimatorC2 = fdl.c(fp2Var, F, lhb.k(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorC, objectAnimatorC2);
            animatorSet.addListener(new dp2(fp2Var));
            animatorC = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            e4m.b(viewGroup4, true);
            gp2Var.q().a(new ep2(viewGroup4));
        }
        return animatorC;
    }

    @Override // defpackage.r2i
    public final String[] s() {
        return D;
    }
}
