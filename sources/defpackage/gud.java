package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class gud extends qud {
    public final Intent a;

    public gud(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gud) && this.a.equals(((gud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.a + ")";
    }
}
