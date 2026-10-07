package defpackage;

import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class axj extends zwj {
    public axj(ixj ixjVar, WindowInsets windowInsets) {
        super(ixjVar, windowInsets);
    }

    @Override // defpackage.exj
    public ixj a() {
        return ixj.g(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.exj
    public do5 e() {
        return do5.e(this.c.getDisplayCutout());
    }

    @Override // defpackage.ywj, defpackage.exj
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axj)) {
            return false;
        }
        axj axjVar = (axj) obj;
        return Objects.equals(this.c, axjVar.c) && Objects.equals(this.g, axjVar.g) && ywj.A(this.h, axjVar.h);
    }

    @Override // defpackage.exj
    public int hashCode() {
        return this.c.hashCode();
    }
}
