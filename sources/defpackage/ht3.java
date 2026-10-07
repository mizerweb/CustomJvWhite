package defpackage;

import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Path;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.PathElement;
import one.me.sdk.richvector.internal.element.Shape;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class ht3 extends oc9 {
    public ClipPathElement k0(XmlResourceParser xmlResourceParser) {
        int iC = oc9.c(this, xmlResourceParser, SdkMetricStatEvent.NAME_KEY);
        String attributeValue = iC != -1 ? xmlResourceParser.getAttributeValue(iC) : null;
        int iC2 = oc9.c(this, xmlResourceParser, "pathData");
        return new ClipPathElement(attributeValue, iC2 != -1 ? xmlResourceParser.getAttributeValue(iC2) : null);
    }

    public GroupElement l0(XmlResourceParser xmlResourceParser) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        int iC = oc9.c(this, xmlResourceParser, SdkMetricStatEvent.NAME_KEY);
        String attributeValue = iC != -1 ? xmlResourceParser.getAttributeValue(iC) : null;
        int iC2 = oc9.c(this, xmlResourceParser, "pivotX");
        float fFloatValue = (iC2 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC2))) : fValueOf2).floatValue();
        int iC3 = oc9.c(this, xmlResourceParser, "pivotY");
        float fFloatValue2 = (iC3 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC3))) : fValueOf2).floatValue();
        int iC4 = oc9.c(this, xmlResourceParser, "rotation");
        float fFloatValue3 = (iC4 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC4))) : fValueOf2).floatValue();
        int iC5 = oc9.c(this, xmlResourceParser, "scaleX");
        float fFloatValue4 = (iC5 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC5))) : fValueOf).floatValue();
        int iC6 = oc9.c(this, xmlResourceParser, "scaleY");
        if (iC6 != -1) {
            fValueOf = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC6)));
        }
        float fFloatValue5 = fValueOf.floatValue();
        int iC7 = oc9.c(this, xmlResourceParser, "translateX");
        float fFloatValue6 = (iC7 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC7))) : fValueOf2).floatValue();
        int iC8 = oc9.c(this, xmlResourceParser, "translateY");
        if (iC8 != -1) {
            fValueOf2 = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC8)));
        }
        return new GroupElement(attributeValue, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, fValueOf2.floatValue(), null, null, 768, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    public PathElement m0(XmlResourceParser xmlResourceParser) {
        Object obj;
        Object obj2;
        Object obj3;
        Integer num = 0;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        int iC = oc9.c(this, xmlResourceParser, SdkMetricStatEvent.NAME_KEY);
        String attributeValue = iC != -1 ? xmlResourceParser.getAttributeValue(iC) : null;
        int iC2 = oc9.c(this, xmlResourceParser, "fillAlpha");
        int iMin = Math.min(255, (int) ((iC2 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC2))) : fValueOf2).floatValue() * 255.0f));
        int iC3 = oc9.c(this, xmlResourceParser, "fillColor");
        int iIntValue = (iC3 != -1 ? Integer.valueOf(n1g.P(xmlResourceParser.getAttributeValue(iC3))) : num).intValue();
        moc mocVar = moc.c;
        int iC4 = oc9.c(this, xmlResourceParser, (String) mocVar.a);
        if (iC4 != -1) {
            switch (xmlResourceParser.getAttributeValue(iC4)) {
                case "1":
                    obj = Path.FillType.EVEN_ODD;
                    break;
                case "2":
                    obj = Path.FillType.INVERSE_WINDING;
                    break;
                case "3":
                    obj = Path.FillType.INVERSE_EVEN_ODD;
                    break;
                default:
                    obj = Path.FillType.WINDING;
                    break;
            }
        } else {
            obj = mocVar.b;
        }
        Path.FillType fillType = (Path.FillType) obj;
        int iC5 = oc9.c(this, xmlResourceParser, "pathData");
        String attributeValue2 = iC5 != -1 ? xmlResourceParser.getAttributeValue(iC5) : null;
        int iC6 = oc9.c(this, xmlResourceParser, "strokeAlpha");
        int iMin2 = Math.min(255, (int) ((iC6 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC6))) : fValueOf2).floatValue() * 255.0f));
        int iC7 = oc9.c(this, xmlResourceParser, "strokeColor");
        int iIntValue2 = (iC7 != -1 ? Integer.valueOf(n1g.P(xmlResourceParser.getAttributeValue(iC7))) : 0).intValue();
        noc nocVar = noc.c;
        int iC8 = oc9.c(this, xmlResourceParser, (String) nocVar.a);
        if (iC8 != -1) {
            String attributeValue3 = xmlResourceParser.getAttributeValue(iC8);
            if (attributeValue3.equals("1")) {
                obj2 = Paint.Cap.ROUND;
            } else {
                obj2 = attributeValue3.equals("2") ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
        } else {
            obj2 = nocVar.b;
        }
        Paint.Cap cap = (Paint.Cap) obj2;
        ooc oocVar = ooc.c;
        int iC9 = oc9.c(this, xmlResourceParser, (String) oocVar.a);
        if (iC9 != -1) {
            String attributeValue4 = xmlResourceParser.getAttributeValue(iC9);
            if (attributeValue4.equals("1")) {
                obj3 = Paint.Join.ROUND;
            } else {
                obj3 = attributeValue4.equals("2") ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
        } else {
            obj3 = oocVar.b;
        }
        Paint.Join join = (Paint.Join) obj3;
        int iC10 = oc9.c(this, xmlResourceParser, "strokeMiterLimit");
        float fFloatValue = (iC10 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC10))) : Float.valueOf(4.0f)).floatValue();
        int iC11 = oc9.c(this, xmlResourceParser, "strokeWidth");
        float fFloatValue2 = (iC11 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC11))) : fValueOf).floatValue();
        int iC12 = oc9.c(this, xmlResourceParser, "trimPathEnd");
        if (iC12 != -1) {
            fValueOf2 = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC12)));
        }
        float fFloatValue3 = fValueOf2.floatValue();
        int iC13 = oc9.c(this, xmlResourceParser, "trimPathOffset");
        float fFloatValue4 = (iC13 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC13))) : fValueOf).floatValue();
        int iC14 = oc9.c(this, xmlResourceParser, "trimPathStart");
        if (iC14 != -1) {
            fValueOf = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC14)));
        }
        return new PathElement(attributeValue, iMin, iIntValue, fillType, attributeValue2, iMin2, iIntValue2, cap, join, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fValueOf.floatValue());
    }

    public Shape n0(XmlResourceParser xmlResourceParser) {
        Float fValueOf;
        Float fValueOf2 = Float.valueOf(0.0f);
        int iC = oc9.c(this, xmlResourceParser, "viewportWidth");
        float fFloatValue = (iC != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC))) : fValueOf2).floatValue();
        int iC2 = oc9.c(this, xmlResourceParser, "viewportHeight");
        float fFloatValue2 = (iC2 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC2))) : fValueOf2).floatValue();
        int iC3 = oc9.c(this, xmlResourceParser, "alpha");
        int iMin = Math.min(255, (int) ((iC3 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iC3))) : Float.valueOf(1.0f)).floatValue() * 255.0f));
        int iC4 = oc9.c(this, xmlResourceParser, SdkMetricStatEvent.NAME_KEY);
        String attributeValue = iC4 != -1 ? xmlResourceParser.getAttributeValue(iC4) : null;
        int iC5 = oc9.c(this, xmlResourceParser, "width");
        if (iC5 != -1) {
            String attributeValue2 = xmlResourceParser.getAttributeValue(iC5);
            fValueOf = Float.valueOf(Float.parseFloat(attributeValue2.substring(0, attributeValue2.length() - (attributeValue2.endsWith("dip") ? 3 : 2))));
        } else {
            fValueOf = fValueOf2;
        }
        float fFloatValue3 = fValueOf.floatValue();
        int iC6 = oc9.c(this, xmlResourceParser, "height");
        if (iC6 != -1) {
            String attributeValue3 = xmlResourceParser.getAttributeValue(iC6);
            fValueOf2 = Float.valueOf(Float.parseFloat(attributeValue3.substring(0, attributeValue3.length() - (attributeValue3.endsWith("dip") ? 3 : 2))));
        }
        return new Shape(attributeValue, fFloatValue, fFloatValue2, iMin, fFloatValue3, fValueOf2.floatValue(), null, 64, null);
    }
}
