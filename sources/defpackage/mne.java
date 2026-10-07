package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class mne {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, gm0 gm0Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceB = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            mj9 mj9Var = h9i.b;
            Typeface typeface = (Typeface) mj9Var.c(h9i.c(resources, i, string, i3, i2));
            if (typeface != null) {
                if (gm0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new yde(gm0Var, 1, typeface));
                }
                typefaceB = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        i77 i77VarA = qyl.a(resources.getXml(i), resources);
                        if (i77VarA == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (gm0Var != null) {
                                gm0Var.f(-3);
                            }
                        } else {
                            typefaceB = h9i.b(context, i77VarA, resources, i, string, typedValue.assetCookie, i2, gm0Var, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceI = h9i.a.i(context, resources, i, string);
                        if (typefaceI != null) {
                            mj9Var.d(h9i.c(resources, i, string, i4, i2), typefaceI);
                        }
                        if (gm0Var != null) {
                            if (typefaceI != null) {
                                new Handler(Looper.getMainLooper()).post(new yde(gm0Var, 1, typefaceI));
                            } else {
                                gm0Var.f(-3);
                            }
                        }
                        typefaceB = typefaceI;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (gm0Var != null) {
                        gm0Var.f(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (gm0Var != null) {
                        gm0Var.f(-3);
                    }
                }
            }
        } else if (gm0Var != null) {
            gm0Var.f(-3);
        }
        if (typefaceB != null || gm0Var != null || z2) {
            return typefaceB;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
