package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class nt {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final h6g h = new h6g(0);
    public final Object[] a = new Object[2];

    public br a(Context context, AttributeSet attributeSet) {
        return new br(context, attributeSet);
    }

    public cr b(Context context, AttributeSet attributeSet) {
        return new cr(context, attributeSet);
    }

    public er c(Context context, AttributeSet attributeSet) {
        return new er(context, attributeSet);
    }

    public fs d(Context context, AttributeSet attributeSet) {
        return new fs(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        h6g h6gVar = h;
        Constructor constructor = (Constructor) h6gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            h6gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
