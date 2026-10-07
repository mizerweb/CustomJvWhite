package defpackage;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xik {
    public static final Logger a;
    public static final ifh b;

    static {
        gik gikVar = dul.o;
        a = gikVar != null ? gikVar.c : new DefaultLogger("VkpnsClientSdk");
        new ifh(pgk.v);
        b = new ifh(pgk.w);
    }

    public static yek a() {
        if (dul.o != null) {
            return (yek) b.getValue();
        }
        ore.k("ConfigModule.init() must be called before accessing its members");
        return null;
    }
}
