package defpackage;

import android.hardware.DataSpace;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.MediaItemInfo;
import android.os.SystemClock;
import android.util.Size;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class w26 {
    public static final SparseIntArray f;
    public static final SparseIntArray g;
    public static final SparseIntArray h;
    public static final SparseIntArray i;
    public final long a = SystemClock.elapsedRealtime();
    public final boolean b;
    public final boolean c;
    public final String d;
    public final v26 e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        g = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        h = sparseIntArray3;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        i = sparseIntArray4;
        sparseIntArray.put(1000, 1);
        sparseIntArray.put(1001, 2);
        sparseIntArray.put(2000, 3);
        sparseIntArray.put(2001, 4);
        sparseIntArray.put(2002, 5);
        sparseIntArray.put(2003, 3);
        sparseIntArray.put(2004, 6);
        sparseIntArray.put(2005, 7);
        sparseIntArray.put(2006, 8);
        sparseIntArray.put(2007, 9);
        sparseIntArray.put(2008, 10);
        sparseIntArray.put(3001, 11);
        sparseIntArray.put(3002, 12);
        sparseIntArray.put(3003, 13);
        sparseIntArray.put(4001, 14);
        sparseIntArray.put(4002, 15);
        sparseIntArray.put(4003, 16);
        sparseIntArray.put(5001, 17);
        sparseIntArray.put(6001, 18);
        sparseIntArray.put(7001, 19);
        sparseIntArray.put(7002, 2);
        sparseIntArray2.put(-1, 0);
        sparseIntArray2.put(2, 131072);
        sparseIntArray2.put(1, 65536);
        sparseIntArray2.put(6, 393216);
        sparseIntArray3.put(-1, 0);
        sparseIntArray3.put(2, 268435456);
        sparseIntArray3.put(1, 134217728);
        sparseIntArray4.put(-1, 0);
        sparseIntArray4.put(1, 4194304);
        sparseIntArray4.put(3, 12582912);
        sparseIntArray4.put(2, 8388608);
        sparseIntArray4.put(10, 16777216);
        sparseIntArray4.put(6, 29360128);
        sparseIntArray4.put(7, 33554432);
    }

    public w26(v26 v26Var, String str, boolean z, boolean z2) {
        this.e = v26Var;
        this.d = str;
        this.b = z;
        this.c = z2;
    }

    public static long b(String str) {
        long j = uya.i(str) ? 4L : 0L;
        if (uya.m(str)) {
            j |= 2;
        }
        return uya.k(str) ? j | 1 : j;
    }

    public static ArrayList c(c98 c98Var) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c98Var.size(); i2++) {
            mh6 mh6Var = (mh6) c98Var.get(i2);
            MediaItemInfo.Builder builderH = u26.h();
            builderH.setClipDurationMillis(vqi.p0(mh6Var.a));
            String str = mh6Var.e;
            if (str != null) {
                builderH.addCodecName(str);
            }
            String str2 = mh6Var.d;
            if (str2 != null) {
                builderH.addCodecName(str2);
            }
            b87 b87Var = mh6Var.c;
            if (b87Var != null) {
                String str3 = b87Var.n;
                String str4 = b87Var.m;
                if (str4 != null) {
                    builderH.setContainerMimeType(str4);
                }
                if (str3 != null) {
                    builderH.addSampleMimeType(str3);
                    builderH.addDataType(b(str3));
                }
                float f2 = b87Var.y;
                if (f2 != -1.0f) {
                    builderH.setVideoFrameRate(f2);
                }
                int i3 = b87Var.u;
                if (i3 == -1) {
                    i3 = -1;
                }
                int i4 = b87Var.v;
                if (i4 == -1) {
                    i4 = -1;
                }
                builderH.setVideoSize(new Size(i3, i4));
                ex3 ex3Var = b87Var.D;
                if (ex3Var != null) {
                    builderH.setVideoDataSpace(DataSpace.pack(g.get(ex3Var.a, 0), i.get(ex3Var.c, 0), h.get(ex3Var.b, 0)));
                }
            }
            b87 b87Var2 = mh6Var.b;
            if (b87Var2 != null) {
                String str5 = b87Var2.n;
                if (str5 != null) {
                    builderH.addSampleMimeType(str5);
                    builderH.addDataType(b(str5));
                }
                int i5 = b87Var2.F;
                if (i5 != -1) {
                    builderH.setAudioChannelCount(i5);
                }
                int i6 = b87Var2.G;
                if (i6 != -1) {
                    builderH.setAudioSampleRateHz(i6);
                }
            }
            arrayList.add(builderH.build());
        }
        return arrayList;
    }

    public static MediaItemInfo d(nh6 nh6Var) {
        MediaItemInfo.Builder builderH = u26.h();
        long j = nh6Var.b;
        String str = nh6Var.o;
        String str2 = nh6Var.h;
        if (j != -9223372036854775807L) {
            builderH.setDurationMillis(j);
        }
        if (str2 != null) {
            builderH.addSampleMimeType(str2);
            builderH.addDataType(b(str2));
        }
        if (str != null) {
            builderH.addSampleMimeType(str);
            builderH.addDataType(b(str));
        }
        int i2 = nh6Var.e;
        if (i2 != -1) {
            builderH.setAudioChannelCount(i2);
        }
        int i3 = nh6Var.f;
        if (i3 != -2147483647) {
            builderH.setAudioSampleRateHz(i3);
        }
        String str3 = nh6Var.g;
        if (str3 != null) {
            builderH.addCodecName(str3);
        }
        String str4 = nh6Var.n;
        if (str4 != null) {
            builderH.addCodecName(str4);
        }
        builderH.setVideoSampleCount(nh6Var.m);
        int i4 = nh6Var.l;
        if (i4 == -1) {
            i4 = -1;
        }
        int i5 = nh6Var.k;
        builderH.setVideoSize(new Size(i4, i5 != -1 ? i5 : -1));
        ex3 ex3Var = nh6Var.j;
        if (ex3Var != null) {
            builderH.setVideoDataSpace(DataSpace.pack(g.get(ex3Var.a, 0), i.get(ex3Var.c, 0), h.get(ex3Var.b, 0)));
        }
        return builderH.build();
    }

    public final EditingEndedEvent.Builder a(int i2) {
        EditingEndedEvent.Builder exporterName = u26.d(i2).setTimeSinceCreatedMillis(SystemClock.elapsedRealtime() - this.a).setExporterName("androidx.media3:media3-transformer:1.9.3");
        String str = this.d;
        if (str != null) {
            exporterName.setMuxerName(str);
        }
        return exporterName;
    }

    public final void e(int i2) {
        EditingSession editingSession;
        EditingEndedEvent.Builder builderA = a(2);
        if (i2 != -1) {
            builderA.setFinalProgressPercent(i2);
        }
        if (this.b) {
            builderA.addOperationType(8L);
        }
        if (this.c) {
            builderA.addOperationType(4L);
        }
        EditingEndedEvent editingEndedEventBuild = builderA.build();
        v26 v26Var = this.e;
        if (!v26Var.b && (editingSession = v26Var.a) != null) {
            editingSession.reportEditingEndedEvent(editingEndedEventBuild);
            v26Var.b = true;
        }
        try {
            x05.l(v26Var);
        } catch (Exception e) {
            lvb.l0("EditingMetricsCollector", "error while closing the metrics reporter", e);
        }
    }

    public final void f(EditingEndedEvent.Builder builder, nh6 nh6Var, boolean z) {
        c98 c98Var = nh6Var.s;
        if (z) {
            builder.addOperationType(128L);
        }
        boolean zA = np4.a(c98Var, new fb5(2));
        boolean zA2 = np4.a(c98Var, new fb5(3));
        if (zA) {
            if (nh6Var.g != null) {
                builder.addOperationType(2L);
            } else {
                builder.addOperationType(32L);
            }
        }
        if (zA2) {
            if (nh6Var.n != null) {
                builder.addOperationType(1L);
            } else {
                builder.addOperationType(16L);
            }
        }
        if (this.b) {
            builder.addOperationType(8L);
        }
        if (this.c) {
            builder.addOperationType(4L);
        }
    }
}
