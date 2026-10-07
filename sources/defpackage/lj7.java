package defpackage;

import androidx.datastore.preferences.protobuf.d;

/* JADX INFO: loaded from: classes2.dex */
public final class lj7 implements vga {
    public static final lj7 b = new lj7(0);
    public final /* synthetic */ int a;

    public /* synthetic */ lj7(int i) {
        this.a = i;
    }

    @Override // defpackage.vga
    public final i5e a(Class cls) {
        switch (this.a) {
            case 0:
                if (!d.class.isAssignableFrom(cls)) {
                    ore.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (i5e) d.e(cls.asSubclass(d.class)).d(3);
                } catch (Exception e) {
                    ore.h("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.vga
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return d.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
