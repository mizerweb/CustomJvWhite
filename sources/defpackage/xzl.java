package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xzl {
    public static final ek7 a(Context context, af7 af7Var) {
        GestureDetector gestureDetector = new GestureDetector(context, new fk7(0, af7Var));
        gestureDetector.setIsLongpressEnabled(false);
        return new ek7(gestureDetector, 1);
    }

    public static boolean b(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? typedArray.getBoolean(5, z) : z;
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") == null) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = jx3.a;
        try {
            return jx3.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static ed7 d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ed7 ed7VarC;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ed7((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                ed7VarC = ed7.C(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                ed7VarC = null;
            }
            if (ed7VarC != null) {
                return ed7VarC;
            }
        }
        return new ed7((Shader) null, (ColorStateList) null, 0);
    }

    public static float e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null ? typedArray.getFloat(i, f) : f;
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !g(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
