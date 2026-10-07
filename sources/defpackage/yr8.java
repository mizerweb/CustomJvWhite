package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class yr8 implements OmicronEnvironment, iee, ine, hgg, wl, c4b, tu0, f2i {
    public static yr8 b;
    public final /* synthetic */ int a;

    public yr8() {
        this.a = 7;
        p90.a(0L);
    }

    public static yr8 e(Map map, BiPredicate biPredicate) {
        return new yr8(18);
    }

    public static final c79 f(DataInputStream dataInputStream) throws IOException {
        Object utf;
        c79 c79VarW = yab.w();
        while (dataInputStream.read() == 5) {
            String utf2 = dataInputStream.readUTF();
            long j = dataInputStream.readLong();
            String utf3 = dataInputStream.readUTF();
            long j2 = dataInputStream.readLong();
            String utf4 = dataInputStream.readUTF();
            ul9 ul9Var = new ul9();
            int i = dataInputStream.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                String utf5 = dataInputStream.readUTF();
                int i3 = dataInputStream.readInt();
                if (i3 == 1) {
                    utf = dataInputStream.readUTF();
                } else if (i3 == 2) {
                    utf = Boolean.valueOf(dataInputStream.readBoolean());
                } else if (i3 == 3) {
                    utf = Long.valueOf(dataInputStream.readLong());
                } else {
                    if (i3 != 4) {
                        qr7.k(zo5.h(i3, "Unsupported attribute value type "));
                        return null;
                    }
                    utf = Double.valueOf(dataInputStream.readDouble());
                }
                ul9Var.put(utf5, utf);
            }
            c79VarW.add(new irc(utf2, j, utf3, j2, utf4, ul9Var.b()));
        }
        return yab.j(c79VarW);
    }

    public static final void i(DataOutputStream dataOutputStream, irc ircVar) throws IOException {
        dataOutputStream.writeByte(5);
        dataOutputStream.writeUTF(ircVar.a);
        dataOutputStream.writeLong(ircVar.b);
        dataOutputStream.writeUTF(ircVar.c);
        dataOutputStream.writeLong(ircVar.d);
        dataOutputStream.writeUTF(ircVar.e);
        Map map = ircVar.f;
        dataOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            dataOutputStream.writeUTF(str);
            if (value instanceof Boolean) {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
            } else if (value instanceof Long ? true : value instanceof Integer ? true : value instanceof Byte ? true : value instanceof Short) {
                dataOutputStream.writeInt(3);
                dataOutputStream.writeLong(((Number) value).longValue());
            } else if (value instanceof Double ? true : value instanceof Float) {
                dataOutputStream.writeInt(4);
                dataOutputStream.writeDouble(((Number) value).doubleValue());
            } else {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeUTF(value.toString());
            }
        }
    }

    public static Bundle k(Long l, boolean z, ha9 ha9Var) {
        return n1g.i(new ylc("message_id", l), new ylc("is_primary", Boolean.valueOf(z)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)));
    }

    public static void l(aac aacVar, List list) {
        aacVar.j();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            z9c z9cVar = new z9c(aacVar.getContext());
            z9cVar.setTabItem((owb) obj);
            ugh ughVarI = aacVar.i();
            ughVarI.b = z9cVar;
            ughVarI.c();
            ArrayList arrayList = aacVar.b;
            aacVar.b(ughVarI, arrayList.size(), arrayList.isEmpty());
            i = i2;
        }
    }

    public static tbh m(sbh sbhVar, rbh rbhVar) {
        t4h t4hVar = tbh.e;
        return new tbh(sbhVar, rbhVar, tbh.e);
    }

    public static g9i n(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mg1 mg1Var = (mg1) it.next();
            int[] iArr = sfk.a;
            x52 x52Var = mg1Var.a;
            yt1 yt1Var = x52Var.b;
            int i = iArr[x52Var.a.ordinal()];
            if (i == 1) {
                hashSet.add(yt1Var);
            } else if (i == 2) {
                hashSet2.add(yt1Var);
            } else if (i == 3) {
                hashSet3.add(yt1Var);
            }
        }
        return new g9i(hashSet2);
    }

    public static yr8 o() {
        if (b == null) {
            b = new yr8(9);
        }
        return b;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    public static tbh q(int i, Size size, ej0 ej0Var, int i2, int i3, t4h t4hVar) {
        LinkedHashMap linkedHashMap = ej0Var.f;
        sbh sbhVar = (sbh) tbh.h.get(Integer.valueOf(i));
        if (sbhVar == null) {
            sbhVar = sbh.a;
        }
        rbh rbhVar = rbh.NOT_SUPPORT;
        Size size2 = mag.a;
        int height = size.getHeight() * size.getWidth();
        if (i2 == 1) {
            if (height <= mag.a((Size) ej0Var.b.get(Integer.valueOf(i)))) {
                rbhVar = rbh.S720P_16_9;
            } else if (height <= mag.a((Size) ej0Var.d.get(Integer.valueOf(i)))) {
                rbhVar = rbh.S1440P_4_3;
            }
        } else if (i3 == 1) {
            Size size3 = (Size) linkedHashMap.get(Integer.valueOf(i));
            for (rbh rbhVar2 : tbh.f) {
                if (size.equals(rbhVar2.b)) {
                    rbhVar = rbhVar2;
                    break;
                }
            }
            if (rbhVar == rbh.NOT_SUPPORT && size.equals(size3)) {
                rbhVar = rbh.MAXIMUM;
            }
        } else if (height <= mag.a(ej0Var.a)) {
            rbhVar = rbh.VGA;
        } else if (height <= mag.a(ej0Var.c)) {
            rbhVar = rbh.PREVIEW;
        } else {
            Size size4 = ej0Var.e;
            if (height <= size4.getHeight() * size4.getWidth()) {
                rbhVar = rbh.RECORD;
            } else {
                Size size5 = (Size) linkedHashMap.get(Integer.valueOf(i));
                Size size6 = (Size) ej0Var.i.get(Integer.valueOf(i));
                if (size5 != null) {
                    if (height <= size5.getHeight() * size5.getWidth()) {
                        if (i2 != 2) {
                            rbhVar = rbh.MAXIMUM;
                        } else if (size6 != null) {
                            if (height <= size6.getHeight() * size6.getWidth()) {
                                rbhVar = rbh.ULTRA_MAXIMUM;
                            }
                        }
                    } else if (size6 != null) {
                        if (height <= size6.getHeight() * size6.getWidth()) {
                            rbhVar = rbh.ULTRA_MAXIMUM;
                        }
                    }
                } else if (i2 != 2) {
                    rbhVar = rbh.MAXIMUM;
                } else if (size6 != null) {
                    if (height <= size6.getHeight() * size6.getWidth()) {
                        rbhVar = rbh.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new tbh(sbhVar, rbhVar, t4hVar);
    }

    @Override // defpackage.wl
    public void a(p81 p81Var) {
        p81Var.invoke();
    }

    @Override // defpackage.f2i
    public Object apply(Object obj) throws ImageCaptureException {
        ge6 ge6Var;
        switch (this.a) {
            case 6:
                mi0 mi0Var = (mi0) obj;
                l78 l78Var = mi0Var.b;
                hjd hjdVar = mi0Var.a;
                if (f3m.d(l78Var.getFormat())) {
                    try {
                        h45 h45Var = ge6.b;
                        ByteBuffer buffer = l78Var.e0()[0].getBuffer();
                        buffer.rewind();
                        byte[] bArr = new byte[buffer.capacity()];
                        buffer.get(bArr);
                        ge6Var = new ge6(new se6(new ByteArrayInputStream(bArr)));
                        l78Var.e0()[0].getBuffer().rewind();
                    } catch (IOException e) {
                        throw new ImageCaptureException(1, "Failed to extract EXIF data.", e);
                    }
                    break;
                } else {
                    ge6Var = null;
                }
                if (((ImageCaptureRotationOptionQuirk) rk5.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    bh0 bh0Var = hl2.f;
                } else if (f3m.d(l78Var.getFormat())) {
                    qyj.k(ge6Var, "JPEG image must have exif.");
                    Size size = new Size(l78Var.getWidth(), l78Var.getHeight());
                    int iA = hjdVar.d - ge6Var.a();
                    Size size2 = y1i.c(y1i.k(iA)) ? new Size(size.getHeight(), size.getWidth()) : size;
                    Matrix matrixA = y1i.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iA, false);
                    RectF rectF = new RectF(hjdVar.c);
                    matrixA.mapRect(rectF);
                    rectF.sort();
                    Size size3 = size2;
                    Rect rect = new Rect();
                    rectF.round(rect);
                    int iA2 = ge6Var.a();
                    Matrix matrix = new Matrix(hjdVar.f);
                    matrix.postConcat(matrixA);
                    gd2 so2Var = l78Var.getImageInfo() instanceof hd2 ? ((hd2) l78Var.getImageInfo()).a : new so2(20);
                    l78Var.getFormat();
                    return new hi0(l78Var, ge6Var, l78Var.getFormat(), size3, rect, iA2, matrix, so2Var);
                }
                Rect rect2 = hjdVar.c;
                int i = hjdVar.d;
                Matrix matrix2 = hjdVar.f;
                gd2 so2Var2 = l78Var.getImageInfo() instanceof hd2 ? ((hd2) l78Var.getImageInfo()).a : new so2(20);
                Size size4 = new Size(l78Var.getWidth(), l78Var.getHeight());
                if (f3m.d(l78Var.getFormat())) {
                    qyj.k(ge6Var, "JPEG image must have Exif.");
                }
                return new hi0(l78Var, ge6Var, l78Var.getFormat(), size4, rect2, i, matrix2, so2Var2);
            default:
                return (byte[]) obj;
        }
    }

    @Override // defpackage.tu0
    public void b(String str, af7 af7Var) {
    }

    @Override // defpackage.hgg
    public long c(long j) {
        return -1L;
    }

    @Override // defpackage.ine
    public void d(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        gda gdaVarQ0 = null;
        if (iU == 0) {
            return null;
        }
        long jI0 = 0;
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            if (strS0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                jI0 = fkaVar.I0();
            } else if (strS0.equals("message")) {
                gdaVarQ0 = yab.q0(fkaVar);
            } else {
                fkaVar.x();
            }
        }
        return new pj1(jI0, gdaVarQ0);
    }

    @Override // defpackage.tu0
    public void j(String str, Throwable th, af7 af7Var) {
    }

    @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "RELEASE";
    }

    @Override // defpackage.wl
    public String p() {
        return vab.TENSORFLOW.b;
    }

    @Override // defpackage.iee
    public boolean u(UnsatisfiedLinkError unsatisfiedLinkError, rcg[] rcgVarArr) {
        if (!(unsatisfiedLinkError instanceof qcg) || (unsatisfiedLinkError instanceof pcg)) {
            return false;
        }
        String str = ((qcg) unsatisfiedLinkError).a;
        StringBuilder sb = new StringBuilder("Reunpacking NonApk UnpackingSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb.toString());
        for (rcg rcgVar : rcgVarArr) {
            if (rcgVar instanceof wci) {
                wci wciVar = (wci) rcgVar;
                if (wciVar instanceof wn0) {
                    continue;
                } else {
                    try {
                        Log.e("SoLoader", "Runpacking " + wciVar.b());
                        wciVar.d(2);
                    } catch (Exception e) {
                        Log.e("SoLoader", "Encountered an exception while reunpacking " + wciVar.b() + " for library " + str + ": ", e);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.wl
    public void z(yt1 yt1Var) {
    }

    public /* synthetic */ yr8(int i) {
        this.a = i;
    }
}
