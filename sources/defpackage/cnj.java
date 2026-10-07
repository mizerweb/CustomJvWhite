package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class cnj implements ynj {
    public final Intent a;

    public cnj(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnj) && this.a.equals(((cnj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraScreenIntentReady(intent=" + this.a + ")";
    }
}
