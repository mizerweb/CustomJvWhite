package defpackage;

import android.util.Size;
import java.util.Objects;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class xkg {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public xkg(Size size) {
        this.c = size;
        this.a = size.getWidth();
        this.b = size.getHeight();
        String name = xkg.class.getName();
        this.d = name;
        VideoMessageStencilHolder videoMessageStencilHolder = new VideoMessageStencilHolder(size.getWidth(), size.getHeight());
        this.e = videoMessageStencilHolder;
        this.f = new FrameBuffer(size.getWidth(), size.getHeight());
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "init, previewSize=" + size, null);
            }
        }
        videoMessageStencilHolder.notifyRecording(true);
    }

    public static /* synthetic */ bb0 a(xkg xkgVar) {
        return (bb0) xkgVar.f;
    }

    public static /* synthetic */ ta0 b(xkg xkgVar) {
        return (ta0) xkgVar.e;
    }

    public static /* synthetic */ b87 c(xkg xkgVar) {
        return (b87) xkgVar.c;
    }

    public static tb0 d(xkg xkgVar) {
        ta0 ta0Var = (ta0) xkgVar.e;
        return new tb0(ta0Var.a, ta0Var.b, ta0Var.c, ta0Var.f, ta0Var.d, ta0Var.e);
    }

    public static xkg e(xkg xkgVar, ta0 ta0Var) {
        return new xkg((b87) xkgVar.c, (b87) xkgVar.d, xkgVar.a, xkgVar.b, ta0Var, (bb0) xkgVar.f);
    }

    public static boolean f(xkg xkgVar, xkg xkgVar2) {
        xkgVar.getClass();
        return ((ta0) xkgVar2.e).equals((ta0) xkgVar.e);
    }

    public static boolean g(xkg xkgVar) {
        return Objects.equals(((b87) xkgVar.c).n, "audio/raw");
    }

    public static long h(xkg xkgVar, long j) {
        return vqi.g0(((b87) xkgVar.c).G, j);
    }

    public static /* synthetic */ b87 i(xkg xkgVar) {
        return (b87) xkgVar.d;
    }

    public static long l(xkg xkgVar, long j) {
        return vqi.g0(((ta0) xkgVar.e).b, j);
    }

    public /* synthetic */ xkg(b87 b87Var, b87 b87Var2, int i, int i2, ta0 ta0Var, bb0 bb0Var, int i3) {
        this(b87Var, b87Var2, i, i2, ta0Var, bb0Var);
    }

    public xkg(b87 b87Var, b87 b87Var2, int i, int i2, ta0 ta0Var, bb0 bb0Var) {
        this.c = b87Var;
        this.d = b87Var2;
        this.a = i;
        this.b = i2;
        this.e = ta0Var;
        this.f = bb0Var;
    }
}
