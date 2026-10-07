package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@mif(with = ak5.class)
public final class bk5 {
    public static final e69 e;
    public static final fif f;
    public final Map a;
    public static final /* synthetic */ zv8[] c = {new dwd(bk5.class, "isAbEventEnabled", "isAbEventEnabled()Z", 0), zo5.f(zfe.a, bk5.class, "isOpcodeStatEnabled", "isOpcodeStatEnabled()Z", 0), new dwd(bk5.class, "isChatHistoryStatEnabled", "isChatHistoryStatEnabled()Z", 0), new dwd(bk5.class, "isUploadHangCheckEnabled", "isUploadHangCheckEnabled()Z", 0), new dwd(bk5.class, "isUploadErrorEventEnabled", "isUploadErrorEventEnabled()Z", 0), new dwd(bk5.class, "isDownloadErrorEventEnabled", "isDownloadErrorEventEnabled()Z", 0), new dwd(bk5.class, "isMemoryStatEnabled", "isMemoryStatEnabled()Z", 0), new dwd(bk5.class, "isBatteryStatEnabled", "isBatteryStatEnabled()Z", 0), new dwd(bk5.class, "isVideoTranscodeSizeRegressionEnabled", "isVideoTranscodeSizeRegressionEnabled()Z", 0), new dwd(bk5.class, "isExitReasonStatEnabled", "isExitReasonStatEnabled()Z", 0), new dwd(bk5.class, "isMultiaccountStatEnabled", "isMultiaccountStatEnabled()Z", 0)};
    public static final ak5 b = new ak5();
    public static final bk5 d = new bk5(new mw(0));

    static {
        e69 e69Var = new e69(n5h.a, b01.a);
        e = e69Var;
        f = e69Var.c;
    }

    public bk5(Map map) {
        this.a = map;
    }

    public final boolean a(xj5 xj5Var) {
        return ((Boolean) this.a.getOrDefault(xj5Var.a, Boolean.FALSE)).booleanValue();
    }

    public final boolean b(String str) {
        return ((Boolean) this.a.getOrDefault(str, Boolean.FALSE)).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk5) && cqk.d(this.a, ((bk5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DevNullServerConfig(events=" + this.a + ")";
    }
}
