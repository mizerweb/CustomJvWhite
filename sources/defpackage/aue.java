package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class aue extends o3 implements zte {
    public static final /* synthetic */ zv8[] h = {new dwd(aue.class, "fontSizeModeFlow", "getFontSizeModeFlow()Lkotlinx/coroutines/flow/MutableStateFlow;", 0), zo5.e(zfe.a, aue.class, "isDisableIncomingCalls", "isDisableIncomingCalls()Z"), new dwd(aue.class, "deviceIdFlow", "getDeviceIdFlow()Lkotlinx/coroutines/flow/MutableStateFlow;", 0)};
    public final n3 e;
    public final gvb f;
    public final n3 g;

    public aue(Context context, cs6 cs6Var) {
        super(context, "root", cs6Var);
        this.e = new n3("font.size", 1, this.d, this.b, zfe.a(Integer.class));
        Boolean bool = Boolean.FALSE;
        this.f = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "dev.calls.disable_incoming");
        this.g = new n3("device.id", null, this.d, this.b, zfe.a(String.class));
    }

    public final m3 f() {
        zv8 zv8Var = h[0];
        return (m3) this.e.g;
    }
}
