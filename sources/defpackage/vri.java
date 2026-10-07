package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public final class vri extends zri {
    public vri() {
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            TypedArray typedArrayH = xzl.h(resources, theme, attributeSet, e51.d);
            String string = typedArrayH.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArrayH.getString(1);
            if (string2 != null) {
                this.a = qyj.q(string2);
            }
            this.c = xzl.g(xmlPullParser, "fillType") ? typedArrayH.getInt(2, 0) : 0;
            typedArrayH.recycle();
        }
    }

    public vri(vri vriVar) {
        super(vriVar);
    }
}
