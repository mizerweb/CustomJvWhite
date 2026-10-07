package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public class n15 extends p15 {
    public final Handler g = new Handler(Looper.getMainLooper());

    public n15() {
        Collections.singleton(new nv8(7));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0265  */
    /* JADX WARN: Code duplicated, block: B:117:0x0269  */
    /* JADX WARN: Code duplicated, block: B:119:0x026d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0270  */
    /* JADX WARN: Code duplicated, block: B:125:0x027e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0292  */
    /* JADX WARN: Code duplicated, block: B:129:0x0299 A[LOOP:1: B:45:0x00c9->B:129:0x0299, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, n15, p15] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // defpackage.p15
    public k15 l(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        int i;
        boolean z;
        boolean z2;
        long j;
        long j2;
        long j3;
        ?? r16;
        ?? R0;
        ?? r17;
        boolean z3 = false;
        String[] strArrSplit = new String[0];
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit = attributeValue.split(",");
        }
        int length = strArrSplit.length;
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= length) {
                z = false;
                break;
            }
            if (z5h.K0(strArrSplit[i2], "urn:dvb:dash:profile:dvb-dash:", false)) {
                z = true;
                break;
            }
            i2++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long jA0 = attributeValue2 == null ? -9223372036854775807L : vqi.a0(attributeValue2);
        long j4 = p15.j(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long j5 = p15.j(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long j6 = zEquals ? p15.j(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long j7 = zEquals ? p15.j(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long j8 = zEquals ? p15.j(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long jA1 = attributeValue3 == null ? -9223372036854775807L : vqi.a0(attributeValue3);
        long jE = zEquals ? 0L : -9223372036854775807L;
        String string = uri.toString();
        ArrayList arrayListE = j8f.e(new ws0(string, z ? 1 : Integer.MIN_VALUE, 1, string));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j9 = zEquals ? -9223372036854775807L : 0L;
        int i3 = 0;
        boolean z4 = false;
        fvd fvdVarO = null;
        ewe eweVar = null;
        Uri uriE = null;
        ijf ijfVarX = null;
        ?? r6 = arrayList2;
        while (true) {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, "BaseURL")) {
                if (i3 == 0) {
                    jE = p15.e(xmlPullParser, jE);
                    i3 = i;
                }
                r6.addAll(p15.f(xmlPullParser, arrayListE, z));
                if (r6.size() > i) {
                    int size = r6.size();
                    for (?? r3 = z3; r3 < size; r3++) {
                        r6.set(r3, new ws0(((ws0) r6.get(r3)).a, r3, i, ((ws0) r6.get(r3)).b));
                    }
                }
            } else {
                if (a05.f(xmlPullParser, "ProgramInformation")) {
                    fvdVarO = p15.o(xmlPullParser);
                } else {
                    if (a05.f(xmlPullParser, "UTCTiming")) {
                        z2 = false;
                        eweVar = new ewe(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY), z2, 10);
                    } else {
                        z2 = false;
                        if (a05.f(xmlPullParser, "Location")) {
                            uriE = w1m.e(uri.toString(), xmlPullParser.nextText());
                        } else if (a05.f(xmlPullParser, "ServiceDescription")) {
                            ijfVarX = p15.x(xmlPullParser);
                        } else {
                            if (!a05.f(xmlPullParser, "Period") || z4) {
                                arrayListE = arrayListE;
                                j9 = j9;
                                jA0 = jA0;
                                arrayList = arrayList;
                                j = -9223372036854775807L;
                                ?? r18 = r6;
                                j2 = jE;
                                if (a05.f(xmlPullParser, "vk:Attrs")) {
                                    while (true) {
                                        xmlPullParser.next();
                                        if (a05.f(xmlPullParser, "vk:XPlaybackDuration")) {
                                            String strNextText = xmlPullParser.nextText();
                                            if (strNextText != null) {
                                                j3 = Long.parseLong(strNextText);
                                                break;
                                            }
                                        } else {
                                            p15.b(xmlPullParser);
                                            if (a05.e(xmlPullParser, "vk:Attrs")) {
                                            }
                                        }
                                        j3 = 0;
                                        break;
                                    }
                                    this.g.post(new ff((Object) this, j3, 6));
                                    r16 = r18;
                                } else {
                                    p15.b(xmlPullParser);
                                    r16 = r18;
                                }
                            } else {
                                if (i3 != 0) {
                                    R0 = r6.isEmpty() ? arrayListE : r6;
                                } else {
                                    R0 = xw3.R0(new ws0(uri.toString(), z ? i : Integer.MIN_VALUE, i, uri.toString()));
                                }
                                long j10 = jA0;
                                ?? r19 = r6;
                                j2 = jE;
                                long j11 = j9;
                                jA0 = j10;
                                arrayListE = arrayListE;
                                arrayList = arrayList;
                                j = -9223372036854775807L;
                                Pair pairM = m(xmlPullParser, R0, j11, j2, jA0, j7, z);
                                fsc fscVar = (fsc) pairM.first;
                                j9 = j11;
                                if (fscVar.b != -9223372036854775807L) {
                                    Long l = (Long) pairM.second;
                                    long jLongValue = (l != null && l.longValue() == -9223372036854775807L) ? -9223372036854775807L : l.longValue() + fscVar.b;
                                    arrayList.add(fscVar);
                                    j9 = jLongValue;
                                    r16 = r19;
                                } else {
                                    if (!zEquals) {
                                        throw ParserException.b(null, "Unable to determine start of period " + arrayList.size());
                                    }
                                    jE = j2;
                                    z4 = true;
                                    r17 = r19;
                                }
                            }
                            jE = j2;
                            r17 = r16;
                        }
                    }
                    j = -9223372036854775807L;
                    r17 = r6;
                }
                if (a05.e(xmlPullParser, "MPD")) {
                    if (j4 == j) {
                        if (j9 != j) {
                            j4 = j9;
                        } else if (!zEquals) {
                            throw ParserException.b(null, "Unable to determine duration of static manifest.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        throw ParserException.b(null, "No periods found.");
                    }
                    return new k15(jA0, j4, j5, zEquals, j6, j7, j8, jA1, fvdVarO, eweVar, ijfVarX, uriE, arrayList);
                }
                arrayListE = arrayListE;
                arrayList = arrayList;
                z3 = z2;
                r6 = r17;
                i = 1;
                jA0 = jA0;
                j9 = j9;
            }
            arrayListE = arrayListE;
            z2 = false;
            j = -9223372036854775807L;
            r17 = r6;
            if (a05.e(xmlPullParser, "MPD")) {
                if (j4 == j) {
                    if (j9 != j) {
                        j4 = j9;
                    } else if (!zEquals) {
                        throw ParserException.b(null, "Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList.isEmpty()) {
                    return new k15(jA0, j4, j5, zEquals, j6, j7, j8, jA1, fvdVarO, eweVar, ijfVarX, uriE, arrayList);
                }
                throw ParserException.b(null, "No periods found.");
            }
            arrayListE = arrayListE;
            arrayList = arrayList;
            z3 = z2;
            r6 = r17;
            i = 1;
            jA0 = jA0;
            j9 = j9;
        }
    }

    @Override // defpackage.p15
    public final o15 q(XmlPullParser xmlPullParser, ArrayList arrayList, String str, String str2, String str3, String str4, int i, int i2, float f, int i3, int i4, String str5, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, mcf mcfVar, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "quality");
        if (attributeValue == null) {
            attributeValue = "";
        }
        o15 o15VarQ = super.q(xmlPullParser, arrayList, str, str2, str3, str4, i, i2, f, i3, i4, str5, arrayList2, arrayList3, arrayList4, arrayList5, mcfVar, j, j2, j3, j4, j5, z);
        b87 b87Var = o15VarQ.a;
        if (r5h.X0(attributeValue)) {
            return o15VarQ;
        }
        lwa lwaVar = b87Var.l;
        if (lwaVar == null) {
            lwaVar = new lwa(new jwa[0]);
        }
        lwa lwaVarA = lwaVar.a(new eri(attributeValue));
        a87 a87VarA = b87Var.a();
        a87VarA.k = lwaVarA;
        return new o15(new b87(a87VarA), o15VarQ.b, o15VarQ.c, o15VarQ.d, o15VarQ.e, o15VarQ.f, o15VarQ.h, o15VarQ.i, o15VarQ.g);
    }
}
