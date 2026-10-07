package defpackage;

import android.os.Debug;

/* JADX INFO: loaded from: classes3.dex */
public abstract class esk {
    public static nba a(Debug.MemoryInfo memoryInfo) {
        return new nba(sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.java-heap"))), sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.native-heap"))), sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.code"))), sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.stack"))), sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.graphics"))), sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.private-other"))), sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.system"))), sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.total-swap"))), sb8.G(Long.parseLong(memoryInfo.getMemoryStat("summary.total-pss"))));
    }

    public static final float b(float f, float f2, float f3) {
        return c0a.c(f2, f, f3, f);
    }

    public static final int c(int i, float f, int i2) {
        return ((int) (b((i & 255) / 255.0f, (i2 & 255) / 255.0f, f) * 255.0f)) | (((int) (b(((i >> 24) & 255) / 255.0f, ((i2 >> 24) & 255) / 255.0f, f) * 255.0f)) << 24) | (((int) (b(((i >> 16) & 255) / 255.0f, ((i2 >> 16) & 255) / 255.0f, f) * 255.0f)) << 16) | (((int) (b(((i >> 8) & 255) / 255.0f, ((i2 >> 8) & 255) / 255.0f, f) * 255.0f)) << 8);
    }
}
