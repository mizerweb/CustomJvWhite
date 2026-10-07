package defpackage;

import android.graphics.RenderNode;
import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ht6 {
    public static /* synthetic */ RenderNode e() {
        return new RenderNode("blur");
    }

    public static /* bridge */ /* synthetic */ RenderNode f(Object obj) {
        return (RenderNode) obj;
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint i(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void m() {
    }
}
