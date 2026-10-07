package org.jni_zero;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
@JNINamespace("jni_zero")
public class JniInit {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static void crashIfMultiplexingMisaligned(long j, long j2) {
        try {
            long j3 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j4 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j3 != j && j3 != j2 && j4 != j) {
                throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j + " or " + j2 + " Java: " + j3 + " or " + j4);
            }
        } catch (ReflectiveOperationException unused) {
        }
    }

    private static Object[] init() {
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP};
    }
}
