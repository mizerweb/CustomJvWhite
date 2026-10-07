package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import androidx.camera.core.ProcessingException;
import androidx.media3.common.ParserException;
import com.google.android.gms.tasks.Task;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.vendor.rustore.push.RustoreMessagingService;
import one.video.calls.sdk.upload.FileUploadService;
import one.video.transcoder.exception.MissingRequiredDurationException;
import one.video.transcoder.exception.TranscoderException;
import one.video.transcoder.exception.WrongThreadException;
import one.video.upload.exceptions.TlsBufferOverflowException;
import one.video.upload.exceptions.TlsConnectionClosedException;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.RtpParameters;
import org.webrtc.RtpSender;
import org.webrtc.Size;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ewe implements s8g, kg7, m8e, d8h, rg4, otb {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public ewe(IBinder iBinder) throws RemoteException {
        this.a = 17;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new sxk(iBinder);
            this.b = null;
        }
    }

    public static final void e(ArrayList arrayList, String str, Object obj, Object obj2) {
        if (cqk.d(obj, obj2)) {
            return;
        }
        arrayList.add(str + ": " + obj + " -> " + obj2);
    }

    public static ylc m(Long l, uzh uzhVar) throws MissingRequiredDurationException {
        Range range = uzhVar.c;
        if (range.equals(uzh.g)) {
            return new ylc(l, l);
        }
        if (l != null) {
            return new ylc(l, Long.valueOf((long) ((((Number) range.getUpper()).floatValue() - ((Number) range.getLower()).floatValue()) * l.longValue())));
        }
        throw new MissingRequiredDurationException("Cannot trim track as duration is not available");
    }

    @Override // defpackage.d8h
    public int F() {
        return 1;
    }

    @Override // defpackage.s8g
    public void a(Object obj) {
        switch (this.a) {
            case 2:
                s8g s8gVar = (s8g) this.b;
                try {
                    gfd gfdVar = (gfd) ((rj5) ((pp9) this.c).c).b;
                    gfdVar.c.onConversationPrepared();
                    gfdVar.f.log("ConversationPrepare", "Conversation prepared");
                    s8gVar.a(obj);
                } catch (Throwable th) {
                    iwl.a(th);
                    s8gVar.onError(th);
                    return;
                }
                break;
            case 3:
                ((s8g) this.b).a(obj);
                break;
            default:
                cch cchVar = (cch) obj;
                cchVar.getClass();
                try {
                    ((dch) ((xde) this.c).b).d(cchVar);
                } catch (ProcessingException e) {
                    tvj.d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                }
                break;
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        au6 au6Var = FileUploadService.a;
        c7k c7kVar = nl9.c;
        y3e y3eVar = c7kVar != null ? (CidLogger) c7kVar.b : nl9.b;
        File file = (File) this.b;
        y3eVar.reportException("FileUploadService", "File uploading failed. File  " + file.getAbsolutePath(), th);
        if (((it6) this.c).c) {
            wxl.b(file, new ysj(1, au6Var, au6.class, "log", "log(Ljava/lang/String;)V", 0, 7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(boolean z, nq4 nq4Var) {
        l6k l6kVar;
        Object objJ;
        if (nq4Var instanceof l6k) {
            l6kVar = (l6k) nq4Var;
            int i = l6kVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6kVar.h = i - Integer.MIN_VALUE;
            } else {
                l6kVar = new l6k(this, nq4Var);
            }
        } else {
            l6kVar = new l6k(this, nq4Var);
        }
        Object obj = l6kVar.f;
        int i2 = l6kVar.h;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            xde xdeVar = (xde) this.b;
            l6kVar.d = this;
            l6kVar.e = z;
            l6kVar.h = 1;
            objJ = xdeVar.j(l6kVar);
            if (objJ != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                ((roe) obj).getClass();
                return sbiVar;
            }
            if (i2 == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = l6kVar.e;
        this = l6kVar.d;
        ch3.d0(obj);
        objJ = ((m4k) obj).a;
        String str = (String) objJ;
        if (!r5h.X0(str) && z) {
            Logger.DefaultImpls.info$default((Logger) ((ifh) this.c).getValue(), "Push token exists, need to remote delete token", null, 2, null);
            xde xdeVar2 = (xde) this.b;
            l6kVar.d = null;
            l6kVar.h = 2;
            if (xdeVar2.l(str, l6kVar) == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        Logger.DefaultImpls.info$default((Logger) ((ifh) this.c).getValue(), "Push token is null, no need to remote delete token", null, 2, null);
        xde xdeVar3 = (xde) this.b;
        l6kVar.d = null;
        l6kVar.h = 3;
        Object objK0 = yab.K0((lb5) xdeVar3.e, new q7k(xdeVar3, null, 0), l6kVar);
        if (objK0 != hu4Var) {
            objK0 = sbiVar;
        }
        if (objK0 == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        switch (this.a) {
            case 2:
                ((s8g) this.b).c(ko5Var);
                break;
            default:
                ((s8g) this.b).c(ko5Var);
                break;
        }
    }

    public void d() {
        Logger logger = (Logger) this.c;
        Logger.DefaultImpls.info$default(logger, "Trying to start the client app service", null, 2, null);
        int i = RustoreMessagingService.k;
        Intent intent = new Intent(ComponentActions.CLIENT_MESSAGING_SERVICE_ACTION);
        Context context = (Context) this.b;
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (IllegalStateException e) {
            Logger.DefaultImpls.warn$default(logger, "Unable to start service, possible background limitations: " + e.getMessage(), null, 2, null);
        } catch (Exception e2) {
            logger.warn("Unable to start service", e2);
        }
    }

    public void f(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        try {
            i(rtpSender, str, i, i2, d, z);
        } catch (Throwable th) {
            ((y3e) this.c).reportException("RtpSenderHelper", "Failed to set bitrate of ".concat(str), th);
        }
    }

    public boolean g(RtpSender rtpSender, boolean z, List list) {
        y3e y3eVar = (y3e) this.c;
        y3eVar.log("RtpSenderHelper", "video updateVideoSenderUnsafeWithSimulcast forceUpdate = " + z + " , simulcastLayerInfos = " + list);
        RtpParameters parameters = rtpSender.getParameters();
        int iP0 = wm9.P0(yw3.W0(list, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        for (Object obj : list) {
            linkedHashMap.put(((u7g) obj).a, obj);
        }
        ArrayList arrayList = new ArrayList();
        List<RtpParameters.Encoding> list2 = parameters.encodings;
        list2.getClass();
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            RtpParameters.Encoding encoding = (RtpParameters.Encoding) obj2;
            String str = encoding.rid;
            if (str == null) {
                str = ((u7g) list.get(i)).a;
            }
            u7g u7gVar = (u7g) linkedHashMap.get(str);
            if (u7gVar != null) {
                ArrayList arrayList2 = new ArrayList();
                Boolean boolValueOf = Boolean.valueOf(encoding.active);
                boolean z2 = u7gVar.c;
                e(arrayList2, "active", boolValueOf, Boolean.valueOf(z2));
                encoding.active = z2;
                Integer num = encoding.maxBitrateBps;
                int i3 = u7gVar.e;
                e(arrayList2, "maxBitrateBps", num, Integer.valueOf(i3));
                encoding.maxBitrateBps = Integer.valueOf(i3);
                Integer num2 = encoding.maxFramerate;
                int i4 = u7gVar.g;
                e(arrayList2, "maxFramerate", num2, Integer.valueOf(i4));
                encoding.maxFramerate = Integer.valueOf(i4);
                Integer num3 = encoding.numTemporalLayers;
                Integer num4 = u7gVar.h;
                e(arrayList2, "numTemporalLayers", num3, num4);
                encoding.numTemporalLayers = num4;
                Double d = encoding.scaleResolutionDownBy;
                double d2 = u7gVar.d;
                e(arrayList2, "scaleResolutionDownBy", d, Double.valueOf(d2));
                encoding.scaleResolutionDownBy = Double.valueOf(d2);
                if (!arrayList2.isEmpty()) {
                    x05.m(str, ww3.z1(arrayList2, null, null, null, null, 63), arrayList);
                }
            } else if (encoding.active) {
                encoding.active = false;
                x05.m(str, "active: true -> false", arrayList);
            }
            i = i2;
        }
        if (arrayList.isEmpty() && !z) {
            y3eVar.log("RtpSenderHelper", "encodings update not needed");
            return false;
        }
        boolean parameters2 = rtpSender.setParameters(parameters);
        if (parameters2) {
            y3eVar.log("RtpSenderHelper", "setParameters success for video. Updated layers: ".concat(ww3.z1(arrayList, ", ", null, null, null, 62)));
            return parameters2;
        }
        y3eVar.log("RtpSenderHelper", "setParameters failed for video. Updated layers: ".concat(ww3.z1(arrayList, ", ", null, null, null, 62)));
        return parameters2;
    }

    public void i(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        y3e y3eVar = (y3e) this.c;
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            y3eVar.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
            return;
        }
        boolean z2 = false;
        for (RtpParameters.Encoding encoding : parameters.encodings) {
            Integer num = encoding.maxBitrateBps;
            if (num == null || num.intValue() != i2) {
                encoding.maxBitrateBps = Integer.valueOf(i2);
                z2 = true;
            }
            Integer num2 = encoding.minBitrateBps;
            if (num2 == null || num2.intValue() != i) {
                encoding.minBitrateBps = Integer.valueOf(i);
                z2 = true;
            }
            if (d != null && encoding.bitratePriority != d.doubleValue()) {
                encoding.bitratePriority = d.doubleValue();
                z2 = true;
            }
            if (encoding.adaptiveAudioPacketTime != z) {
                encoding.adaptiveAudioPacketTime = z;
                z2 = true;
            }
        }
        if (!z2) {
            y3eVar.log("RtpSenderHelper", str + " encodings update not needed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
            return;
        }
        if (rtpSender.setParameters(parameters)) {
            y3eVar.log("RtpSenderHelper", str + " encodings update done. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
            return;
        }
        y3eVar.log("RtpSenderHelper", str + " encodings update failed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
    }

    @Override // defpackage.otb
    public void j(Task task) {
        t6m t6mVar = (t6m) this.b;
        qjh qjhVar = (qjh) this.c;
        synchronized (t6mVar.f) {
            t6mVar.e.remove(qjhVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x022c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0237  */
    /* JADX WARN: Code duplicated, block: B:132:0x0240  */
    /* JADX WARN: Code duplicated, block: B:133:0x024a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0252  */
    /* JADX WARN: Code duplicated, block: B:137:0x025a  */
    /* JADX WARN: Code duplicated, block: B:138:0x025e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0266  */
    /* JADX WARN: Code duplicated, block: B:141:0x026b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0273  */
    /* JADX WARN: Code duplicated, block: B:149:0x0286  */
    /* JADX WARN: Code duplicated, block: B:151:0x028b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0293  */
    /* JADX WARN: Code duplicated, block: B:155:0x029b  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02da  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:174:0x030b  */
    /* JADX WARN: Code duplicated, block: B:177:0x031c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0325  */
    /* JADX WARN: Code duplicated, block: B:181:0x0327  */
    /* JADX WARN: Code duplicated, block: B:184:0x0330  */
    /* JADX WARN: Code duplicated, block: B:185:0x0332  */
    /* JADX WARN: Code duplicated, block: B:188:0x033b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0343  */
    /* JADX WARN: Code duplicated, block: B:193:0x0347  */
    /* JADX WARN: Code duplicated, block: B:194:0x034c  */
    /* JADX WARN: Code duplicated, block: B:239:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x02f2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d8h
    public void k(byte[] bArr, int i, int i2, c8h c8hVar, qg4 qg4Var) {
        suj sujVarD;
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        int i3;
        boolean z;
        ewe eweVar = this;
        nmc nmcVar = (nmc) eweVar.b;
        nmcVar.L(i + i2, bArr);
        nmcVar.N(i);
        ArrayList arrayList = new ArrayList();
        try {
            yuj.d(nmcVar);
            while (!TextUtils.isEmpty(nmcVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i4 = 0;
                int i5 = -1;
                int i6 = 0;
                byte b2 = -1;
                while (true) {
                    int i7 = 1;
                    if (b2 == -1) {
                        i6 = nmcVar.b;
                        String strN = nmcVar.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b2 = 2;
                        } else {
                            b2 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        nmcVar.N(i6);
                        if (b2 == 0) {
                            kr6 kr6Var = new kr6();
                            kr6Var.a = Collections.unmodifiableList(new ArrayList(arrayList2));
                            kr6Var.b = new long[arrayList2.size() * 2];
                            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                suj sujVar = (suj) arrayList2.get(i8);
                                int i9 = i8 * 2;
                                long[] jArr = (long[]) kr6Var.b;
                                jArr[i9] = sujVar.b;
                                jArr[i9 + 1] = sujVar.c;
                            }
                            long[] jArr2 = (long[]) kr6Var.b;
                            long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
                            kr6Var.c = jArrCopyOf;
                            Arrays.sort(jArrCopyOf);
                            bgc.g(kr6Var, c8hVar, qg4Var);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(nmcVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    ore.p("A style block was found after the first cue.");
                                    return;
                                }
                                nmcVar.n(StandardCharsets.UTF_8);
                                quj qujVar = (quj) eweVar.c;
                                nmc nmcVar2 = qujVar.a;
                                StringBuilder sb = qujVar.b;
                                sb.setLength(0);
                                int i10 = nmcVar.b;
                                while (!TextUtils.isEmpty(nmcVar.n(StandardCharsets.UTF_8))) {
                                }
                                nmcVar2.L(nmcVar.b, nmcVar.a);
                                nmcVar2.N(i10);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    quj.c(nmcVar2);
                                    if (nmcVar2.a() >= 5 && "::cue".equals(nmcVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i11 = nmcVar2.b;
                                        String strB = quj.b(nmcVar2, sb);
                                        if (strB == null) {
                                            strTrim = null;
                                        } else if ("{".equals(strB)) {
                                            nmcVar2.N(i11);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i12 = nmcVar2.b;
                                                int i13 = nmcVar2.c;
                                                int i14 = i4;
                                                while (i12 < i13 && i14 == 0) {
                                                    int i15 = i12 + 1;
                                                    int i16 = ((char) nmcVar2.a[i12]) == ')' ? i7 : i4;
                                                    i12 = i15;
                                                    i14 = i16;
                                                }
                                                strTrim = nmcVar2.y((i12 - 1) - nmcVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = null;
                                            }
                                            if (!")".equals(quj.b(nmcVar2, sb))) {
                                                strTrim = null;
                                            }
                                        }
                                    } else {
                                        strTrim = null;
                                    }
                                    if (strTrim != null && "{".equals(quj.b(nmcVar2, sb))) {
                                        ruj rujVar = new ruj();
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i5) {
                                                Matcher matcher2 = quj.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i7);
                                                    strGroup2.getClass();
                                                    rujVar.d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(i4, iIndexOf);
                                            }
                                            String str = vqi.a;
                                            String[] strArrSplit = strTrim.split("\\.", i5);
                                            String str2 = strArrSplit[i4];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != i5) {
                                                rujVar.b = str2.substring(i4, iIndexOf2);
                                                rujVar.a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                rujVar.b = str2;
                                            }
                                            if (strArrSplit.length > i7) {
                                                int length = strArrSplit.length;
                                                lvb.R(length <= strArrSplit.length ? i7 : i4);
                                                rujVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                            }
                                        }
                                        int i17 = i4;
                                        String strB2 = null;
                                        while (i17 == 0) {
                                            int i18 = nmcVar2.b;
                                            strB2 = quj.b(nmcVar2, sb);
                                            int i19 = (strB2 == null || "}".equals(strB2)) ? i7 : i4;
                                            if (i19 == 0) {
                                                nmcVar2.N(i18);
                                                quj.c(nmcVar2);
                                                String strA = quj.a(nmcVar2, sb);
                                                if (!strA.isEmpty() && ":".equals(quj.b(nmcVar2, sb))) {
                                                    quj.c(nmcVar2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z2 = false;
                                                    while (true) {
                                                        if (z2) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i20 = nmcVar2.b;
                                                            String strB3 = quj.b(nmcVar2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                nmcVar2.N(i20);
                                                                z2 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string != null && !string.isEmpty()) {
                                                        int i21 = nmcVar2.b;
                                                        String strB4 = quj.b(nmcVar2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                rujVar.f = hx3.a(string, true);
                                                                rujVar.g = true;
                                                            } else if ("background-color".equals(strA)) {
                                                                rujVar.h = hx3.a(string, true);
                                                                rujVar.i = true;
                                                            } else if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    rujVar.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    rujVar.p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string)) {
                                                                    z = true;
                                                                } else {
                                                                    z = true;
                                                                }
                                                                rujVar.q = z;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    rujVar.k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                rujVar.e = n1g.b0(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                if ("bold".equals(string)) {
                                                                    rujVar.l = 1;
                                                                }
                                                            } else if ("font-style".equals(strA)) {
                                                                if ("italic".equals(string)) {
                                                                    rujVar.m = 1;
                                                                }
                                                            } else if ("font-size".equals(strA)) {
                                                                matcher = quj.d.matcher(n1g.b0(string));
                                                                if (matcher.matches()) {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case LangUtils.HASH_OFFSET /* 37 */:
                                                                            if (!strGroup.equals("%")) {
                                                                                b = 0;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    c.t();
                                                                                    return;
                                                                            }
                                                                            String strGroup3 = matcher.group(i3);
                                                                            strGroup3.getClass();
                                                                            rujVar.o = Float.parseFloat(strGroup3);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b = 1;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    c.t();
                                                                                    return;
                                                                            }
                                                                            String strGroup4 = matcher.group(i3);
                                                                            strGroup4.getClass();
                                                                            rujVar.o = Float.parseFloat(strGroup4);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b = 2;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    c.t();
                                                                                    return;
                                                                            }
                                                                            String strGroup5 = matcher.group(i3);
                                                                            strGroup5.getClass();
                                                                            rujVar.o = Float.parseFloat(strGroup5);
                                                                            break;
                                                                    }
                                                                    b = -1;
                                                                    switch (b) {
                                                                        case 0:
                                                                            i3 = 1;
                                                                            rujVar.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i3 = 1;
                                                                            rujVar.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i3 = 1;
                                                                            rujVar.n = 1;
                                                                            break;
                                                                        default:
                                                                            c.t();
                                                                            return;
                                                                    }
                                                                    String strGroup6 = matcher.group(i3);
                                                                    strGroup6.getClass();
                                                                    rujVar.o = Float.parseFloat(strGroup6);
                                                                } else {
                                                                    lvb.G0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        } else if ("}".equals(strB4)) {
                                                            nmcVar2.N(i21);
                                                            if ("color".equals(strA)) {
                                                                rujVar.f = hx3.a(string, true);
                                                                rujVar.g = true;
                                                            } else if ("background-color".equals(strA)) {
                                                                rujVar.h = hx3.a(string, true);
                                                                rujVar.i = true;
                                                            } else if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    rujVar.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    rujVar.p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                rujVar.q = z;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    rujVar.k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                rujVar.e = n1g.b0(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                if ("bold".equals(string)) {
                                                                    rujVar.l = 1;
                                                                }
                                                            } else if ("font-style".equals(strA)) {
                                                                if ("italic".equals(string)) {
                                                                    rujVar.m = 1;
                                                                }
                                                            } else if ("font-size".equals(strA)) {
                                                                matcher = quj.d.matcher(n1g.b0(string));
                                                                if (matcher.matches()) {
                                                                    lvb.G0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                } else {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case LangUtils.HASH_OFFSET /* 37 */:
                                                                            if (!strGroup.equals("%")) {
                                                                                b = 0;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    c.t();
                                                                                    return;
                                                                            }
                                                                            String strGroup7 = matcher.group(i3);
                                                                            strGroup7.getClass();
                                                                            rujVar.o = Float.parseFloat(strGroup7);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b = 1;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    c.t();
                                                                                    return;
                                                                            }
                                                                            String strGroup8 = matcher.group(i3);
                                                                            strGroup8.getClass();
                                                                            rujVar.o = Float.parseFloat(strGroup8);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b = 2;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    rujVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    c.t();
                                                                                    return;
                                                                            }
                                                                            String strGroup9 = matcher.group(i3);
                                                                            strGroup9.getClass();
                                                                            rujVar.o = Float.parseFloat(strGroup9);
                                                                            break;
                                                                    }
                                                                    b = -1;
                                                                    switch (b) {
                                                                        case 0:
                                                                            i3 = 1;
                                                                            rujVar.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i3 = 1;
                                                                            rujVar.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i3 = 1;
                                                                            rujVar.n = 1;
                                                                            break;
                                                                        default:
                                                                            c.t();
                                                                            return;
                                                                    }
                                                                    String strGroup10 = matcher.group(i3);
                                                                    strGroup10.getClass();
                                                                    rujVar.o = Float.parseFloat(strGroup10);
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                            i17 = i19;
                                            i4 = 0;
                                            i7 = 1;
                                        }
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(rujVar);
                                        }
                                        i4 = 0;
                                        i5 = -1;
                                        i7 = 1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = wuj.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = nmcVar.n(charset);
                                if (strN2 == null) {
                                    sujVarD = null;
                                } else {
                                    Pattern pattern2 = wuj.a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        sujVarD = wuj.d(null, matcher3, nmcVar, arrayList);
                                    } else {
                                        sujVarD = null;
                                        String strN3 = nmcVar.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                sujVarD = wuj.d(strN2.trim(), matcher4, nmcVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (sujVarD != null) {
                                    arrayList2.add(sujVarD);
                                }
                            }
                            eweVar = this;
                        }
                    }
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void l(RtpSender rtpSender, String str, boolean z, Integer num, Integer num2, Integer num3, RtpParameters.DegradationPreference degradationPreference) {
        y3e y3eVar = (y3e) this.c;
        if (rtpSender == null) {
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            y3eVar.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
            return;
        }
        for (RtpParameters.Encoding encoding : parameters.encodings) {
            if (!cqk.d(encoding.maxBitrateBps, num)) {
                encoding.maxBitrateBps = num;
                z = true;
            }
            if (!cqk.d(encoding.numTemporalLayers, num2)) {
                encoding.numTemporalLayers = num2;
                z = true;
            }
            if (!cqk.d(encoding.maxFramerate, num3)) {
                encoding.maxFramerate = num3;
                z = true;
            }
        }
        if (parameters.degradationPreference != degradationPreference) {
            parameters.degradationPreference = degradationPreference;
            z = true;
        }
        if (!z) {
            y3eVar.log("RtpSenderHelper", "No " + str + " change detected. Ignore update");
            return;
        }
        if (rtpSender.setParameters(parameters)) {
            y3eVar.log("RtpSenderHelper", "Sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
            return;
        }
        y3eVar.log("RtpSenderHelper", "Failed to set sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
    }

    public int n(RtpSender rtpSender) {
        List<RtpParameters.Encoding> list;
        if (rtpSender == null) {
            return 0;
        }
        try {
            RtpParameters parameters = rtpSender.getParameters();
            if (parameters == null || (list = parameters.encodings) == null) {
                return 0;
            }
            Iterator<T> it = list.iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                Integer num = ((RtpParameters.Encoding) it.next()).maxBitrateBps;
                iIntValue += num != null ? num.intValue() : 0;
            }
            return iIntValue;
        } catch (Throwable th) {
            ((y3e) this.c).reportException("RtpSenderHelper", "Unable to get sender max bitrate", th);
            return 0;
        }
    }

    public c79 o(RtpSender rtpSender, Size size) {
        rtpSender.getClass();
        c79 c79VarW = yab.w();
        List<RtpParameters.Encoding> list = rtpSender.getParameters().encodings;
        list.getClass();
        for (RtpParameters.Encoding encoding : list) {
            encoding.getClass();
            CropAndScaleParamsProvider cropAndScaleParamsProvider = (CropAndScaleParamsProvider) this.b;
            cropAndScaleParamsProvider.getClass();
            int i = size.width;
            int i2 = size.height;
            Double d = encoding.scaleResolutionDownBy;
            CropAndScaleParamsProvider.CropAndScaleParams cropAndScaleParamsCalculate = cropAndScaleParamsProvider.calculate(i, i2, d != null ? d.doubleValue() : 1.0d);
            cropAndScaleParamsCalculate.getClass();
            Size sizeA = r2m.a(cropAndScaleParamsCalculate);
            String str = encoding.rid;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean z = encoding.active;
            Double d2 = encoding.scaleResolutionDownBy;
            double dDoubleValue = d2 != null ? d2.doubleValue() : 1.0d;
            Integer num = encoding.maxBitrateBps;
            int iIntValue = 0;
            int iIntValue2 = num != null ? num.intValue() : 0;
            Integer num2 = encoding.minBitrateBps;
            int iIntValue3 = num2 != null ? num2.intValue() : 0;
            Integer num3 = encoding.maxFramerate;
            if (num3 != null) {
                iIntValue = num3.intValue();
            }
            c79VarW.add(new u7g(str2, 1, z, dDoubleValue, iIntValue2, iIntValue3, iIntValue, sizeA.width, sizeA.height, np0.m));
        }
        return yab.j(c79VarW);
    }

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        switch (this.a) {
            case 2:
                try {
                    gfd gfdVar = (gfd) ((rj5) ((pp9) this.c).c).b;
                    gfdVar.c.onConversationPrepared();
                    y3e y3eVar = gfdVar.f;
                    if (th != null) {
                        y3eVar.logException("ConversationPrepare", "Conversation prepare failed", th);
                    } else {
                        y3eVar.log("ConversationPrepare", "Conversation prepared");
                    }
                } catch (Throwable th2) {
                    iwl.a(th2);
                    th = new CompositeException(th, th2);
                }
                ((s8g) this.b).onError(th);
                break;
            default:
                s8g s8gVar = (s8g) this.b;
                try {
                    Object objMo41apply = ((p8g) this.c).c.mo41apply(th);
                    if (objMo41apply != null) {
                        s8gVar.a(objMo41apply);
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                        nullPointerException.initCause(th);
                        s8gVar.onError(nullPointerException);
                    }
                } catch (Throwable th3) {
                    iwl.a(th3);
                    s8gVar.onError(new CompositeException(th, th3));
                }
                break;
        }
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        int i = ((zbh) this.b).f;
        if (i == 2 && (th instanceof CancellationException)) {
            tvj.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
            return;
        }
        tvj.i("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + yvl.b(i), th);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public void p(JSONObject jSONObject) {
        Object i62Var;
        z62 z62Var = (z62) this.c;
        wze wzeVar = (wze) this.b;
        cnc cncVar = (cnc) wzeVar.c;
        Object j62Var = null;
        try {
            String string = jSONObject.getString("eventType");
            string.getClass();
            int i = 0;
            if (string == null) {
                ore.n("Name is null");
            } else if (string.equals("ATTENDEE")) {
                i = 1;
            } else if (string.equals("HAND_UP")) {
                i = 2;
            } else if (string.equals("FEEDBACK")) {
                i = 3;
            } else {
                ore.p("No enum constant okcalls.g2.".concat(string));
            }
            int iD = qt4.D(i);
            List listB = r66.a;
            if (iD != 0) {
                if (iD == 1) {
                    int i2 = jSONObject.getInt("totalCount");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("addedParticipantIds");
                    List listB2 = jSONArrayOptJSONArray != null ? cncVar.b(jSONArrayOptJSONArray) : listB;
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("removedParticipantIds");
                    if (jSONArrayOptJSONArray2 != null) {
                        listB = cncVar.b(jSONArrayOptJSONArray2);
                    }
                    i62Var = new k62(i2, listB2, listB);
                } else {
                    if (iD != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (jSONObject.has("feedback")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("feedback");
                        jSONObject2.getClass();
                        j62Var = new j62(l6m.s(jSONObject2));
                    }
                }
                if (j62Var != null) {
                    if (j62Var instanceof i62) {
                        z62Var.onAttendee((i62) j62Var);
                    } else if (j62Var instanceof j62) {
                        z62Var.onFeedback((j62) j62Var);
                    } else if (j62Var instanceof k62) {
                        z62Var.onHandUp((k62) j62Var);
                    }
                }
            }
            int iOptInt = jSONObject.optInt("totalCount");
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("addedParticipantIds");
            List listB3 = jSONArrayOptJSONArray3 != null ? cncVar.b(jSONArrayOptJSONArray3) : listB;
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("removedParticipantIds");
            if (jSONArrayOptJSONArray4 != null) {
                listB = cncVar.b(jSONArrayOptJSONArray4);
            }
            i62Var = new i62(iOptInt, listB3, listB);
            j62Var = i62Var;
        } catch (JSONException e) {
            ((CidLogger) wzeVar.b).logException("WaitingRoomNotificationParser", "Can't parse chat room notification", e);
        }
        if (j62Var != null) {
            if (j62Var instanceof i62) {
                z62Var.onAttendee((i62) j62Var);
            } else if (j62Var instanceof j62) {
                z62Var.onFeedback((j62) j62Var);
            } else if (j62Var instanceof k62) {
                z62Var.onHandUp((k62) j62Var);
            }
        }
    }

    public void q(JSONObject jSONObject) {
        l62 l62Var;
        wze wzeVar = (wze) this.b;
        wzeVar.getClass();
        try {
            l62Var = new l62(!jSONObject.optBoolean("disprove", false));
        } catch (JSONException e) {
            ((CidLogger) wzeVar.b).logException("WaitingRoomNotificationParser", "Can't parse promotion approved", e);
            l62Var = null;
        }
        if (l62Var != null) {
            ((z62) this.c).onPromotionUpdated(l62Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [r66] */
    public o5g r(JSONObject jSONObject) {
        try {
            ?? arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rooms");
            if (jSONArrayOptJSONArray == null) {
                arrayList = r66.a;
            } else {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    n5g n5gVarN = jSONObjectOptJSONObject != null ? ((g85) this.c).N(jSONObjectOptJSONObject) : null;
                    if (n5gVarN != null) {
                        arrayList.add(n5gVarN);
                    }
                }
            }
            return new o5g(iw8.k(jSONObject), arrayList);
        } catch (JSONException e) {
            ((CidLogger) this.b).logException("SessionRoomsParser", "Can't parse rooms state", e);
            return null;
        }
    }

    @Override // defpackage.m8e
    public int read(ByteBuffer byteBuffer) {
        xde xdeVar = (xde) this.c;
        SSLEngine sSLEngine = (SSLEngine) xdeVar.b;
        agi agiVar = (agi) this.b;
        if (((SocketChannel) agiVar.e.a).read(xdeVar.w()) == -1) {
            return -1;
        }
        xdeVar.w().flip();
        int iBytesProduced = 0;
        do {
            try {
                xdeVar.q().clear();
                SSLEngineResult sSLEngineResultUnwrap = sSLEngine.unwrap(xdeVar.w(), xdeVar.q());
                xdeVar.q().flip();
                SSLEngineResult.Status status = sSLEngineResultUnwrap.getStatus();
                int i = status == null ? -1 : ngh.$EnumSwitchMapping$0[status.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        throw new TlsConnectionClosedException("SSLEngine.unwrap error. Connection closed. " + sSLEngineResultUnwrap, null, 2, null);
                    }
                    if (i == 3) {
                        agiVar.y();
                        break;
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new TlsBufferOverflowException("SSLEngine.unwrap error. " + sSLEngineResultUnwrap, null, 2, null);
                }
                byteBuffer.put(xdeVar.q());
                iBytesProduced += sSLEngineResultUnwrap.bytesProduced();
            } catch (Throwable th) {
                xdeVar.w().compact();
                throw th;
            }
        } while (xdeVar.w().hasRemaining());
        xdeVar.w().compact();
        return iBytesProduced;
    }

    public c5f s(Uri uri, String str, uzh uzhVar, rj5 rj5Var) {
        File fileB;
        ze9 ze9Var = (ze9) this.c;
        ze9Var.j("Transcoder", new bpg(18, uzhVar));
        try {
            fileB = u1m.b(uri);
        } catch (IllegalArgumentException unused) {
            fileB = null;
        } catch (Throwable th) {
            ze9Var.r("Transcoder", new yvg(20), new bpg(19, th));
            fileB = null;
        }
        if (fileB != null && !fileB.exists()) {
            c.o(qv1.k("Input file doesn't exist: ", fileB.getAbsolutePath()));
            return null;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new WrongThreadException("Transcoder caller thread must be associated with looper");
        }
        if (looperMyLooper.equals(Looper.getMainLooper())) {
            throw new WrongThreadException("Transcoder must be called on a worker thread associated with a Looper");
        }
        v56 v56Var = new v56(looperMyLooper);
        File file = new File(str);
        Context context = (Context) this.b;
        wfe wfeVar = new wfe();
        try {
            by9 by9Var = new by9();
            fy9 fy9Var = new fy9();
            List list = Collections.EMPTY_LIST;
            ghe gheVar = ghe.e;
            hy9 hy9Var = new hy9();
            ly9 ly9Var = ly9.d;
            lvb.b0(fy9Var.b == null || fy9Var.a != null);
            ry9 ry9Var = new ry9("", new dy9(by9Var), new jy9(uri, null, fy9Var.a != null ? new gy9(fy9Var) : null, null, list, null, gheVar, -9223372036854775807L), new iy9(hy9Var), b0a.K, ly9Var);
            a0a a0aVarU = new uvc(ze9Var, 21, context).u(ry9Var);
            ylc ylcVarM = m(a0aVarU.a, uzhVar);
            Long l = (Long) ylcVarM.a;
            Long l2 = (Long) ylcVarM.b;
            ljf ljfVar = new ljf(ry9Var, a0aVarU, context, ze9Var, 17);
            wfeVar.a = ljfVar.t(uzhVar, new c5f(new kvd(rj5Var), 8, v56Var), l2, new h0i(this, l, v56Var, rj5Var));
            ((g2i) wfeVar.a).h(ljfVar.r(l, uzhVar), file.getAbsolutePath());
        } catch (Throwable th2) {
            ze9Var.r("Transcoder", new yvg(19), new bpg(19, th2));
            g2i g2iVar = (g2i) wfeVar.a;
            if (g2iVar != null) {
                g2iVar.c();
            }
            rj5Var.O(new TranscoderException("Failed to start the transcoder", th2));
        }
        return new c5f(v56Var, 7, new vuf(15, wfeVar));
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ewe(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public ewe(xde xdeVar, Logger logger) {
        this.a = 13;
        this.b = xdeVar;
        this.c = new ifh(new kr0(logger, 9, this));
    }

    public ewe(wze wzeVar, ubj ubjVar) {
        this.a = 11;
        wzeVar.getClass();
        ubjVar.getClass();
        this.b = wzeVar;
        this.c = ubjVar;
    }

    public ewe(Context context, Logger logger) {
        this.a = 15;
        this.b = context;
        this.c = logger.createLogger("ClientServiceStarter");
    }

    public /* synthetic */ ewe(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public ewe(CropAndScaleParamsProvider cropAndScaleParamsProvider, y3e y3eVar) {
        this.a = 0;
        cropAndScaleParamsProvider.getClass();
        y3eVar.getClass();
        this.b = cropAndScaleParamsProvider;
        this.c = y3eVar;
    }

    public ewe(CidLogger cidLogger, iw8 iw8Var, g85 g85Var) {
        this.a = 1;
        this.b = cidLogger;
        this.c = g85Var;
    }

    public ewe(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = new nmc();
                this.c = new quj();
                break;
        }
    }
}
