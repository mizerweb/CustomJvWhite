package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class tk extends f2 {
    public static final tk c = new tk(rk.INTERPOLATOR, new AccelerateDecelerateInterpolator());

    @Override // defpackage.f2
    public final Object d(Context context, XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue != 0) {
            return AnimationUtils.loadInterpolator(context, attributeResourceValue);
        }
        ore.k("Can't parse interpolator");
        return null;
    }
}
