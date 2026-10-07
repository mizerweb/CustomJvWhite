package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kne {
    public final Resources a;
    public final Resources.Theme b;

    public kne(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kne.class == obj.getClass()) {
            kne kneVar = (kne) obj;
            if (this.a.equals(kneVar.a) && Objects.equals(this.b, kneVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
