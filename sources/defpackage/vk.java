package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;

/* JADX INFO: loaded from: classes.dex */
public final class vk extends f2 {
    public static final vk c = new vk(rk.VALUE_FROM, null);
    public static final vk d = new vk(rk.VALUE_TO, null);

    @Override // defpackage.f2
    public final Object d(Context context, XmlResourceParser xmlResourceParser, int i) {
        float fA;
        Object dlVar = (il) sk.j.e(context, xmlResourceParser);
        if (!(dlVar instanceof dl) && r5h.o1(xmlResourceParser.getAttributeValue(i), '#')) {
            dlVar = new dl(0);
        }
        if (dlVar instanceof dl) {
            return new dl(n1g.P(xmlResourceParser.getAttributeValue(i)));
        }
        if (dlVar instanceof el) {
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            try {
                fA = wl5.a(context, attributeValue);
            } catch (NumberFormatException unused) {
                fA = Float.parseFloat(attributeValue);
            }
            return new el(fA);
        }
        if (dlVar instanceof fl) {
            return new fl(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
        }
        if (dlVar instanceof gl) {
            return new gl(xmlResourceParser.getAttributeValue(i));
        }
        if (cqk.d(dlVar, hl.a)) {
            ore.k(c0a.o("Undefined ", ((rk) this.a).a, " type"));
            return null;
        }
        ore.o();
        return null;
    }
}
