package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hsk {
    public static TextView a(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            TextView textViewA = a(viewGroup.getChildAt(i));
            if (textViewA != null) {
                return textViewA;
            }
        }
        return null;
    }

    public static final ObjectAnimator b(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.addListener(new ck(z, view, 0));
        return objectAnimatorOfFloat;
    }

    public static final ObjectAnimator c(float f, View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), view.getTranslationY() + f);
    }
}
