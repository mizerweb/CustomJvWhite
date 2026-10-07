package defpackage;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v21 {
    public static final /* synthetic */ int a = 0;

    static {
        c98.v((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);
    }

    public static ByteBuffer a(b87 b87Var) {
        List list = b87Var.q;
        lvb.O("csd-0 and/or csd-1 not found in the format for avcC box.", list.size() >= 2);
        byte[] bArr = (byte[]) list.get(0);
        lvb.O("csd-0 is empty for avcC box.", bArr.length > 0);
        byte[] bArr2 = (byte[]) list.get(1);
        lvb.O("csd-1 is empty for avcC box.", bArr2.length > 0);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap2.limit() + byteBufferWrap.limit() + 200);
        byteBufferAllocate.put((byte) 1);
        ghe gheVarB = rsk.b(byteBufferWrap);
        lvb.O("SPS data not found in csd0 for avcC box.", !gheVarB.isEmpty());
        ByteBuffer byteBuffer = (ByteBuffer) gheVarB.get(0);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[iRemaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        oab oabVarN = xsg.n(0, bArr3, iRemaining);
        byteBufferAllocate.put((byte) oabVarN.a);
        byteBufferAllocate.put((byte) oabVarN.b);
        byteBufferAllocate.put((byte) oabVarN.c);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -31);
        byteBufferAllocate.putShort((short) byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        ghe gheVarB2 = rsk.b(byteBufferWrap2);
        lvb.Z("PPS data not found in csd1 for avcC box.", !gheVarB2.isEmpty());
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) gheVarB2.get(0);
        byteBufferAllocate.putShort((short) byteBuffer2.remaining());
        byteBufferAllocate.put(byteBuffer2);
        byteBuffer2.rewind();
        byteBufferAllocate.flip();
        return dfl.d("avcC", byteBufferAllocate);
    }

    public static ArrayList b(List list, ArrayList arrayList, int i) {
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(list2.size());
        if (!list2.isEmpty()) {
            boolean z = false;
            long j = ((u31) list2.get(0)).a;
            long jIntValue = 0;
            int i2 = 0;
            boolean z2 = false;
            long j2 = 0;
            while (i2 < list2.size()) {
                long j3 = ((u31) list2.get(i2)).a - j;
                long jP = p(j3, i) - jIntValue;
                if (jP <= 2147483647L) {
                    z = true;
                }
                lvb.Z("Only 32-bit composition offset is allowed", z);
                long j4 = j;
                jIntValue += (long) ((Integer) arrayList.get(i2)).intValue();
                arrayList2.add(Integer.valueOf((int) jP));
                if (j3 < j2) {
                    z2 = true;
                }
                i2++;
                list2 = list;
                j2 = j3;
                j = j4;
                z = false;
            }
            if (!z2) {
                arrayList2.clear();
            }
        }
        return arrayList2;
    }

    public static ByteBuffer c(b87 b87Var) {
        int i;
        int i2;
        ByteBuffer byteBufferD;
        int i3;
        int iD;
        int i4;
        String str = b87Var.n;
        List list = b87Var.q;
        str.getClass();
        byte b = 10;
        byte b2 = 8;
        char c = 1;
        switch (str) {
            case "video/dolby-vision":
                Pair pairJ = j(b87Var);
                lvb.W(pairJ, "Can't identify Dolby vision profile");
                ByteBuffer byteBufferM = ((Integer) pairJ.first).intValue() <= 8 ? m(b87Var) : a(b87Var);
                int iIntValue = ((Integer) pairJ.first).intValue();
                int iIntValue2 = ((Integer) pairJ.second).intValue();
                byte[] bArr = qu3.a;
                byte[] bArr2 = new byte[24];
                if (iIntValue == 8) {
                    i = 4;
                    i2 = 0;
                } else if (iIntValue == 9) {
                    i = 2;
                    i2 = 1;
                } else {
                    i = 0;
                    i2 = 0;
                }
                bArr2[0] = 1;
                bArr2[1] = 0;
                byte b3 = (byte) ((iIntValue & 127) << 1);
                bArr2[2] = b3;
                bArr2[2] = (byte) ((b3 | ((iIntValue2 >> 5) & 1)) & 255);
                byte b4 = (byte) ((iIntValue2 & 31) << 3);
                bArr2[3] = b4;
                byte b5 = (byte) (b4 | 4);
                bArr2[3] = b5;
                byte b6 = b5;
                bArr2[3] = b6;
                bArr2[3] = (byte) (b6 | 1);
                byte b7 = (byte) (i << 4);
                bArr2[4] = b7;
                bArr2[4] = (byte) (b7 | (i2 << 2));
                int iIntValue3 = ((Integer) pairJ.first).intValue();
                if (iIntValue3 == 5) {
                    byteBufferD = dfl.d("dvcC", ByteBuffer.wrap(bArr2));
                } else {
                    if (iIntValue3 != 8 && iIntValue3 != 9) {
                        ore.p(zo5.h(iIntValue3, "Unsupported Dolby Vision profile "));
                        return null;
                    }
                    byteBufferD = dfl.d("dvvC", ByteBuffer.wrap(bArr2));
                }
                return dfl.a(byteBufferM, byteBufferD);
            case "video/3gpp":
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(7);
                byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
                byteBufferAllocate.put((byte) 0);
                Pair pairB = qu3.b(b87Var);
                if (pairB == null) {
                    pairB = new Pair(1, 1);
                }
                byteBufferAllocate.put(((Integer) pairB.second).byteValue());
                byteBufferAllocate.put(((Integer) pairB.first).byteValue());
                byteBufferAllocate.flip();
                return dfl.d("d263", byteBufferAllocate);
            case "video/av01":
                return dfl.d("av1C", ByteBuffer.wrap((byte[]) list.get(0)));
            case "video/hevc":
                return m(b87Var);
            case "audio/amr-wb":
                return f((short) -31745);
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return h(b87Var);
            case "audio/raw":
                return ByteBuffer.allocate(0);
            case "video/mp4v-es":
                return h(b87Var);
            case "video/apv":
                lvb.O("csd-0 is not found in the format for apvC box", !list.isEmpty());
                byte[] bArr3 = (byte[]) list.get(0);
                lvb.O("csd-0 is empty for apvC box.", bArr3.length > 0);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr3.length + 4);
                byteBufferAllocate2.putInt(0);
                byteBufferAllocate2.put(bArr3);
                byteBufferAllocate2.flip();
                return dfl.d("apvC", byteBufferAllocate2);
            case "video/avc":
                return a(b87Var);
            case "audio/3gpp":
                return f((short) -32257);
            case "audio/opus":
                lvb.O("csd-0 not found in the format for dOps box.", !list.isEmpty());
                byte[] bArr4 = (byte[]) list.get(0);
                lvb.O("As csd0 contains 'OpusHead' in first 8 bytes, csd0 length should be greater than 8", bArr4.length >= 8);
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(bArr4.length);
                byteBufferAllocate3.put(bArr4, 8, bArr4.length - 8);
                byteBufferAllocate3.flip();
                return dfl.d("dOps", byteBufferAllocate3);
            case "video/x-vnd.on2.vp9":
                ex3 ex3Var = b87Var.D;
                lvb.O("csd-0 is not found in the format for vpcC box", !list.isEmpty());
                byte[] bArr5 = (byte[]) list.get(0);
                lvb.O("csd-0 for vp9 is invalid.", bArr5.length > 3);
                if (k4m.c(bArr5) == 16777216) {
                    return dfl.d("vpcC", ByteBuffer.wrap(bArr5));
                }
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(200);
                byteBufferAllocate4.putInt(16777216);
                if (ex3Var == null || (i3 = ex3Var.b) == -1) {
                    i3 = 0;
                }
                byte b8 = 0;
                byte b9 = 0;
                for (int i5 = 0; i5 < bArr5.length; i5 += 3) {
                    byte b10 = bArr5[i5];
                    int i6 = i5 + 2;
                    if (b10 == 1) {
                        b8 = bArr5[i6];
                    } else if (b10 == 2) {
                        b = bArr5[i6];
                    } else if (b10 == 3) {
                        b2 = bArr5[i6];
                    } else if (b10 == 4) {
                        b9 = bArr5[i6];
                    }
                }
                ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(3);
                byteBufferAllocate5.put(b8);
                byteBufferAllocate5.put(b);
                byteBufferAllocate5.put((byte) ((b2 << 4) | (b9 << 1) | i3));
                byteBufferAllocate5.flip();
                byteBufferAllocate4.put(byteBufferAllocate5);
                if (ex3Var != null) {
                    int i7 = ex3Var.a;
                    char c2 = i7 != 2 ? i7 != 6 ? (char) 1 : '\t' : (char) 5;
                    iD = ex3.d(ex3Var.c);
                    i4 = i7 != 2 ? i7 != 6 ? 1 : 9 : 6;
                    c = c2;
                } else {
                    iD = 1;
                    i4 = 1;
                }
                byteBufferAllocate4.put((byte) c);
                byteBufferAllocate4.put((byte) iD);
                byteBufferAllocate4.put((byte) i4);
                byteBufferAllocate4.putShort((short) 0);
                byteBufferAllocate4.flip();
                return dfl.d("vpcC", byteBufferAllocate4);
            default:
                ore.p("Unsupported format: ".concat(str));
                return null;
        }
    }

    public static String d(b87 b87Var) {
        String str = b87Var.n;
        int i = b87Var.H;
        str.getClass();
        switch (str) {
            case "video/dolby-vision":
                Pair pairJ = j(b87Var);
                lvb.W(pairJ, "Dolby Vision profile and level is not found.");
                int iIntValue = ((Integer) pairJ.first).intValue();
                if (iIntValue == 5) {
                    return "dvh1";
                }
                if (iIntValue == 8) {
                    return "hvc1";
                }
                if (iIntValue == 9) {
                    return "avc1";
                }
                c.j("Unsupported profile ", pairJ.first, " for format: ", str);
                return null;
            case "video/3gpp":
                return "s263";
            case "video/av01":
                return "av01";
            case "video/hevc":
                return "hvc1";
            case "audio/amr-wb":
                return "sawb";
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return "mp4a";
            case "audio/raw":
                if (i == 2) {
                    return "sowt";
                }
                if (i == 268435456) {
                    return "twos";
                }
                ore.p(zo5.h(i, "Unsupported PCM encoding: "));
                return null;
            case "video/mp4v-es":
                return "mp4v-es";
            case "video/apv":
                return "apv1";
            case "video/avc":
                return "avc1";
            case "audio/3gpp":
                return "samr";
            case "audio/opus":
                return "Opus";
            case "video/x-vnd.on2.vp9":
                return "vp09";
            default:
                ore.p("Unsupported format: ".concat(str));
                return null;
        }
    }

    public static ArrayList e(int i, long j, List list) {
        long jP;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        if (list.isEmpty()) {
            return arrayList2;
        }
        int iIntValue = 0;
        long j2 = 0;
        int i2 = 0;
        boolean z = false;
        while (i2 < list.size()) {
            long j3 = ((u31) list.get(i2)).a;
            arrayList.add(Long.valueOf(j3));
            if (j3 < j2) {
                z = true;
            }
            i2++;
            j2 = j3;
        }
        if (z) {
            Collections.sort(arrayList);
        }
        long jLongValue = ((Long) arrayList.get(0)).longValue();
        int i3 = 1;
        while (i3 < arrayList.size()) {
            long jLongValue2 = ((Long) arrayList.get(i3)).longValue();
            long jP2 = p(jLongValue2 - jLongValue, i);
            lvb.Z("Only 32-bit sample duration is allowed", jP2 <= 2147483647L);
            arrayList2.add(Integer.valueOf((int) jP2));
            i3++;
            jLongValue = jLongValue2;
        }
        if (j != -9223372036854775807L) {
            long j4 = i;
            jP = p(j, j4) - p(jLongValue, j4);
            lvb.Z("Only 32-bit sample duration is allowed", jP <= 2147483647L);
        } else {
            jP = -1;
        }
        int i4 = (int) jP;
        if (i4 != -1) {
            iIntValue = i4;
        } else if (arrayList2.size() >= 2) {
            iIntValue = ((Integer) np4.n(arrayList2)).intValue();
        }
        arrayList2.add(Integer.valueOf(iIntValue));
        return arrayList2;
    }

    public static ByteBuffer f(short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.flip();
        return dfl.d("damr", byteBufferAllocate);
    }

    public static ByteBuffer g(long j, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer h(b87 b87Var) {
        ByteBuffer byteBufferWrap;
        Byte b;
        List list = b87Var.q;
        lvb.O("csd-0 not found in the format for esds box.", !list.isEmpty());
        byte[] bArr = (byte[]) list.get(0);
        lvb.O("csd-0 is empty for esds box.", bArr.length > 0);
        String str = b87Var.n;
        str.getClass();
        if (str.equals("audio/vorbis")) {
            byte[] bArr2 = qu3.a;
            lvb.O("csd-0 and csd-1 must be present for Vorbis.", list.size() > 1);
            byte[] bArr3 = (byte[]) list.get(0);
            byte[] bArr4 = (byte[]) list.get(1);
            int length = bArr3.length;
            int length2 = bArr4.length;
            int i = length / 255;
            byte[] bArr5 = new byte[i + 1];
            Arrays.fill(bArr5, (byte) -1);
            bArr5[i] = (byte) (length % 255);
            byte[] bArr6 = {23};
            Arrays.fill(bArr6, (byte) -1);
            byteBufferWrap = ByteBuffer.allocate(i + 3 + length + 23 + length2);
            byteBufferWrap.put((byte) 2);
            byteBufferWrap.put(bArr5);
            byteBufferWrap.put(bArr6);
            byteBufferWrap.put(bArr3);
            byteBufferWrap.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
            byteBufferWrap.put(bArr4);
            byteBufferWrap.flip();
        } else {
            byteBufferWrap = ByteBuffer.wrap(bArr);
        }
        int i2 = b87Var.i;
        int i3 = b87Var.h;
        boolean zM = uya.m(str);
        int iRemaining = byteBufferWrap.remaining();
        ByteBuffer byteBufferK = k(iRemaining);
        ByteBuffer byteBufferK2 = k(byteBufferK.remaining() + iRemaining + 14);
        ByteBuffer byteBufferK3 = k(byteBufferK2.remaining() + byteBufferK.remaining() + iRemaining + 21);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put(byteBufferK3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(zM ? (byte) 31 : (byte) 0);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(byteBufferK2);
        switch (str) {
            case "audio/vorbis":
                b = (byte) -35;
                break;
            case "audio/mp4a-latm":
                b = (byte) 64;
                break;
            case "video/mp4v-es":
                b = (byte) 32;
                break;
            default:
                b = null;
                break;
        }
        b.getClass();
        byteBufferAllocate.put(b.byteValue());
        byteBufferAllocate.put((byte) ((zM ? 16 : 20) | 1));
        byteBufferAllocate.putShort((short) (((zM ? 96000 : 768) >> 8) & 65535));
        byteBufferAllocate.put((byte) 0);
        if (i2 == -1) {
            i2 = 0;
        }
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3 != -1 ? i3 : 0);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put(byteBufferK);
        byteBufferAllocate.put(byteBufferWrap);
        byteBufferWrap.rewind();
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.flip();
        return dfl.d("esds", byteBufferAllocate);
    }

    public static ByteBuffer i() {
        ArrayList arrayList = new ArrayList();
        String str = vqi.a;
        arrayList.add(ByteBuffer.wrap("isom".getBytes(StandardCharsets.UTF_8)));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(131072);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(strArr[i].getBytes(StandardCharsets.UTF_8)));
        }
        return dfl.c("ftyp", arrayList);
    }

    public static Pair j(b87 b87Var) {
        String str = b87Var.k;
        lvb.W(str, "Codec string is null for Dolby Vision format.");
        List listT = ed7.S('.').T(str);
        if (listT.size() < 3) {
            lvb.G0("Boxes", "Invalid Dolby Vision codec string: ".concat(str));
            return null;
        }
        return Pair.create(Integer.valueOf(Integer.parseInt((String) listT.get(1))), Integer.valueOf(Integer.parseInt((String) listT.get(2))));
    }

    public static ByteBuffer k(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = np0.m;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            byteBufferAllocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer l(String str, String str2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        String str3 = vqi.a;
        Charset charset = StandardCharsets.UTF_8;
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(str2.getBytes(charset));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return dfl.d("hdlr", byteBufferAllocate);
    }

    public static ByteBuffer m(b87 b87Var) {
        List list = b87Var.q;
        lvb.O("csd-0 not found in the format for hvcC box.", !list.isEmpty());
        byte[] bArr = (byte[]) list.get(0);
        lvb.O("csd-0 is empty for hvcC box.", bArr.length > 0);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + 200);
        ghe gheVarB = rsk.b(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < gheVarB.d; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) gheVarB.get(i);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBuffer.limit());
            int i2 = 0;
            for (int i3 = 0; i3 < byteBuffer.limit(); i3++) {
                if (byteBuffer.get(i3) != 3 || i2 < 2) {
                    byteBufferAllocate2.put(byteBuffer.get(i3));
                }
                i2 = byteBuffer.get(i3) == 0 ? i2 + 1 : 0;
            }
            byteBufferAllocate2.flip();
            arrayList.add(byteBufferAllocate2);
        }
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.get(0);
        if (byteBuffer2.get(byteBuffer2.position()) != 64) {
            ore.p("First NALU in csd-0 is not the VPS.");
            return null;
        }
        byteBufferAllocate.put(byteBuffer2.get(6));
        byteBufferAllocate.putInt(byteBuffer2.getInt(7));
        byteBufferAllocate.putInt(byteBuffer2.getInt(11));
        byteBufferAllocate.putShort(byteBuffer2.getShort(15));
        byteBufferAllocate.put(byteBuffer2.get(17));
        byteBufferAllocate.putShort((short) -4096);
        byteBufferAllocate.put((byte) -4);
        int i4 = gheVarB.d;
        ByteBuffer byteBuffer3 = (ByteBuffer) gheVarB.get(1);
        int iRemaining = byteBuffer3.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer3.get(bArr2);
        byteBuffer3.rewind();
        lab labVarL = xsg.l(bArr2, 0, iRemaining, null);
        byte b = (byte) (labVarL.c | 252);
        byte b2 = (byte) (labVarL.d | 248);
        byte b3 = (byte) (labVarL.e | 248);
        byteBufferAllocate.put(b);
        byteBufferAllocate.put(b2);
        byteBufferAllocate.put(b3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 15);
        byteBufferAllocate.put((byte) i4);
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer4 = (ByteBuffer) gheVarB.get(i5);
            byteBufferAllocate.put((byte) ((byteBuffer4.get(0) >> 1) & 63));
            byteBufferAllocate.putShort((short) 1);
            byteBufferAllocate.putShort((short) byteBuffer4.limit());
            byteBufferAllocate.put(byteBuffer4);
        }
        byteBufferAllocate.flip();
        return dfl.d("hvcC", byteBufferAllocate);
    }

    /* JADX WARN: Code duplicated, block: B:200:0x073e  */
    public static ByteBuffer n(ArrayList arrayList, ljf ljfVar, boolean z) {
        ByteBuffer byteBufferD;
        ByteBuffer byteBufferC;
        String str;
        int i;
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBufferD2;
        int i2;
        ByteBuffer byteBufferD3;
        ByteBuffer byteBufferC2;
        String str2;
        String str3;
        int i3;
        byte[] bArrN0;
        int i4;
        ByteBuffer byteBufferAllocate2;
        short s;
        short s2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5;
        int i6;
        int i7;
        ByteBuffer byteBufferAllocate3;
        ArrayList arrayList4 = arrayList;
        u2b u2bVar = (u2b) ljfVar.e;
        HashSet hashSet = (HashSet) ljfVar.d;
        int i8 = (int) u2bVar.a;
        int i9 = (int) u2bVar.b;
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            ayh ayhVar = (ayh) arrayList4.get(i10);
            if (!ayhVar.b.isEmpty()) {
                jMin = Math.min(((u31) ayhVar.b.get(0)).a, jMin);
            }
        }
        if (jMin == BuildConfig.MAX_TIME_TO_UPLOAD) {
            jMin = -9223372036854775807L;
        }
        if (!z && jMin == -9223372036854775807L) {
            return ByteBuffer.allocate(0);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i11 = 0;
        int i12 = 1;
        long jMax = 0;
        long j = 0;
        while (true) {
            String str4 = "meta";
            long j2 = jMin;
            if (i11 >= arrayList4.size()) {
                HashSet hashSet2 = hashSet;
                ArrayList arrayList7 = arrayList5;
                ArrayList arrayList8 = arrayList6;
                int i13 = i12;
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(200);
                byteBufferAllocate4.putInt(0);
                byteBufferAllocate4.putInt(i8);
                byteBufferAllocate4.putInt(i9);
                byteBufferAllocate4.putInt(10000);
                byteBufferAllocate4.putInt((int) p(jMax, 10000L));
                byteBufferAllocate4.putInt(65536);
                byteBufferAllocate4.putShort((short) 256);
                byteBufferAllocate4.putShort((short) 0);
                byteBufferAllocate4.putInt(0);
                byteBufferAllocate4.putInt(0);
                int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
                for (int i14 = 0; i14 < 9; i14++) {
                    byteBufferAllocate4.putInt(iArr[i14]);
                }
                for (int i15 = 0; i15 < 6; i15++) {
                    byteBufferAllocate4.putInt(0);
                }
                byteBufferAllocate4.putInt(i13);
                byteBufferAllocate4.flip();
                ByteBuffer byteBufferD4 = dfl.d("mvhd", byteBufferAllocate4);
                r2b r2bVar = (r2b) ljfVar.c;
                if (r2bVar == null) {
                    byteBufferD = ByteBuffer.allocate(0);
                } else {
                    Object[] objArr = {Float.valueOf(r2bVar.a), Float.valueOf(r2bVar.b)};
                    String str5 = vqi.a;
                    String str6 = String.format(Locale.US, "%+.4f%+.4f/", objArr);
                    ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(str6.length() + 4);
                    byteBufferAllocate5.putShort((short) (byteBufferAllocate5.capacity() - 4));
                    byteBufferAllocate5.putShort((short) 5575);
                    byteBufferAllocate5.put(str6.getBytes(StandardCharsets.UTF_8));
                    lvb.b0(byteBufferAllocate5.limit() == byteBufferAllocate5.capacity());
                    byteBufferAllocate5.flip();
                    byteBufferD = dfl.d("udta", dfl.e(byteBufferAllocate5, new byte[]{-87, 120, 121, 122}));
                }
                if (hashSet2.isEmpty()) {
                    byteBufferC = ByteBuffer.allocate(0);
                } else {
                    ByteBuffer byteBufferL = l("mdta", "");
                    hashSet2.getClass();
                    ArrayList arrayList9 = new ArrayList(hashSet2);
                    int length = 0;
                    for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                        length += ((qp9) arrayList9.get(i16)).a.length() + 8;
                    }
                    ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(length + 8);
                    int i17 = 0;
                    byteBufferAllocate6.putInt(0);
                    byteBufferAllocate6.putInt(arrayList9.size());
                    for (int i18 = 0; i18 < arrayList9.size(); i18++) {
                        String str7 = ((qp9) arrayList9.get(i18)).a;
                        String str8 = vqi.a;
                        byteBufferAllocate6.put(dfl.d("mdta", ByteBuffer.wrap(str7.getBytes(StandardCharsets.UTF_8))));
                    }
                    byteBufferAllocate6.flip();
                    ByteBuffer byteBufferD5 = dfl.d(ApiProtocol.PARAM_KEYS, byteBufferAllocate6);
                    hashSet2.getClass();
                    ArrayList arrayList10 = new ArrayList(hashSet2);
                    int length2 = 0;
                    for (int i19 = 0; i19 < arrayList10.size(); i19++) {
                        length2 += ((qp9) arrayList10.get(i19)).b.length + 24;
                    }
                    ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(length2);
                    while (i17 < arrayList10.size()) {
                        int i20 = i17 + 1;
                        qp9 qp9Var = (qp9) arrayList10.get(i17);
                        ByteBuffer byteBufferAllocate8 = ByteBuffer.allocate(qp9Var.b.length + 8);
                        byteBufferAllocate8.putInt(qp9Var.d);
                        byteBufferAllocate8.putInt(qp9Var.c);
                        byteBufferAllocate8.put(qp9Var.b);
                        byteBufferAllocate8.flip();
                        ByteBuffer byteBufferD6 = dfl.d("data", byteBufferAllocate8);
                        byteBufferAllocate7.putInt(byteBufferD6.remaining() + 8);
                        byteBufferAllocate7.putInt(i20);
                        byteBufferAllocate7.put(byteBufferD6);
                        i17 = i20;
                    }
                    byteBufferAllocate7.flip();
                    byteBufferC = dfl.c("meta", Arrays.asList(byteBufferL, byteBufferD5, dfl.d("ilst", byteBufferAllocate7)));
                }
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(byteBufferD4);
                arrayList11.add(byteBufferD);
                arrayList11.add(byteBufferC);
                arrayList11.addAll(arrayList7);
                if (z) {
                    arrayList11.add(dfl.c("mvex", arrayList8));
                }
                return dfl.c("moov", arrayList11);
            }
            ayh ayhVar2 = (ayh) arrayList4.get(i11);
            if (z || !ayhVar2.b.isEmpty()) {
                b87 b87Var = ayhVar2.a;
                ArrayList arrayList12 = ayhVar2.b;
                if (Objects.equals(b87Var.n, "video/av01") && b87Var.q.isEmpty()) {
                    a87 a87VarA = b87Var.a();
                    byte[] bArr = ayhVar2.h;
                    bArr.getClass();
                    a87VarA.p = c98.r(bArr);
                    b87Var = new b87(a87VarA);
                }
                String str9 = b87Var.d;
                int i21 = b87Var.v;
                int i22 = b87Var.u;
                String iSO3Language = str9;
                String str10 = b87Var.n;
                if (iSO3Language == null) {
                    str = null;
                } else {
                    Locale localeForLanguageTag = Locale.forLanguageTag(iSO3Language);
                    if (!localeForLanguageTag.getISO3Language().isEmpty()) {
                        iSO3Language = localeForLanguageTag.getISO3Language();
                    }
                    str = iSO3Language;
                }
                ArrayList arrayList13 = arrayList5;
                ArrayList arrayList14 = arrayList6;
                ArrayList arrayListE = e(ayhVar2.a(), ayhVar2.i, arrayList12);
                long jIntValue = j;
                int i23 = 0;
                while (i23 < arrayListE.size()) {
                    jIntValue += (long) ((Integer) arrayListE.get(i23)).intValue();
                    i23++;
                    str4 = str4;
                    str = str;
                }
                String str11 = str4;
                String str12 = str;
                long j3 = arrayList12.isEmpty() ? j : ((u31) arrayList12.get(0)).a;
                long jI0 = vqi.i0(jIntValue, 1000000L, ayhVar2.a(), RoundingMode.HALF_UP);
                long j4 = jIntValue;
                long jAbs = j3 < j ? jI0 - Math.abs(j3) : jI0;
                int iH = uya.h(str10);
                ByteBuffer byteBufferAllocate9 = ByteBuffer.allocate((arrayListE.size() * 8) + 200);
                byteBufferAllocate9.putInt(0);
                long j5 = jAbs;
                int iPosition = byteBufferAllocate9.position();
                byteBufferAllocate9.putInt(0);
                int i24 = i12;
                int i25 = i9;
                int i26 = 0;
                int i27 = 0;
                int iPosition2 = -1;
                long j6 = -1;
                while (i27 < arrayListE.size()) {
                    int iIntValue = ((Integer) arrayListE.get(i27)).intValue();
                    int i28 = i22;
                    long j7 = iIntValue;
                    if (j6 != j7) {
                        iPosition2 = byteBufferAllocate9.position();
                        byteBufferAllocate9.putInt(1);
                        byteBufferAllocate9.putInt(iIntValue);
                        i26++;
                        j6 = j7;
                    } else {
                        byteBufferAllocate9.putInt(iPosition2, byteBufferAllocate9.getInt(iPosition2) + 1);
                    }
                    i27++;
                    i22 = i28;
                }
                int i29 = i22;
                byteBufferAllocate9.putInt(iPosition, i26);
                byteBufferAllocate9.flip();
                ByteBuffer byteBufferD7 = dfl.d("stts", byteBufferAllocate9);
                if (uya.m(str10)) {
                    ArrayList arrayListB = b(arrayList12, arrayListE, ayhVar2.a());
                    if (arrayListB.isEmpty()) {
                        byteBufferAllocate = ByteBuffer.allocate(0);
                    } else {
                        ByteBuffer byteBufferAllocate10 = ByteBuffer.allocate((arrayListB.size() * 8) + 8);
                        byteBufferAllocate10.putInt(16777216);
                        int iPosition3 = byteBufferAllocate10.position();
                        byteBufferAllocate10.putInt(0);
                        int i30 = 0;
                        int i31 = -1;
                        int i32 = -1;
                        for (int i33 = 0; i33 < arrayListB.size(); i33++) {
                            int iIntValue2 = ((Integer) arrayListB.get(i33)).intValue();
                            if (i31 != iIntValue2) {
                                int iPosition4 = byteBufferAllocate10.position();
                                byteBufferAllocate10.putInt(1);
                                byteBufferAllocate10.putInt(iIntValue2);
                                i30++;
                                i32 = iPosition4;
                                i31 = iIntValue2;
                            } else {
                                byteBufferAllocate10.putInt(i32, byteBufferAllocate10.getInt(i32) + 1);
                            }
                        }
                        byteBufferAllocate10.putInt(iPosition3, i30);
                        byteBufferAllocate10.flip();
                        byteBufferAllocate = dfl.d("ctts", byteBufferAllocate10);
                    }
                    i = 0;
                } else {
                    i = 0;
                    byteBufferAllocate = ByteBuffer.allocate(0);
                }
                ByteBuffer byteBuffer = byteBufferAllocate;
                ByteBuffer byteBufferAllocate11 = ByteBuffer.allocate((arrayList12.size() * 4) + 200);
                byteBufferAllocate11.putInt(i);
                byteBufferAllocate11.putInt(i);
                byteBufferAllocate11.putInt(arrayList12.size());
                for (int i34 = 0; i34 < arrayList12.size(); i34++) {
                    byteBufferAllocate11.putInt(((u31) arrayList12.get(i34)).b);
                }
                byteBufferAllocate11.flip();
                ByteBuffer byteBufferD8 = dfl.d("stsz", byteBufferAllocate11);
                ArrayList arrayList15 = ayhVar2.d;
                ByteBuffer byteBufferAllocate12 = ByteBuffer.allocate((arrayList15.size() * 12) + 200);
                byteBufferAllocate12.putInt(0);
                int iPosition5 = byteBufferAllocate12.position();
                byteBufferAllocate12.putInt(0);
                int i35 = 1;
                int i36 = 0;
                int i37 = -1;
                for (int i38 = 0; i38 < arrayList15.size(); i38++) {
                    int iIntValue3 = ((Integer) arrayList15.get(i38)).intValue();
                    if (iIntValue3 != i37) {
                        byteBufferAllocate12.putInt(i35);
                        byteBufferAllocate12.putInt(iIntValue3);
                        byteBufferAllocate12.putInt(1);
                        i36++;
                        i37 = iIntValue3;
                    }
                    i35++;
                }
                byteBufferAllocate12.putInt(iPosition5, i36);
                byteBufferAllocate12.flip();
                ByteBuffer byteBufferD9 = dfl.d("stsc", byteBufferAllocate12);
                ArrayList arrayList16 = ayhVar2.c;
                if (z) {
                    ByteBuffer byteBufferAllocate13 = ByteBuffer.allocate((arrayList16.size() * 4) + 8);
                    byteBufferAllocate13.putInt(0);
                    byteBufferAllocate13.putInt(arrayList16.size());
                    for (int i39 = 0; i39 < arrayList16.size(); i39++) {
                        long jLongValue = ((Long) arrayList16.get(i39)).longValue();
                        lvb.Z("Only 32-bit chunk offset is allowed", jLongValue <= 4294967295L);
                        byteBufferAllocate13.putInt((int) jLongValue);
                    }
                    byteBufferAllocate13.flip();
                    byteBufferD2 = dfl.d("stco", byteBufferAllocate13);
                } else {
                    ByteBuffer byteBufferAllocate14 = ByteBuffer.allocate((arrayList16.size() * 8) + 8);
                    byteBufferAllocate14.putInt(0);
                    byteBufferAllocate14.putInt(arrayList16.size());
                    for (int i40 = 0; i40 < arrayList16.size(); i40++) {
                        byteBufferAllocate14.putLong(((Long) arrayList16.get(i40)).longValue());
                    }
                    byteBufferAllocate14.flip();
                    byteBufferD2 = dfl.d("co64", byteBufferAllocate14);
                }
                ByteBuffer byteBuffer2 = byteBufferD2;
                if (iH == -1 || iH == 5) {
                    i2 = i29;
                    ByteBuffer byteBufferAllocate15 = ByteBuffer.allocate(200);
                    byteBufferAllocate15.putInt(0);
                    byteBufferAllocate15.flip();
                    byteBufferD3 = dfl.d("nmhd", byteBufferAllocate15);
                    ByteBuffer byteBufferAllocate16 = ByteBuffer.allocate(200);
                    str10.getClass();
                    String str13 = vqi.a;
                    byte[] bytes = str10.getBytes(StandardCharsets.UTF_8);
                    byteBufferAllocate16.put(bytes);
                    byteBufferAllocate16.put((byte) 0);
                    byteBufferAllocate16.put(bytes);
                    byteBufferAllocate16.put((byte) 0);
                    byteBufferAllocate16.flip();
                    byteBufferC2 = dfl.c("stbl", Arrays.asList(o(dfl.d("mett", byteBufferAllocate16)), byteBufferD7, byteBufferD8, byteBufferD9, byteBuffer2));
                    str2 = "MetaHandle";
                    str3 = str11;
                } else if (iH == 1) {
                    i2 = i29;
                    ByteBuffer byteBufferAllocate17 = ByteBuffer.allocate(200);
                    byteBufferAllocate17.putInt(0);
                    byteBufferAllocate17.putShort((short) 0);
                    byteBufferAllocate17.putShort((short) 0);
                    byteBufferAllocate17.flip();
                    ByteBuffer byteBufferD10 = dfl.d("smhd", byteBufferAllocate17);
                    String strD = d(b87Var);
                    ByteBuffer byteBufferC3 = c(b87Var);
                    ByteBuffer byteBufferAllocate18 = ByteBuffer.allocate(byteBufferC3.remaining() + 200);
                    byteBufferAllocate18.putInt(0);
                    byteBufferAllocate18.putShort((short) 0);
                    byteBufferAllocate18.putShort((short) 1);
                    byteBufferAllocate18.putInt(0);
                    byteBufferAllocate18.putInt(0);
                    byteBufferAllocate18.putShort((short) b87Var.F);
                    byteBufferAllocate18.putShort((short) 16);
                    byteBufferAllocate18.putShort((short) 0);
                    byteBufferAllocate18.putShort((short) 0);
                    byteBufferAllocate18.putInt(b87Var.G << 16);
                    byteBufferAllocate18.put(byteBufferC3);
                    byteBufferAllocate18.flip();
                    byteBufferC2 = dfl.c("stbl", Arrays.asList(o(dfl.d(strD, byteBufferAllocate18)), byteBufferD7, byteBufferD8, byteBufferD9, byteBuffer2));
                    str3 = "soun";
                    str2 = "SoundHandle";
                    byteBufferD3 = byteBufferD10;
                } else {
                    if (iH != 2) {
                        ore.p("Unsupported track type");
                        return null;
                    }
                    ByteBuffer byteBufferAllocate19 = ByteBuffer.allocate(200);
                    byteBufferAllocate19.putInt(0);
                    byteBufferAllocate19.putShort((short) 0);
                    byteBufferAllocate19.putShort((short) 0);
                    byteBufferAllocate19.putShort((short) 0);
                    byteBufferAllocate19.putShort((short) 0);
                    byteBufferAllocate19.flip();
                    ByteBuffer byteBufferD11 = dfl.d("vmhd", byteBufferAllocate19);
                    ByteBuffer byteBufferC4 = c(b87Var);
                    ex3 ex3Var = b87Var.D;
                    String strD2 = d(b87Var);
                    ByteBuffer byteBufferAllocate20 = ByteBuffer.allocate(byteBufferC4.limit() + 200);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putShort((short) 0);
                    byteBufferAllocate20.putShort((short) 1);
                    byteBufferAllocate20.putShort((short) 0);
                    byteBufferAllocate20.putShort((short) 0);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putInt(0);
                    i2 = i29;
                    byteBufferAllocate20.putShort(i2 != -1 ? (short) i2 : (short) 0);
                    byteBufferAllocate20.putShort(i21 != -1 ? (short) i21 : (short) 0);
                    byteBufferAllocate20.putInt(4718592);
                    byteBufferAllocate20.putInt(4718592);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putShort((short) 1);
                    long j8 = j;
                    byteBufferAllocate20.putLong(j8);
                    byteBufferAllocate20.putLong(j8);
                    byteBufferAllocate20.putLong(j8);
                    byteBufferAllocate20.putLong(j8);
                    byteBufferAllocate20.putShort((short) 24);
                    byteBufferAllocate20.putShort((short) -1);
                    byteBufferAllocate20.put(byteBufferC4);
                    if (ex3Var != null && strD2.equals("vp09")) {
                        byte[] bArr2 = ex3Var.d;
                        if (bArr2 != null) {
                            ByteBuffer byteBufferAllocate21 = ByteBuffer.allocate(200);
                            byteBufferAllocate21.putInt(0);
                            byteBufferAllocate21.put(bArr2);
                            byteBufferAllocate21.flip();
                            byteBufferAllocate3 = dfl.d("SmDm", byteBufferAllocate21);
                        } else {
                            byteBufferAllocate3 = ByteBuffer.allocate(0);
                        }
                        byteBufferAllocate20.put(byteBufferAllocate3);
                    }
                    ByteBuffer byteBufferAllocate22 = ByteBuffer.allocate(8);
                    byteBufferAllocate22.putInt(65536);
                    byteBufferAllocate22.putInt(65536);
                    byteBufferAllocate22.rewind();
                    byteBufferAllocate20.put(dfl.d("pasp", byteBufferAllocate22));
                    if (ex3Var != null) {
                        int i41 = ex3Var.a;
                        ByteBuffer byteBufferAllocate23 = ByteBuffer.allocate(20);
                        byteBufferAllocate23.put((byte) 110);
                        byteBufferAllocate23.put((byte) 99);
                        byteBufferAllocate23.put((byte) 108);
                        byteBufferAllocate23.put((byte) 120);
                        if (i41 != 2) {
                            i6 = 6;
                            i7 = i41 != 6 ? 1 : 9;
                        } else {
                            i6 = 6;
                            i7 = 5;
                        }
                        short s3 = (short) i7;
                        short sD = (short) ex3.d(ex3Var.c);
                        short s4 = (short) (i41 != 2 ? i41 != i6 ? 1 : 9 : 6);
                        byte b = ex3Var.b == 1 ? (byte) -128 : (byte) 0;
                        byteBufferAllocate23.putShort(s3);
                        byteBufferAllocate23.putShort(sD);
                        byteBufferAllocate23.putShort(s4);
                        byteBufferAllocate23.put(b);
                        byteBufferAllocate23.flip();
                        byteBufferAllocate20.put(dfl.d("colr", byteBufferAllocate23));
                    }
                    byteBufferAllocate20.flip();
                    ByteBuffer byteBufferO = o(dfl.d(strD2, byteBufferAllocate20));
                    ByteBuffer byteBufferAllocate24 = ByteBuffer.allocate((arrayList12.size() * 4) + 200);
                    byteBufferAllocate24.putInt(0);
                    int iPosition6 = byteBufferAllocate24.position();
                    byteBufferAllocate24.putInt(arrayList12.size());
                    int i42 = 1;
                    int i43 = 0;
                    for (int i44 = 0; i44 < arrayList12.size(); i44++) {
                        if ((((u31) arrayList12.get(i44)).c & 1) > 0) {
                            byteBufferAllocate24.putInt(i42);
                            i43++;
                        }
                        i42++;
                    }
                    byteBufferAllocate24.putInt(iPosition6, i43);
                    byteBufferAllocate24.flip();
                    byteBufferC2 = dfl.c("stbl", Arrays.asList(byteBufferO, byteBufferD7, byteBuffer, byteBufferD8, byteBufferD9, byteBuffer2, dfl.d("stss", byteBufferAllocate24)));
                    str3 = "vide";
                    str2 = "VideoHandle";
                    byteBufferD3 = byteBufferD11;
                }
                int i45 = ((t2b) ljfVar.b).a;
                ByteBuffer byteBufferAllocate25 = ByteBuffer.allocate(200);
                byteBufferAllocate25.putInt(7);
                byteBufferAllocate25.putInt(i8);
                i3 = i25;
                byteBufferAllocate25.putInt(i3);
                byteBufferAllocate25.putInt(i24);
                byteBufferAllocate25.putInt(0);
                ByteBuffer byteBuffer3 = byteBufferD3;
                ayh ayhVar3 = ayhVar2;
                ByteBuffer byteBuffer4 = byteBufferC2;
                String str14 = str2;
                byteBufferAllocate25.putInt((int) p(j5, 10000L));
                byteBufferAllocate25.putInt(0);
                byteBufferAllocate25.putInt(0);
                byteBufferAllocate25.putInt(0);
                byteBufferAllocate25.putShort(uya.i(str10) ? (short) 256 : (short) 0);
                byteBufferAllocate25.putShort((short) 0);
                if (i45 == 0) {
                    bArrN0 = vqi.n0(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
                } else if (i45 == 90) {
                    bArrN0 = vqi.n0(0, 65536, 0, -65536, 0, 0, 0, 0, 1073741824);
                } else if (i45 == 180) {
                    bArrN0 = vqi.n0(-65536, 0, 0, 0, -65536, 0, 0, 0, 1073741824);
                } else {
                    if (i45 != 270) {
                        ore.p(zo5.h(i45, "invalid orientation "));
                        return null;
                    }
                    bArrN0 = vqi.n0(0, -65536, 0, 65536, 0, 0, 0, 0, 1073741824);
                }
                byteBufferAllocate25.put(bArrN0);
                if (i2 == -1) {
                    i2 = 0;
                }
                if (i21 == -1) {
                    i21 = 0;
                }
                byteBufferAllocate25.putInt(i2 << 16);
                byteBufferAllocate25.putInt(i21 << 16);
                byteBufferAllocate25.flip();
                ByteBuffer byteBufferD12 = dfl.d("tkhd", byteBufferAllocate25);
                long jA = ayhVar3.a();
                j = 0;
                long j9 = j2 > 0 ? j3 - j2 : j3;
                if (j9 != 0) {
                    ByteBuffer byteBufferAllocate26 = ByteBuffer.allocate(50);
                    byteBufferAllocate26.putInt(16777216);
                    if (j9 > 0) {
                        byteBufferAllocate26.putInt(2);
                        byteBufferAllocate26.put(g(p(j9, 10000L), -1L));
                        byteBufferAllocate26.put(g(p(j5, 10000L), 0L));
                        j = 0;
                    } else {
                        byteBufferAllocate26.putInt(1);
                        byteBufferAllocate26.put(g(p(j5, 10000L), p(Math.abs(j9), jA)));
                    }
                    byteBufferAllocate26.flip();
                    byteBufferAllocate2 = dfl.d("edts", dfl.d("elst", byteBufferAllocate26));
                    i4 = 0;
                } else {
                    ayhVar3 = ayhVar3;
                    i4 = 0;
                    byteBufferAllocate2 = ByteBuffer.allocate(0);
                }
                int iA = ayhVar3.a();
                ByteBuffer byteBufferAllocate27 = ByteBuffer.allocate(200);
                byteBufferAllocate27.putInt(i4);
                byteBufferAllocate27.putInt(i8);
                byteBufferAllocate27.putInt(i3);
                byteBufferAllocate27.putInt(iA);
                byteBufferAllocate27.putInt((int) j4);
                if (str12 == null) {
                    s = 0;
                    s2 = 0;
                } else {
                    byte[] bytes2 = str12.getBytes(StandardCharsets.UTF_8);
                    if (bytes2.length != 3) {
                        s = 0;
                        s2 = 0;
                    } else {
                        s2 = 0;
                        s = (short) (((bytes2[2] & 31) + ((bytes2[1] & 31) << 5) + ((bytes2[0] & 31) << 10)) & 32767);
                    }
                }
                byteBufferAllocate27.putShort(s);
                byteBufferAllocate27.putShort(s2);
                byteBufferAllocate27.flip();
                ByteBuffer byteBufferD13 = dfl.d("mdhd", byteBufferAllocate27);
                ByteBuffer byteBufferL2 = l(str3, str14);
                ByteBuffer byteBufferAllocate28 = ByteBuffer.allocate(4);
                byteBufferAllocate28.putInt(1);
                byteBufferAllocate28.flip();
                ByteBuffer[] byteBufferArr = {dfl.d("url ", byteBufferAllocate28)};
                ByteBuffer byteBufferAllocate29 = ByteBuffer.allocate(8);
                byteBufferAllocate29.putInt(0);
                byteBufferAllocate29.putInt(1);
                byteBufferAllocate29.flip();
                ArrayList arrayList17 = new ArrayList();
                arrayList17.add(byteBufferAllocate29);
                Collections.addAll(arrayList17, byteBufferArr);
                ByteBuffer byteBufferC5 = dfl.c("trak", Arrays.asList(byteBufferD12, byteBufferAllocate2, dfl.c("mdia", Arrays.asList(byteBufferD13, byteBufferL2, dfl.c("minf", Arrays.asList(byteBuffer3, dfl.d("dinf", dfl.c("dref", arrayList17)), byteBuffer4))))));
                arrayList2 = arrayList13;
                arrayList2.add(byteBufferC5);
                jMax = Math.max(jMax, j5);
                ByteBuffer byteBufferAllocate30 = ByteBuffer.allocate(24);
                byteBufferAllocate30.putInt(0);
                byteBufferAllocate30.putInt(i24);
                byteBufferAllocate30.putInt(1);
                byteBufferAllocate30.putInt(0);
                byteBufferAllocate30.putInt(0);
                byteBufferAllocate30.putInt(0);
                byteBufferAllocate30.flip();
                arrayList3 = arrayList14;
                arrayList3.add(dfl.d("trex", byteBufferAllocate30));
                i5 = i24 + 1;
            } else {
                i3 = i9;
                arrayList2 = arrayList5;
                arrayList3 = arrayList6;
                i11 = i11;
                i5 = i12;
            }
            i11++;
            i12 = i5;
            arrayList6 = arrayList3;
            i9 = i3;
            jMin = j2;
            hashSet = hashSet;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
        }
    }

    public static ByteBuffer o(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return dfl.d("stsd", byteBufferAllocate);
    }

    public static long p(long j, long j2) {
        return vqi.i0(j, j2, 1000000L, RoundingMode.HALF_UP);
    }
}
