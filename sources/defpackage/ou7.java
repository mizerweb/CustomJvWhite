package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.d;
import androidx.media3.muxer.MuxerException;
import androidx.work.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.Size;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.tracer.upload.SampleUploadWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class ou7 implements s70, sf7, nsi, nu3, k74, mcg, f2i, c4b, CropAndScaleParamsProvider, lj6, p9b {
    public static final ou7 b = new ou7(1);
    public static final ou7 c = new ou7(2);
    public static final ou7 d = new ou7(3);
    public static final ou7 e = new ou7(4);
    public static final ou7 f = new ou7(5);
    public static final ou7 g = new ou7(7);
    public static final ou7 h = new ou7(8);
    public static final ou7 i = new ou7(9);
    public static final ou7 j = new ou7(10);
    public static final t5j k = new t5j(new float[8]);
    public static final /* synthetic */ ou7 l = new ou7(14);
    public final /* synthetic */ int a;

    public /* synthetic */ ou7(int i2) {
        this.a = i2;
    }

    public static final String b(wj wjVar) {
        String str;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i2 = wjVar.b;
        if (i2 < 0) {
            ore.p(zo5.h(i2, "Illegal Capacity: "));
            return null;
        }
        int[] iArr2 = new int[Math.max(i2, 8)];
        int i3 = 0;
        while (wjVar.b != 0) {
            int iB = wjVar.b();
            int length = iArr2.length;
            if (i3 < length) {
                iArr = iArr2;
            } else {
                iArr = new int[length * 2];
                System.arraycopy(iArr2, 0, iArr, 0, length);
                iArr2 = iArr;
            }
            iArr2[i3] = iB;
            i3++;
            iArr2 = iArr;
        }
        while (i3 != 0) {
            if (i3 == 0) {
                qr7.d();
                return null;
            }
            i3--;
            int i4 = iArr2[i3];
            switch (i4) {
                case 0:
                case 2:
                    str = "";
                    break;
                case 1:
                    str = "=";
                    break;
                case 3:
                case 5:
                    str = "{";
                    break;
                case 4:
                    str = "{:";
                    break;
                case 6:
                case 7:
                    str = "[";
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i4);
                    throw new IllegalArgumentException(sb2.toString());
            }
            sb.append(str);
            wjVar.d(i4);
        }
        return sb.toString();
    }

    public static x8b e(FileInputStream fileInputStream) throws CorruptionException {
        try {
            aed aedVarL = aed.l(fileInputStream);
            x8b x8bVarC = lkl.c(new wdd[0]);
            for (Map.Entry entry : aedVarL.j().entrySet()) {
                String str = (String) entry.getKey();
                eed eedVar = (eed) entry.getValue();
                int iX = eedVar.x();
                switch (iX == 0 ? -1 : fed.$EnumSwitchMapping$0[qt4.D(iX)]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        ore.o();
                        return null;
                    case 1:
                        x8bVarC.a(new vdd(str), Boolean.valueOf(eedVar.p()));
                        break;
                    case 2:
                        x8bVarC.a(new vdd(str), Float.valueOf(eedVar.s()));
                        break;
                    case 3:
                        x8bVarC.a(new vdd(str), Double.valueOf(eedVar.r()));
                        break;
                    case 4:
                        x8bVarC.a(new vdd(str), Integer.valueOf(eedVar.t()));
                        break;
                    case 5:
                        x8bVarC.a(new vdd(str), Long.valueOf(eedVar.u()));
                        break;
                    case 6:
                        x8bVarC.a(new vdd(str), eedVar.v());
                        break;
                    case 7:
                        x8bVarC.a(new vdd(str), ww3.X1(eedVar.w().k()));
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new x8b(new LinkedHashMap(Collections.unmodifiableMap(x8bVarC.a)), true);
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Unable to parse preferences proto.", e2);
        }
    }

    public static zp6 f(String str) {
        Object next;
        ma6 ma6Var = xp6.c;
        ma6Var.getClass();
        y1 y1Var = new y1(0, ma6Var);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (!z5h.G0(((xp6) next).name(), str, true));
        xp6 xp6Var = (xp6) next;
        if (xp6Var != null) {
            return xp6Var;
        }
        yp6 yp6Var = yp6.c;
        return mxl.c(str);
    }

    public static void g(Context context, ste steVar, File file, String str, Long l2, Map map, int i2) {
        String str2 = (i2 & 32) != 0 ? null : str;
        Map map2 = (i2 & np0.n) != 0 ? s66.a : map;
        long length = file.length();
        String name = file.getName();
        Method method = qwh.d;
        qwh qwhVarA = gyl.a();
        long jZ = n1g.z(e9i.d0(context.getPackageManager(), context.getPackageName()));
        w4 w4Var = new w4(6, false);
        LinkedHashMap linkedHashMap = (LinkedHashMap) w4Var.a;
        w4Var.r("tracer_feature_name", steVar.b);
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put("tracer_feature_uze_gzip", bool);
        w4Var.r("tracer_sample_file_path", file.getPath());
        linkedHashMap.put("tracer_sample_file_size", Long.valueOf(length));
        w4Var.r("tracer_sample_file_name", name);
        w4Var.r("tracer_sample_uuid", null);
        w4Var.r("tracer_feature_tag", str2);
        linkedHashMap.put("tracer_has_attr1", bool);
        linkedHashMap.put("tracer_attr1", l2);
        linkedHashMap.put("tracer_custom_properties_keys", (String[]) map2.keySet().toArray(new String[0]));
        w4Var.p(map2);
        if (qwhVarA != null) {
            w4Var.r("tracer_trace_id", qwhVarA.a);
            w4Var.r("tracer_span_id", qwhVarA.b);
            w4Var.r("tracer_trace_flags", qwhVarA.c);
        }
        linkedHashMap.put("tracer_version_code", Long.valueOf(jZ));
        d25 d25VarE = w4Var.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        swh swhVar = swh.a;
        Object obj = swh.c().get(cqk.b);
        if ((obj instanceof lt4 ? (lt4) obj : null) == null) {
            new v2a(18).j();
        }
        oyj.d(context).b((cdc) ((a) ((a) new a(SampleUploadWorker.class).setConstraints(new kg4(new adb(null), 3, false, true, true, false, -1L, -1L, ww3.X1(linkedHashSet)))).setInputData(d25VarE)).build());
    }

    public static void i(Object obj, wki wkiVar) {
        d dVarA;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((x8b) obj).a);
        ydd yddVarK = aed.k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            vdd vddVar = (vdd) entry.getKey();
            Object value = entry.getValue();
            String str = vddVar.a;
            if (value instanceof Boolean) {
                ded dedVarY = eed.y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                dedVarY.c();
                eed.m((eed) dedVarY.b, zBooleanValue);
                dVarA = dedVarY.a();
            } else if (value instanceof Float) {
                ded dedVarY2 = eed.y();
                float fFloatValue = ((Number) value).floatValue();
                dedVarY2.c();
                eed.n((eed) dedVarY2.b, fFloatValue);
                dVarA = dedVarY2.a();
            } else if (value instanceof Double) {
                ded dedVarY3 = eed.y();
                double dDoubleValue = ((Number) value).doubleValue();
                dedVarY3.c();
                eed.l((eed) dedVarY3.b, dDoubleValue);
                dVarA = dedVarY3.a();
            } else if (value instanceof Integer) {
                ded dedVarY4 = eed.y();
                int iIntValue = ((Number) value).intValue();
                dedVarY4.c();
                eed.o((eed) dedVarY4.b, iIntValue);
                dVarA = dedVarY4.a();
            } else if (value instanceof Long) {
                ded dedVarY5 = eed.y();
                long jLongValue = ((Number) value).longValue();
                dedVarY5.c();
                eed.i((eed) dedVarY5.b, jLongValue);
                dVarA = dedVarY5.a();
            } else if (value instanceof String) {
                ded dedVarY6 = eed.y();
                dedVarY6.c();
                eed.j((eed) dedVarY6.b, (String) value);
                dVarA = dedVarY6.a();
            } else {
                if (!(value instanceof Set)) {
                    ore.k(cqk.M(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                    return;
                }
                ded dedVarY7 = eed.y();
                bed bedVarL = ced.l();
                bedVarL.c();
                ced.i((ced) bedVarL.b, (Set) value);
                dedVarY7.c();
                eed.k((eed) dedVarY7.b, bedVarL);
                dVarA = dedVarY7.a();
            }
            yddVarK.getClass();
            yddVarK.c();
            aed.i((aed) yddVarK.b).put(str, (eed) dVarA);
        }
        aed aedVar = (aed) yddVarK.a();
        int iA = aedVar.a();
        Logger logger = vu3.f;
        if (iA > 4096) {
            iA = 4096;
        }
        vu3 vu3Var = new vu3(wkiVar, iA);
        aedVar.c(vu3Var);
        if (vu3Var.d > 0) {
            vu3Var.p();
        }
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return ch3.m((Executor) ((g85) h74Var).i(new x0e(sai.class, Executor.class)));
    }

    @Override // defpackage.lj6
    public void D() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lj6
    public kyh G(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.p9b
    public c98 a(int i2) {
        if (i2 == 2) {
            return fd7.g;
        }
        if (i2 == 1) {
            return fd7.h;
        }
        a98 a98Var = c98.b;
        return ghe.e;
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 3:
                return new js6((File) obj);
            case 8:
                return new xgc((ConversationParams) obj);
            default:
                return (byte[]) obj;
        }
    }

    @Override // defpackage.p9b
    public q9b c(String str) throws MuxerException {
        try {
            return new fd7(new MediaMuxer(str, 0));
        } catch (IOException e2) {
            throw new MuxerException("Error creating muxer", e2);
        }
    }

    @Override // org.webrtc.CropAndScaleParamsProvider
    public CropAndScaleParamsProvider.CropAndScaleParams calculate(int i2, int i3, int i4, int i5) {
        Size sizeCalculateAlignment = calculateAlignment(new Size(i4, i5));
        return new CropAndScaleParamsProvider.CropAndScaleParams(0, 0, i2, i3, sizeCalculateAlignment.width, sizeCalculateAlignment.height);
    }

    @Override // org.webrtc.CropAndScaleParamsProvider
    public Size calculateAlignment(Size size) {
        size.getClass();
        int i2 = size.width;
        if (i2 < 0 || size.height < 0) {
            ore.e(size, "targetSize must be >= 0, was ");
            return null;
        }
        int i3 = 0;
        if (i2 == 0) {
            i2 = 0;
        } else if (i2 % 16 != 0) {
            int i4 = (i2 / 16) * 16;
            int i5 = ((i2 + 15) / 16) * 16;
            i2 = Math.abs(i2 - i4) < Math.abs(i5 - i2) ? i4 : i5;
        }
        int i6 = size.height;
        if (i6 != 0) {
            if (i6 % 16 == 0) {
                i3 = i6;
            } else {
                i3 = (i6 / 16) * 16;
                int i7 = ((i6 + 15) / 16) * 16;
                if (Math.abs(i6 - i3) >= Math.abs(i7 - i6)) {
                    i3 = i7;
                }
            }
        }
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int iMax2 = Math.max(iMin, 144);
        int iMax3 = Math.max(iMax, 240);
        return i2 <= i3 ? new Size(iMax2, iMax3) : new Size(iMax3, iMax2);
    }

    public ByteBuffer d(ByteBuffer byteBuffer, i1m i1mVar) {
        if (!byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        ghe gheVarB = rsk.b(byteBuffer);
        int iRemaining = 0;
        for (int i2 = 0; i2 < gheVarB.d; i2++) {
            iRemaining += ((ByteBuffer) gheVarB.get(i2)).remaining() + 4;
        }
        i1mVar.getClass();
        lvb.R(iRemaining >= 0);
        if (((ByteBuffer) i1mVar.a).remaining() < iRemaining) {
            i1mVar.a = ByteBuffer.allocateDirect(Math.max(iRemaining, ((ByteBuffer) i1mVar.a).capacity() * 2));
        }
        ByteBuffer byteBufferSlice = ((ByteBuffer) i1mVar.a).slice();
        ByteBuffer byteBuffer2 = (ByteBuffer) i1mVar.a;
        byteBuffer2.position(byteBuffer2.position() + iRemaining);
        byteBufferSlice.limit(iRemaining);
        for (int i3 = 0; i3 < gheVarB.d; i3++) {
            ByteBuffer byteBuffer3 = (ByteBuffer) gheVarB.get(i3);
            byteBufferSlice.putInt(byteBuffer3.remaining());
            byteBufferSlice.put(byteBuffer3);
        }
        byteBufferSlice.rewind();
        byteBuffer.position(byteBuffer.limit());
        return byteBufferSlice;
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        c01 c01Var = new c01();
        c01Var.b = "";
        int iU = ch3.U(fkaVar);
        for (int i2 = 0; i2 < iU; i2++) {
            String strW = ch3.W(fkaVar);
            strW.getClass();
            switch (strW) {
                case "description":
                    c01Var.b = ch3.W(fkaVar);
                    break;
                case "name":
                    c01Var.a = ch3.W(fkaVar);
                    break;
                case "botId":
                    c01Var.c = ch3.T(fkaVar, 0L);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new d01(c01Var);
    }

    @Override // defpackage.lj6
    public void r(xbf xbfVar) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        switch (this.a) {
            case 4:
                break;
        }
        return rx8.q(-1, kbcVar.getIcon().h);
    }
}
