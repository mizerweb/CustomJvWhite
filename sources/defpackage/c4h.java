package defpackage;

import android.content.Context;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.SystemClock;
import android.util.Size;
import java.math.BigInteger;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.stories.edit.VideoViewerWidget;

/* JADX INFO: loaded from: classes3.dex */
public class c4h implements e78, op5, sf7 {
    public final /* synthetic */ int a;
    public final Object b;

    public c4h(c4h c4hVar, boolean z) {
        this.a = 6;
        this.b = (Instant) c4hVar.b;
    }

    public Integer[] a() {
        int[] outputFormats;
        Integer[] numArr = null;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
            outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
        } catch (IllegalArgumentException e) {
            tvj.i("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
        } catch (NullPointerException e2) {
            tvj.i("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e2);
        }
        if (outputFormats != null) {
            numArr = new Integer[outputFormats.length];
            int length = outputFormats.length;
            for (int i = 0; i < length; i++) {
                numArr[i] = Integer.valueOf(outputFormats[i]);
            }
        }
        return numArr;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0138  */
    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        wkc wkcVar;
        boolean z;
        double d;
        double d2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        Double d3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 8:
                a4e a4eVar = (a4e) obj;
                a4eVar.getClass();
                ykc ykcVar = (ykc) obj2;
                wkc wkcVar2 = ykcVar.b;
                uw uwVar = ykcVar.p;
                uw uwVar2 = ykcVar.o;
                yi9 yi9Var = ykcVar.n;
                iaa iaaVar = ykcVar.f;
                ex8 ex8Var = ykcVar.k;
                List<fgg> list = a4eVar.b;
                list.getClass();
                if (ex8Var.T(list)) {
                    iaaVar.invoke("reset state");
                    wkcVar2.reset();
                    ykcVar.l = 0.0d;
                    yi9Var.a = 0L;
                    yi9Var.b = 0L;
                    ykcVar.m = Double.NaN;
                    uwVar2.c();
                    uwVar.c();
                }
                pk2 pk2VarC = a4eVar.c();
                boolean zD = cqk.d(pk2VarC != null ? pk2VarC.i : null, "tcp");
                pk2 pk2VarC2 = a4eVar.c();
                double dDoubleValue = (pk2VarC2 == null || (d3 = pk2VarC2.h) == null) ? 0.0d : d3.doubleValue() / 1000.0d;
                xde xdeVarC = grl.c(list);
                ArrayList arrayList = (ArrayList) xdeVarC.d;
                ArrayList arrayList2 = (ArrayList) xdeVarC.e;
                ArrayList arrayList3 = (ArrayList) xdeVarC.c;
                ArrayList arrayList4 = (ArrayList) xdeVarC.b;
                if (arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    wkcVar = wkcVar2;
                    z = zD;
                    d = ykcVar.l;
                } else {
                    final vfe vfeVar = new vfe();
                    final vfe vfeVar2 = new vfe();
                    wkcVar = wkcVar2;
                    final int i2 = 0;
                    cf7 cf7Var = new cf7() { // from class: vkc
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj3) {
                            int i3 = i2;
                            sbi sbiVar = sbi.a;
                            vfe vfeVar3 = vfeVar2;
                            vfe vfeVar4 = vfeVar;
                            switch (i3) {
                                case 0:
                                    bgg bggVar = (bgg) obj3;
                                    bggVar.getClass();
                                    long j = vfeVar4.a;
                                    BigInteger bigInteger3 = bggVar.h;
                                    vfeVar4.a = j + (bigInteger3 != null ? bigInteger3.longValue() : 0L);
                                    long j2 = vfeVar3.a;
                                    BigInteger bigInteger4 = bggVar.i;
                                    vfeVar3.a = j2 + (bigInteger4 != null ? bigInteger4.longValue() : 0L);
                                    break;
                                default:
                                    cgg cggVar = (cgg) obj3;
                                    cggVar.getClass();
                                    long j3 = vfeVar4.a;
                                    BigInteger bigInteger5 = cggVar.h;
                                    vfeVar4.a = j3 + (bigInteger5 != null ? bigInteger5.longValue() : 0L);
                                    long j4 = vfeVar3.a;
                                    BigInteger bigInteger6 = cggVar.i;
                                    vfeVar3.a = j4 + (bigInteger6 != null ? bigInteger6.longValue() : 0L);
                                    break;
                            }
                            return sbiVar;
                        }
                    };
                    z = zD;
                    final int i3 = 1;
                    cf7 cf7Var2 = new cf7() { // from class: vkc
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj3) {
                            int i4 = i3;
                            sbi sbiVar = sbi.a;
                            vfe vfeVar3 = vfeVar2;
                            vfe vfeVar4 = vfeVar;
                            switch (i4) {
                                case 0:
                                    bgg bggVar = (bgg) obj3;
                                    bggVar.getClass();
                                    long j = vfeVar4.a;
                                    BigInteger bigInteger3 = bggVar.h;
                                    vfeVar4.a = j + (bigInteger3 != null ? bigInteger3.longValue() : 0L);
                                    long j2 = vfeVar3.a;
                                    BigInteger bigInteger4 = bggVar.i;
                                    vfeVar3.a = j2 + (bigInteger4 != null ? bigInteger4.longValue() : 0L);
                                    break;
                                default:
                                    cgg cggVar = (cgg) obj3;
                                    cggVar.getClass();
                                    long j3 = vfeVar4.a;
                                    BigInteger bigInteger5 = cggVar.h;
                                    vfeVar4.a = j3 + (bigInteger5 != null ? bigInteger5.longValue() : 0L);
                                    long j4 = vfeVar3.a;
                                    BigInteger bigInteger6 = cggVar.i;
                                    vfeVar3.a = j4 + (bigInteger6 != null ? bigInteger6.longValue() : 0L);
                                    break;
                            }
                            return sbiVar;
                        }
                    };
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        cf7Var.invoke(it2.next());
                        it = it2;
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        cf7Var.invoke(it3.next());
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        cf7Var2.invoke(it4.next());
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        cf7Var2.invoke(it5.next());
                    }
                    long j = vfeVar2.a;
                    if (j != 0) {
                        long j2 = vfeVar.a;
                        if (j2 == 0) {
                            ykcVar.l = 0.0d;
                            d = 0.0d;
                        } else {
                            double dA = yi9Var.a(j, j2);
                            ykcVar.l = dA;
                            d = dA;
                        }
                    } else {
                        ykcVar.l = 0.0d;
                        d = 0.0d;
                    }
                }
                dgg dggVar = (dgg) ww3.t1(grl.b(list));
                Long lValueOf = (dggVar == null || (bigInteger2 = dggVar.j) == null) ? null : Long.valueOf(bigInteger2.longValue());
                ArrayList arrayList5 = new ArrayList(list.size());
                for (fgg fggVar : list) {
                    if (fggVar.b == 1 && fggVar.a == 1) {
                        arrayList5.add((zfg) fggVar);
                    }
                }
                zfg zfgVar = (zfg) ww3.t1(arrayList5);
                Long lValueOf2 = (zfgVar == null || (bigInteger = zfgVar.j) == null) ? null : Long.valueOf(bigInteger.longValue());
                if (lValueOf == null || lValueOf2 == null) {
                    d2 = ykcVar.m;
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    d2 = uwVar.d(lValueOf.longValue(), jElapsedRealtime) + uwVar2.d(lValueOf2.longValue(), jElapsedRealtime);
                    ykcVar.m = d2;
                }
                double d4 = d2;
                double d5 = dDoubleValue;
                boolean z2 = z;
                double dC = wkcVar.c(d5, d, d4, z2);
                iaaVar.invoke("calc result: " + dC + " for: rtt=" + d5 + ", loss=" + d + ", bitrate=" + d4 + " isTCP=" + z2);
                return Double.valueOf(dC);
            default:
                ((Long) obj).getClass();
                yig yigVar = (yig) obj2;
                yigVar.getClass();
                return new p64(2, new vuf(6, yigVar)).j(th.a());
        }
    }

    public long b(int i, Size size) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    public Size[] c(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    @Override // defpackage.e78
    public ojd j(Context context, uj7 uj7Var, ib5 ib5Var, t3a t3aVar, at5 at5Var, boolean z, ee6 ee6Var, qg7 qg7Var, vi8 vi8Var, vi8 vi8Var2, dn5 dn5Var, j85 j85Var, k2d k2dVar, w4 w4Var) {
        return new ojd(context, uj7Var, new vqh(ib5Var), t3aVar, at5Var, z, ee6Var, qg7Var, vi8Var, vi8Var2, dn5Var, j85Var, k2dVar, (tqh) this.b);
    }

    @Override // defpackage.op5
    public void q() {
        VideoViewerWidget videoViewerWidget = (VideoViewerWidget) this.b;
        zv8[] zv8VarArr = VideoViewerWidget.o;
        a6j a6jVarU1 = videoViewerWidget.u1();
        if (a6jVarU1 != null) {
            a6jVarU1.y0();
        }
    }

    @Override // defpackage.op5
    public void r(long j) {
        VideoViewerWidget videoViewerWidget = (VideoViewerWidget) this.b;
        zv8[] zv8VarArr = VideoViewerWidget.o;
        a6j a6jVarU1 = videoViewerWidget.u1();
        if (a6jVarU1 != null) {
            a6jVarU1.I0(j);
        }
    }

    public /* synthetic */ c4h(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public c4h(Instant instant, int i) {
        this.a = 6;
        this.b = instant;
    }

    public /* synthetic */ c4h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
