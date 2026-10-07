package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sk extends f2 {
    public static final sk e;
    public static final sk f;
    public final /* synthetic */ int c;
    public static final sk d = new sk(rk.DURATION, 300L, 0);
    public static final sk g = new sk(rk.REPEAT_COUNT, 0, 3);
    public static final sk h = new sk(rk.REPEAT_MODE, 1, 4);
    public static final sk i = new sk(rk.START_OFFSET, 0L, 5);
    public static final sk j = new sk(rk.VALUE_TYPE, new el(0.0f), 6);

    static {
        String str = "";
        e = new sk(rk.PATH_DATA, str, 1);
        f = new sk(rk.PROPERTY_NAME, str, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk(rk rkVar, Object obj, int i2) {
        super(rkVar, obj);
        this.c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    @Override // defpackage.f2
    public final Object d(Context context, XmlResourceParser xmlResourceParser, int i2) {
        Integer num;
        String attributeValue;
        int i3;
        switch (this.c) {
            case 0:
                Long lC0 = y5h.C0(xmlResourceParser.getAttributeValue(i2));
                return Long.valueOf(lC0 != null ? lC0.longValue() : 0L);
            case 1:
                return xmlResourceParser.getAttributeValue(i2);
            case 2:
                return xmlResourceParser.getAttributeValue(i2);
            case 3:
                return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i2)));
            case 4:
                return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i2)));
            case 5:
                return Long.valueOf(Long.parseLong(xmlResourceParser.getAttributeValue(i2)));
            default:
                Iterator it = xw3.P0(rk.VALUE_FROM, rk.VALUE_TO).iterator();
                do {
                    if (it.hasNext()) {
                        num = (Integer) n1g.h(xmlResourceParser).get(((rk) it.next()).a);
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        attributeValue = xmlResourceParser.getAttributeValue(num.intValue());
                    } else {
                        attributeValue = null;
                    }
                    if (attributeValue == null && r5h.o1(attributeValue, '#')) {
                        i3 = 3;
                    } else {
                        i3 = Integer.parseInt(xmlResourceParser.getAttributeValue(i2));
                    }
                    if (i3 != 0) {
                        return new el(0.0f);
                    }
                    if (i3 != 1) {
                        return new fl(0);
                    }
                    if (i3 != 2) {
                        return new gl("");
                    }
                    if (i3 != 3) {
                        return new dl(0);
                    }
                    if (i3 == 4) {
                        return hl.a;
                    }
                    ore.k(qv1.k("unknown value type ", xmlResourceParser.getAttributeValue(i2)));
                    return null;
                } while (num == null);
                if (num != null) {
                    attributeValue = xmlResourceParser.getAttributeValue(num.intValue());
                } else {
                    attributeValue = null;
                }
                if (attributeValue == null) {
                    i3 = Integer.parseInt(xmlResourceParser.getAttributeValue(i2));
                } else {
                    i3 = Integer.parseInt(xmlResourceParser.getAttributeValue(i2));
                }
                if (i3 != 0) {
                    return new el(0.0f);
                }
                if (i3 != 1) {
                    return new fl(0);
                }
                if (i3 != 2) {
                    return new gl("");
                }
                if (i3 != 3) {
                    return new dl(0);
                }
                if (i3 == 4) {
                    return hl.a;
                }
                ore.k(qv1.k("unknown value type ", xmlResourceParser.getAttributeValue(i2)));
                return null;
        }
    }
}
