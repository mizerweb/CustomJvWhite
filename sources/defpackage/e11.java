package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e11 implements Serializable {
    public final boolean a;
    public final boolean b;

    public e11(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        return qt4.o("{hasBots=", this.a, ", suspendedBot=", this.b, "}");
    }
}
