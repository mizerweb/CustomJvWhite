package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class q5i implements d8h {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final p5i i = new p5i(1, 30.0f, 1);
    public final XmlPullParserFactory a;

    public q5i() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            ore.h("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static s5i a(s5i s5iVar) {
        return s5iVar == null ? new s5i() : s5iVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            lvb.G0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            lvb.P("Invalid cell resolution %s %s", i2, i3, z);
            return i3;
        } catch (NumberFormatException unused) {
            lvb.G0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, s5i s5iVar) throws SubtitleDecoderException {
        Matcher matcher;
        String str2 = vqi.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(zo5.t(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            lvb.G0("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(c0a.o("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                s5iVar.j = 3;
                break;
            case "em":
                s5iVar.j = 2;
                break;
            case "px":
                s5iVar.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(c0a.o("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        s5iVar.k = Float.parseFloat(strGroup2);
    }

    public static p5i e(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = vqi.a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            lvb.O("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f2 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f2 = 1.0f;
        }
        p5i p5iVar = i;
        int i3 = p5iVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = p5iVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new p5i(i3, i2 * f2, i4);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.gx r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5i.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, gx, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static o5i g(XmlPullParser xmlPullParser, o5i o5iVar, HashMap map, p5i p5iVar) throws SubtitleDecoderException {
        long j;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        s5i s5iVarI = i(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    j4 = j(attributeValue, p5iVar);
                    break;
                case "end":
                    j3 = j(attributeValue, p5iVar);
                    break;
                case "begin":
                    j2 = j(attributeValue, p5iVar);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = vqi.a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (o5iVar != null) {
            long j5 = o5iVar.d;
            if (j5 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L) {
                    j2 += j5;
                }
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 != -9223372036854775807L) {
            j = j3;
        } else {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (o5iVar != null) {
                long j6 = o5iVar.e;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                }
            }
            j = j3;
        }
        return new o5i(xmlPullParser.getName(), null, j2, j, s5iVarI, strArr, str, strSubstring, o5iVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x022c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0240  */
    /* JADX WARN: Code duplicated, block: B:160:0x024e  */
    /* JADX WARN: Code duplicated, block: B:163:0x025c  */
    /* JADX WARN: Code duplicated, block: B:168:0x027c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0289  */
    /* JADX WARN: Code duplicated, block: B:171:0x028e  */
    /* JADX WARN: Code duplicated, block: B:174:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:180:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:184:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:188:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    public static s5i i(XmlPullParser xmlPullParser, s5i s5iVar) {
        byte b2;
        u98 jagVar;
        int i2;
        hof hofVarE;
        hof hofVarE2;
        hof hofVarE3;
        un8 un8Var;
        Object next;
        String str;
        int iHashCode;
        un8 un8Var2;
        Object next2;
        String str2;
        int iHashCode2;
        int i3;
        pmh pmhVar;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        s5i s5iVarA = s5iVar;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            String attributeName = xmlPullParser.getAttributeName(i4);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b2 = 0;
                    break;
                case "extent":
                    b2 = 1;
                    break;
                case "fontFamily":
                    b2 = 2;
                    break;
                case "textAlign":
                    b2 = 3;
                    break;
                case "origin":
                    b2 = 4;
                    break;
                case "textDecoration":
                    b2 = 5;
                    break;
                case "fontWeight":
                    b2 = 6;
                    break;
                case "id":
                    b2 = 7;
                    break;
                case "ruby":
                    b2 = 8;
                    break;
                case "color":
                    b2 = 9;
                    break;
                case "shear":
                    b2 = 10;
                    break;
                case "textCombine":
                    b2 = 11;
                    break;
                case "fontSize":
                    b2 = 12;
                    break;
                case "textEmphasis":
                    b2 = 13;
                    break;
                case "rubyPosition":
                    b2 = 14;
                    break;
                case "backgroundColor":
                    b2 = 15;
                    break;
                case "multiRowAlign":
                    b2 = 16;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b2) {
                case 0:
                    s5iVarA = a(s5iVarA);
                    s5iVarA.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    s5iVarA = a(s5iVarA);
                    s5iVarA.u = attributeValue;
                    break;
                case 2:
                    s5iVarA = a(s5iVarA);
                    s5iVarA.a = attributeValue;
                    break;
                case 3:
                    s5iVarA = a(s5iVarA);
                    String strB0 = n1g.b0(attributeValue);
                    strB0.getClass();
                    switch (strB0) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    s5iVarA.o = alignment;
                    break;
                case 4:
                    s5iVarA = a(s5iVarA);
                    s5iVarA.t = attributeValue;
                    break;
                case 5:
                    String strB1 = n1g.b0(attributeValue);
                    strB1.getClass();
                    switch (strB1) {
                        case "nounderline":
                            s5iVarA = a(s5iVarA);
                            s5iVarA.g = 0;
                            break;
                        case "underline":
                            s5iVarA = a(s5iVarA);
                            s5iVarA.g = 1;
                            break;
                        case "nolinethrough":
                            s5iVarA = a(s5iVarA);
                            s5iVarA.f = 0;
                            break;
                        case "linethrough":
                            s5iVarA = a(s5iVarA);
                            s5iVarA.f = 1;
                            break;
                    }
                    break;
                case 6:
                    s5iVarA = a(s5iVarA);
                    s5iVarA.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        s5iVarA = a(s5iVarA);
                        s5iVarA.l = attributeValue;
                    }
                    break;
                case 8:
                    String strB2 = n1g.b0(attributeValue);
                    strB2.getClass();
                    switch (strB2) {
                        case "baseContainer":
                        case "base":
                            s5iVarA = a(s5iVarA);
                            s5iVarA.m = 2;
                            break;
                        case "container":
                            s5iVarA = a(s5iVarA);
                            s5iVarA.m = 1;
                            break;
                        case "delimiter":
                            s5iVarA = a(s5iVarA);
                            s5iVarA.m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            s5iVarA = a(s5iVarA);
                            s5iVarA.m = 3;
                            break;
                    }
                    break;
                case 9:
                    s5iVarA = a(s5iVarA);
                    try {
                        s5iVarA.b = hx3.a(attributeValue, false);
                        s5iVarA.c = true;
                    } catch (IllegalArgumentException unused) {
                        tt2.f("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    s5i s5iVarA2 = a(s5iVarA);
                    Matcher matcher = e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e2) {
                            lvb.H0("TtmlParser", "Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        tt2.f("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    s5iVarA2.s = fMin;
                    s5iVarA = s5iVarA2;
                    break;
                case 11:
                    String strB3 = n1g.b0(attributeValue);
                    strB3.getClass();
                    if (strB3.equals("all")) {
                        s5iVarA = a(s5iVarA);
                        s5iVarA.q = 1;
                    } else if (strB3.equals("none")) {
                        s5iVarA = a(s5iVarA);
                        s5iVarA.q = 0;
                    }
                    break;
                case 12:
                    try {
                        s5iVarA = a(s5iVarA);
                        d(attributeValue, s5iVarA);
                    } catch (SubtitleDecoderException unused2) {
                        tt2.f("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    s5iVarA = a(s5iVarA);
                    Pattern pattern = pmh.d;
                    if (attributeValue == null) {
                        pmhVar = null;
                    } else {
                        String strB4 = n1g.b0(attributeValue.trim());
                        if (strB4.isEmpty()) {
                            pmhVar = null;
                        } else {
                            String[] strArrSplit = TextUtils.split(strB4, pmh.d);
                            int length = strArrSplit.length;
                            if (length == 0) {
                                jagVar = nhe.j;
                            } else if (length != 1) {
                                jagVar = u98.l((Object[]) strArrSplit.clone(), strArrSplit.length);
                            } else {
                                jagVar = new jag(strArrSplit[0]);
                            }
                            un8 un8Var3 = new un8(xpl.e(pmh.h, jagVar));
                            String str4 = (String) (un8Var3.hasNext() ? un8Var3.next() : "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i2 = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i2 = -2;
                                }
                                hofVarE = xpl.e(pmh.e, jagVar);
                                if (hofVarE.isEmpty()) {
                                    hofVarE2 = xpl.e(pmh.g, jagVar);
                                    hofVarE3 = xpl.e(pmh.f, jagVar);
                                    if (hofVarE2.isEmpty() || !hofVarE3.isEmpty()) {
                                        un8Var = new un8(hofVarE2);
                                        if (un8Var.hasNext()) {
                                            next = un8Var.next();
                                        } else {
                                            next = "filled";
                                        }
                                        str = (String) next;
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i5 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            un8Var2 = new un8(hofVarE3);
                                            if (un8Var2.hasNext()) {
                                                next2 = un8Var2.next();
                                            } else {
                                                next2 = "circle";
                                            }
                                            str2 = (String) next2;
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i3 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i3 = 3;
                                                }
                                                pmhVar = new pmh(i3, i5, i2);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i3 = 1;
                                            pmhVar = new pmh(i3, i5, i2);
                                        } else {
                                            str.equals("filled");
                                        }
                                        un8Var2 = new un8(hofVarE3);
                                        if (un8Var2.hasNext()) {
                                            next2 = un8Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            pmhVar = new pmh(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        pmhVar = new pmh(i3, i5, i2);
                                    } else {
                                        pmhVar = new pmh(-1, 0, i2);
                                    }
                                } else {
                                    str3 = (String) new un8(hofVarE).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i6 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        pmhVar = new pmh(i6, 0, i2);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    pmhVar = new pmh(i6, 0, i2);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i2 = 1;
                            hofVarE = xpl.e(pmh.e, jagVar);
                            if (hofVarE.isEmpty()) {
                                str3 = (String) new un8(hofVarE).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    pmhVar = new pmh(i6, 0, i2);
                                } else {
                                    str3.equals("auto");
                                }
                                pmhVar = new pmh(i6, 0, i2);
                            } else {
                                hofVarE2 = xpl.e(pmh.g, jagVar);
                                hofVarE3 = xpl.e(pmh.f, jagVar);
                                if (hofVarE2.isEmpty()) {
                                    un8Var = new un8(hofVarE2);
                                    if (un8Var.hasNext()) {
                                        next = un8Var.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        un8Var2 = new un8(hofVarE3);
                                        if (un8Var2.hasNext()) {
                                            next2 = un8Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            pmhVar = new pmh(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        pmhVar = new pmh(i3, i5, i2);
                                    } else {
                                        str.equals("filled");
                                    }
                                    un8Var2 = new un8(hofVarE3);
                                    if (un8Var2.hasNext()) {
                                        next2 = un8Var2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i3 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i3 = 3;
                                        }
                                        pmhVar = new pmh(i3, i5, i2);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i3 = 1;
                                    pmhVar = new pmh(i3, i5, i2);
                                } else {
                                    un8Var = new un8(hofVarE2);
                                    if (un8Var.hasNext()) {
                                        next = un8Var.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        un8Var2 = new un8(hofVarE3);
                                        if (un8Var2.hasNext()) {
                                            next2 = un8Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            pmhVar = new pmh(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        pmhVar = new pmh(i3, i5, i2);
                                    } else {
                                        str.equals("filled");
                                    }
                                    un8Var2 = new un8(hofVarE3);
                                    if (un8Var2.hasNext()) {
                                        next2 = un8Var2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i3 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i3 = 3;
                                        }
                                        pmhVar = new pmh(i3, i5, i2);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i3 = 1;
                                    pmhVar = new pmh(i3, i5, i2);
                                }
                            }
                        }
                    }
                    s5iVarA.r = pmhVar;
                    break;
                case 14:
                    String strB5 = n1g.b0(attributeValue);
                    strB5.getClass();
                    if (strB5.equals("before")) {
                        s5iVarA = a(s5iVarA);
                        s5iVarA.n = 1;
                    } else if (strB5.equals("after")) {
                        s5iVarA = a(s5iVarA);
                        s5iVarA.n = 2;
                    }
                    break;
                case 15:
                    s5iVarA = a(s5iVarA);
                    try {
                        s5iVarA.d = hx3.a(attributeValue, false);
                        s5iVarA.e = true;
                    } catch (IllegalArgumentException unused3) {
                        tt2.f("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 16:
                    s5iVarA = a(s5iVarA);
                    String strB6 = n1g.b0(attributeValue);
                    strB6.getClass();
                    switch (strB6) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    s5iVarA.p = alignment;
                    break;
            }
        }
        return s5iVarA;
    }

    public static long j(String str, p5i p5iVar) throws SubtitleDecoderException {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d4 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d5 = d4 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d6 = d5 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d7 = d6 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / p5iVar.a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) p5iVar.b)) / ((double) p5iVar.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(qv1.k("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d9 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d2 = p5iVar.a;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            case "h":
                d3 = 3600.0d;
                break;
            case "m":
                d3 = 60.0d;
                break;
            case "t":
                d2 = p5iVar.c;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            case "ms":
                d2 = 1000.0d;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            default:
                return (long) (d9 * 1000000.0d);
        }
        d9 *= d3;
        return (long) (d9 * 1000000.0d);
    }

    public static gx l(XmlPullParser xmlPullParser) {
        String strA = a05.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = g.matcher(strA);
        if (!matcher.matches()) {
            lvb.G0("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new gx(i2, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            lvb.G0("TtmlParser", "Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    @Override // defpackage.d8h
    public final int F() {
        return 1;
    }

    @Override // defpackage.d8h
    public final v7h h(int i2, byte[] bArr, int i3) {
        v7h v7hVar;
        v7h v7hVar2 = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new r5i("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            p5i p5iVarE = i;
            int iC = 15;
            int i4 = 0;
            g85 g85Var = null;
            gx gxVarL = null;
            while (eventType != 1) {
                o5i o5iVar = (o5i) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    v7hVar = v7hVar2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                p5iVarE = e(xmlPullParserNewPullParser);
                                iC = c(xmlPullParserNewPullParser);
                                gxVarL = l(xmlPullParserNewPullParser);
                            }
                            p5i p5iVar = p5iVarE;
                            int i5 = iC;
                            gx gxVar = gxVarL;
                            if (b(name)) {
                                if ("head".equals(name)) {
                                    f(xmlPullParserNewPullParser, map, i5, gxVar, map2, map3);
                                } else {
                                    try {
                                        o5i o5iVarG = g(xmlPullParserNewPullParser, o5iVar, map2, p5iVar);
                                        arrayDeque.push(o5iVarG);
                                        if (o5iVar != null) {
                                            if (o5iVar.m == null) {
                                                o5iVar.m = new ArrayList();
                                            }
                                            o5iVar.m.add(o5iVarG);
                                        }
                                    } catch (SubtitleDecoderException e2) {
                                        lvb.H0("TtmlParser", "Suppressing parser error", e2);
                                        i4++;
                                    }
                                }
                                gxVarL = gxVar;
                                iC = i5;
                                p5iVarE = p5iVar;
                            } else {
                                lvb.r0("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            }
                            i4++;
                            gxVarL = gxVar;
                            iC = i5;
                            p5iVarE = p5iVar;
                        } catch (IOException e3) {
                            e = e3;
                            ore.l("Unexpected error when reading input.", e);
                            return v7hVar;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            ore.l("Unable to decode source", e);
                            return v7hVar;
                        }
                    } else if (eventType == 4) {
                        o5iVar.getClass();
                        o5i o5iVarA = o5i.a(xmlPullParserNewPullParser.getText());
                        if (o5iVar.m == null) {
                            o5iVar.m = new ArrayList();
                        }
                        o5iVar.m.add(o5iVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            o5i o5iVar2 = (o5i) arrayDeque.peek();
                            o5iVar2.getClass();
                            g85Var = new g85(o5iVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    v7hVar = v7hVar2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                v7hVar2 = v7hVar;
            }
            v7hVar = v7hVar2;
            g85Var.getClass();
            return g85Var;
        } catch (IOException e5) {
            e = e5;
            v7hVar = v7hVar2;
        } catch (XmlPullParserException e6) {
            e = e6;
            v7hVar = v7hVar2;
        }
    }

    @Override // defpackage.d8h
    public final void k(byte[] bArr, int i2, int i3, c8h c8hVar, qg4 qg4Var) {
        bgc.g(h(i2, bArr, i3), c8hVar, qg4Var);
    }
}
