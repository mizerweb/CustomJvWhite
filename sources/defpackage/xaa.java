package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class xaa {
    public final Context a;
    public final boolean b;
    public final ny8 c;

    public xaa(ny8 ny8Var, Context context, boolean z) {
        this.a = context;
        this.b = z;
        this.c = ny8Var;
    }

    public final void a(aba abaVar) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Context context = this.a;
        Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
        if (systemService == null) {
            ore.p("Required value was null.");
            return;
        }
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
        if (systemService2 == null) {
            ore.p("Required value was null.");
            return;
        }
        int largeMemoryClass = ((ActivityManager) systemService2).getLargeMemoryClass();
        int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / 1048576.0d);
        if (this.b) {
            yj5.a((yj5) this.c.getValue(), xj5.MEMORY, abaVar.f, 0.0f, 0.0f, gm0.J(memoryInfo.totalMem / 1048576.0d), gm0.J(memoryInfo.threshold / 1048576.0d), largeMemoryClass, iMaxMemory, abaVar.a, abaVar.e, 0.0f, 0.0f, 0.0f, lvb.w0(context).a, abaVar.d, abaVar.b, abaVar.c, abaVar.g, abaVar.h, abaVar.i, abaVar.j, null, abaVar.k, abaVar.l, -14672884);
        }
    }
}
