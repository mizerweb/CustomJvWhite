package org.webrtc;

import defpackage.ore;

/* JADX INFO: loaded from: classes3.dex */
class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ore.q("Failed to get WebRTC class loader.");
        return null;
    }
}
