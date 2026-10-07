package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g55 {
    public static final LinkedHashMap a;

    static {
        hle hleVar = new hle(4);
        a98 a98Var = c98.b;
        Object[] objArr = {"SetComposition", "SeekTo", "SetVideoOutput", "Release"};
        ch3.e(objArr, 4);
        hleVar.j("CompositionPlayer", c98.j(objArr, 4));
        hleVar.j("TransformerInternal", c98.r("Start"));
        hleVar.j("AssetLoader", c98.s("InputFormat", "OutputFormat"));
        hleVar.j("AudioDecoder", c98.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        hleVar.j("AudioGraph", c98.s("RegisterNewInputStream", "OutputEnded"));
        Object[] objArr2 = {"RegisterNewInputStream", "OutputFormat", "ProducedOutput"};
        ch3.e(objArr2, 3);
        hleVar.j("AudioMixer", c98.j(objArr2, 3));
        hleVar.j("AudioEncoder", c98.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        hleVar.j("VideoDecoder", c98.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        Object[] objArr3 = {"RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"};
        ch3.e(objArr3, 9);
        hleVar.j("VideoFrameProcessor", c98.j(objArr3, 9));
        hleVar.j("ExternalTextureManager", c98.s("SignalEOS", "SurfaceTextureTransformFix"));
        hleVar.j("BitmapTextureManager", c98.r("SignalEOS"));
        hleVar.j("TexIdTextureManager", c98.r("SignalEOS"));
        hleVar.j("Compositor", c98.r("OutputTextureRendered"));
        hleVar.j("VideoEncoder", c98.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        hleVar.j("Muxer", c98.u("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        hleVar.c(true);
        a = new LinkedHashMap();
        SystemClock.elapsedRealtime();
    }

    public static synchronized void a() {
        synchronized (g55.class) {
        }
    }
}
