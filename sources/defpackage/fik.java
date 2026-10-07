package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.Rational;
import android.util.SparseArray;
import android.util.Xml;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.di.component.DnsStoreInPrefs$Companion$BrokenInetAddressException;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes2.dex */
public class fik implements ttb, tzb, sah, CameraVideoCapturer.CameraSwitchHandler, qif, wm7, qmc, cy, s8g, lw0, kg7 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public fik(Context context, int i) {
        String str;
        this.a = 11;
        this.b = new SparseArray();
        this.c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            jrc jrcVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                x(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                jrcVar = new jrc(context, xml);
                                ((SparseArray) this.b).put(jrcVar.b, jrcVar);
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                xf4 xf4Var = new xf4(context, xml);
                                if (jrcVar != null) {
                                    ((ArrayList) jrcVar.d).add(xf4Var);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public static void C(tha thaVar, CharSequence charSequence, u9h u9hVar) {
        pha phaVar = thaVar.f;
        int iIntValue = ((Number) thaVar.getMessagePosition().getValue()).intValue();
        CharSequence text = thaVar.getText();
        sbi sbiVar = null;
        SpannableString spannableStringValueOf = text != null ? SpannableString.valueOf(text) : null;
        s9h s9hVarJ = spannableStringValueOf != null ? j(spannableStringValueOf, iIntValue, u9hVar) : null;
        if (spannableStringValueOf != null && s9hVarJ != null) {
            int spanStart = spannableStringValueOf.getSpanStart(s9hVarJ);
            int spanEnd = spannableStringValueOf.getSpanEnd(s9hVarJ);
            Editable text2 = phaVar.getText();
            if (text2 != null) {
                text2.replace(spanStart, spanEnd, charSequence, 0, charSequence.length());
            }
            Editable text3 = phaVar.getText();
            if (text3 == null) {
                thaVar.setText(" ");
            } else {
                text3.append((CharSequence) " ");
            }
            sbiVar = sbi.a;
        }
        if (sbiVar == null) {
            int length = u9hVar.e.length();
            Editable text4 = phaVar.getText();
            if (text4 != null) {
                int iMax = Math.max(phaVar.getSelectionStart(), 0);
                text4.replace(Math.max(iMax - length, 0), iMax, charSequence, 0, charSequence.length());
            }
            Editable text5 = phaVar.getText();
            if (text5 == null) {
                thaVar.setText(" ");
            } else {
                text5.append((CharSequence) " ");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[RETURN] */
    public static s9h j(SpannableString spannableString, int i, u9h u9hVar) {
        s9h[] s9hVarArr = (s9h[]) spannableString.getSpans(0, spannableString.length(), s9h.class);
        if (s9hVarArr != null) {
            for (s9h s9hVar : s9hVarArr) {
                int spanStart = spannableString.getSpanStart(s9hVar);
                int spanEnd = spannableString.getSpanEnd(s9hVar);
                if (s9hVar.a.a == u9hVar.a && spanStart <= i && i <= spanEnd && spanEnd - spanStart > 0) {
                    if (s9hVar != null) {
                        return s9hVar;
                    }
                }
            }
            s9hVar = null;
            if (s9hVar != null) {
                return s9hVar;
            }
        }
        return null;
    }

    public static boolean t(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            pj6.m("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        pj6.m("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    public ki0 A() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(l());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = qt4.H(5)[iOptInt];
        if (i2 == 0) {
            ore.n("Null registrationStatus");
            return null;
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new ki0(i2, jOptLong2, jOptLong, strOptString, strOptString2, strOptString3, strOptString4);
        }
        ore.k("Missing required properties:".concat(str));
        return null;
    }

    public void B(tha thaVar, CharSequence charSequence) {
        s9h s9hVar;
        CharSequence text = thaVar.getText();
        int iIntValue = ((Number) thaVar.getMessagePosition().getValue()).intValue();
        if (r5h.X0(charSequence) || text == null || r5h.X0(text) || charSequence.length() <= text.length()) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.c;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.append(text);
        s9h[] s9hVarArr = (s9h[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), s9h.class);
        s9h s9hVar2 = null;
        if (s9hVarArr != null) {
            int length = s9hVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    s9hVar = null;
                    break;
                }
                s9hVar = s9hVarArr[i];
                int spanStart = spannableStringBuilder.getSpanStart(s9hVar);
                int spanEnd = spannableStringBuilder.getSpanEnd(s9hVar);
                if (spanStart <= iIntValue && iIntValue <= spanEnd && spanEnd - spanStart > 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (s9hVar != null) {
                s9hVar2 = s9hVar;
            }
        }
        if (s9hVar2 != null) {
            u9h u9hVar = s9hVar2.a;
            int spanStart2 = spannableStringBuilder.getSpanStart(s9hVar2);
            int spanEnd2 = spannableStringBuilder.getSpanEnd(s9hVar2);
            if (spanStart2 != -1 && spanEnd2 != -1 && spanStart2 <= spanEnd2) {
                String string = spannableStringBuilder.subSequence(spanStart2, spanEnd2).toString();
                if (u9hVar.d.equals(string) || u9hVar.b.equals(string)) {
                    return;
                }
            }
            int spanStart3 = spannableStringBuilder.getSpanStart(s9hVar2);
            int spanEnd3 = spannableStringBuilder.getSpanEnd(s9hVar2);
            try {
                for (Object obj : spannableStringBuilder.getSpans(spanStart3, spanEnd3, Object.class)) {
                    if (!(obj instanceof y2e)) {
                        spannableStringBuilder.removeSpan(obj);
                    }
                }
            } catch (Throwable unused) {
            }
            thaVar.setText(spannableStringBuilder.delete(spanStart3, spanEnd3));
            CharSequence text2 = thaVar.getText();
            int length2 = text2 != null ? text2.length() : 0;
            if (spanStart3 <= -1 || spanStart3 > length2) {
                spanStart3 = length2;
            }
            thaVar.post(new ai(thaVar, spanStart3, 16));
        }
    }

    public void D(String str, InetAddress[] inetAddressArr) {
        v44 v44VarA = ((ksh) this.b).a();
        if (inetAddressArr == null || inetAddressArr.length == 0) {
            zr6 zr6Var = (zr6) ((ry8) ((ifh) this.c).getValue()).edit();
            zr6Var.remove(str);
            zr6Var.apply();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (InetAddress inetAddress : inetAddressArr) {
                linkedHashSet.add(av7.h(inetAddress.getAddress()) + "/" + (r5h.V0(inetAddress.toString(), "/", 0, false, 6) > 0 ? inetAddress.getHostName() : ""));
            }
            zr6 zr6Var2 = (zr6) ((ry8) ((ifh) this.c).getValue()).edit();
            zr6Var2.putStringSet(str, linkedHashSet);
            zr6Var2.apply();
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.c;
        if (a4cVar.b(je9Var)) {
            String strT = ew5.t(v44VarA.j());
            Integer numValueOf = inetAddressArr != null ? Integer.valueOf(inetAddressArr.length) : null;
            StringBuilder sbQ = qv1.q("saveAddresses (", strT, "), ", str, " to prefs (");
            sbQ.append(numValueOf);
            sbQ.append(")");
            a4cVar.c(je9Var, "DnsStoreInPrefs", sbQ.toString(), null);
        }
    }

    public void E(ConversationEndReason conversationEndReason) {
        CidLogger cidLogger = (CidLogger) this.b;
        if (conversationEndReason == null) {
            return;
        }
        ConversationEndReason conversationEndReason2 = (ConversationEndReason) this.c;
        if (conversationEndReason2 == null) {
            this.c = conversationEndReason;
            cidLogger.log("CallEndInfoHolder", "set end reason " + conversationEndReason);
            return;
        }
        cidLogger.log("CallEndInfoHolder", "warning: trying to replace end reason from " + conversationEndReason2 + " to " + conversationEndReason);
    }

    @Override // defpackage.wm7
    public void I(EGLDisplay eGLDisplay) throws GlUtil$GlException {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            tab.o((EGLContext) arrayList.get(i), eGLDisplay);
        }
        EGL14.eglReleaseThread();
        tab.d("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        tab.d("Error terminating display");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:24:0x00a3, B:25:0x00a9, B:49:0x0119, B:27:0x00ae, B:30:0x00ba, B:31:0x00c1, B:34:0x00c5, B:35:0x00d3, B:36:0x00e6, B:39:0x00ea, B:43:0x00f3, B:45:0x00f8, B:46:0x0103, B:47:0x010f), top: B:65:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:24:0x00a3, B:25:0x00a9, B:49:0x0119, B:27:0x00ae, B:30:0x00ba, B:31:0x00c1, B:34:0x00c5, B:35:0x00d3, B:36:0x00e6, B:39:0x00ea, B:43:0x00f3, B:45:0x00f8, B:46:0x0103, B:47:0x010f), top: B:65:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0103 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:24:0x00a3, B:25:0x00a9, B:49:0x0119, B:27:0x00ae, B:30:0x00ba, B:31:0x00c1, B:34:0x00c5, B:35:0x00d3, B:36:0x00e6, B:39:0x00ea, B:43:0x00f3, B:45:0x00f8, B:46:0x0103, B:47:0x010f), top: B:65:0x00a3 }] */
    @Override // defpackage.s8g
    public void a(Object obj) {
        boolean z;
        RuntimeException runtimeException;
        int i;
        qi0 qi0Var;
        switch (this.a) {
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((mp9) this.c).a(obj);
                return;
            default:
                m86 m86Var = (m86) obj;
                tvj.a("Recorder", "VideoEncoder is created. " + m86Var);
                if (m86Var == null) {
                    return;
                }
                qi0 qi0VarU = null;
                qyj.l(null, ((bee) this.c).g.d0 == ((i5b) this.b));
                qyj.l(null, ((bee) this.c).g.H == null);
                dee deeVar = ((bee) this.c).g;
                i5b i5bVar = (i5b) this.b;
                m86 m86Var2 = (m86) i5bVar.f;
                m86Var2.getClass();
                deeVar.H = m86Var2;
                deeVar.l.D(((awi) m86Var2.g).h());
                MediaFormat mediaFormat = deeVar.H.d;
                if (mediaFormat.containsKey("bitrate")) {
                    mediaFormat.getInteger("bitrate");
                }
                int i2 = 4;
                Surface surface = i5bVar.b != 4 ? null : (Surface) i5bVar.g;
                deeVar.D = surface;
                deeVar.G(surface);
                o9b.a(o9b.g((e89) i5bVar.k), new uvc(deeVar, i5bVar, false, 28), deeVar.e);
                dee deeVar2 = ((bee) this.c).g;
                synchronized (deeVar2.j) {
                    try {
                        switch (deeVar2.m.ordinal()) {
                            case 0:
                                deeVar2.H(cee.d);
                                qi0Var = null;
                                runtimeException = null;
                                z = false;
                                i2 = 0;
                                i = i2;
                                break;
                            case 1:
                                z = false;
                                if (deeVar2.p != null) {
                                    qi0Var = null;
                                    runtimeException = null;
                                    i2 = 0;
                                    i = i2;
                                } else if (deeVar2.n0 == 3) {
                                    qi0Var = deeVar2.q;
                                    deeVar2.q = null;
                                    deeVar2.C();
                                    runtimeException = dee.t0;
                                    i = 0;
                                } else {
                                    runtimeException = null;
                                    i2 = 0;
                                    i = 0;
                                    qi0VarU = deeVar2.u(deeVar2.m);
                                    qi0Var = null;
                                }
                                break;
                            case 2:
                                z = true;
                                if (deeVar2.p != null) {
                                    qi0Var = null;
                                    runtimeException = null;
                                    i2 = 0;
                                    i = i2;
                                } else if (deeVar2.n0 == 3) {
                                    qi0Var = deeVar2.q;
                                    deeVar2.q = null;
                                    deeVar2.C();
                                    runtimeException = dee.t0;
                                    i = 0;
                                } else {
                                    runtimeException = null;
                                    i2 = 0;
                                    i = 0;
                                    qi0VarU = deeVar2.u(deeVar2.m);
                                    qi0Var = null;
                                }
                                break;
                            case 3:
                            case 7:
                                throw new AssertionError("Incorrectly invoke onConfigured() in state " + deeVar2.m);
                            case 4:
                                z = false;
                                qyj.l("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", deeVar2.s());
                                qi0Var = null;
                                runtimeException = null;
                                i2 = 0;
                                i = 1;
                                break;
                            case 5:
                                z = true;
                                qyj.l("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", deeVar2.s());
                                qi0Var = null;
                                runtimeException = null;
                                i2 = 0;
                                i = 1;
                                break;
                            case 6:
                                throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                            case 8:
                                tvj.c("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                                qi0Var = null;
                                runtimeException = null;
                                z = false;
                                i2 = 0;
                                i = i2;
                                break;
                            default:
                                qi0Var = null;
                                runtimeException = null;
                                z = false;
                                i2 = 0;
                                i = i2;
                                break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i == 0) {
                    if (qi0VarU != null) {
                        deeVar2.L(qi0VarU, z);
                        return;
                    } else {
                        if (qi0Var != null) {
                            deeVar2.l(qi0Var, i2, runtimeException);
                            return;
                        }
                        return;
                    }
                }
                deeVar2.N(deeVar2.s, true);
                deeVar2.H.l();
                if (deeVar2.h0) {
                    qi0 qi0Var2 = deeVar2.s;
                    qi0Var2.A(new s3j(qi0Var2.h, deeVar2.n()), true);
                    deeVar2.h0 = false;
                }
                if (z) {
                    deeVar2.H.e();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.qif
    public aw8 b(rv8 rv8Var) {
        e9b e9bVar = (e9b) ((ur3) this.c).get(((qr3) rv8Var).d());
        Object m71Var = e9bVar.a.get();
        if (m71Var == null) {
            synchronized (e9bVar) {
                m71Var = e9bVar.a.get();
                if (m71Var == null) {
                    m71Var = new m71((aw8) ((cf7) this.b).invoke(rv8Var));
                    e9bVar.a = new SoftReference(m71Var);
                }
            }
        }
        return ((m71) m71Var).a;
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        oo5.d((hp9) this.b, ko5Var);
    }

    @Override // defpackage.cy
    public ey createAssetLoader(s26 s26Var, Looper looper, dy dyVar, ay ayVar) {
        return new f58((Context) this.b, s26Var, dyVar, (xx0) this.c, ayVar.b);
    }

    public a12 d(x70 x70Var) {
        a12 a12Var;
        Object objC;
        HashMap map = (HashMap) this.c;
        a12 a12Var2 = (a12) map.get((cnf) x70Var.b);
        if (a12Var2 == null && x70Var.a) {
            a12Var = null;
        } else {
            cnf cnfVar = (cnf) x70Var.b;
            imc imcVar = (imc) x70Var.c;
            if (a12Var2 == null || (objC = a12Var2.b) == null) {
                objC = "";
            }
            if (imcVar.q()) {
                objC = imcVar.c();
            }
            String str = (String) objC;
            imc imcVar2 = (imc) x70Var.d;
            Object objValueOf = Boolean.valueOf(a12Var2 != null ? a12Var2.c : false);
            if (imcVar2.q()) {
                objValueOf = imcVar2.c();
            }
            boolean zBooleanValue = ((Boolean) objValueOf).booleanValue();
            List list = a12Var2 != null ? a12Var2.d : null;
            List listG1 = (List) ((imc) x70Var.e).s();
            Iterable iterable = (List) ((imc) x70Var.f).s();
            List list2 = (List) ((imc) x70Var.g).s();
            if (listG1 == null) {
                Iterable iterableX1 = list2 != null ? ww3.X1(list2) : c76.a;
                if (iterable == null) {
                    iterable = r66.a;
                }
                listG1 = list != null ? ww3.G1(iterable, ww3.F1(list, iterableX1)) : ww3.F1(iterable, iterableX1);
            }
            List list3 = listG1;
            imc imcVar3 = (imc) x70Var.h;
            Object objValueOf2 = Integer.valueOf(a12Var2 != null ? a12Var2.e : 0);
            if (imcVar3.q()) {
                objValueOf2 = imcVar3.c();
            }
            int iIntValue = ((Number) objValueOf2).intValue();
            imc imcVar4 = (imc) x70Var.i;
            Object objC2 = a12Var2 != null ? a12Var2.f : null;
            if (imcVar4.q()) {
                objC2 = imcVar4.c();
            }
            yt1 yt1Var = (yt1) objC2;
            imc imcVar5 = (imc) x70Var.j;
            Object objC3 = a12Var2 != null ? a12Var2.g : null;
            if (imcVar5.q()) {
                objC3 = imcVar5.c();
            }
            a12Var = new a12(iIntValue, yt1Var, cnfVar, (Long) objC3, str, list3, zBooleanValue);
            map.put(cnfVar, a12Var);
        }
        if (a12Var == null) {
            return null;
        }
        ((xq1) this.b).f.onRoomUpdated(new g12(a12Var.a, zgl.c(a12Var)));
        return a12Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    @Override // defpackage.lw0
    public kw0 e(kj6 kj6Var, long j) {
        int iA;
        long position = kj6Var.getPosition();
        int iMin = (int) Math.min(20000L, kj6Var.getLength() - position);
        nmc nmcVar = (nmc) this.c;
        nmcVar.K(iMin);
        kj6Var.u(0, nmcVar.a, iMin);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (nmcVar.a() >= 4) {
            if (yw6.a(nmcVar.b, nmcVar.a) != 442) {
                nmcVar.O(1);
            } else {
                nmcVar.O(4);
                long jC = uxd.c(nmcVar);
                if (jC != -9223372036854775807L) {
                    long jB = ((dth) this.b).b(jC);
                    if (jB > j) {
                        return j2 == -9223372036854775807L ? new kw0(-1, jB, position) : new kw0(0, -9223372036854775807L, position + ((long) i2));
                    }
                    j2 = jB;
                    long j3 = 100000 + j2;
                    i2 = nmcVar.b;
                    if (j3 > j) {
                        return new kw0(0, -9223372036854775807L, position + ((long) i2));
                    }
                }
                int i3 = nmcVar.c;
                if (nmcVar.a() >= 10) {
                    nmcVar.O(9);
                    int iA2 = nmcVar.A() & 7;
                    if (nmcVar.a() >= iA2) {
                        nmcVar.O(iA2);
                        if (nmcVar.a() >= 4) {
                            if (yw6.a(nmcVar.b, nmcVar.a) != 443) {
                                while (nmcVar.a() >= 4) {
                                    iA = yw6.a(nmcVar.b, nmcVar.a);
                                    if (iA == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            nmcVar.O(4);
                            int iH = nmcVar.H();
                            if (nmcVar.a() < iH) {
                                nmcVar.N(i3);
                            } else {
                                nmcVar.O(iH);
                                while (nmcVar.a() >= 4) {
                                    iA = yw6.a(nmcVar.b, nmcVar.a);
                                    if (iA == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    nmcVar.O(4);
                                    if (nmcVar.a() < 2) {
                                        nmcVar.N(i3);
                                        break;
                                    }
                                    nmcVar.N(Math.min(nmcVar.c, nmcVar.b + nmcVar.H()));
                                }
                            }
                        } else {
                            nmcVar.N(i3);
                        }
                    } else {
                        nmcVar.N(i3);
                    }
                } else {
                    nmcVar.N(i3);
                }
                i = nmcVar.b;
            }
        }
        return j2 != -9223372036854775807L ? new kw0(-2, j2, position + ((long) i)) : kw0.d;
    }

    public void f() {
        HashMap map = (HashMap) this.c;
        Set setKeySet = map.keySet();
        setKeySet.getClass();
        List listT1 = ww3.T1(setKeySet);
        map.clear();
        Iterator it = listT1.iterator();
        while (it.hasNext()) {
            ((xq1) this.b).f.onRoomRemoved(new f12((cnf) it.next()));
        }
    }

    @Override // defpackage.wm7
    public EGLSurface g(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil$GlException {
        int[] iArr;
        int[] iArr2 = tab.f;
        if (i == 3 || i == 10) {
            iArr = tab.b;
        } else {
            if (i != 7 && i != 6) {
                ore.p(zo5.h(i, "Unsupported color transfer: "));
                return null;
            }
            iArr = tab.c;
            if (!z) {
                if (i == 6) {
                    if (!tab.w()) {
                        throw new GlUtil$GlException("BT.2020 PQ OpenGL output isn't supported.");
                    }
                    iArr2 = tab.d;
                } else {
                    if (!tab.x("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        throw new GlUtil$GlException("BT.2020 HLG OpenGL output isn't supported.");
                    }
                    iArr2 = tab.e;
                }
            }
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, tab.u(eGLDisplay, iArr), obj, iArr2, 0);
        tab.d("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    @Override // defpackage.sah
    public Object get() {
        xb0 xb0Var = (xb0) this.b;
        nwk.b(xb0Var);
        nwk.c(xb0Var);
        int i = xb0Var.a;
        if (i == -1) {
            tvj.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            i = 1;
        } else {
            tvj.a("DefAudioResolver", "Using supplied AUDIO channel count: " + i);
        }
        kl2 kl2VarD = nwk.d(44100, i, 2, (Rational) this.c);
        int i2 = kl2VarD.b;
        int i3 = kl2VarD.a;
        tvj.a("DefAudioResolver", nbh.u("Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: ", i3, "Hz. Encode sample rate: ", i2, "Hz."));
        List list = rg0.f;
        g85 g85Var = new g85();
        g85Var.a = -1;
        g85Var.b = -1;
        g85Var.c = -1;
        g85Var.d = -1;
        g85Var.e = -1;
        g85Var.a = 5;
        g85Var.e = 2;
        g85Var.d = Integer.valueOf(i);
        g85Var.b = Integer.valueOf(i3);
        g85Var.c = Integer.valueOf(i2);
        return g85Var.w();
    }

    public byte[] h(tc6 tc6Var) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(tc6Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(tc6Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(tc6Var.c);
            dataOutputStream.writeLong(tc6Var.d);
            dataOutputStream.write(tc6Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            qr7.o(e);
            return null;
        }
    }

    @Override // defpackage.lw0
    public void i() {
        nmc nmcVar = (nmc) this.c;
        byte[] bArr = vqi.b;
        nmcVar.getClass();
        nmcVar.L(bArr.length, bArr);
    }

    public Bitmap k(int i) {
        Object objPollFirst;
        euc eucVar = (euc) this.c;
        synchronized (eucVar) {
            c31 c31Var = (c31) ((SparseArray) eucVar.b).get(i);
            if (c31Var == null) {
                objPollFirst = null;
            } else {
                objPollFirst = c31Var.c.pollFirst();
                if (((c31) eucVar.c) != c31Var) {
                    eucVar.C(c31Var);
                    c31 c31Var2 = (c31) eucVar.c;
                    if (c31Var2 == null) {
                        eucVar.c = c31Var;
                        eucVar.d = c31Var;
                    } else {
                        c31Var.d = c31Var2;
                        c31Var2.a = c31Var;
                        eucVar.c = c31Var;
                    }
                }
            }
        }
        if (objPollFirst != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(objPollFirst);
            }
        }
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !t(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    public File l() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        ov6 ov6Var = (ov6) this.c;
                        ov6Var.a();
                        this.b = new File(ov6Var.a.getFilesDir(), "PersistedInstallation." + ((ov6) this.c).c() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.b;
    }

    public List m(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.c;
        if (charSequence == null || r5h.X0(charSequence)) {
            return r66.a;
        }
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.append(charSequence);
        Object[] spans = spannableStringBuilder.getSpans(0, charSequence.length(), fga.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (((fga) obj).a.c == bga.a) {
                arrayList.add(obj);
            }
        }
        return ww3.T1(arrayList);
    }

    @Override // defpackage.qmc
    public Object n(Uri uri, x25 x25Var) {
        ou6 ou6Var = (ou6) ((qmc) this.b).n(uri, x25Var);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? ou6Var : (ou6) ou6Var.a(list);
    }

    @Override // defpackage.wm7
    public dn7 o(int i, int i2, int i3) throws GlUtil$GlException {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        tab.e();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        tab.e();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        tab.e();
        return new dn7(i, iArr[0], i2, i3);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public void onCameraSwitchDone(boolean z) {
        kd2 kd2Var = (kd2) this.b;
        String str = (String) this.c;
        kd2Var.e.log("CameraCapturerAdapter", qt4.n("onCameraSwitchDone, new camera: ", str, ", is front: ", z));
        synchronized (kd2Var.g) {
            kd2Var.h = str;
            kd2Var.i = z;
            kd2Var.j = false;
        }
        Iterator it = kd2Var.f.iterator();
        while (it.hasNext()) {
            ((sb9) it.next()).i(kd2Var, true);
        }
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public void onCameraSwitchError(String str) {
        kd2 kd2Var = (kd2) this.b;
        kd2Var.e.reportException("CameraCapturerAdapter", "Error on camera switch", new IllegalStateException(qv1.k("onCameraSwitchError, ", str)));
        synchronized (kd2Var.g) {
            kd2Var.j = false;
        }
        Iterator it = kd2Var.f.iterator();
        while (it.hasNext()) {
            ((sb9) it.next()).i(kd2Var, false);
        }
    }

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        ((mp9) this.c).onError(th);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        qi0 qi0Var;
        tvj.i("Recorder", "VideoEncoder Setup error: " + th, th);
        bee beeVar = (bee) this.c;
        int i = beeVar.e;
        if (i < beeVar.c) {
            beeVar.e = i + 1;
            h7b h7bVar = new h7b(13, this);
            beeVar.f = zjl.d().schedule(new i7b(beeVar.g.e, 29, h7bVar), dee.A0, TimeUnit.MILLISECONDS);
            return;
        }
        dee deeVar = beeVar.g;
        synchronized (deeVar.j) {
            try {
                qi0Var = null;
                switch (deeVar.m.ordinal()) {
                    case 1:
                    case 2:
                        qi0 qi0Var2 = deeVar.q;
                        deeVar.q = null;
                        qi0Var = qi0Var2;
                    case 0:
                        deeVar.I(-1);
                        deeVar.H(cee.i);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + deeVar.m + ": " + th);
                    default:
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (qi0Var != null) {
            deeVar.l(qi0Var, 7, th);
        }
    }

    public ConversationEndReason p() {
        ConversationEndReason conversationEndReason = (ConversationEndReason) this.c;
        return conversationEndReason == null ? ConversationEndReason.Unknown.INSTANCE : conversationEndReason;
    }

    @Override // defpackage.wm7
    public EGLSurface q(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return tab.l(eGLContext, eGLDisplay);
    }

    public xmf r(cnf cnfVar) {
        cnfVar.getClass();
        a12 a12Var = (a12) ((HashMap) this.c).get(cnfVar);
        if (a12Var != null) {
            return zgl.c(a12Var);
        }
        return null;
    }

    public void s(ki0 ki0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ki0Var.a);
            jSONObject.put("Status", qt4.D(ki0Var.b));
            jSONObject.put("AuthToken", ki0Var.c);
            jSONObject.put("RefreshToken", ki0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", ki0Var.f);
            jSONObject.put("ExpiresInSecs", ki0Var.e);
            jSONObject.put("FisError", ki0Var.g);
            ov6 ov6Var = (ov6) this.c;
            ov6Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", ov6Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(l())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public InetAddress[] u(String str) {
        InetAddress[] inetAddressArr;
        InetAddress inetAddressB;
        v44 v44VarA = ((ksh) this.b).a();
        Set<String> stringSet = ((ry8) ((ifh) this.c).getValue()).getStringSet(str, null);
        if (stringSet != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : stringSet) {
                try {
                    inetAddressB = ksl.b(str2);
                } catch (DnsStoreInPrefs$Companion$BrokenInetAddressException unused) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "DnsStoreInPrefs", qv1.k("loadAddresses, failed to read inet address=", str2), null);
                        }
                    }
                    inetAddressB = null;
                }
                if (inetAddressB != null) {
                    arrayList.add(inetAddressB);
                }
            }
            inetAddressArr = (InetAddress[]) arrayList.toArray(new InetAddress[0]);
        } else {
            inetAddressArr = null;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.c;
            if (a4cVar2.b(je9Var2)) {
                String strT = ew5.t(v44VarA.j());
                Integer numValueOf = inetAddressArr != null ? Integer.valueOf(inetAddressArr.length) : null;
                StringBuilder sbQ = qv1.q("loadAddresses (", strT, "), ", str, " from prefs (");
                sbQ.append(numValueOf);
                sbQ.append(")");
                a4cVar2.c(je9Var2, "DnsStoreInPrefs", sbQ.toString(), null);
            }
        }
        return inetAddressArr;
    }

    public void v(long j) {
        txc txcVarX1 = ((AbstractPickerScreen) this.b).x1();
        mjg mjgVar = txcVarX1.h;
        m8b m8bVarE = rx8.e((m8b) mjgVar.getValue());
        m8bVarE.n(j);
        txcVarX1.d.e(j);
        mjgVar.j(null, m8bVarE);
    }

    public void w(rq rqVar, View view, float f) {
        Rect rect = (Rect) this.c;
        Rect rect2 = (Rect) this.b;
        view.getDrawingRect(rect2);
        rqVar.offsetDescendantRectToMyCoords(view, rect2);
        rect2.offset(0, -rqVar.getTopInset());
        float fAbs = rect2.top - Math.abs(f);
        if (fAbs > 0.0f) {
            WeakHashMap weakHashMap = i7j.a;
            view.setClipBounds(null);
            view.setTranslationY(0.0f);
            view.setVisibility(0);
            return;
        }
        float fE = 1.0f - np4.e(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fE * fE)));
        view.setTranslationY(fHeight);
        view.getDrawingRect(rect);
        rect.offset(0, (int) (-fHeight));
        if (fHeight >= rect.height()) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        WeakHashMap weakHashMap2 = i7j.a;
        view.setClipBounds(rect);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void x(Context context, XmlResourceParser xmlResourceParser) {
        eg4 eg4Var = new eg4();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    zf4 zf4VarF = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (zf4VarF == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        zf4VarF.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (zf4VarF == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        zf4VarF.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        zf4VarF = eg4.f(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (zf4VarF == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        zf4VarF.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (zf4VarF == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        zf4VarF.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        zf4VarF = eg4.f(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        zf4VarF.d.a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (zf4VarF != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        pf4.a(context, xmlResourceParser, zf4VarF.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        zf4VarF = eg4.f(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        zf4VarF.d.h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (zf4VarF != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        pf4.a(context, xmlResourceParser, zf4VarF.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        zf4VarF = eg4.f(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        eg4Var.c.put(Integer.valueOf(zf4VarF.a), zf4VarF);
                                        zf4VarF = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        eg4Var.c.put(Integer.valueOf(zf4VarF.a), zf4VarF);
                                        zf4VarF = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        eg4Var.c.put(Integer.valueOf(zf4VarF.a), zf4VarF);
                                        zf4VarF = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.c).put(identifier, eg4Var);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.c).put(identifier, eg4Var);
                return;
            }
        }
    }

    @Override // defpackage.wm7
    public EGLContext y(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil$GlException {
        EGLContext eGLContextK = tab.k((EGLContext) this.b, eGLDisplay, i, iArr);
        ((ArrayList) this.c).add(eGLContextK);
        return eGLContextK;
    }

    public Object z() {
        Object obj;
        euc eucVar = (euc) this.c;
        synchronized (eucVar) {
            c31 c31Var = (c31) eucVar.d;
            if (c31Var == null) {
                obj = null;
            } else {
                Object objPollLast = c31Var.c.pollLast();
                if (c31Var.c.isEmpty()) {
                    eucVar.C(c31Var);
                    ((SparseArray) eucVar.b).remove(c31Var.b);
                }
                obj = objPollLast;
            }
        }
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            ((HashSet) this.b).remove(obj);
        }
        return obj;
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        String str = ((vo7) this.b).i;
        so7 so7Var = new so7(exc);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "GoogleMlKit scanner result error " + exc, so7Var);
            }
        }
        ((ek2) this.c).resumeWith(new poe(exc));
    }

    public /* synthetic */ fik(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ fik(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public fik(tu0 tu0Var) {
        this.a = 0;
        this.b = tu0Var;
        this.c = fik.class.getName();
    }

    public fik(o91 o91Var, vn7 vn7Var) {
        this.a = 25;
        vn7Var.getClass();
        this.b = o91Var;
        this.c = vn7Var;
    }

    public fik(xq1 xq1Var) {
        this.a = 7;
        this.b = xq1Var;
        this.c = new HashMap();
    }

    public fik(kzi kziVar, p81 p81Var) {
        this.a = 18;
        kziVar.getClass();
        this.b = kziVar;
        this.c = p81Var;
    }

    public fik(af7 af7Var) {
        this.a = 21;
        this.b = af7Var;
        this.c = new SpannableStringBuilder();
    }

    public fik(ny8 ny8Var, ny8 ny8Var2) {
        this.a = 14;
        this.b = new pfh(3);
        this.c = new ifh(new oe3(ny8Var, ny8Var2, 2));
    }

    public fik(cf7 cf7Var) {
        this.a = 10;
        this.b = cf7Var;
        this.c = new ur3();
    }

    public /* synthetic */ fik(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public fik(dth dthVar) {
        this.a = 27;
        this.b = dthVar;
        this.c = new nmc();
    }

    public fik(ov6 ov6Var) {
        this.a = 26;
        this.c = ov6Var;
    }

    public fik(EditText editText) {
        this.a = 15;
        this.b = editText;
        t56 t56Var = new t56(editText);
        this.c = t56Var;
        editText.addTextChangedListener(t56Var);
        if (o46.b == null) {
            synchronized (o46.a) {
                try {
                    if (o46.b == null) {
                        o46 o46Var = new o46();
                        try {
                            o46.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, o46.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        o46.b = o46Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(o46.b);
    }

    public fik(ghe gheVar, int[] iArr) {
        this.a = 23;
        this.b = c98.n(gheVar);
        this.c = iArr;
    }

    public fik(bee beeVar, i5b i5bVar) {
        this.a = 28;
        this.c = beeVar;
        this.b = i5bVar;
    }

    public fik(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new HashSet();
                this.c = new euc(3);
                break;
            case 13:
                this.b = EGL14.EGL_NO_CONTEXT;
                this.c = new ArrayList();
                break;
            case 16:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(np0.o);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = new Rect();
                this.c = new Rect();
                break;
        }
    }
}
