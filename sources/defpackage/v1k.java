package defpackage;

import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import org.webrtc.EncodedImage;
import org.webrtc.JniCommon;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v1k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1k(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    @Override // java.lang.Runnable
    public final void run() {
        y55 y55Var;
        y55 y55Var2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo[] mediaCodecInfoArr;
        y55 y55Var3;
        long j = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                super/*android.view.View*/.invalidateDrawable((Drawable) this.c);
                break;
            case 1:
                ((z1k) ((ex4) this.b).c).g((l68) this.c);
                break;
            case 2:
                ((z1k) ((ex4) this.b).c).f((Throwable) this.c);
                break;
            case 3:
                bak bakVar = (bak) this.b;
                dik dikVar = (dik) this.c;
                bakVar.l.incrementAndGet();
                bakVar.u.a();
                int i2 = dikVar.b;
                long j2 = i2;
                long j3 = bakVar.h;
                if (j2 != 1 + j3 && j3 != -1 && i2 != 0) {
                    y3e y3eVar = bakVar.a;
                    StringBuilder sb = new StringBuilder("dropping ");
                    sb.append(dikVar.b);
                    sb.append(" due to seq (");
                    y3eVar.log("DecoderWrapper", c0a.m(bakVar.h, ")", sb));
                    bakVar.n.incrementAndGet();
                    break;
                } else {
                    if ((dikVar.a & 1) != 0) {
                        bv4 bv4Var = bakVar.A;
                        ((gsh) ((esh) bv4Var.a)).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Long l = (Long) bv4Var.b;
                        if (l != null) {
                            long jLongValue = jElapsedRealtime - l.longValue();
                            if (jLongValue > 1000) {
                                td7 td7Var = (td7) bv4Var.c;
                                bv4Var.c = new td7(td7Var.a + 1, td7Var.b + jLongValue);
                            }
                        }
                        bv4Var.b = Long.valueOf(jElapsedRealtime);
                        if (bakVar.f != null) {
                            bakVar.a.log("DecoderWrapper", "received start @ seq " + dikVar.b + " queue: " + bakVar.f.c);
                            bakVar.n.incrementAndGet();
                        }
                        bakVar.m.incrementAndGet();
                        csb csbVar = bakVar.f;
                        if (csbVar != null) {
                            try {
                                ((ByteArrayOutputStream) csbVar.d).close();
                                break;
                            } catch (IOException unused) {
                            }
                        }
                        bakVar.f = null;
                        bakVar.f = new csb(bakVar, dikVar);
                    } else {
                        j = 0;
                        csb csbVar2 = bakVar.f;
                        if (csbVar2 != null) {
                            csbVar2.b |= (dikVar.a & 4) != 0;
                            while (true) {
                                int iMin = Math.min(dikVar.e.remaining(), ((bak) csbVar2.e).c.length);
                                if (iMin == 0) {
                                    csbVar2.c++;
                                } else {
                                    dikVar.e.get(((bak) csbVar2.e).c, 0, iMin);
                                    ((ByteArrayOutputStream) csbVar2.d).write(((bak) csbVar2.e).c, 0, iMin);
                                }
                            }
                        }
                    }
                    if ((dikVar.a & 2) != 0) {
                        bakVar.o.incrementAndGet();
                        bakVar.v.a();
                        csb csbVar3 = bakVar.f;
                        if (csbVar3 == null) {
                            bakVar.a.log("DecoderWrapper", "unexpected: trying to deliver 0 packets as frame");
                        } else {
                            int i3 = csbVar3.a;
                            int i4 = 3;
                            if (i3 != bakVar.D || (y55Var3 = bakVar.g) == null || y55Var3.h) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                long j4 = bakVar.i;
                                if (j4 == j || jElapsedRealtime2 - j4 >= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                                    bakVar.i = jElapsedRealtime2;
                                    String str = r3k.a[qt4.D(i3)] != 1 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                                    int length = codecInfos.length;
                                    int i5 = 0;
                                    MediaCodecInfo mediaCodecInfo = null;
                                    MediaCodecInfo mediaCodecInfo2 = null;
                                    while (i5 < length) {
                                        MediaCodecInfo mediaCodecInfo3 = codecInfos[i5];
                                        if (!mediaCodecInfo3.isEncoder()) {
                                            String[] supportedTypes = mediaCodecInfo3.getSupportedTypes();
                                            int length2 = supportedTypes.length;
                                            while (i < length2) {
                                                if (supportedTypes[i].equalsIgnoreCase(str)) {
                                                    String name = mediaCodecInfo3.getName();
                                                    String[] strArr = bak.E;
                                                    mediaCodecInfoArr = codecInfos;
                                                    int i6 = 0;
                                                    while (true) {
                                                        if (i6 < i4) {
                                                            if (!name.startsWith(strArr[i6])) {
                                                                i6++;
                                                                i4 = 3;
                                                            }
                                                        } else if (mediaCodecInfo == null) {
                                                            mediaCodecInfo = mediaCodecInfo3;
                                                        }
                                                        if (mediaCodecInfo2 == null) {
                                                            mediaCodecInfo2 = mediaCodecInfo3;
                                                        }
                                                    }
                                                } else {
                                                    mediaCodecInfoArr = codecInfos;
                                                }
                                                i++;
                                                codecInfos = mediaCodecInfoArr;
                                                i4 = 3;
                                            }
                                        }
                                        i5++;
                                        codecInfos = codecInfos;
                                        i4 = 3;
                                        i = 0;
                                    }
                                    if (mediaCodecInfo == null) {
                                        mediaCodecInfo = mediaCodecInfo2;
                                    }
                                    if (mediaCodecInfo != null) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                        if (capabilitiesForType != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                                            bakVar.a.log("DecoderWrapper", "selecting " + mediaCodecInfo.getName());
                                            Integer num = (Integer) videoCapabilities.getSupportedWidths().getUpper();
                                            int i7 = (Integer) videoCapabilities.getSupportedHeightsFor(num.intValue()).getUpper();
                                            if (i7 == null) {
                                                i7 = 240;
                                            }
                                            bakVar.j = num;
                                            bakVar.k = i7;
                                            bakVar.a.log("DecoderWrapper", "supports up to " + num + "x" + i7);
                                        }
                                        y55 y55Var4 = bakVar.g;
                                        if (y55Var4 != null) {
                                            y55Var4.a();
                                            bakVar.g = null;
                                            bakVar.D = 0;
                                        }
                                        bakVar.D = i3;
                                        bakVar.g = new y55(bakVar, i3, bakVar.b, bakVar.a);
                                    }
                                }
                            }
                            if (bakVar.g != null) {
                                if (bakVar.z.get() > 4000000) {
                                    y55 y55Var5 = bakVar.g;
                                    y55Var5.i = true;
                                    y55Var5.l.set(y55Var5.k.get());
                                    bakVar.r.incrementAndGet();
                                    bakVar.B = true;
                                } else {
                                    csb csbVar4 = bakVar.f;
                                    boolean z = csbVar4.b;
                                    if (!bakVar.B || z) {
                                        bakVar.B = false;
                                        byte[] byteArray = ((ByteArrayOutputStream) csbVar4.d).toByteArray();
                                        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(byteArray.length);
                                        byteBufferNativeAllocateByteBuffer.limit(byteArray.length);
                                        byteBufferNativeAllocateByteBuffer.put(byteArray);
                                        byteBufferNativeAllocateByteBuffer.rewind();
                                        bakVar.y.incrementAndGet();
                                        bakVar.z.addAndGet(byteBufferNativeAllocateByteBuffer.capacity());
                                        EncodedImage encodedImageCreateEncodedImage = EncodedImage.builder().setBuffer(byteBufferNativeAllocateByteBuffer, new ce5()).setCaptureTimeNs(SystemClock.elapsedRealtimeNanos()).setEncodedWidth(bakVar.j.intValue()).setEncodedHeight(bakVar.k.intValue()).setFrameType(z ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta).createEncodedImage();
                                        y55 y55Var6 = bakVar.g;
                                        if (y55Var6 != null) {
                                            EncodedImage.FrameType frameType = encodedImageCreateEncodedImage.frameType;
                                            EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
                                            boolean z2 = frameType == frameType2;
                                            if (!y55Var6.i || z2) {
                                                int i8 = y55Var6.j.get();
                                                if (i8 > 30 || (i8 > 25 && !z2)) {
                                                    y55Var6.o.r.incrementAndGet();
                                                    bak bakVar2 = y55Var6.o;
                                                    ByteBuffer byteBuffer = encodedImageCreateEncodedImage.buffer;
                                                    bakVar2.y.decrementAndGet();
                                                    byteBuffer.rewind();
                                                    bakVar2.z.addAndGet(-byteBuffer.capacity());
                                                    JniCommon.nativeFreeByteBuffer(byteBuffer);
                                                    y55Var6.i = true;
                                                    y55Var6.l.set(y55Var6.k.get());
                                                } else {
                                                    y55Var6.i = false;
                                                    if (z2) {
                                                        y55Var6.k.incrementAndGet();
                                                    }
                                                    int i9 = y55Var6.k.get();
                                                    y55Var6.j.incrementAndGet();
                                                    y55Var6.e.post(new uc2(y55Var6, encodedImageCreateEncodedImage, i9, 3));
                                                }
                                            } else {
                                                y55Var6.o.r.incrementAndGet();
                                                bak bakVar3 = y55Var6.o;
                                                ByteBuffer byteBuffer2 = encodedImageCreateEncodedImage.buffer;
                                                bakVar3.y.decrementAndGet();
                                                byteBuffer2.rewind();
                                                bakVar3.z.addAndGet(-byteBuffer2.capacity());
                                                JniCommon.nativeFreeByteBuffer(byteBuffer2);
                                            }
                                            if (encodedImageCreateEncodedImage.frameType == frameType2) {
                                                bakVar.p.incrementAndGet();
                                            }
                                            if (encodedImageCreateEncodedImage.frameType == EncodedImage.FrameType.VideoFrameDelta) {
                                                bakVar.q.incrementAndGet();
                                            }
                                        } else {
                                            bakVar.y.decrementAndGet();
                                            byteBufferNativeAllocateByteBuffer.rewind();
                                            bakVar.z.addAndGet(-byteBufferNativeAllocateByteBuffer.capacity());
                                            JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
                                            bakVar.r.incrementAndGet();
                                        }
                                    } else {
                                        bakVar.r.incrementAndGet();
                                    }
                                }
                            }
                        }
                        csb csbVar5 = bakVar.f;
                        if (csbVar5 != null) {
                            try {
                                ((ByteArrayOutputStream) csbVar5.d).close();
                                break;
                            } catch (IOException unused2) {
                            }
                        }
                        y55Var = null;
                        bakVar.f = null;
                    } else {
                        y55Var = null;
                    }
                    if ((dikVar.a & 8) != 0 && (y55Var2 = bakVar.g) != null) {
                        y55Var2.a();
                        bakVar.g = y55Var;
                        bakVar.D = 0;
                        break;
                    }
                }
                break;
            case 4:
                ((zak) this.b).i.accept((pak) this.c);
                break;
            case 5:
                eck eckVar = (eck) this.b;
                w4k w4kVar = (w4k) this.c;
                hak hakVar = eckVar.f;
                Object[] objArr = {new n8k(), new k8k(2)};
                ArrayList arrayList = new ArrayList(2);
                while (i < 2) {
                    Object obj = objArr[i];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    i++;
                }
                hakVar.e(Collections.unmodifiableList(arrayList), w4kVar);
                break;
            case 6:
                xdk xdkVar = (xdk) this.b;
                kr6 kr6Var = (kr6) this.c;
                while (i == 0) {
                    try {
                        eek eekVarJ = kr6Var.j();
                        if (eekVarJ.a() == 10307) {
                            tdk tdkVar = (tdk) eekVarJ;
                            xdkVar.d(tdkVar.a, tdkVar.b);
                            i = 1;
                        }
                    } catch (IOException unused3) {
                        xdkVar.d(0L, "");
                        return;
                    }
                }
                break;
            case 7:
                x70 x70Var = (x70) this.b;
                pak pakVar = (pak) this.c;
                boolean zC = pakVar.c();
                uak uakVar = pakVar.e;
                if (!zC) {
                    rdk rdkVar = (rdk) x70Var.j;
                    if (rdkVar != null) {
                        mek mekVar = new mek();
                        mekVar.a = pakVar;
                        mekVar.b = uakVar;
                        rdkVar.accept(mekVar);
                    } else {
                        x70Var.e(259L);
                    }
                } else {
                    try {
                        Consumer consumer = (Consumer) ((HashMap) x70Var.c).get(Long.valueOf(ti8.g(uakVar)));
                        if (consumer != null) {
                            mek mekVar2 = new mek();
                            mekVar2.a = pakVar;
                            mekVar2.b = uakVar;
                            consumer.accept(mekVar2);
                        } else {
                            uakVar.g(259L);
                        }
                    } catch (IOException unused4) {
                        return;
                    }
                }
                break;
            case 8:
                vek vekVar = (vek) this.b;
                yve yveVar = (yve) this.c;
                try {
                    tve tveVar = (tve) vekVar.d.c;
                    if (tveVar != null) {
                        tveVar.d(vekVar.c, yveVar);
                    }
                } catch (Throwable th) {
                    vekVar.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsuccess", th);
                    return;
                }
                break;
            case 9:
                vek vekVar2 = (vek) this.b;
                Throwable th2 = (Throwable) this.c;
                try {
                    jl5 jl5Var = (jl5) vekVar2.d.d;
                    if (jl5Var != null) {
                        jl5Var.a(vekVar2.c, th2);
                    }
                } catch (Throwable th3) {
                    vekVar2.a.reportException("ProtocolInfo", "rtc.command.handle.command.onerror", th3);
                    return;
                }
                break;
            default:
                dc9 dc9Var = (dc9) this.b;
                Throwable th4 = (Throwable) this.c;
                for (sve sveVar : (CopyOnWriteArrayList) dc9Var.c) {
                    try {
                        sveVar.b.log(sveVar.a, "<- [?]: " + th4);
                    } catch (Throwable th5) {
                        ((y3e) dc9Var.b).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th5);
                    }
                }
                break;
        }
    }
}
